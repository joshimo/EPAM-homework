package assigment05.application;

import assigment05.printer.Printer;
import assigment05.printer.WindowPrinter;
import assigment05.task04.Ukraine;
import static assigment05.printer.ConsolePrinter.*;

public class Application {

    private static Printer printer = new WindowPrinter();
    private static Ukraine ukraine;

    public static void main(String[] args){
        ukraine = Ukraine.create();
        //printer.print("Capital: \n" + ukraine.getCapital());
        printer.print("Overall information \n" + ukraine.toString());
        print("Overall information \n" + ukraine.toString());
        printer.print("Total regions number: " + ukraine.getRegionsNumber() + "\n");
        print("Total regions number: " + ukraine.getRegionsNumber() + "\n");
        printer.print("Regions capitals \n" + ukraine.getAllRegionsCapitals());
        print("Regions capitals \n" + ukraine.getAllRegionsCapitals());
        printer.print("Regions squares \n" + ukraine.getAllRegionsSquares());
        print("Regions squares \n" + ukraine.getAllRegionsSquares());
    }
}
