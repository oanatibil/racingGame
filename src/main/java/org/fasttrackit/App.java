package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;

        car.engine = new Engine(); // relatie de tip has-a //

        Engine engine = new Engine();
        engine.capacity = 1500;
        engine.manufacturer = "Renault";

        car.engine = engine; //atribuim engine la car//

        Car car2 = new Car();

        engine = null;


    }
}
