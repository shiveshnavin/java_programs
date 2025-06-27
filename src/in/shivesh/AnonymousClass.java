package in.shivesh;

import java.util.*;

public class AnonymousClass {

    public static abstract class A{
        public A(int x){

        }

         public abstract void x() throws RuntimeException;
    }

    public static void main(String[] args) {
        A a = new A(2){

            public int A(int x){
               return 2;
            }

            public void x() {

            }
        };
        a.x();

        String xxx = "aaa";
        String yyy = new String("aaa");

        System.out.println(xxx == yyy.intern());
    }

}
