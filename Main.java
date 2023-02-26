import java.util.ArrayList;

import animalUtis.AnimalUtils;
import animals.*;
import factory.Factory;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = Factory.createWolfs(5);
        System.out.println(wolfs);
        AnimalUtils.sortAnimals(wolfs);
        // WolfCage wolfsInCage = new WolfCage(wolfs);
        // wolfsInCage.sort("age");
        // System.out.println(wolfsInCage);
        // wolfsInCage.sort("weight");
        System.out.println(wolfs);
    }
}
