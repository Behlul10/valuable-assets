import java.util.ArrayList;

public class Portfolio implements Valuable {
    public static ArrayList<Valuable> valuables = new ArrayList<>();

    public  Portfolio() {

    }

    public void addValuable(Valuable valuable) {
        valuables.add(valuable);
    }

    public double getValue() {
        double totalVal = 0;
        for (Valuable item: valuables) {
            totalVal += item.getValue();
        }
        return totalVal;
    }
//
//    public ArrayList<Truck> getTrucks() {
//
//    }
}
