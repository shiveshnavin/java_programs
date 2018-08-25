package in.hoptec;

import java.util.Scanner;

public class Main {


    public static class Animal
    {
        int limbs =4;
         public Animal()
        {


            Scanner s=new Scanner(System.in);
            int itr=s.nextInt();
            int i=0;
            while (i<itr){


                int seatNo=s.nextInt();
                String outp="";
                if(seatNo%6==0) outp=""+(seatNo+1)+" WS";
                else if(seatNo%5==0) outp=""+(seatNo+3)+" MS";
                else if(seatNo%4==0) outp=""+(seatNo+6)+" AS";
                else if(seatNo%3==0)  outp=""+(seatNo+7)+" AS";
                else if(seatNo%2==0) outp=""+(seatNo+9)+" MS";
                else outp = "" + (seatNo + 11) + " WS";
                l(outp);

            }

        }

        public Animal(int l)
        {
            setLimbs(l);
            l("Made Animal and set "+limbs);
        }
        void setLimbs(int l)
        {
            limbs=l;
        }


    }

    public static class Dog extends Animal{

        public Dog()
        {
            super(3);
            l("Made Dog "+limbs);
        }


    }

    public static class Pug extends Dog{

        public Pug()
        {
            super.setLimbs(2);











        }

    }
    public void bark(Animal a)
    {
        System.out.println("Main.bark "+a.limbs);
        a.limbs++;
    }



    public static void l(Object s)
    {
        System.out.println(""+s);
    }
    public static void main(String[] args) {

        Main m=new Main();


        Animal c=new Animal();

    }
}
