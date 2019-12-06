package collections.mainTask;

import collections.mainTask.accesories.Accessories;
import collections.mainTask.flowers.Flower;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bouquet {
    private List<? extends Flower> flowers;
    private List<? extends Accessories> accessories;



    public Bouquet(List<? extends Flower> flowers, List<? extends Accessories> accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public float getPriceBouquet() {
        float price = 0;
        for (int i = 0; i < flowers.size (); i++) {
            price = price + flowers.get (i).getCost ();
        }
        for (int i = 0; i < accessories.size (); i++) {
            price = price + accessories.get (i).getCost ();
        }
        return price;
    }

    List<? extends Flower> sortFresh() {
        flowers.sort (Comparator.comparingInt (Flower::getFreshness));
        return flowers;
    }

    public List<? extends Flower> getLengthStemFromRange(int min, int max) {
        List<Flower> flowersLengthStemRange = new ArrayList<> ();
        for (int i = 0; i < flowers.size (); i++) {
            if (flowers.get (i).getLengthStem () >= min && flowers.get (i).getLengthStem () <= max) {
            flowersLengthStemRange.add (flowers.get (i));
            }
        }
        flowersLengthStemRange.sort (Comparator.comparingInt (Flower::getLengthStem) );
        return  flowersLengthStemRange;
    }
}