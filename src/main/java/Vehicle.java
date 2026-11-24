public abstract class Vehicle implements Valuable {
    private String makeModel;
    private double initialCost;
    private int initalMilage;
    private int currentMilage;
    final double DEPRECIATION_PER_MILE = 0.05;

    public Vehicle(String makeModel, double initialCost, int initalMilage) {
        this.makeModel = makeModel;
        this.initialCost = initialCost;
        this.initalMilage = initalMilage;
    }

    public void drive (int miles) {
        this.currentMilage += miles;
    }

    public double getValue() {
        int milesDrove = (this.currentMilage - this.initalMilage);
        return this.initialCost - (milesDrove * DEPRECIATION_PER_MILE);
    }
}
