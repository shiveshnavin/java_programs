package in.shivesh;

public class BaseClass {

    public static void l(String l)
    {
        System.out.println(""+l);
    }
    public static abstract class Animal
    {
        String name="Animal";
        public
        abstract void sound();
        void junmp()
        {
            l("->"+name+ " is Jumping");
        }
    }

    public static class Mammal extends Animal
    {

        public Mammal()
        {
            name="Mammal";
        }

        public Mammal bleh(){
            return null;
        }

        public void sound() {

            l("->"+name+ " is making Sound");

        }
    }
    public static class Dog extends Mammal
    {

        public Dog()
        {
            name="Dog";
        }

        public Dog bleh(){
            return null;
        }

        public void sound() {

            l("->"+name+ " is Barking");

        }



    }


    public static class Puppy extends Dog
    {

        public Puppy()
        {
            name="Puppy";
        }

        public void sound() {

            l("->"+name+ " is Squealing");

        }
    }


}
