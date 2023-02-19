package animals;

public class Snake extends Animal {
    
    private int bodyLength;
    private static final int MAX_WEIGHT = 20;
    private static final String TYPE = "Snake";

    public Snake(int age, int weight, int countLimbs, int bodyLength){
        super(age, weight, countLimbs);
        this.bodyLength = bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public int getBodyLength(){
        return bodyLength;
    }

    @Override
    public String getType(){
        return TYPE;
    }

    @Override
    public int getMaxWeight(){
        return MAX_WEIGHT;
    }
}
