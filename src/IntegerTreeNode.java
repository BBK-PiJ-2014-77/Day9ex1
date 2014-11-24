/**
 * Created by digibrose on 24/11/2014.
 */
public class IntegerTreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;



    public IntegerTreeNode(int rootnumber) {
        this.value = rootnumber;
    }

    public void add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            }
            else {
                right.add(newNumber);
            }
        }
        else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            }
            else {
                left.add(newNumber);
            }
        }

    }

    public boolean contains(int n) {
        if (n == this.value)  {
            return true;
        }
        else if (n > this.value) {
            if (right == null) {
                return false;
            }
            else {
                return right.contains(n);
            }
        }
        else {
            if (left == null) {
                return false;
            }
            else {
                return left.contains(n);
            }
        }
    }

    public int getMax() {
        if (right == null) {
            return this.value;
        }
        else {
            return right.getMax();
        }
    }

    public int getMin() {
        if (left == null) {
            return this.value;
        }
        else {
            return left.getMin();
        }
    }

    public String toString() {
        String Output = "";

        if (this.left != null && this.right != null) {
            Output = Output + "[" + value + "L[" + left.toString() + "]R[" + right.toString() + "]";
        }
        if (this.left != null && this.right == null) {
            Output = Output + value + "L[" + left.toString() + "]R[]";
        }
        if (this.right != null  && this.left == null) {
            Output = Output + value + "L[]R[" + right.toString() + "]";
        }
        if (this.left == null && this.right == null) {
            Output = Output + value + "R[]L[]";
        }
        return Output;
    }

    public int getDepth(int depth) {

        if (this.left != null && this.right != null) {
            depth++;
            if (this.left.getDepth(depth) > this.right.getDepth(depth)) {
                return this.left.getDepth(depth);
            }
            else {
                return this.right.getDepth(depth);
            }
        }
        else if (this.left != null && this.right == null) {
            depth++;
            return this.left.getDepth(depth);
        }
        else if (this.right != null  && this.left == null) {
            depth++;
            return this.right.getDepth(depth);
        }
        else {
            return depth;
        }
    }
}

