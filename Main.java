import java.util.ArrayList;

import animals.*;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import factory.Factory;
import terminal.TerminalReader;
import terminal.ZooCommandParser;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = Factory.createLions(5);
        ArrayList<Wolf> wolfs = Factory.createWolfs(5);
        ArrayList<Snake> snakes = Factory.createSnake(5);
        LionCage cagelion = new LionCage();
        WolfCage cagewolf = new WolfCage();
        SnakeCage cagesnake = new SnakeCage();
        cagelion.setLions(lions);
        cagesnake.setSnake(snakes);
        cagewolf.setWolves(wolfs);
        Zoo zoo = new Zoo(cagewolf, cagelion, cagesnake);
        TerminalReader term = TerminalReader.newTerminalReader(new ZooCommandParser());
        term.setZoo(zoo);
        term.endless();
        System.out.println();
        }
}
