public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("land", 4);
        Fish fish = new Fish("water", 0);
        System.out.println("Dog \nType: " + dog.getAnimalType() + "\nNo. of legs: "+ dog.getLegs());
        dog.sound();
        System.out.println("Fish \nType: " + fish.getAnimalType() + "\nNo. of legs: "+ fish.getLegs());
        fish.sound();
    }
}
