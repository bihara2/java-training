import java.util.HashMap;
import java.util.Map;

public class AnimalRegistration {
    private Map<AnimalType,Animal> animals=new HashMap<>();

    public  AnimalRegistration(){
        this.initialize();
    }

    private void initialize(){
        Dog dog=new Dog();
        dog.setBreed("German Shepherd");
        dog.setOwner("Peter");

        Fish fish=new Fish();
        fish.setWeight("2Kg");

        animals.put(AnimalType.Dog,dog);
        animals.put(AnimalType.Fish,fish);

    }

    public Animal getAnimal(AnimalType type){
        Animal newAnimal=null;
        try {
            newAnimal=(Animal) animals.get(type).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return  newAnimal;
    }
}
