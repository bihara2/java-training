public class Dog extends Animal{
    private String breed;
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString(){
        return "Animal Type: Dog\n Breed: "+breed+"\n Owner: "+owner;
    }

}
