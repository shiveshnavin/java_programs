package in.shivesh.songadt;

public class Node {

    public String name;
    public String dur;

    Node next,prev;

    public Node(String name, String dur) {
        this.name = name;
        this.dur = dur;
    }

    @Override
    public String toString() {
        return name;
    }
}
