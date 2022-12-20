package RecursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

// Tree 말단 노드까지의 가장 짧은 경로(BFS)
public class BFSTree {
    NodeBFSTree root;
    public int BFS(NodeBFSTree root) {
        Queue<NodeBFSTree> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i < len; ++i) {
                NodeBFSTree current = Q.poll();
                if(current.lt == null && current.rt == null) return L;
                if(current.lt != null) Q.offer(current.lt);
                if(current.rt != null) Q.offer(current.rt);
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        BFSTree tree = new BFSTree();
        tree.root = new NodeBFSTree(1);
        tree.root.lt = new NodeBFSTree(2);
        tree.root.rt = new NodeBFSTree(3);
        tree.root.lt.lt = new NodeBFSTree(4);
        tree.root.lt.rt = new NodeBFSTree(5);
        System.out.println(tree.BFS(tree.root));
    }
}
class NodeBFSTree {
    int data;
    NodeBFSTree lt, rt;
    public NodeBFSTree(int val){
        data = val;
        lt=rt=null;
    }
}
