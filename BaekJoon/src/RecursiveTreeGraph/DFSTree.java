package RecursiveTreeGraph;

// Tree 말단 노드까지의 가장 짧은 경로(DFS)
public class DFSTree {
    Node root;
    public int DFSTree(int L, Node root) {
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFSTree(L+1, root.lt), DFSTree(L+1, root.rt));
    }
    public static void main(String[] args) {
        DFSTree tree = new DFSTree();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFSTree(0, tree.root));
    }
}
