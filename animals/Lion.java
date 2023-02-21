package animals;

public class Lion extends Animal implements Comparable<Lion>{
    
    private int maneVolume;
    private static final int MAX_WEIGHT = 10;
    private static final String TYPE = "Lion";

    public Lion(int age, int weight, int countLimbs, int maneVolume){
        super(age, weight, countLimbs);
        this.maneVolume = maneVolume;
    }
    
    public void setManeVolume(int maneVolume){
        this.maneVolume = maneVolume;
    }

    public int getManeVolume(){
        return maneVolume;
    }

    @Override
    public String getType(){
        return TYPE;
    }

    @Override
    public int getMaxWeight(){
        return MAX_WEIGHT;
    }

    @Override
    public int compareTo(Lion o) {
        if(this.age > o.getAge()){
            return 1;
        }
        else if(this.age < o.getAge()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return "Lion{" +
                "age=" + age +
                ", maneVolume=" + maneVolume +
                "}";
    }
}
