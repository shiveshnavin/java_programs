package in.shivesh.songadt;

import java.util.Scanner;

public class SongPlaylist {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("1. Automated Execution \n2. Manual Execution \nEnter Choice : ");
        int ch=sc.nextInt();

        if(ch==1)
        {
            automated();
        }
        else
        {
            LinkedList linkedList=new LinkedList();
            Node current = null;
            do{
                if(current!=null)
                {
                    System.out.println("\nCurrently Playing : "+current.name);
                }
                System.out.println(
                                "1. Add a song to the playlist\n" +
                                "2. Delete a song from the playlist\n" +
                                "3. Find a song by name\n" +
                                "4. Next track / Previous track\n" +
                                "5. Sort playlist by song title\n" +
                                "6. Display playlist\n" +
                                "7. Exit\n" +
                                        "Enter Choice : ");
                ch=sc.nextInt();
                switch (ch)
                {
                    case 1:
                        System.out.println("Enter Song Name : ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.println("Enter Song Duration : ");
                        String dur = sc.nextLine();
                        linkedList.addSong(name,dur);
                        System.out.println("Added to playlist : "+name);
                        if(current==null) current=linkedList.getSongAtPos(0);
                        break;
                    case 2:
                        System.out.println("Enter Track Number : ");
                        linkedList.deleteAtPos(sc.nextInt());
                        break;
                    case 3:
                       System.out.println("Enter Song Name : ");sc.nextLine();
                        int pos=linkedList.findSong(sc.nextLine());
                        System.out.println(pos!=-1 ? "Found at position "+pos:"Not Found  !");;
                        break;
                    case 4:
                        System.out.println(" 1. Next \n 2. Prev\n Enter Choice : ");
                        if(current==null) System.out.println("No Songs Available !");
                        else if(sc.nextInt()==1)
                        {
                            if(current.next!=null) {
                                current=current.next;
                            }
                            else
                                System.out.println("No Next Song Available !");
                        }
                        else
                        {
                            if(current.prev!=null) {
                                current=current.prev;
                            }
                            else
                                System.out.println("No Prev Song Available !");
                        }
                        break;
                    case 5:
                        linkedList.sortList();
                        System.out.println("List Sorted !");
                        linkedList.display();
                        break;
                    case 6:
                        linkedList.display();
                        break;

                }



            }while (ch>0 && ch<7);
        }



    }

    private static void automated() {
        LinkedList linkedList=new LinkedList();
        linkedList.addSong("Dance with the Devil","<3:32>");
        linkedList.addSong("Faded","<4:15>");
        linkedList.addSong("In The End","<3:23>");
        linkedList.addSong("Ignite","<5:12>");
        linkedList.addSong("Alan Walker Alone","<6:23>");
        linkedList.addSong("Rolling in the deep","<4:45>");


        linkedList.display();

        System.out.println("");
        System.out.println("Song at Pos 2 : "+linkedList.getSongAtPos(2));

        linkedList.deleteAtPos(0);
        System.out.println("List after deleting song at post 2");
        linkedList.display();

        System.out.println("Position of song 'Faded' : "+linkedList.findSong("Faded"));

        linkedList.sortList();
        System.out.println("PlayList after sort : ");
        linkedList.display();
    }
}
