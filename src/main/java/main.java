import com.david.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class main {
    public static void main(String[] args) {

        Car sx4 = new Car(Brand.SUZUKI, 5, "personal 4x4", FuelType.BENZINE, 5.6, "sx4");
        Car golf = new Car(Brand.VOLKSWAGEN, 5, "combi 4x4", FuelType.BENZINE, 6.4, "golf");
        Car fabia2 = new Car(Brand.SKODA, 5, "personal", FuelType.OIL, 5.2, "fabia 2");
        Car rapid = new Car(Brand.SKODA, 5, "personal", FuelType.OIL, 4.8, "rapid");
        Car octavia = new Car(Brand.SKODA, 5, "personal", FuelType.OIL, 5.6, "octavia");
        Car mondeo = new Car(Brand.FORD, 5, "personal", FuelType.OIL, 5, "mondeo");
        Car focus = new Car(Brand.FORD, 5, "personal", FuelType.OIL, 7.4, "focus");
        Car punto = new Car(Brand.FIAT, 5, "personal", FuelType.BENZINE, 6.1, "punto");
        Car rada2 = new Car(Brand.BMW, 5, "personal", FuelType.BENZINE, 7.5, "rada 2");
        Car h1 = new Car(Brand.HYUNDAI, 5, "minibus", FuelType.OIL, 7, "H 1");
        Car mazda = new Car(Brand.MAZDA, 4, "limusine", FuelType.BENZINE, 7.2, "6");
        Car rav4 = new Car(Brand.TOYOTA, 5, "SUV 4x4", FuelType.BENZINE, 6.5, "RAV 4");
        Car yaris = new Car(Brand.TOYOTA, 5, "SUV 4x4", FuelType.BENZINE, 4.5, "yaris");
        Car astra = new Car(Brand.OPEL, 5, "hatchback", FuelType.GAS, 4.2, "astra");
        Car model3 = new Car(Brand.TESLA, 5, "liftback 4x4", FuelType.ELECTRIC, 5.9, "model 3");

        List<Car> listOfCars = Arrays.asList(sx4, golf, fabia2, rapid, octavia, mondeo, focus, punto, rada2, h1, mazda, rav4, yaris, astra, model3);

        List<Garage> listOfGarages = new ArrayList<>();

        for (Car car : listOfCars) {
            if (!listOfGarages.isEmpty()) {
                boolean garageFound = false;
                for (Garage currentGarage : listOfGarages) {
                    if (currentGarage.getBrand().equals(car.getBrand())) {
                        currentGarage.addCar(car);
                        garageFound = true;
                        break;
                    }
                }
                if (!garageFound) {
                    Garage newGarage = new Garage(car.getBrand(), car);
                    listOfGarages.add(newGarage);
                }
            } else {
                Garage newGarage = new Garage(car.getBrand(), car);
                listOfGarages.add(newGarage);
            }
        }
        System.out.println("listOfGarages = " + listOfGarages);
    }



}










