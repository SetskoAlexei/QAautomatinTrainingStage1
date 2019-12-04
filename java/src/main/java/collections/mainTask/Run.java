package collections.mainTask;

import collections.mainTask.accesories.Accessories;
import collections.mainTask.accesories.Feathers;
import collections.mainTask.accesories.Shells;
import collections.mainTask.flowers.Flower;
import collections.mainTask.flowers.Peonies;
import collections.mainTask.flowers.Roses;
import collections.mainTask.types.PeoniesVariety;
import collections.mainTask.types.RoseVariety;
import collections.mainTask.types.ShellsSize;
import collections.mainTask.types.TypeFeather;


import java.util.*;

//Цветочница. Определить иерархию цветов. Создать несколько объектов-цветов.
//        Собрать букет (используя аксессуары) с определением его стоимости.
//        Провести сортировку цветов в букете на основе уровня свежести.
//        Найти цветок в букете, соответствующий заданному диапазону длин стеблей.

public class Run {
    static List<Flower> flowers = Arrays.asList (
    new Roses ("Rose", RoseVariety.BLUE_PERFUME, 45, 4, 1.2f),
    new Roses ("Rose", RoseVariety.FLAMINGO, 50, 6, 1.1f),
    new Roses ("Rose", RoseVariety.ICEBERG, 35, 3, 0.9f),
    new Peonies ("Peony", PeoniesVariety.ATHENA, 35,4, 1.0f),
    new Peonies ("Peony", PeoniesVariety.BARTZELLA, 33, 8, 1.0f),
    new Flower ("Chamomile", 30, 5, 0.5f)
    );

    static List<Accessories> accessories = Arrays.asList (
            new Feathers ("Feather", TypeFeather.OSTRICH_FEATHER, 35, "White", 3.0f),
            new Feathers ("Feather", TypeFeather.PEACOCK_FEATHER, 60, "Multi-colored", 2.2f),
            new Shells ("Shell", ShellsSize.BIG, 0.6f),
            new Shells ("Shell", ShellsSize.SMALL, 0.2f)
            );
    public static void main(String[] args){
        Bouquet bouquet = new Bouquet (flowers, accessories);
         float price = bouquet.getPriceBouquet ();
        System.out.printf ("Price of a bouquet: " + "%.2f", price);
        System.out.println ("$");
        List<? extends Flower> freshness = bouquet.sortFresh ();
        System.out.printf ("Flowers sorted by freshness: %n" + freshness + "%n" );
        List<? extends Flower> rangeLengthStem = bouquet.getLengthStemFromRange (35, 55);
        System.out.printf ("Flowers length ranging from 35 to 55: %n" + rangeLengthStem);
    }
}
