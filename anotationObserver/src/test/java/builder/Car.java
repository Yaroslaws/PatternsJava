package builder;



public class Car {
    String make;
    Transmission transmission;
    int maxSpeed;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

enum Transmission {
    MANUAL, AUTO;
}

class CarBuilder {
    String m = "Default";
    Transmission t = Transmission.MANUAL;
    int s = 150;

    CarBuilder speedBuilder(int s) {
        this.s = s;
        return this;
    }

    CarBuilder transmissionBuilder(Transmission t) {
        this.t = t;
        return this;
    }

    CarBuilder builderMake(String m){
        this.m = m;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(m);
        car.setMaxSpeed(s);
        car.setTransmission(t);
        return car;
    }


}