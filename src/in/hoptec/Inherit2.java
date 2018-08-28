package in.hoptec;

public class Inherit2 extends Main   {


    public interface Tes{

        final int x=0;
        void print();

    }

    public static  abstract class Set {


          Set(){
              l("Set.Set");

          }
        public void print() {
             l("Set.print");
        }
    }

    public class HasSet extends Set{

        HasSet(){
            l("HasSet.Set");

        }
        public void print() {
            l("HasSet.print");

        }
    }


    public Inherit2()
    {

     /*   Animal a=new Dog();
        a.sound();;*/

        Set s=new Set() {
            @Override
            public void print() {
                super.print();
            }
        };
        s.print();

        HasSet ss=new HasSet();
        ss.print();
    }












}
