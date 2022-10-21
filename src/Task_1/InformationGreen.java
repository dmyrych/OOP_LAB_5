package Task_1;

public class InformationGreen extends Printer {
    public InformationGreen(String info){
        Print(ConsoleColors.GREEN + info);
        System.out.println(ConsoleColors.RESET);
    }
}
