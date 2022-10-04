package web.service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    public List<Car> getCars(int number) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Brand_1", "Model_1", 111));
        cars.add(new Car("Brand_2", "Model_2", 222));
        cars.add(new Car("Brand_3", "Model_3", 333));
        cars.add(new Car("Brand_4", "Model_4", 444));
        cars.add(new Car("Brand_5", "Model_5", 555));
        cars.add(new Car("Brand_6", "Model_6", 666));
        cars.add(new Car("Brand_7", "Model_7", 777));

        if (number == 0 || number > cars.size()) {
            return cars;
        }

        return cars.stream().limit(number).collect(Collectors.toList());
    }
}
