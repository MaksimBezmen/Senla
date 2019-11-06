package TaskSix;

public class Book extends Things {

    private int weight;
    private int cost;
    private String name = "Book";

    public Book() {
        weight = 8;
        cost = 600;
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
