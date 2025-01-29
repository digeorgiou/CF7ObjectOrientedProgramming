package inheritance;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    protected void speak(){
        System.out.println("I am a cat");
    }

    @Override
    public String toString(){
        return("Cat's name is : " + super.getName() +  "\n" +
                "Cat's age is : " + super.getAge());
    }
}
