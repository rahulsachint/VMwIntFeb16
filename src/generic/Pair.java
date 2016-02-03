package generic;

public class Pair <E extends Clothing & Colored> {
    private E left;
    private E right;

    public Pair(E first, E second) {
        this.left = first;
        this.right = second;
    }

    public E getLeft() {
        return left;
    }

    public void setLeft(E first) {
        this.left = first;
    }

    public E getRight() {
        return right;
    }

    public void setRight(E second) {
        this.right = second;
    }

    public boolean isMatched() {
        return (left.getSize() == right.getSize())
                && (left.getColor() == right.getColor());
    }
    
    @Override
    public String toString() {
        return "TwoOf{" + "first=" + left + ", second=" + right + '}';
    }
    
}
