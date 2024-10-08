import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to Book Management System");

        User user1 = new User("Patric","2001-08-20");

        Book book1 = new Book("JAVA","Java Sundar");
        Book book2 = new Book("Python","Python Baabu");
        Book book3 = new AudioBook("C++","C++ Singaari", 2000);

        user1.borrow(book1);
        user1.borrow(book3);
        System.err.println(user1.getBorrowList());
    }
}