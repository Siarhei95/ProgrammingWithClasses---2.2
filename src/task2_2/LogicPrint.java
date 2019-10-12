package task2_2;
import java.util.Random;

public class LogicPrint {

    public void print(Car brand) {
        String model = brand.getBrand();
        System.out.println("Model avto: " + model);
    }

    public void print1(Car car){
        car.go();
        System.out.println("Engine check completed successfully. Go!");
        car.refuel();
        System.out.println("Attention! Fuel level below acceptable.");
    }

    public void print2(Wheel wheel){
        wheel.changeWheel(3,1);
        Random random = new Random();
        int numberGoodWheels = random.nextInt();
        if(numberGoodWheels!=4) {
            System.out.println("Wheel replacement required.");
        }
    }
}
