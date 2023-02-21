import java.util.ArrayList;

import animals.*;
import cage.*;
import factory.Factory;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = Factory.createWolfs(5);
        WolfCage wolfsInCage = new WolfCage(wolfs);
        System.out.println(wolfsInCage);
        wolfsInCage.sort("age");
        System.out.println(wolfsInCage);
        wolfsInCage.sort("weight");
        System.out.println(wolfsInCage);
    }
}
