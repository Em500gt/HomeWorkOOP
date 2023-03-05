package terminal;

import zoo.Zoo;

public interface CommandExecutable {
    
    void execute();
    
    CommandExecutable getZoo(Zoo zoo, Command command);
}