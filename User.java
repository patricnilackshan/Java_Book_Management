import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    User(String name,String birthDate){
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }
    
    private String name;
    private LocalDate birthDate;
    private ArrayList<Book> bookList = new ArrayList<Book>();
    
    public String getName(){
        return name;
    }
    public LocalDate getBirthDate(){
        return birthDate;
    }
    public int getAge(){
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public void borrow(Book book){
        bookList.add(book);
    }
    public String getBorrowList(){
        return String.format("%s borrowed %s", this.name,bookList.toString());
    }
}
