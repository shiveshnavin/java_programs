package in.hoptec.songadt;

public class SongPlaylist {

    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();
        linkedList.addSong("in your head",90);
        linkedList.addSong("passengers",600);
        linkedList.addSong("despacito",120);
        linkedList.addSong("in the end",110);
        linkedList.addSong("immigrant song",430);

        linkedList.display();

        System.out.println("");
        System.out.println(linkedList.getSongAtPos(2));
//
//        linkedList.deleteAtPos(2);
//        linkedList.display();

        System.out.println(linkedList.findSong("passengers"));

        linkedList.swap(linkedList.getSongAtPos(1),linkedList.getSongAtPos(3));
        linkedList.display();

    }
}
