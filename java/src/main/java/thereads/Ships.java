package thereads;

public class Ships {
    private String name;
    private int capacity;
    ShipTarget shipTarget;

    public Ships(String name, int capacity, ShipTarget shipTarget) {
        this.name = name;
        this.capacity = capacity;
        this.shipTarget = shipTarget;
    }

    public Ships() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ShipTarget getShipTarget() {
        return shipTarget;
    }

    public void setShipTarget(ShipTarget shipTarget) {
        this.shipTarget = shipTarget;
    }
}
