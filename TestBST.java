package CauTrucDuLieuTreeVaMap.CaiDatCayTimKiemNhiPhan;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("12345");
        tree.insert("1234");
        tree.insert("123");
        tree.insert("1123");
        tree.insert("11234");
        tree.insert("12");
        tree.insert("012");
        tree.insert("021");


        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("Number of node is " + tree.getSize());
//        System.out.println(tree.delete("12"));
//        System.out.println("---------------------------------------");
//        tree.inorder();
    }
}
