import java.util.ArrayList;

import animals.*;
import cage.*;
import factory.Factory;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = Factory.createLions(3);
        ArrayList<Wolf> wolfs = Factory.createWolfs(3);
        LionCage lionsInCage = new LionCage(lions);
        WolfCage wolfInCage = new WolfCage(wolfs);
        System.out.println(lionsInCage);
        System.out.println();
        System.out.println(wolfInCage);
        wolfInCage.getFirstAnimals();
        System.out.println(wolfInCage);
    }
}
