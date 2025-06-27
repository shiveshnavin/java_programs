package in.shivesh;

public class ExecutionOfJavaBlocks {
    public void myMethod()
    {
        System.out.println("Method");
    }

    long x = 0xf029L;
    {
        System.out.println(" Instance Block");
    }

    public void First_C()
    {
        System.out.println("Constructor ");
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        ExecutionOfJavaBlocks c = new ExecutionOfJavaBlocks();
        c.First_C();
        System.out.println(0.);
        c.myMethod();
    }
}
