package inheritence;

public class Executor {
    public static void main(String[] args) {
        Dog firstAnimal = new Dog();
        firstAnimal.setType("Pug");
        firstAnimal.setSize("13 inches");
        firstAnimal.setWeight(14);
        firstAnimal.setEarShape("Button");
        firstAnimal.setTailShape("Curly");
        firstAnimal.move("21 miles per hour");
        firstAnimal.makeNoise("burping");
        firstAnimal.bark();
        firstAnimal.run();
        firstAnimal.walk();
        firstAnimal.wagTail();
        System.out.println(firstAnimal.toString());
        Fish secondAnimal = new Fish(4,6);
        secondAnimal.setType("Cod fish");
        secondAnimal.setSize("25 pounds");
        secondAnimal.setWeight(1.8);
        secondAnimal.moveMuscles();
        secondAnimal.moveBackFins();
        System.out.println(secondAnimal.toString());
    }
}
