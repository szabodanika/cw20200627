package step2;

public class Car {
    private String make, reg, model, colour;

    public Car(String make, String reg, String model, String colour) {
        this.make = make;
        this.reg = reg;
        this.model = model;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "MAKE: '" + make + '\'' +
                "REGISTRATION: '" + reg + '\'' +
                "MODEL: " + model + '\'' +
                "COLOUR: '" + colour + '\'';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
