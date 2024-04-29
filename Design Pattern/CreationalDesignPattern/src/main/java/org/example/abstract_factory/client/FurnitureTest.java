package org.example.abstract_factory.client;

import org.example.abstract_factory.abstract_furniture.ModernFurnitureAbstarctFactory;
import org.example.abstract_factory.abstract_furniture.VictorianFurnitureAbstractFactory;
import org.example.abstract_factory.factory.Furniture;
import org.example.abstract_factory.factory.FurnitureFactory;

import java.util.Scanner;

public class FurnitureTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String furnitureType;
        Furniture furniture = null;
        while (true)
        {
            System.out.println("Select Furniture [Modern,Victorian]");
            furnitureType = sc.nextLine();
            if(furnitureType.trim().equalsIgnoreCase("Modern"))
            {
                furniture = FurnitureFactory.getFurniture(new ModernFurnitureAbstarctFactory());
                furniture.getChair();
                furniture.getSofa();
            } else if (furnitureType.trim().equalsIgnoreCase("Victorian")) {
                furniture = FurnitureFactory.getFurniture(new VictorianFurnitureAbstractFactory());
                furniture.getChair();
                furniture.getSofa();
            }
            else {
                System.out.println("Thank You");
                break;
            }
        }
    }
}
