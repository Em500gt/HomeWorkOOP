package Comporators;

import java.util.Comparator;

import animals.Wolf;

public class WolfComparator implements Comparator<Wolf>{
    
    private String condition;

    public WolfComparator(String condition){
        this.condition = condition;
    }

    @Override
    public int compare(Wolf w1, Wolf w2){
        if(condition.toLowerCase().equals("age")){
            if(w1.getAge() > w2.getAge()){
                return 1;
            } else if(w1.getAge() < w2.getAge()){
                return -1;
            }
        }
        else if(condition.toLowerCase().equals("weight")){
            if(w1.getWeight() > w2.getWeight()){
                return 1;
            } else if(w1.getWeight() < w2.getWeight()){
                return -1;
            }
        }
        return 0;
    }
}