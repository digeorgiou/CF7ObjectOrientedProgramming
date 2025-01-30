package interfaces.speakingschool;

/**
 * Dependency Injection or IoC(Inversion of Control)
 * (Usually achieved by using Interfaces as class instances)
 * Here done with Constructor Injection.
 * Generic Speaking school is loosely coupled with the object it contains.
 * the object's type is given at runtime.
 * It can use object from any class that implements speakable interface.
 */
public class GenericSpeakingSchool {
    private final ISpeakable speakable;

    public GenericSpeakingSchool(ISpeakable speakable){
        this.speakable = speakable;
    }

    public void learnToSpeak(){
        speakable.speak();
    }

}
