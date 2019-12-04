package collections.mainTask.flowers;


import collections.mainTask.types.PeoniesVariety;

public class Peonies extends Flower{
    private PeoniesVariety peoniesVariety;

    public Peonies(String name, PeoniesVariety peoniesVariety, int lengthStem, int freshness,  float cost) {
        super (name, lengthStem, freshness, cost);
        this.peoniesVariety = peoniesVariety;
    }

    public PeoniesVariety getPeoniesVariety() {
        return peoniesVariety;
    }

    public void setPeoniesVariety(PeoniesVariety peoniesVariety) {
        this.peoniesVariety = peoniesVariety;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", peoniesVariety=" + peoniesVariety +
                        '}');
    }
}
