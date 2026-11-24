public class Truck extends Vehicle{
    int cargoTons;

    //makeModel, double initialCost, int initalMilage
    public Truck(String makeModel, double initialCost, int initalMilage, int cargoTons) {
        super(makeModel, initialCost, initalMilage);
        this.cargoTons = cargoTons;
    }
}
