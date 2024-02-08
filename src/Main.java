import factory.ConcreteVehicleFactory;
import factory.VehicleFactory;
import product.Vehicle;

public class Main {

  public static void main(String[] args) {
    VehicleFactory factory = new ConcreteVehicleFactory();

    Vehicle car = factory.createVehicle("Car");
    car.drive();

    Vehicle truck = factory.createVehicle("truck");
    truck.drive();
  }
}
