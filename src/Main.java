public class Main {
    public static void main(String[] args) {
        Author one = new Author("Лев", "Толстой");
        Author two = new Author("Фёдор", "Достоевский");
        Book First = new Book("Война и мир",1866,one);
        System.out.println("Название- "+First.getTitle());
        System.out.println("Дата выпуска- "+First.getDate());
        System.out.println("Автор:- "+First.getAuthor());
        Book Second= new Book("Преступление и наказание", 1866,two);
        System.out.println("Название- "+Second.getTitle());
        System.out.println("Дата выпуска- "+Second.getDate());
        System.out.println("Автор:- "+Second.getAuthor());
        Second.setDate(1868);
        System.out.println("Новая дата выпуска - "+Second.getDate());
    }
}