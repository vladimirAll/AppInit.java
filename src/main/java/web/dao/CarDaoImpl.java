package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList;
    {
        carList = new ArrayList<>();

        carList.add(new Car("KIA", "OPTIMA", "white"));
        carList.add(new Car("NISSAN", "QASHQAI", "blue"));
        carList.add(new Car("KIA", "SPORTAGE", "grey"));
        carList.add(new Car("VOLKSWAGEN", "JETTA", "white"));
        carList.add(new Car("OPEL", "ASTRA", "black"));
    }

    public List<Car> getCarList(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
