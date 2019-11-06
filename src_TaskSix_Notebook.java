package TaskSix;

public class Notebook extends Things {
    private int weight;
    private int cost;
    private String name = "Notebook";


    public Notebook() {
        weight = 3;
        cost = 400;
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
