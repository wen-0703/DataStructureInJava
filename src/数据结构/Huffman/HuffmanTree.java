package 数据结构.Huffman;

import java.util.Collections;
import java.util.List;

public class HuffmanTree<T> {
    public Node<T> creatTree(List<Node<T>> nodes){
        while (nodes.size()>1){
            Collections.sort(nodes);
            Node<T> left = nodes.get(nodes.size() - 1);
            Node<T> right = nodes.get(nodes.size() - 2);
            Node<T> parent = new Node<>(null, left.getWeight() + right.getWeight());
            parent.setLeft(left);
            parent.setRight(right);
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }


}
