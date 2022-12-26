public class Book {
    private String title;
    private int date;
    private Author author;

    public Book( String title, int date, Author author) {
        this.title = title;
        this.date = date;
        this.author = author;
    }
    public String getTitle() {
        return this.title;
    }
    public int getDate() {
        return this.date;
    }
    public void setDate ( int date) {
        if (date>this.date) {
            throw new IllegalArgumentException("Неверная дата");
        }
        this.date=date;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String toString() {
        return  this.title +this.date+ this.author;
    }

}