package in.hoptec;

import java.util.Objects;

public class Print {

    public static void print(Object...objs){
        StringBuilder sbs=new StringBuilder();
        for(Object s:objs){
            if(s!=null)
            sbs.append(s.toString());
            else {
                sbs.append("null");
            }
            sbs.append(" ");
        }
        System.out.println(sbs.toString());
    }

    public static void print(Node n){
        StringBuilder sbs=new StringBuilder();
        while (n!=null){
            sbs.append(n.val).append(" ");
            n=n.next;
        }
        Print.print(sbs.toString());
    }

}
