package interfaces.speakingschool;

public class Dog implements ISpeakable{

    @Override
    public void speak() {
        System.out.println("Woof woof");
    }
}
