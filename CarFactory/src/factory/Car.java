package factory;

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;


    public Car(int horsePower, String fuelSource, String color) {
            this.horsePower = horsePower;
            this.fuelSource = fuelSource;
            this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("The " + fuelSource + " engine has been started, adn it's ready to utilize " + " " + horsePower + "horsepowers.n");
    }
    public void clean (){
        System.out.println("The car has been cleaned, and the " + color.toLowerCase() + " color shines");

    }
    public void mechanicCheck(){
        System.out.println("This car has been checked by the mechanic. everything looks good!");

    }
    public void fuelCar(){
        System.out.println("The car has been filled with " + fuelSource.toLowerCase());
    }

}
