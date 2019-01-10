package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

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
        car.setName( "Dacia");
        car.setColor ("white");
        car.doorCount = 4;
        car.setMileage (7.5);
        car.running = true;
        System.out.println(car.toString());
//        System.out.println(car.getName());
//
//        car.engine = new Engine(); // relatie de tip has-a //
//
//        car.engine = engine; //atribuim engine la car//
//
//        Engine engine2 = new Engine();
//        engine2.capacity = 1200;
//        engine.manufacturer = "BMW";
//        Car car2 = new Car(engine2);
//
//        engine = null;
//        AutoVehicle auto1 = new AutoVehicle(engine2);
//        //facem prima masina sa accelereze//
//
//        double carTraveledDistance
//                = car.accelerate(100, 2);

        //example of static variables unique for the whole application//
Vehicle vehicle1 = new Vehicle();
vehicle1.vehicleCount = 1;

Vehicle vehicle2 = new Vehicle();
vehicle2.vehicleCount = 2;

Vehicle.vehicleCount = 3;

        System.out.println("Value from vehicle 1 :" + vehicle1.vehicleCount);
        System.out.println("Value from vehicle 2 :" + vehicle2.vehicleCount);
        System.out.println("Value from vehicle class :" + Vehicle.vehicleCount);

   new AutoVehicle(new Engine ());

   vehicle1.accelerate (34.12);
    vehicle2.accelerate (34.12, 0.8);
    new UFO().accelerate (130, 0.8);


    //polymrphism (an object can take multiple forms)
    Vehicle ufo = new UFO();

    //The type of the variable does not deterine the object's behaviour
    ufo.accelerate (200, 2);

    //the type of the variable determines what methods can be invoked
        //We might need type casting (see below)
        ((UFO) ufo).concealCheating();

    }


    }


