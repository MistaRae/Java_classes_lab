import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    Printer printer2;
    @Before
    public void before(){
        printer = new Printer(100, 200);
        printer2 = new Printer(100, 20);
    }

    @Test
    public void canPrint(){
        assertEquals(true, printer.print(10,2));
    }

    @Test
    public void wontPrintIfNotEnoughPaper(){
        assertEquals(false, printer.print(10,12));
    }

    @Test
    public void printingReducesPaperAvailable(){
        printer.print(10,2);
        assertEquals(80,printer.checkPaper());
    }

    @Test
    public void printingReducesTonerVolume(){
        printer.print(10,2);
        assertEquals(180, printer.checkToner());
    }

    @Test
    public void printerPromptsForMoreToner(){
        assertEquals(false, printer2.print(11,2));
    }

}

