package 数据结构;

public class Java约瑟夫环 {
    public static void main(String[] args) {
        int wineer = getWineer(10, 3);
        System.out.println(wineer);
    }
    public static int getWineer(int num,int k){
        Node head = new Node();
        Node temp = head;
        for (int i = 1; i <= num ; i++) {
            Node node = new Node(i);
            temp.next = node;
            temp = node;
        }
        temp.next = head.next;
        Node begin = head.next;
        while (begin.next != begin){
            for (int i = 1; i < k ; i++) {
                begin = begin.next;
            }
            Node kill = begin.next;
            begin.next = kill.next;
        }
        return begin.data;
    }
}

class Node{
    int data;
    Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }
}