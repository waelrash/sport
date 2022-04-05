package tr.edu.maltepe.oop;

class Student extends Person implements DoSport{

    static java.util.ArrayList<Book> studBook;
    static java.util.ArrayList<SportCenter> membership;

    public Student() {
        studBook = new java.util.ArrayList<Book>();
    }

    public void addBook(Book book) {
        studBook.add(book);
    }

    public void returnBook(Library lib, Book book){
        studBook.remove(book);
        lib.addBook(book);
    }

    public void printAvailableBooks() {
        boolean bookPresent = false;
        for (Book book : studBook) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
                bookPresent = true;
            }
        }

        if (!bookPresent) {
            System.out.println("No book in catalog");
        }
    }

    private int stuId;

    public void setStuId (int si) {
        stuId = si;
    }

    public int getStuId() {
        return stuId;
    }

    void studying(){
        System.out.println("Student is studying now");
    }



    @Override
    public void playing() {
        super.playing();
        System.out.println("Student Is playing football");
    }


    @Override
    public void swimming(String stud, SportCenter sc) {
        sc.addMembers(stud);
        System.out.println("Student going to Sport center to swimming");
    }
    @Override
    public void playingFootball(String stud, SportCenter sc){
        sc.addMembers(stud);
        System.out.println("Student going to Sport center to play football");
    }
}