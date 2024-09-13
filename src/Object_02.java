import java.util.HashSet;
import java.util.Objects;


class Person {
    int id;
    String name;

    Person(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return  true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Person Pobj=(Person) obj;
        return id==Pobj.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // now hash of this class obj will be based only on id.
    }

    @Override
    public String toString() {
        String s1= this.name;
        String s2= Integer.toString(this.id);
        return s1+" "+s2;
    }
}


public class Object_02 {

    public static void main(String[] args) {

        HashSet<Person> set= new HashSet<>();
        set.add(new Person(10,"Mohit"));
        set.add(new Person(11,"Mohit"));
        set.add(new Person(10,"Rohit"));
        set.add(new Person(12,"Sohit"));
        set.add(new Person(13,"Dohit"));

        System.out.println(set);
    }

}
