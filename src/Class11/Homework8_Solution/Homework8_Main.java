package Class11.Homework8_Solution;

public class Homework8_Main {

    // Subject: Homework-8
    /**
     * Create a printer
     *
     * max toner level = 100
     * max pages in tray = 100
     * with 1 page printing, 1 toner is being used
     *
     * 1. addToner
     * 2. addPages
     * 3. Print (single and double)
     * 4. PrinterSummary
     *      Toner level:
     *      Pages count in tray:
     * 5. checkToner
     *      if toner is less than 10; it should warn to "Add toner"
     */
    public static void main(String[] args) {

        Homework8_Methods hm8 = new Homework8_Methods();

        hm8.showPrinterSummary();

        hm8.print(7);

        hm8.print(5, true);

        hm8.showPrinterSummary();




    }


}
