package Composition;

public class Author {
    private String AuthorName;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.AuthorName = name;
        this.email = email;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return AuthorName;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail()+ '\'' +
                ", gender=" + getGender() +
                '}';
    }
}
