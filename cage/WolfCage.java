package cage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import animals.Wolf;
import comporators.WolfComparator;

public class WolfCage implements AnimalCage<Wolf>{

    private int clean;
    private ArrayList<Wolf> wolfs;
    
    public WolfCage(ArrayList<Wolf> wolfs){
        this.wolfs = wolfs;
    }

    public WolfCage() {
        this.wolfs = new ArrayList<Wolf>();
    }

    @Override
    public int addAnimal(Wolf animals) {
        wolfs.add(animals);
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

    @Override
    public Wolf takeOffAnimal() {
        if (this.wolfs.isEmpty()) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(wolfs.size());
            return (Wolf) wolfs.remove(i);
        }
    }

    public void setWolves(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public int countAnimals() {
        return wolfs.size();
    }
}