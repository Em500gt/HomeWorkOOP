package terminal;

public interface CommandExecutableFactory {
    CommandExecutable create(Command input);
    }
