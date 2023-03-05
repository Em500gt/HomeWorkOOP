package cage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import animals.Lion;
import comporators.LionComparator;

public class LionCage implements AnimalCage<Lion>{
    
    private int clean;
    private ArrayList<Lion> lions;

    public LionCage(ArrayList<Lion> lions){
        this.lions = lions;
    }

    public LionCage(){
        this.lions = new ArrayList<Lion>();
    }

    @Override
    public int addAnimal(Lion animals) {
        lions.add(animals);
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

    @Override
    public Lion takeOffAnimal() {
        if (lions == null) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(lions.size());
            return lions.remove(i);
        }
    }

    public void setLions(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    @Override
    public int countAnimals() {
        return lions.size();
    }

}
