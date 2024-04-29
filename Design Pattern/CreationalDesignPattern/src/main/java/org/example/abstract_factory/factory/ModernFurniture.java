package org.example.abstract_factory.factory;

import org.example.abstract_factory.factory.Furniture;

public class ModernFurniture implements Furniture {
    @Override
    public void getChair() {
        System.out.println("Modern Chair is Build");
    }

    @Override
    public void getSofa() {
        System.out.println("Modern Sofa is Build");
    }
}
