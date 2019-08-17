package in.hoptec;

public class WeFight {
    public static void main(String [] args) throws Exception
    {

        String messageToYou [] ={"We are Navins !",
                "We Fight , Because Thats what we do..",
                "Thats Who We Are ",
                "We will win due to the simple fact that we dont quit ",
                "And You know why ? Because We are Navins and thats what we do..",
                "We Fight , We Fight till we win , or till we take our last breath",
                "We Fight , We Fight Like Hell , We just dont Quit . ",
                "Because We are Navins , Thats who we are , and Thats what we do . WE FIGHT ! ",
                "Dont Worry ! You will make it ! God is there for you ! All you have to do is FIGHT !"};

        for(String msg:messageToYou)
        {
            System.out.println(msg);
            Thread.sleep(3000);
        }

    }
}
