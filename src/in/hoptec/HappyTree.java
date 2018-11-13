package in.hoptec;

public class HappyTree {



    private int N;
    private String  ch;

    static final int DEF=1,BLACK=DEF+1,RED=BLACK+1,GREEN=RED+1,BLUE=GREEN+1,YELLOW=BLUE+1;

    public HappyTree(int size,String ch)
    {
        this.N=size;
        this.ch=ch;
    }

    public HappyTree(int size)
    {
        this.N =size;
        this.ch=ch;
    }

    public void printf(String c,int color)
    {
        while (color>YELLOW){
            color=color-YELLOW;

        }
        c+="\u001B[40m";
        switch (color)
        {

            case BLACK:
                c+="\u001B[35m";
                break;
            case RED:
                c+="\u001B[31m";
                break;
            case BLUE:
                c+="\u001B[34m";
                break;
            case GREEN:
                c+="\u001B[32m";
                break;
            case YELLOW:
                c+="\u001B[33m";
                break;
            default:
                c+="\u001B[36m";
        }

        System.out.printf(c);
    }




    public void grow () throws Exception
    {
        if(N<7) throw new Exception("Tree Size must be > 7");

        printf("\u001B[40m",RED);
        for(int i=1;i<N-8;i++)printf(" ",RED); printf(" Happy Tree Growing\n",DEF);
        int M=2*N;
        for(int i=1;i<M;i++)
        {
            if(i==N){
                printf(" ",BLUE+i+3);
                for(int j=1;j<M;j++)
                    printf(ch,BLUE+i+3);
            }
             else if(i<N)
                 for(int j=0;j<M;j++)
                 {
                     if(j==N-1 && i==N/2+1)
                     {   printf(":-)",BLUE);
                         j+=2;
                     }
                     else if(N+1 == i +j || N-1 == j-i)
                         printf(ch,DEF+i+3);
                     else
                         printf(" ",DEF+i+3);
                 }
              else
                  for(int j=0;j<M;j++)
                  {   if(j== N-1 || j== N)
                          printf(ch,DEF+i+3);
                      else
                          printf(" ",DEF+i+3);
                  }
            printf("\n",DEF+i+3);
        }
    }



    public static void main(String [] args)
    {

        if(args==null || args.length<2)
        {
            args=new String[2];
            args[0]="9";
            args[1]=".";
        }

        final String [] args2=args;
        HappyTree happyTree=new HappyTree(Integer.valueOf(args2[0]),args2[1]);

        try{

            happyTree.printf("",RED);
            happyTree.printf("\n",RED);
            happyTree.grow();
            happyTree.printf("\n",RED);

        }catch(Exception e)
        {

            e.printStackTrace();
        }




    }






















}
