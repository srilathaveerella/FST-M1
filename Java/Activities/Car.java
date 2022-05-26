package activities;
public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car(int tyres,int doors){
        this.tyres=tyres;
        this.doors=doors;
    }
   void displayCharacteristics() {
       System.out.println("color:"+color+"  transmission: "+transmission+"  make: "+make+"  tyres: "+tyres+"  doors: "+doors);
   }
   void accelerate(){
       System.out.println("Car is moving forward");
   }
   void brake(){
       System.out.println("Car has stopped");
   }

}
