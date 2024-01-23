package PlantInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PlantArrayListExample {

    // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects
    public static void printArrayList(ArrayList<Plant> list){
        int count = 1;
        for(Plant plant : list){
            System.out.println("Plant " + count + " Information: ");
            plant.printInfo();
            System.out.println();
            ++count;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<>();

        // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
        String plantName, plantCost, flowerName, flowerCost, colorOfFlowers;
        boolean isAnnual;

        Plant plant;
        Flower flower;

        input = scan.next();
        while(!input.equals("-1")){
            // TODO: Check if input is a plant or flower
            //       Store as a plant object or flower object
            //       Add to the ArrayList myGarden
            if(input.equals("plant")){
                plantName = scan.next();
                plantCost = scan.next();

                plant = new Plant();
                plant.setPlantName(plantName);
                plant.setPlantCost(plantCost);

                myGarden.add(plant);
            }else if(input.equals("flower")){
                flowerName = scan.next();
                flowerCost = scan.next();
                isAnnual = scan.nextBoolean();
                colorOfFlowers = scan.next();

                flower = new Flower();
                flower.setPlantName(flowerName);
                flower.setPlantCost(flowerCost);
                flower.setPlantType(isAnnual);
                flower.setColorOfFlowers(colorOfFlowers);

                myGarden.add(flower);
            }

            input = scan.next();
        }

        // TODO: Call the method printArrayList to print myGarden
        printArrayList(myGarden);

    }
}