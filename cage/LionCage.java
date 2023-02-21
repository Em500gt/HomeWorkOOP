package cage;

import java.util.ArrayList;
import java.util.Collections;

import Comporators.LionComparator;
import animals.Animal;
import animals.Lion;

public class LionCage implements AnimalCage{
    
    private int clean;
    private ArrayList<Lion> lions;

    public LionCage(ArrayList<Lion> lions){
        this.lions = lions;
    }

    @Override
    public int addAnimal(Animal animals) {
        lions.add((Lion) animals);
        return lions.size();
    }

    @Override
    public int deliverFood(int wietghOfFood) {
        return 0;
    }

    @Override
    public int cleanCage() {
        clean = 0;
        return 0;
    }
    
    @Override
    public String toString(){
        return "LionCage{" +
                "Lions=" + lions +
                ", clean=" + clean +
                "}";
    }

    @Override
    public void getFirstAnimals() {
        if(lions.size() == 0){
            System.out.println("В клетке нету животных");
        }
        else{
            System.out.println(lions.remove(0));
        }
    }

    public void sortLions(){
        Collections.sort(lions);
    }

    public void sortByVolume(){
        Collections.sort(lions, new LionComparator());
    }
}
