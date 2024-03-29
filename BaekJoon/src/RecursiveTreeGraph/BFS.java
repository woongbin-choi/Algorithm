package RecursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

// 넓이우선탐색
public class BFS {
    Node root;
    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i = 0; i < len; ++i) {
                Node current = Q.poll();
                System.out.print(current.data + " ");
                if(current.lt != null) {
                    Q.offer(current.lt);
                }
                if (current.rt != null) {
                    Q.offer(current.rt);
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root=new Node(0);
        tree.root.lt=new Node(1);
        tree.root.rt=new Node(2);
        tree.root.lt.lt=new Node(3);
        tree.root.lt.rt=new Node(4);
        tree.root.rt.lt=new Node(5);
        tree.root.rt.rt=new Node(6);
        tree.BFS(tree.root);
    }
}

class NodeBFS {
    int data;
    NodeBFS lt, rt;
    public NodeBFS(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}
