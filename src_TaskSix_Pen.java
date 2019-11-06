package TaskSix;

public class Pen extends Things {
    private int weight;
    private int cost;
    private String name = "Pen";

    public Pen() {
        weight = 5;
        cost = 200;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
