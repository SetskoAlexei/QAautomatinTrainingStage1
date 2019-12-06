package collections.mainTask.flowers;

public class Flower {
    private String name;
    private int lengthStem;
    private int freshness;
    private float cost;

    public Flower(String name, int lengthStem, int freshness, float cost) {
        this.name = name;
        this.lengthStem = lengthStem;
        this.freshness =  freshness;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthStem() {
        return lengthStem;
    }

    public void setLengthStem(int lengthStem) {
        this.lengthStem = lengthStem;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer (" Flower{");
        sb.append ("name='").append (name).append ('\'');
        sb.append (", lengthStem=").append (lengthStem);
        sb.append (", freshness=").append (freshness);
        sb.append (", cost=").append (cost);
        sb.append ('}');
        return sb.toString ();
    }
}

