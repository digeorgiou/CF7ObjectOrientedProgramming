package inheritance;

public class Main {

    public static void main(String[] args) {


//        Person p1 = new Person();
//
//        Employee e1 = new Employee();
//
//        p1.speak();
//        System.out.println("-----");
//        e1.speak();


        Animal an = new Animal("Tony", 24);
        Cat billy = new Cat("Billy", 5);
        Dog lulu = new Dog("Luna", 12);

        Animal[] arr1 = new Animal[] {an, billy, lulu};

        for(Animal obj : arr1){
            doMakeSound(obj);
            System.out.println(obj);
        }
    }

    /*Polymorphic method. It accepts any animal in the inheritance hierarchy */
    public static void doMakeSound(Animal animal){
        animal.speak();
    }
}
