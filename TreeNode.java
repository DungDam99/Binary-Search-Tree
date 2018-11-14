package CauTrucDuLieuTreeVaMap.CaiDatCayTimKiemNhiPhan;

public class TreeNode<E> {
    private E element;
    TreeNode<E> left;
    TreeNode<E> right;
    public TreeNode(){

    }
    public TreeNode(E e){
        this.setElement(e);
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

}
