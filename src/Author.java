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
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        if (other.getClass()!= null) {
            return false;
        }
        Author a2 = (Author) other;
        return name.equals(a2.name);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
