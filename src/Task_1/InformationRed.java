package Task_1;

public class InformationRed extends Printer{
    public InformationRed(String info){
        Print(ConsoleColors.RED + info);
        System.out.println(ConsoleColors.RESET);
    }
}
