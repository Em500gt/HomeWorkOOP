package cage;

import java.util.ArrayList;
import java.util.Collections;

import Comporators.WolfComparator;
import animals.Animal;
import animals.Wolf;

public class WolfCage implements AnimalCage{

    private int clean;
    private ArrayList<Wolf> wolfs;
    
    public WolfCage(ArrayList<Wolf> wolfs){
        this.wolfs = wolfs;
    }

    @Override
    public int addAnimal(Animal animals) {
        wolfs.add((Wolf) animals);
        return wolfs.size();
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
        return "WolfCage{" +
                "Wolf=" + wolfs +
                ", clean=" + clean +
                "}";
    }

    @Override
    public void getFirstAnimals() {
        if(wolfs.size() == 0){
            System.out.println("В клетке нету животных");
        }
        else{
            System.out.println(wolfs.remove(0));
        }
    }

    public void sort(String condition){
        Collections.sort(wolfs, new WolfComparator(condition));
    }
 
}
