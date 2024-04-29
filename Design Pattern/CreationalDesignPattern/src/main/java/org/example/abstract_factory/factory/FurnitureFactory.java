package org.example.abstract_factory.factory;

import org.example.abstract_factory.abstract_furniture.FurnitureAbstractFactory;
import org.example.abstract_factory.factory.Furniture;

public class FurnitureFactory {
    public static Furniture getFurniture(FurnitureAbstractFactory abstractFactory)
    {
        return abstractFactory.createFurniture();
    }
}
