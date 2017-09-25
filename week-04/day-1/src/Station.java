public class Station {
    int gasAmount;

    Car car = new Car();

    public void refill () {
        gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
    }

}
