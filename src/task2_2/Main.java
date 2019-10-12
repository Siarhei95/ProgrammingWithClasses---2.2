////Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

package task2_2;

public class Main {
    public static void main(String[] args) {
        String brand = "Mersedes";
        Car car = new Car(brand);
        Wheel wheel = new Wheel();
        Engine engine = new Engine();
        LogicPrint printer = new LogicPrint();


        printer.print(car);
        printer.print1(car);
        printer.print2(wheel);

    }
}
