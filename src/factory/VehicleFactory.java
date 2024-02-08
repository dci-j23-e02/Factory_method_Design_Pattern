package factory;

import product.Vehicle;

public abstract class VehicleFactory {
// Factory Method
  public abstract Vehicle createVehicle(String type);
}
