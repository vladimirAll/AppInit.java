package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCarList(List<Car> carList,int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

