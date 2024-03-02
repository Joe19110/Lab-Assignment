public class Animal {
    private java.lang.String animalType;
    private int legs;
    public Animal(java.lang.String animalType, int legs) {
        this.animalType = animalType;
        this.legs = legs;
    }
    public java.lang.String getAnimalType() {
        return animalType;
    }
    public void setAnimalType(java.lang.String animalType) {
        this.animalType = animalType;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public void sound() {
        System.out.println("..........");
    }
}
