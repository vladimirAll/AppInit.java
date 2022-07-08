package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarDaoImpl carDaoImpl = new CarDaoImpl();

    @Override
    public List<Car> getCarList(int count) {
        return carDaoImpl.getCarList(count);
    }
}
