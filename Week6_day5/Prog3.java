/* Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should
have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should 
have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook. */
import java.util.Scanner;
public class Prog3{
  private Book[] books;
  private int numbooks;

  public Prog3(int capacity){
    numbooks=0;
    books=new Book[capacity];
  }
  public void addBook(Book book){
    if(numbooks<books.length){
      books[numbooks]=book;
      numbooks++;
    }
    else{
      System.out.println("Cannot add more books");
    }
  }
  public void removebook(String isbn){
    int bookIndex=findBookIndex(isbn);
    if(bookIndex!=-1){
      for(int i=bookIndex;i<numbooks-1;i++){
        books[i]=books[i+1];
      } 
      books[numbooks-1]=null;
      numbooks--;
      System.out.println("Book deleted successfully");
    }
    else{
      System.out.println("Book not found");
    }
  }
  public int findBookIndex(String isbn){
    for(int i=0;i<numbooks;i++){
      if(books[i].getIsbn().equals(isbn)){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args){
    
  }
}

  

class Book{
  private String isbn;
  private String title;
  private String author;

  public Book(String isbn, String title,String author){
    this.isbn=isbn;
    this.title=title;
    this.author=author;
  }
  public String getIsbn(){
    return isbn;
  }
}