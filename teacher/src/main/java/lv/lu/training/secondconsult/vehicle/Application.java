package lv.lu.training.secondconsult.vehicle;

public class Application {
    public static void main(String[] args) {
        Driveable bicycle = new Bicycle();
        Driveable car = new Car();
        Driveable truck = new Truck();
        Driveable scooter = new Scooter();
        Driveable bicycle1 = new Bicycle();
        Driveable[] array = {bicycle, car, truck, scooter, bicycle1};

        for( Driveable driveable: array){
            driveable.drive();
        }
    }
}
