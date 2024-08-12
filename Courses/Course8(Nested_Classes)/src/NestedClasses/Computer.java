package NestedClasses;
/**
 * Computer
 */
public class Computer {

    double price;

    class CPU{
        double buzzSpeed;
        String manufacturer;

        double getSpeed(){
            return 4.2;
        }

        String getManufacturer(){
            return manufacturer;
        }
    }

    protected class RAM{
        double memorySize;
        String manufacturer;

        double getMemorySize(){
            return 16000;
        }

        String getManufacturer(){
            return manufacturer;
        }
    }
}