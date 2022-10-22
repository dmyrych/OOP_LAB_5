package Task_1;

public class InformationYellow extends Printer {
    public InformationYellow(String info){
        Print(ConsoleColors.YELLOW + info);
        System.out.println(ConsoleColors.RESET);
    }
}
