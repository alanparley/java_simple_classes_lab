public class Printer {
    private int sheets;
    public int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int print(int pages, int copies) {
        return pages * copies;
    }

    public boolean canPrint(){
        if (this.sheets >= print(10, 5)){
            return true;
        } else return false;
    }

    public int getToner(){
        return this.toner;
    }
}
