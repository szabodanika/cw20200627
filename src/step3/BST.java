package step3;

import java.util.ArrayList;

public class BST {
    private BSTNode root;

    public void add(Car car) {
        if(root == null) root = new BSTNode(car, null, null);
        else root.add(new BSTNode(car,null,null));
    }

    public boolean remove(Car car) {
        if(root == null) return false;
        else if(root.isLeaf()) {
            root = null;
            return true;
        } else return root.remove(car, root);
    }

    public ArrayList<Car> findByMake(String make){
        if(root == null) return null;
        else return root.findByMake(make);
    }

    public ArrayList<Car> findByMakeAndModel(String make, String model){
        if(root == null) return null;
        else return root.findByMakeAndModel(make, model);
    }

    public Car findByReg(String reg) {
        return root.findByReg(reg);
    }

    public void printAll() {
        if(root != null) root.print();
        else System.out.println("NOTHING TO SHOW");
    }

    public int getCarsNum() {
        if(root == null) return 0;
        else return root.count();
    }
}
