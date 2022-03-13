import com.david.Brand;
import com.david.Car;
import com.david.FuelType;

import java.util.List;


public class main {
    public static void main(String[] args) {

        Car sx4 = new Car(Brand.SUZUKI, 5, "personal 4x4", FuelType.BENZINE, 5.6, "sx4");
        Car golf = new Car(Brand.VOLKSWAGEN, 5, "combi 4x4", FuelType.BENZINE, 6.4, "golf");
        Car fabia2 = new Car(Brand.SKODA, 5, "personal 4x2", FuelType.OIL, 5.2, "fabia 2");
        Car mondeo = new Car(Brand.FORD, 5, "personal 4x2", FuelType.OIL, 5, "mondeo");
        Car punto = new Car(Brand.FIAT, 5, "personal 4x2", FuelType.BENZINE, 6.1, "punto");
        Car rada2 = new Car(Brand.BMW, 5, "personal 4x2", FuelType.BENZINE, 7.5, "rada 2");
        Car h1 = new Car(Brand.HYUNDAI, 5, "minibus 4x2", FuelType.OIL, 7, "H 1");
        Car mazda = new Car(Brand.MAZDA, 4, "limusine 4x2", FuelType.BENZINE, 7.2, "6");
        Car rav4 = new Car(Brand.TOYOTA, 5, "SUV 4x4", FuelType.OIL, 6.5, "RAV 4");
        Car astra = new Car(Brand.OPEL, 5, "hatchback 4x2", FuelType.GAS, 4.2, "astra");
        Car model3 = new Car(Brand.TESLA, 5, "liftback 4x4", FuelType.ELECTRIC, 5.9, "model 3");




    }

}
