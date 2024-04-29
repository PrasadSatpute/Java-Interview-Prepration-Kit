package org.example.abstract_factory.factory;

import org.example.abstract_factory.factory.Furniture;

public class VictorianFurniture implements Furniture {
    @Override
    public void getChair() {
        System.out.println("Victorian Chair is Build");
    }

    @Override
    public void getSofa() {
        System.out.println("Victorian Sofa is Build");
    }
}
