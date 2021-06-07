public class Printer {
    private int paperAvailable;
    private int tonerVolume;
    public Printer(int paperAvailable, int tonerVolume){
        this.paperAvailable = paperAvailable;
        this.tonerVolume = tonerVolume;
    }
    public boolean print(int pages, int copies) {
        if (pages * copies <= paperAvailable && pages * copies <= tonerVolume) {
            int paperUsed = pages * copies;
            paperAvailable -= paperUsed;
            int tonerUsed = paperUsed;
            tonerVolume -= tonerUsed;
            System.out.println("Printing...");
            return true;
        }
        System.out.println("Please check the paper tray and toner levels.");
        return false;
    }
    public int checkPaper(){
        return this.paperAvailable;
    }
    public int checkToner(){
        return this.tonerVolume;
    }
}
