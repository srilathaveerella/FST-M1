//Call the methods in the Car class to print the characteristics of the car,
//      and what happens when you accelerate() and brake()
package activities;

public class Activity1 {

    public static void main(String[] args){
        Car tiago = new Car(4,4);
        tiago.make=2014;
        tiago.color="Black";
        tiago.transmission="Manual";
        tiago.displayCharacteristics();
        tiago.accelerate();
        tiago.brake();
    }
}
