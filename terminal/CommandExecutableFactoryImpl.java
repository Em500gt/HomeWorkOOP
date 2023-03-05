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
            default -> {
                return null;
            }
        }
    }

}
