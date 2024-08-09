class Book{

    //properties // instant variables

    static int totalBooks;

    String title;
    String author;
    int isbn;
    boolean isBorrowed;

    //blocks

    static{
        totalBooks=0;
    }

    {
     totalBooks++;
    }

    Book(int isbn,String title,String author){

    }
    Book(int isbn){
        this(isbn,"unknown","unknown");
    }

    //methods / functions :

    public void borrowBook(){

        if(totalBooks<=0){
            System.out.println("sorry book is out of stock !");
        }
        else {
            if (isBorrowed) {
                System.out.println("Book is already borrowed , first return book(isbn:" + this.isbn + ") after that i can assign a new book");
            } else {
                System.out.println("Book is borrowed successfully :)");
                this.isBorrowed=true;
                totalBooks--;
            }
        }
    }

    public void returnBook(){
        if(isBorrowed) {
            this.isBorrowed=false;
            System.out.println("Your book is submitted , hope you enjoy the book :)");
            totalBooks++;
        }
        else{
            System.out.println("book is already submited");
        }
    }

    public static void getTotalBooks(){
        System.out.println("TOTAL NUMBER OF BOOKS IN LIBRARY :"+totalBooks);
    }

    public static void main(String[] args) {

        Book lifeOfPI=new Book(1,"lifeOfPi","Labh");
        Book design=new Book(2,"design","Tanvi");

        Book.getTotalBooks();
        lifeOfPI.borrowBook();
        design.borrowBook();
        lifeOfPI.borrowBook();
        lifeOfPI.returnBook();
        lifeOfPI.returnBook();

    }
}
