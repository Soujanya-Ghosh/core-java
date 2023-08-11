package inheritence2;

public class Executor {
    public static void main(String[] args) {
        Person firstPerson = new Person("Soujanya",20);
        System.out.println(firstPerson.getName());
        System.out.println(firstPerson.getAge());
        System.out.println(firstPerson.toString());
        Person1 secondPerson = new Person1("Srilekha",20);
        System.out.println(secondPerson.name());
        System.out.println(secondPerson.age());
        System.out.println(secondPerson);
    }
}
