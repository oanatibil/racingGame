package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.capacity = 1500;
        engine.manufacturer = "Renault";
        engine.expiryDate = LocalDateTime.now().minusYears(10);

        Car car = new Car(engine);
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;

        car.engine = new Engine(); // relatie de tip has-a //

        car.engine = engine; //atribuim engine la car//

        Engine engine2 = new Engine();
        engine2.capacity = 1200;
        engine.manufacturer = "BMW";
        Car car2 = new Car(engine2);

        engine = null;

        //facem prima masina sa accelereze//

        double carTraveledDistance
                = car.accelerate(100, 2);




    }
}
