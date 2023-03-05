package terminal;

import java.util.ArrayList;

import animals.Lion;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable{

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Command command) {
        ArrayList<String> input = command.getParameters();
        this.zoo = zoo;
        this.lion = new Lion(input.get(0), Integer.parseInt(input.get(1)), 
        Integer.parseInt(input.get(2)), 4, Integer.parseInt(input.get(3)));
    }
    
    @Override
    public void execute() {
        this.zoo.addLion(lion);
    }

    @Override
    public CreateLionExecutable getZoo(Zoo zoo, Command command) {
        return new CreateLionExecutable(zoo, command);
    }
}