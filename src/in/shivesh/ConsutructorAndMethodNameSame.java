package in.shivesh;

public class ConsutructorAndMethodNameSame {


    int val;
    public int ConsutructorAndMethodNameSame(){
        System.out.println("contrucc called");
        return 20;
    }

    public ConsutructorAndMethodNameSame(){
        System.out.println("contttttt cllleeee");
        new ConsutructorAndMethodNameSame();
    }

    public void x(){
        ConsutructorAndMethodNameSame();
    }

    public static void main(String[] args) {
        ConsutructorAndMethodNameSame b = new ConsutructorAndMethodNameSame();
        System.out.println("nooo");
    }

}
