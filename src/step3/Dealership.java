package step3;

import java.util.ArrayList;

public class Dealership {
    private String name, owner;
    private ArrayList<String> makes = new ArrayList<>();
    private BST cars = new BST();

    public Dealership(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public ArrayList<String> getMakes() {
        return makes;
    }

    public boolean findMake(String make) {
        for (String m : makes ) {
            if (m.equals(make)) return true;
        }
        return false;
    }

    public boolean addMake(String make) {
        if(!findMake(make)) return makes.add(make);
        return false;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public boolean removeCar(Car car) {
        return this.cars.remove(car);
    }

    public ArrayList<Car> getCarsByMake(String make) {
        return cars.findByMake(make);
    }

    public ArrayList<Car> getCarsByMakeAndModel(String make, String model) {
        return cars.findByMakeAndModel(make, model);
    }

    public Car findCarByReg(String reg) {
        return cars.findByReg(reg);
    }

    public void printAll(){
        cars.printAll();
    }

    public boolean removeMake(String make) {
        return this.makes.remove(make);
    }

    public String getName() {
        return name;
    }

    public int getCarsNum() {
        return cars.getCarsNum();
    }
}
