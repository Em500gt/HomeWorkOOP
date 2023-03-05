package terminal;

import zoo.Zoo;
import static terminal.InputCheck.isCheck;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private Zoo zoo;

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    private CommandParser commandParser;

    private CommandExecutable commandExecutable;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public void setCommandExecutable(Command command) {
        this.commandExecutable = new CommandExecutableFactoryImpl(zoo).create(command);
    }

    public void endless() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(zoo.toString() + "\n");
            new inMessage().consoleMessage();
            String input = scanner.nextLine();
            if (input.equals("stop")) break;
            if (isCheck(input)) {
                Command newCommand = this.commandParser.parseCommand(input);
                this.setCommandExecutable(newCommand);
                this.commandExecutable.execute();
            } else {
                new ErrorMessage().consoleMessage();
            }
        }
        scanner.close();
    }

}