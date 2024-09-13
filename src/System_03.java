//system

public class System_03 {



    public static void main(String[] args) {
        int a[]={10,30,29,45};
        int b[]=new int[3];
        System.arraycopy(a,1,b,0,3); //copies array values

        for (int i :b){
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name", "Unknown OS"));

        System.out.println(System.getenv("PATH"));

        System.gc();
        System.exit(0);  // Normal termination

        System.out.println("shutdown"); // will not print



    }


}
