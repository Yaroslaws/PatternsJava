package builder;

import Observer.Look;
import Observer.Reacting;
import Observer.WhoToFollow;

public class Runner {


    public static void main(String[] args) {

        Car car = new CarBuilder().builderMake("BMW")
                .speedBuilder(250)
                .transmissionBuilder(Transmission.AUTO)
                .build();
        System.out.println(car.make + " " + car.transmission + " " + car.maxSpeed);
    }
}
