import java.util.ArrayList;
import java.util.Random;

public class ParkingLot {

    public ArrayList<Car> createList () {
        ArrayList<Car> carList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 255; i++) {
            Car newCar = new Car(Car.Colour.values()[r.nextInt(3)].toString(), Car.Type.values()[r.nextInt(3)].toString());
            carList.add(newCar);
        }
        return carList;
    }

    public void printCars (ArrayList<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            Car temp = carList.get(i);
            System.out.println(temp.colour + " " + temp.type);
        }
    }

    public void countCarTypes (ArrayList<Car> carList) {
        int ladaSum = 0;
        int trabantSum = 0;
        int daciaSum = 0;
        for (int i = 0; i < carList.size(); i++) {
            Car temp = carList.get(i);
            if (temp.type.equals(Car.Type.values()[0].toString())) {
                ladaSum++;
            } else if (temp.type.equals(Car.Type.values()[1].toString())) {
                trabantSum++;
            } else if (temp.type.equals(Car.Type.values()[2].toString())) {
                daciaSum++;
            }
        }
        System.out.println("The number of Ladas: " + ladaSum);
        System.out.println("The number of Trabants: " + trabantSum);
        System.out.println("The number of Dacias: " + daciaSum);
    }

    public void countCarColours (ArrayList<Car> carList) {
        int blueSum = 0;
        int orangeSum = 0;
        int greenSum = 0;
        for (int i = 0; i < carList.size(); i++) {
            Car temp = carList.get(i);
            if (temp.colour.equals(Car.Colour.values()[0].toString())) {
                blueSum++;
            } else if (temp.colour.equals(Car.Colour.values()[1].toString())) {
                orangeSum++;
            } else if (temp.colour.equals(Car.Colour.values()[2].toString())) {
                greenSum++;
            }
        }
        System.out.println("The number of beachFenceBlue cars : " + blueSum);
        System.out.println("The number of sausageFatOrange cars : " + orangeSum);
        System.out.println("The number of babyGooseGreen cars : " + greenSum);
    }

    public void countSameCars (ArrayList<Car> carList) {

        int blueLadaSum = 0;
        int blueTrabantSum = 0;
        int blueDaciaSum = 0;

        int orangeLadaSum = 0;
        int orangeTrabantSum = 0;
        int orangeDaciaSum = 0;

        int greenLadaSum = 0;
        int greenTrabantSum = 0;
        int greenDaciaSum = 0;

        for (int i = 0; i < carList.size(); i++) {
            Car temp = carList.get(i);
            if (temp.colour.equals(Car.Colour.values()[0]) && temp.type.equals(Car.Type.values()[0])) {
                blueLadaSum++;
            } else if (temp.colour.equals(Car.Colour.values()[1]) && temp.type.equals(Car.Type.values()[0])) {
                orangeLadaSum++;
            } else if (temp.colour.equals(Car.Colour.values()[2]) && temp.type.equals(Car.Type.values()[0])) {
                greenLadaSum++;
            } else if (temp.colour.equals(Car.Colour.values()[0]) && temp.type.equals(Car.Type.values()[1])) {
                blueTrabantSum++;
            } else if (temp.colour.equals(Car.Colour.values()[1]) && temp.type.equals(Car.Type.values()[1])) {
                orangeTrabantSum++;
            } else if (temp.colour.equals(Car.Colour.values()[2]) && temp.type.equals(Car.Type.values()[1])) {
                greenTrabantSum++;
            } else if (temp.colour.equals(Car.Colour.values()[0]) && temp.type.equals(Car.Type.values()[2])) {
                blueDaciaSum++;
            } else if (temp.colour.equals(Car.Colour.values()[1]) && temp.type.equals(Car.Type.values()[2])) {
                orangeDaciaSum++;
            } else if (temp.colour.equals(Car.Colour.values()[2]) && temp.type.equals(Car.Type.values()[2])) {
                greenDaciaSum++;
            }
        }

        int[] carSum = {blueLadaSum, blueTrabantSum, blueDaciaSum, orangeLadaSum, orangeTrabantSum, orangeDaciaSum, greenLadaSum, greenTrabantSum, greenDaciaSum};
        int temp = 0;
        int tempI = 0;
        for (int i = 0; i < carSum.length; i++) {
            if (carSum[i] > temp) {
                temp = carSum[i];
                tempI = i;
            }
        }

        switch (tempI) {
            case 0 :
                System.out.println("The most occurred cars are beachFenceBlue Ladas");
                break;

            case 1 :
                System.out.println("The most occurred cars are beachFenceBlue Trabants");
                break;

            case 2 :
                System.out.println("The most occurred cars are beachFenceBlue Dacias");
                break;

            case 3 :
                System.out.println("The most occurred cars are sausageFatOrange Ladas");
                break;

            case 4 :
                System.out.println("The most occurred cars are sausageFatOrange Trabants");
                break;

            case 5 :
                System.out.println("The most occurred cars are sausageFatOrange Dacias");
                break;

            case 6 :
                System.out.println("The most occurred cars are babyGooseGreen Ladas");
                break;

            case 7 :
                System.out.println("The most occurred cars are babyGooseGreen Trabants");
                break;

            case 8 :
                System.out.println("The most occurred cars are babyGooseGreen Dacias");
                break;
        }
    }
}
