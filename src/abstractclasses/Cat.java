package abstractclasses;

public class Cat extends Animal{

    //must be overriden
    @Override
    public void speak(){
        System.out.println("Mieow! ");
    }

    //can be overriden or not.
    @Override
    public void eat(){
        super.eat();
        System.out.println(".. food is finished");
    }

}
