package collections.mainTask.flowers;

import collections.mainTask.types.RoseVariety;


public class Roses extends Flower {
        private RoseVariety roseVariety;

    public Roses(String name, RoseVariety roseVariety, int lengthStem, int freshness, float cost ) {
        super (name, lengthStem, freshness, cost);
        this.roseVariety = roseVariety;
    }

    public RoseVariety getRoseVariety() {
        return roseVariety;
    }

    public void setRoseVariety(RoseVariety roseVariety) {
        this.roseVariety = roseVariety;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", roseVariety=" + roseVariety +
                        '}' );
    }
}
