package step3;

import java.util.ArrayList;

public class BSTNode implements Comparable<BSTNode> {
    private Car car;
    private BSTNode left, right;

    public BSTNode(Car car, BSTNode left, BSTNode right) {
        this.car = car;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(BSTNode o) {
      return this.car.compareTo(o.car);
    }

    public boolean add(BSTNode bstNode) {
        if(this.compareTo(bstNode) > 0){
            if(this.left != null) this.left.add(bstNode);
            else this.left = bstNode;
            return true;
        } else if(this.compareTo(bstNode) < 0){
            if(this.right != null) this.right.add(bstNode);
            else this.right = bstNode;
            return true;
        } else return false;
    }

    public boolean remove(Car car, BSTNode parent) {
        if (this.car.compareTo(car) > 0) {
            if (left == null) return false;
            return left.remove(car, this);
        } else if (this.car.compareTo(car) < 0) {
            if (right == null) return false;
            return right.remove(car, this);
        } else {
            if (left != null && right != null) {
                findSmallestNode(right).car = this.car;
                right.remove(this.car, this);
            } else if (parent.left == this) {
                parent.left = left != null ? left : right;
            } else if (parent.right == this) {
                parent.right = right != null ? right : left;
            }
            return true;
        }
    }

    public static BSTNode findSmallestNode(BSTNode root) {
        if (root.left == null) return root;
        else return findSmallestNode(root.left);
    }

    public ArrayList<Car> findByMake(String make) {
        ArrayList<Car> found = new ArrayList<>();
        if(this.left != null) found.addAll(this.left.findByMake(make));
        if(this.car.getMake().equals(make)) found.add(this.car);
        if(this.right != null) found.addAll(this.right.findByMake(make));
        return found;
    }

    public ArrayList<Car> findByMakeAndModel(String make, String model) {
        ArrayList<Car> found = new ArrayList<>();
        if(this.left != null) found.addAll(this.left.findByMake(make));
        if(this.car.getMake().equals(make) && this.car.getModel().equals(model)) found.add(this.car);
        if(this.right != null) found.addAll(this.right.findByMake(make));
        return found;
    }

    public Car findByReg(String reg) {
        if(this.car.getReg().equals(reg)) return this.car;
        if(this.left != null) if(this.left.findByReg(reg) != null) return this.left.findByReg(reg);
        if(this.right != null) if(this.right.findByReg(reg) != null) return this.right.findByReg(reg);
        return null;
    }

    public void print() {
        if(this.left != null) this.left.print();
        if(this.right != null) this.right.print();
        System.out.println(this.car);
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }

    public int count() {
        int sum = 0;
        if(this.left != null) sum += this.left.count();
        if(this.right != null) sum += this.right.count();
        return sum++;
    }
}