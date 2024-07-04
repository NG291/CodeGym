public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal("feline");
        System.out.println("animal sound: " + animal.makeSound());

        Animal animal1 = animalFactory.getAnimal("canine");
        System.out.println("animal1 sound: " + animal1.makeSound());
    }
}
