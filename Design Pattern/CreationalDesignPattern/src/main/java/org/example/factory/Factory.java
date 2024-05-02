package org.example.factory;

public class Factory {
    public static Transport getTransport(String transportType)
    {
        if (transportType.trim().equalsIgnoreCase("Truck"))
        {
            return new Truck();
        }
        else if (transportType.trim().equalsIgnoreCase("Ship"))
        {
            return new Ship();
        }
        else
        {
            return null;
        }
    }
}
