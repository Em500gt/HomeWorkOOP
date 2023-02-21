package animals;

public abstract class Animal {

    protected int age;
    protected int weight;
    private int countLimbs;

    public Animal(int age, int weight, int countLimbs){
        this.age = age;
        this.weight = weight;
        this.countLimbs = countLimbs;
    }
    
    public void feed(int foodWeight){
        if(weight + foodWeight <= getMaxWeight()){
            weight += foodWeight;
        }
        else{
            System.out.println("Max weight exceeded");
        }
        
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setCountLimbs(int countLimbs){
        this.countLimbs = countLimbs;
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }

    public int getCountLimbs(){
        return countLimbs;
    }

    public abstract String getType();

    public abstract int getMaxWeight();
}