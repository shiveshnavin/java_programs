package in.hoptec;

import java.util.*;
import java.util.function.Consumer;

public class Airtel {

    static int x= 22;
    static {
        x = x/11;
    }

    public static class MyIterator implements Iterator<Integer>{

        Iterator<Integer> org;
        Integer last = null;

        public MyIterator(Iterator<Integer> i){
            org = i;
            last = i.next();
        }

        private static int x(){
            return 0;
        }

        @Override
        public boolean hasNext() {
            return org.hasNext();
        }

        @Override
        public Integer next() {

            Integer prev = last;

            while (org.hasNext()){
                last = org.next();
                if(last != prev)
                {
                    prev = last;
                    while (org.hasNext() && org.next() == prev);
                    break;
                }

            }

            while (org.hasNext()){

              last = org.next();
              if(last == prev)
                  continue;
              else
                  break;
            }

            return prev;
        }
    }

    /**
     * ArrayList of LinkedList,, sorted
     * @param args
     */
    public static void main(String[] args) {
//
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(4);
//        a.add(6);
//        a.add(6);
//
//        Iterator<Integer> fin = getDistinct(a.iterator());
//        while (fin.hasNext()){
//            System.out.println(fin.next());
//        }

        System.out.println(Airtel.x);

    }

    public static Iterator getDistinct(Iterator orig){
        return new MyIterator(orig);
    }

}
