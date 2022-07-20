public class Fish extends Animal {

    private String weight;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String size) {
        this.weight = size;
    }

    @Override
    public String toString(){
        return "Animal Type: Fish\n Size: "+weight;
    }
}
