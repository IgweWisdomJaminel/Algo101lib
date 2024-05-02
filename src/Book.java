public class Book {
    String title;
    int pageCount;
    int ISBN;
    boolean isChecked;
    int dayCheckedout =-1;

    public Book(String title, int pageCount, int ISBN, boolean isChecked, int dayCheckedout) {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        this.isChecked = false;
        this.dayCheckedout = dayCheckedout;
    }
    //Getters
    public String getTitle() { 
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked( boolean newischecked,int cureentDayCheckedOut) {
        this.isChecked=newischecked;
        setDayCheckedout(cureentDayCheckedOut);
       
    }

    public int getDayCheckedout() {
        return dayCheckedout;
    }

    public void setDayCheckedout(int dayCheckedout) {
        this.dayCheckedout = dayCheckedout;
    }

    public static void main(String[] args) {
         
    }
}
