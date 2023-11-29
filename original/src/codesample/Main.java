package codesample;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hey hey people, LinkedList here");
        LinkedList linkedList = new LinkedList();
        Node node = new Node();
        node.setData("uh beibe");
        linkedList.append(node);
        Node nd2 = new Node();
        nd2.setData("the last one");
        linkedList.append(nd2);
        System.out.println(linkedList.getLength());
        System.out.println(linkedList.getLast().getData());
        System.out.println(linkedList.getFirst().getData());
    }
}