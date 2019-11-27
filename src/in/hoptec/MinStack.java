package in.hoptec;

public class MinStack extends Stack{


    int minEle;
    public MinStack() {
        super();
    }

    @Override
    public void push(int val) {
        if(top==null)
        {
            minEle=val;
        }
        else if(val<minEle)
        {
            int tmpVal=val;
            val=2*val-minEle;
            minEle=tmpVal;
        }
        super.push(val);
    }

    @Override
    public int pop() {
        int val= super.pop();
        if(val==-1)
            return -1;

        if(val<minEle)
        {
            int prevMinele=2*minEle-val;
            val=minEle;
            minEle=prevMinele;
        }

        return val;
    }

    @Override
    public void printAll() {

        Node tmp=top;
        if(tmp!=null)
        {
            int min=minEle;
            System.out.println("Min Ele "+min);
            while (tmp!=null)
            {
                if(tmp.val<min){

                    int prevMinele=2*min-tmp.val;
                    tmp.val=min;
                    min=prevMinele;
                }
                System.out.print(" "+tmp.val);

                tmp=tmp.next;
            }

            System.out.println("--");
        }

    }

    public static void main(String args[])
    {

        Stack s=new MinStack();
        s.push(100);
        s.push(23);
        s.printAll();
        s.push(6);
        s.push(10);
        s.push(2);
        s.printAll();
        s.push(9);
        s.push(1);
        s.pop();
        s.push(45);

        s.printAll();




    }





}
