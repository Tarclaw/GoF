package edu.examples.creational.c_builder.builders;

import edu.examples.creational.c_builder.cars.Type;
import edu.examples.creational.c_builder.components.Engine;
import edu.examples.creational.c_builder.components.GPSNavigator;
import edu.examples.creational.c_builder.components.Transmission;
import edu.examples.creational.c_builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
