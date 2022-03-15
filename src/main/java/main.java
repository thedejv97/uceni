import com.david.*;

import java.util.ArrayList;
import java.util.Arrays;
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

        List<Car> listOfCars = Arrays.asList(sx4, golf, fabia2, mondeo, punto, rada2, h1, mazda, rav4, astra, model3);

        List<Garage> listOfGarages = new ArrayList<>();

        if(sx4.getBrand() == Brand.SUZUKI){
            new ArrayList<Garage>(listOfGarages);
}

        if(golf.getBrand() == Brand.VOLKSWAGEN){
            new ArrayList<Garage>(listOfGarages);
        }

        if(fabia2.getBrand() == Brand.SKODA){
            new ArrayList<Garage>(listOfGarages);
        }

        if(mondeo.getBrand() == Brand.FORD){
            new ArrayList<Garage>(listOfGarages);
        }

        if(punto.getBrand() == Brand.FIAT){
            new ArrayList<Garage>(listOfGarages);
        }

        if(rada2.getBrand() == Brand.BMW){
            new ArrayList<Garage>(listOfGarages);
        }
        if(h1.getBrand() == Brand.HYUNDAI){
            new ArrayList<Garage>(listOfGarages);
        }

        if(mazda.getBrand() == Brand.MAZDA){
            new ArrayList<Garage>(listOfGarages);
        }

        if(rav4.getBrand() == Brand.TOYOTA){
            new ArrayList<Garage>(listOfGarages);
        }

        if(astra.getBrand() == Brand.OPEL){
            new ArrayList<Garage>(listOfGarages);
        }

        if(model3.getBrand() == Brand.TESLA){
            new ArrayList<Garage>(listOfGarages);
        }


    }



}










