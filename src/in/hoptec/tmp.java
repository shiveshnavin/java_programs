package in.hoptec;

public class  tmp {


    // start 12:40 AM

    public static void main(String[] args) {

        ex x=new ex();
        Object ex2=x.clone();

    }

    public static int midElement(Node n,int curDepth){

        if(n.next==null)
            return curDepth;

        int depth=midElement(n.next,curDepth+1);

        if(curDepth-1==depth/2){
            System.out.println(n.val);
        }

        return depth;
    }


    public static class ex {

        public ex(){

        }

        final public void x(){

        }

        @Override
        public ex clone(){
            return null;
        }

    }


    public static class ex2 extends ex {

        public ex2(){

        }

        final public void x(int y){

        }


    }

}
