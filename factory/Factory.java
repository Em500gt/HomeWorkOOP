package factory;

import java.util.ArrayList;
import animals.*;
public class Factory {

    static public ArrayList<Lion> createLions(int count){
        ArrayList<Lion> lionCage = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            Lion lionsList = new Lion(5, 5, 5, 5);
            lionCage.add(lionsList);
        }
        return lionCage;
    }

    static public ArrayList<Wolf> createWolfs(int count){
        ArrayList<Wolf> wolfsCage = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            Wolf wolfsList = new Wolf(5, 5, 5, 5);
            wolfsCage.add(wolfsList);
        }
        return wolfsCage;
    }
    
}
