package web.carService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.carDao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarService {

    private final CarDao carDao;

    @Autowired
    public CarService  (CarDao carDao) {
        this.carDao = carDao;
    }

    public List <Car> carList (){
        return carDao.listCars();
    }


}
