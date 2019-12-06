package collections.mainTask.accesories;


public class Accessories {
    private String nameAccessories;
    private float cost;

    public Accessories(String nameAccessories, float cost) {
        this.nameAccessories = nameAccessories;
        this.cost = cost;
    }

    public String getNameAccessories() {
        return nameAccessories;
    }

    public void setNameAccessories(String nameAccessories) {
        this.nameAccessories = nameAccessories;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer ("Accessories{");
        sb.append ("nameAccessories='").append (nameAccessories).append ('\'');
        sb.append (", cost=").append (cost);
        sb.append ('}');
        return sb.toString ();
    }
}