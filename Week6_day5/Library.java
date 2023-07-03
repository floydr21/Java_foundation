public class Library {
  private Book[] books;
  private int numBooks;
 
  public Library(int capacity) {
    books = new Book[capacity];
    numBooks = 0;
  }
 
  public void addBook(Book book) {
    if (numBooks < books.length) {
      books[numBooks] = book;
      numBooks++;
      System.out.println("Book added successfully.");
    } else {
      System.out.println("The library is full. Cannot add more books.");
    }
  }
 
  public void deleteBook(String isbn) {
    int bookIndex = findBookIndex(isbn);
 
    if (bookIndex != -1) {
      // Shift the elements to remove the book
      for (int i = bookIndex; i < numBooks - 1; i++) {
        books[i] = books[i + 1];
      }
 
      books[numBooks - 1] = null; // Set last element to null
      numBooks--;
 
      System.out.println("Book deleted successfully.");
    } else {
      System.out.println("Book not found in the library.");
    }
  }
 
  private int findBookIndex(String isbn) {
    for (int i = 0; i < numBooks; i++) {
      if (books[i].getIsbn().equals(isbn)) {
        return i;
      }
    }
    return -1; // Book not found
  }
 
  public void displayBooks() {
    if (numBooks == 0) {
      System.out.println("The library is empty.");
    } else {
      System.out.println("Books in the library:");
      for (int i = 0; i < numBooks; i++) {
        System.out.println(books[i]);
      }
    }
  }
 
  public static void main(String[] args) {
    Library library = new Library(5);
 
    // Creating book objects
    Book book1 = new Book("1234567890", "The Catcher in the Rye", "J.D. Salinger");
    Book book2 = new Book("0987654321", "To Kill a Mockingbird", "Harper Lee");
    Book book3 = new Book("5432167890", "1984", "George Orwell");
 
    // Adding books to the library
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
 
    // Displaying books in the library
    library.displayBooks();
 
    // Deleting a book from the library
    library.deleteBook("0987654321");
 
    // Displaying books after deletion
    library.displayBooks();
  }
}
 
class Book {
  private String isbn;
  private String title;
  private String author;
 
  public Book(String isbn, String title, String author) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
  }
 
  public String getIsbn() {
    return isbn;
  }
 
  @Override
  public String toString() {
    return "Book{" +
        "isbn='" + isbn + '\'' +
        ", title='" + title + '\'' +
        ", author='" + author + '\'' +
        '}';
  }
}