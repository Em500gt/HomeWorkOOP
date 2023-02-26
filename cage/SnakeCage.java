package cage;

import java.util.ArrayList;

import animals.Snake;

public class SnakeCage implements AnimalCage<Snake> {

    private int clean;
    private ArrayList<Snake> snakes;

    public SnakeCage(ArrayList<Snake> snakes){
        this.snakes = snakes;
    }

    @Override
    public int addAnimal(Snake animals) {
        snakes.add((Snake) animals);
        return snakes.size();
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
    public void getFirstAnimals() {
        if(snakes.size() == 0){
            System.out.println("В клетке нету животных");
        }
        else{
            System.out.println(snakes.remove(0));
        }
    }

    @Override
    public String toString(){
        return "SnakeCage{" +
                "Snakes=" + snakes +
                ", clean=" + clean +
                "}";
    }
}
