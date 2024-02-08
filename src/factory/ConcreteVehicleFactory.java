package factory;

import product.Car;
import product.Truck;
import product.Vehicle;

public class ConcreteVehicleFactory extends VehicleFactory{

  @Override
  public Vehicle createVehicle(String type) {

    if(type.equalsIgnoreCase("Car")){
      return  new Car();
    }else if (type.equalsIgnoreCase("Truck")){
      return  new Truck();
    }

    return null; // Return null or throw an exception : type is unknown
  }
}
