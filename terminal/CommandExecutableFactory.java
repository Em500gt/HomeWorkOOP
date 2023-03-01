package terminal;

import animals.Lion;
import zoo.Zoo;

public class CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(String[] input) {
        String code = input[0] + input[1];
        if (code.equals("liondelete")) return new DeleteLionExecutable(zoo);
        else if (code.equals("lioncreate")){
            Lion lion = new Lion(Integer.parseInt(input[3]), Integer.parseInt(input[4]), 4, Integer.parseInt(input[5]));
            return new CreateLionExecutable(zoo, lion);
        }
        else return null;
    }

}
