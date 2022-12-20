package RecursiveTreeGraph;

// Tree 말단 노드까지의 가장 짧은 경로(DFS)
public class DFSTree {
    NodeTree root;

    public int DFSTree(int L, NodeTree root) {
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFSTree(L+1, root.lt), DFSTree(L+1, root.rt));
    }

    public static void main(String[] args) {
        DFSTree tree = new DFSTree();
        tree.root = new NodeTree(1);
        tree.root.lt = new NodeTree(2);
        tree.root.rt = new NodeTree(3);
        tree.root.lt.lt = new NodeTree(4);
        tree.root.lt.rt = new NodeTree(5);
        System.out.println(tree.DFSTree(0, tree.root));
    }
}

class NodeTree {
    int data;
    NodeTree lt, rt;
    public NodeTree(int val){
        data = val;
        lt=rt=null;
    }
}
