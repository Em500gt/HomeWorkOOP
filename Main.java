import java.util.ArrayList;

import animals.*;
import cage.LionCage;
import factory.Factory;
import terminal.TerminalReader;
import terminal.ZooCommandParser;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = Factory.createLions(5);
        LionCage cage = new LionCage();
        cage.setLions(lions);
        Zoo zoo = new Zoo(null, cage, null);
        TerminalReader term = TerminalReader.newTerminalReader(new ZooCommandParser());
        term.setZoo(zoo);
        term.endless();
        System.out.println();
        }
}
