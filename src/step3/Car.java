package step3;

public class Car implements Comparable<Car> {
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

    @Override
    public int compareTo(Car car) {
        if(this.getMake().compareTo(car.getMake()) != 0) {
            if(this.getModel().compareTo(car.getModel()) != 0) {
                return this.getReg().compareTo(car.getReg());
            }else return this.getModel().compareTo(car.getModel());
        } else return this.getMake().compareTo(car.getMake());
    }

    public String getMake() {
        return make;
    }

    public String getReg() {
        return reg;
    }

    public String getModel() {
        return model;
    }

}
