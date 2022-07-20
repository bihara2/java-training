public class Implementation {
    public static void main(String[] args) {
        AnimalRegistration newRegistry=new AnimalRegistration();

        Dog newDog=(Dog) newRegistry.getAnimal(AnimalType.Dog);
        System.out.println(newDog);
    }
}
