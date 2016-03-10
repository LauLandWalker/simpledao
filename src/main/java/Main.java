/**
 * Created by lauroalarcon on 3/10/16.
 */

import com.hopcroft.examples.dao.CarDaoImpl;
import com.hopcroft.examples.domain.Car;
import com.hopcroft.examples.dao.CarDao;
public class Main {
    public static void main(String[] args) {


        CarDaoImpl carDao = new CarDaoImpl();
        Car newCar = new Car();
        newCar.setId(3);
        newCar.setCompany("Ford");
        newCar.setModel("Lynx");
        newCar.setPrice(10000);

    }
}
