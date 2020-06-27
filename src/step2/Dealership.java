package step2;

import java.util.ArrayList;

public class Dealership {
    private String name, owner;
    private ArrayList<String> makes = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();

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

    public boolean addCar(Car car) {
        return this.cars.add(car);
    }

    public boolean removeCar(Car car) {
        return this.cars.remove(car);
    }

    public ArrayList<Car> getCarsByMake(String make) {
        ArrayList<Car> cars = new ArrayList<>();
        for(Car c : this.cars) if(c.getMake().equals(make)) cars.add(c);
        return cars;
    }

    public ArrayList<Car> getCars() {
       return cars;
    }

    public Car findCarByReg(String reg) {
        for(Car c : cars) if (c.getReg().equals(reg)) return c;
        return null;
    }

    public boolean removeMake(String make) {
        return this.makes.remove(make);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
