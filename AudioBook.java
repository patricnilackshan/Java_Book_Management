public class AudioBook extends Book {
    private int runTime;
    AudioBook(String title,String author,int runTime){
        super(title,author);
        this.runTime = runTime;
    }
    public int getRunTime(){
        return runTime;
    }
    public String toString(){
        return String.format("%s by %s with %d minutes", this.getTitle(),this.getAuthor(),this.runTime);
    }
}
