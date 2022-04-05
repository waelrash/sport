package tr.edu.maltepe.oop;


public class Prof extends Person{


    static java.util.ArrayList<Book> myBooks;
    static java.util.ArrayList<SportCenter> membership;


    public Prof() {
        myBooks = new java.util.ArrayList<Book>();
    }

    //--Change the name of the functions
    public void addBook(Book book) {
        myBooks.add(book);
    }

    public void returnBook(Library lib, Book book){
        myBooks.remove(book);
        lib.addBook(book);
    }
    public void printAvailableBooks() {
        boolean bookPresent = false;
        for (Book book : myBooks) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
                bookPresent = true;
            }
        }

        if (!bookPresent) {
            System.out.println("No book in category");
        }
    }
    private int proId;
    public void setProId (int pi) {
        proId = pi;
    }

    public int getProId(int i) {
        return proId;
    }

    void teaches(){
        System.out.println("Professor is teaching now");
    }

    @Override
    public void swimming(String prof, SportCenter sc) {
        sc.addMembers(prof);
        System.out.println("Professor is going to Sport center to swimming");
    }
    @Override
    public void playingFootball(String prof, SportCenter sc){
        sc.addMembers(prof);
        System.out.println("Professor is going to Sport center to play football");
    }
}
