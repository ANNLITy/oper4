public class Author {
    private String name;
    private String surName;

    public Author(String name, String surName) {
        if (name != this.name) {
            throw new IllegalArgumentException("Неверное имя");
        }
        this.name = name;
        this.surName = surName;

    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }

    public String toString() {
        return this.name + " " + this.surName;
    }

    {

    }
}