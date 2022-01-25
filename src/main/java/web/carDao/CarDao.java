package web.carDao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("brand1","model1","color1"));
        cars.add(new Car("brand2","model2","color2"));
        cars.add(new Car("brand3","model3","color3"));
        cars.add(new Car("brand4","model4","color4"));
        cars.add(new Car("brand5","model5","color5"));
    }

    public List <Car> listCars () {
        return cars;
    }
}
