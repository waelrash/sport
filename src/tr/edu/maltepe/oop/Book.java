package tr.edu.maltepe.oop;


public class Book {

    private String title;
    boolean borrowed;


    public Book(String title) {
        this.title = title;
        this.borrowed = false;
    }



    public void borrowed() {
        this.borrowed = true;
    }


    public void returned() {
        this.borrowed = false;
    }


    public boolean isBorrowed() {
        return this.borrowed;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
