package animals;

public abstract class Animal{

    protected String name;
    protected int age;
    protected int weight;
    private int countLimbs;

    public Animal(String name, int age, int weight, int countLimbs){
        this.name = name;
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

    public String getNickName() {
        return name;
    }

    public void setNickName(String nickName) {
        this.name = nickName;
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