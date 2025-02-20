package Actvity1;

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    public boolean getIsIndoor() {
        return isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
