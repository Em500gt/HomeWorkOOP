package terminal;

import java.util.Scanner;

import zoo.Zoo;

public class TerminalReader{

    public void endless(Zoo zoo) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите параметры\n " +
                    "(Тип delete)\n " +
                    "(Тип create Имя год вес объем гривы)\n(stop - выход)");
            String input = scanner.nextLine();
            if (input.equals("stop")) break;
            String[] inputList = input.split(" ");
            if(inputCheck(inputList)){
                CommandExecutableFactory oper = new CommandExecutableFactory(zoo);
                oper.create(inputList).execute();
            }
            else {
                System.out.println("Вы ввели не верный параметр\n");
            }
        }
        scanner.close();
    }

    boolean inputCheck(String[] inputList) {
        if (inputList.length != 2 && inputList.length != 6) return false;
        else if (inputList[0].equals("wolf") && inputList[0].equals("lion") && inputList[0].equals("snake")) return false;
        else if (inputList[1].equals("delete") && inputList[1].equals("create")) return false;
        else if (inputList.length == 6 && (!inputList[3].matches("\\d+") ||
                !inputList[4].matches("\\d+") ||
                !inputList[5].matches("\\d+"))) return false;
        return true;
    }
}