package Composition;

public class AuthorExe {
    public static void main(String[] args) {
        Author firstAuthor = new Author("S.Roy","sroy@gmail.com",'M');
//        System.out.println(firstAuthor.getName());
//        System.out.println(firstAuthor.getEmail());
//        System.out.println(firstAuthor.getGender());
       System.out.println(firstAuthor.toString());
        Book storyBook = new Book("Hatyapuri",firstAuthor.getName(),890.57,1);
        System.out.println(storyBook.toString());
    }
}
