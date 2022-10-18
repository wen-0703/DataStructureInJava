package 数据结构.Huffman;

public class Node<T> implements Comparable<Node<T>>{
    private T data;
    private double weight;
    private Node right;
    private Node left;

    public Node(T data, double weight) {
        this.data = data;
        this.weight = weight;
    }

    public Node() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                ", right=" + right +
                ", left=" + left +
                '}';
    }

    @Override
    public int compareTo(Node<T> o) {
        if (o.getWeight()>this.getWeight()){
            return 1;
        }else if (o.getWeight()<this.getWeight()){
            return -1;
        }
        else return 0;
    }
}
