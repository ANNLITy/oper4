public class Author {
    private String name;
    private String surName;

    public Author(String name, String surName) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
