package interfaces.speakingschool;

public class Main {
    public static void main(String[] args) {

    ISpeakable bob = new Dog();
    ISpeakable alice = new Cat();

    Cat mia = new Cat();

    alice.speak();
    bob.speak();

        System.out.println("---ONLY CAT--");
    SpeakingSchool sc = new SpeakingSchool();

    sc.learnToSpeak();

        System.out.println("--GENERIC---");

    GenericSpeakingSchool gs1 = new GenericSpeakingSchool(alice);
    GenericSpeakingSchool gs2 = new GenericSpeakingSchool(bob);
    GenericSpeakingSchool gs3 = new GenericSpeakingSchool(mia);

    gs1.learnToSpeak();
    gs2.learnToSpeak();
    gs3.learnToSpeak();

    }
}
