package factory;

import java.util.ArrayList;
import java.util.Random;

import animals.*;
public class Factory {

    static public ArrayList<Lion> createLions(int count){
        ArrayList<Lion> lionCage = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            Lion lionsList = new Lion("Lion", new Random().nextInt(50), new Random().nextInt(50), new Random().nextInt(50), new Random().nextInt(50));
            lionCage.add(lionsList);
        }
        return lionCage;
    }

    static public ArrayList<Wolf> createWolfs(int count){
        ArrayList<Wolf> wolfsCage = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            Wolf wolfsList = new Wolf("Wolf", new Random().nextInt(50), new Random().nextInt(50), new Random().nextInt(50), new Random().nextInt(50));
            wolfsCage.add(wolfsList);
        }
        return wolfsCage;
    }

    static public ArrayList<Snake> createSnake(int count){
        ArrayList<Snake> SnakeCage = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            Snake SnakeList = new Snake("Snake", new Random().nextInt(50), new Random().nextInt(50), new Random().nextInt(50), new Random().nextInt(50));
            SnakeCage.add(SnakeList);
        }
        return SnakeCage;
    }
    
}