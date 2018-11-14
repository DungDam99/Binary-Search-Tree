package CauTrucDuLieuTreeVaMap.CaiDatCayTimKiemNhiPhan;


public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size;

    public BST(){

    }

    public BST(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

//    public java.util.List<TreeNode<E>> path(E e){
//
//    }



    @Override
    public boolean insert(E e) {
        if (root == null){
            root = new TreeNode(e);
        }else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while(current != null){
                if(e.compareTo(current.getElement()) < 0){
                    parent = current;
                    current = current.left;
                }else{
                    if (e.compareTo(current.getElement()) > 0){
                        parent = current;
                        current = current.right;
                    }else{
                        return false;
                    }
                }
            }
            if(e.compareTo(parent.getElement()) < 0){
                parent.left = new TreeNode(e);
            }else{
                parent.right = new TreeNode(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void inorder(TreeNode<E> root){
        if (root == null)  return;
        inorder(root.left);
        System.out.println(root.getElement() + "\t");
        inorder(root.right);
    }

    public void preOrder(TreeNode<E> root){
        if (root == null) return;
        System.out.println(root.getElement() + "\n");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode<E> root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.getElement() + "\n");
    }

    public TreeNode<E> search(E element){
        TreeNode<E> current = root;
        while(current != null){
            if (element.compareTo(current.getElement()) < 0){
                current = current.left;
            }else{
                if (element.compareTo(current.getElement()) > 0){
                    current = current.right;
                }else{
                    return current;
                }
            }
        }
        return null;
    }

    public TreeNode<E> searchParentOfElement(E element){
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        while(current != null){
            if (element.compareTo(current.getElement()) < 0){
                parent = current;
                current = current.left;
            }else{
                if (element.compareTo(current.getElement()) > 0){
                    parent = current;
                    current = current.right;
                }else{
                    return parent;
                }
            }
        }
        return null;
    }

    ///////////////////////////////
    public TreeNode<E> searchMostRight(TreeNode<E> e) {
        TreeNode<E> current = e;
        while (current != null) {
                current = current.left;
        }
        return current;
    }

    public boolean delete(E e){
            return true;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

}
//        TreeNode<E> current = search(e);
//        if (search(e) == null){
//            return true;
//        }
//        TreeNode<E> parent = searchParentOfElement(e);
//        if (current.left == null && current.right == null){
//            if (parent.left == current) {
//                parent.left = null;
//            }else{
//                parent.right = null;
//            }
//            return true;
//        }else{
//            if (current.left != null && current.right == null){
//                if(parent.left == current){
//                    parent.left = current.left;
//                }else{
//                    parent.right = current.left;
//                }
//            }else{
//                if (current.left == null && current.right != null){
//                    if(parent.right == current){
//                        parent.right = current.right;
//                    }else{
//                        parent.left = current.right;
//                    }
//                }else{
//                    ////Thay thế dữ liệu
//                    TreeNode<E> mostRight = searchMostRight(current.right);
//                    current = mostRight;
//                    mostRight.
//                }
//            }
//                   }