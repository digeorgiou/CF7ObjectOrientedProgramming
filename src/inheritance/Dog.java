package inheritance;

public class Dog extends Animal{

    Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    protected void speak(){
        System.out.println("I am a dog");
    }

    @Override
    public String toString(){
        return("Dog's name is : " + super.getName() +  "\n" +
                "Dog's age is : " + super.getAge());
    }

}
