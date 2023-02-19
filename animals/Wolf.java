package animals;

public class Wolf extends Animal {

    private int maneVolume;
    private static final int MAX_WEIGHT = 10;
    private static final String TYPE = "Wolf";

    public Wolf(int age, int weight, int countLimbs, int maneVolume) {
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
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

}
