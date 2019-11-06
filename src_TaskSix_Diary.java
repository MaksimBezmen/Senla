package TaskSix;

public class Diary extends Things{

    private int weight;
    private int cost;
    private String name = "Diary";

    public Diary() {
        weight = 4;
        cost = 500;
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
