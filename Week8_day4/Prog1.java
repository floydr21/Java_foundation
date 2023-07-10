// As a manager of a book shop, you are responsible for managing all the operations related to books in the shop. You have a system that stores all the book details(book_id, title, author, price) in an ArrayList of Book objects.
/* 
Your task is to create a Java program that helps you manage the book shop efficiently.  
Create a console-based menu-driven program that allows the user to perform the following operations:
1. Add books
2. Calculate total price of all books
3. Remove a book by book_id
4. Update book price by book_id
5. Search books by author
6. Quit the program
If no books are found for the given author name, the method should throw a custom exception called BookNotFoundException with an appropriate error message.
Each menu option should call the corresponding method and display the results or appropriate error messages.  */
import java.util.Scanner;
import java.util.ArrayList;

class Book {
  private int bookID;
  private String title;
  private String author;
  private double price;

  public Book(int bookID,String title,String author,double price){
    this.bookID=bookID;
    this.title=title;
    this.author=author;
    this.price=price;
  }
  public int getBookID(){
    return bookID;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public double getPrice(){
    return price;
  }
}
class BookNotFoundException extends Exception {
  public BookNotFoundException(String msg){
    super(msg);
  }
}
class BookShop{
  private ArrayList<Book>books;
  public BookShop(){
    books=new ArrayList<>();
  }
  public void addBook(int bookID,String title,String author,double price){
    Book book=new Book(bookID,title,author,price);
    books.add(book);
    System.out.println("Book added successfully");
  }
  public double totalPrice(){
    double totalprice=0;
    for(Book book:books){
      totalprice +=book.getPrice();
    }
    return totalprice;
  }
  public void removedBook(int bookID)throws BookNotFoundException{
    boolean bookremoved=false;
    for(int i=0;i<books.size;i++){
      Book book =books.get(i);
      if(book.getBookID=bookID){
        books.remove(i);
        bookremovd=true;
        System.out.println("Book removed");
        break;
      }
    }
    if(!bookremoved){
      throw new BookNotFoundException("Book not found with the book id:"+bookID)
    }
  }
}