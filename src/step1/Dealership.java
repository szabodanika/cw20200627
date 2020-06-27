package step1;

import java.util.ArrayList;

public class Dealership {
    private String name, owner;
    private ArrayList<String> makes = new ArrayList<>();

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
