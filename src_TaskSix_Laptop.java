package TaskSix;

public class Laptop extends Things {


    private int weight;
    private int cost;
    private String name = "Laptop";

    public Laptop() {
        weight = 10;
        cost = 1000;
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
