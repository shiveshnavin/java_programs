package in.hoptec.songadt;

public class Node {

    public String name;
    public int dur;

    Node next,prev;

    public Node(String name, int dur) {
        this.name = name;
        this.dur = dur;
    }

    @Override
    public String toString() {
        return name;
    }
}
