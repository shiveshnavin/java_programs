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


        try{

            Sort ms=new InsertSort();
            ms.sort();


        }catch(Exception e)
        {
            e.printStackTrace();
        }




    }
}
