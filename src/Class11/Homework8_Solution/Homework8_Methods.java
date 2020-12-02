package Class11.Homework8_Solution;

public class Homework8_Methods {

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
    private int pages = 100;
    private int toner = 100;

    /**
     * addPages
     *      Input: int (pagesToAdd)
     *      Return: void
     *
     *      if (pagesToAdd > 0 and pagesToAdd <= 100)
     *          if (pagesToAdd + pages <= 100)
     *              pages = pagesToAdd + pages;
     *          else
     *              sout -> more pages added than printer capacity
     *      else
     *          sout -> invalid pages to add
     */

    public void addPages (int pCount) {
        System.out.println("\n\n**** Attempting to add "+ pCount + " pages to printer ****");
        if (pCount > 0 && pCount <= 100) {
            if (pCount + pages <= 100) {
                pages = pCount + pages;
            } else {
                System.out.println("\nPages added over printer capacity");
            }
        } else {
            System.out.println("\nInvalid pages to add");
        }
        System.out.println("**** Done attempting to add "+ pCount + " pages to printer ****");
    }

    public void showPages() {
        System.out.println("\nPage Count in printer: " + pages);
    }

    public void showToner() {
        System.out.println("Toner level in printer: " + toner);
    }

    public void showPrinterSummary() {
        showPages();
        showToner();
    }


    public void print(int pagesToPrint) {
        System.out.println("\n\n**** Attempting to print "+ pagesToPrint + " pages single side ****");
        if (pagesToPrint > 0) {
            pages-=pagesToPrint;
            toner-=pagesToPrint;
            System.out.println("Successfully printed: " + pagesToPrint + " pages single sided" +
                    "\nPages used: " + pagesToPrint +
                    "\nToner used: " + pagesToPrint);
        } else {
            System.out.println("Invalid pages count to print '" + pagesToPrint + "'");
        }
        System.out.println("**** Done printing to add "+ pagesToPrint + " pages single side ****");
    }

    public void print(int pagesToPrint, boolean ecoFriendly) {
        System.out.println("\n\n**** Attempting to print "+ pagesToPrint + " pages double side ****");
        int pagesRequired;
        if (pagesToPrint > 0) {
            if (pagesToPrint%2 == 0) {
                pagesRequired = pagesToPrint/2;
            } else {
                pagesRequired = (pagesToPrint/2) + 1;
            }
            pages-=pagesRequired;
            toner-=pagesToPrint;
            System.out.println("Successfully printed: " + pagesToPrint + " pages double sided" +
                    "\nPages used: " + pagesRequired +
                    "\nToner used: " + pagesToPrint);
        } else {
            System.out.println("Invalid pages count to print '" + pagesToPrint + "'");
        }
        System.out.println("**** Done printing to add "+ pagesToPrint + " pages double side ****");
    }

    /**
     * print()
     *      Input: 2
     *          int -> pagesToPrint
     *          boolean -> ecoFriendly true (double) , false (single side)
     *
     *     if (ecoFr) {
     *         if (pagesToPrint%2 == 0)
     *              pagesRequired = pagesToPrint/2;
     *              tonerRequired = pagesToPrint
     *
     *              pages = pages - pagesRequired;
     *              toner = toner - tonerRequired
     *         else {
     *             pagesRequired = pagesToPrint/2 + 1;
     *              tonerRequired = pagesToPrint
     *
     *              pages = pages - pagesRequired;
     *              toner = toner - tonerRequired
     *         }
     *     } else {
     *         pagesRequired = pagesToPrint
     *         tonerRequired = pagesToPrint
     *
     *         pages = pages - pagesRequired
     *         toner = toner - tonerRequired
     *
     *         sout -> Printed pagesToPrint number of pages, single sided.
     *
     *     }
     */

    /**
     * pages = 100
     * toner = 100
     *
     * print 10 - singled sided
     * pages=90
     * toner=90
     *
     * print 9 - double sided
     * pages=85
     * toner=81
     *
     * printSummary()
     * Toner level: 81
     * Pages in tray: 85
     *
     * print 2 - double sided
     * pages=84
     * toner=79
     *
     * printSummary()
     * Toner level: 79
     * Pages in tray: 84
     *
     *
     *
     */


}
