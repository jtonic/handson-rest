package ro.jtonic.handsonrest.api;

import ro.jtonic.handsonrest.model.Car;

/**
 * Created by jtonic on 9/11/13.
 */
public class CarResource implements ICarResource {
    @Override
    public Car getCarById(String carId) {
        return new Car("bmw", "black");
    }
}
