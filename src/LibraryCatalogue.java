import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String,Book> bookCollection= new HashMap<String,Book>();
    int currentDay=0;
    int lengthCheckedoutPeriod=7;
    double intialLateFee=0.50;
    double feePerLateday=1.00;



    public LibraryCatalogue(Map<String,Book>bookCollection){
        this.bookCollection=bookCollection;

    }
    public LibraryCatalogue(Map<String, Book> bookCollection, int lengthCheckedoutPeriod, double intialLateFee, double feePerLateday) {
        this.bookCollection = bookCollection;
        this.lengthCheckedoutPeriod = lengthCheckedoutPeriod;
        this.intialLateFee = intialLateFee;
        this.feePerLateday = feePerLateday;
    }

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getLengthCheckedoutPeriod() {
        return lengthCheckedoutPeriod;
    }

    public double getIntialLateFee() {
        return intialLateFee;
    }

    public double getFeePerLateday() {
        return feePerLateday;
    }

    public void setBookCollection(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public void setLengthCheckedoutPeriod(int lengthCheckedoutPeriod) {
        this.lengthCheckedoutPeriod = lengthCheckedoutPeriod;
    }

    public void setIntialLateFee(double intialLateFee) {
        this.intialLateFee = intialLateFee;
    }

    public void setFeePerLateday(double feePerLateday) {
        this.feePerLateday = feePerLateday;
    }

    public static void main(String[] args) {

    }
}
