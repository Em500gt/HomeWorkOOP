import java.util.ArrayList;

import animals.*;
import cage.LionCage;
import factory.Factory;
import terminal.TerminalReader;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = Factory.createLions(5);
        LionCage cage = new LionCage();
        cage.setLions(lions);
        TerminalReader term = new TerminalReader();
        Zoo zoo = new Zoo(null, cage, null);
        term.endless(zoo);
        System.out.println();
    }
}
