package in.hoptec;

public class Main {


    public static class Animal
    {
        int legs=4;
        @Override
        public boolean equals(Object an)
        {
            System.out.println("overrid");
            if(((Animal)an).legs==legs)
            {
                return true;
            }
            return false;
        }

    }



    public static void l(Object s)
    {
        System.out.println(""+s);
    }
    public static void main(String[] args) {
	// write your code

        int x= -8;
        int x2=0b10011;

        l(" << "+(x<<1));

        Animal a=new Animal();
        l(a.equals(new Animal()));



    }
}
