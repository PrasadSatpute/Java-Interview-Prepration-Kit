package org.example.abstract_factory.abstract_furniture;

import org.example.abstract_factory.factory.Furniture;
import org.example.abstract_factory.factory.VictorianFurniture;

public class VictorianFurnitureAbstractFactory extends FurnitureAbstractFactory{
    @Override
    public Furniture createFurniture() {
        return new VictorianFurniture();
    }
}
