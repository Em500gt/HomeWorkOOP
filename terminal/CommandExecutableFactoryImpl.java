package terminal;

import zoo.Zoo;


public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command input) {
        String code = input.getAction() + input.getAnimal();
        switch (code) {
            case "liondelete" -> {
                return new DeleteLionExecutable(zoo);
            }
            case "lioncreate" -> {
                return new CreateLionExecutable(zoo, input);
            }
            case "snakedelete" -> {
                return new DeleteSnakeExecutable(zoo);
            }
            case "snakecreate" -> {
                return new CreateSnakeExecutable(zoo, input);
            }
            case "wolfdelete" -> {
                return new DeleteWolfExecutable(zoo);
            }
            case "wolfcreate" -> {
                return new CreateWolfExecutable(zoo, input);
            }
            default -> {
                return null;
            }
        }
    }

}
