package bt;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        BinaryTrees Node = new BinaryTrees(null,null, 50);
        BinaryTrees.setRoot(Node);
        BinaryTrees.insertNode(13, Node);
        BinaryTrees.insertNode(1000, Node);
        BinaryTrees.insertNode(53, Node);
        BinaryTrees.insertNode(12, Node);
        BinaryTrees.insertNode(44, Node);
        BinaryTrees.insertNode(11, Node);
        BFS(Node);
    }

    public static void BFS(BinaryTrees Node){
        Queue<BinaryTrees> Queue = new LinkedList<BinaryTrees>();

        Queue.add(Node);
        while (!Queue.isEmpty()){
            BinaryTrees CNode = Queue.poll();
            System.out.print(CNode.getValue() + " ");
            if (CNode.getLeft() != null){
                Queue.add(CNode.getLeft());
            }
            if (CNode.getRight() != null){
                Queue.add(CNode.getRight());
            }
        }
    }
}
