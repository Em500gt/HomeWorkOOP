package terminal;

import zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable{

    private Zoo zoo;

    public DeleteLionExecutable(Zoo zoo){
        this.zoo = zoo;
    }
    @Override
    public void execute() {
        this.zoo.takeOfLion();
    }
    @Override
    public  DeleteLionExecutable getZoo(Zoo zoo, Command command) {
        return new DeleteLionExecutable(zoo);
    }
}