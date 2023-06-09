package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;
    public CarServiceImpl(CarDao carDao){
        this.carDao=carDao;
    }
    @Override
    @Transactional
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    @Transactional
    public List<Car> listCars() {
        return carDao.listCars();
    }
}
