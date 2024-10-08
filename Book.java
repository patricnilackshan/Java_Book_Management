public class Book {
    Book(String title,String author){
        this.title = title;
        this.author = author;
    }
    private String title;
    private String author;
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        return String.format("%s by %s", this.title,this.author);
    }
}
