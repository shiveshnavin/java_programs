package in.hoptec;

import java.util.Scanner;

public class Main {


    public static abstract class Animal
    {
        int limbs =4;
        abstract void cute();
         public Animal()
        {


        }

        public void sound()
        {
            l(" * sound of * Animal "+getClass().toString());
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

        void cute() {

        }

        public Dog()
        {
            super(3);
            l("Made Dog "+limbs);
        }


        public void sound()
        {
            l(" * sound of * Dog "+getClass().toString());
        }



    }

    public static class Pug extends Dog{

        public Pug()
        {
            super.setLimbs(2);

        }
        public void sound()
        {
            l(" * sound of * Pug "+getClass().toString());
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

        Inherit2 m=new Inherit2();


       /* Animal c=new Dog();


        Scanner s=new Scanner(System.in);
        int itr=s.nextInt();
        int i=0;
        while (i<itr){

            int seatNo=s.nextInt();
            int row=seatNo/6;
            int fromRow=(seatNo%6);

            if(fromRow!=0)
                row++;
            String outp="";

            if(row%2==0)
            {

                if(fromRow==1 ) outp=""+(seatNo-1)+" WS";
                else if(fromRow==2) outp=""+(seatNo-3)+" MS";
                else if(fromRow==3) outp=""+(seatNo-5)+" AS";
                else if(fromRow==4)  outp=""+(seatNo-7)+" AS";
                else if(fromRow==5) outp=""+(seatNo-9)+" MS";
                else outp = "" + (seatNo - 10) + " WS";
            }
            else {


                if(fromRow==0) outp=""+(seatNo+1)+" WS";
                else if(fromRow==1) outp=""+(seatNo+11)+" WS";
                else if(fromRow==2) outp=""+(seatNo+9)+" MS";
                else if(fromRow==3)  outp=""+(seatNo+7)+" AS";
                else if(fromRow==4) outp=""+(seatNo+5)+" AS";
                else if(fromRow==5) outp=""+(seatNo+3)+" MS";

            }
            i++;
            l(outp);
        }


*/


    }
}
