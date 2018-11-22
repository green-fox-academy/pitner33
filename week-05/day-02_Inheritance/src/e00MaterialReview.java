public class e00MaterialReview {
//    extends - extending a class to a parent class being able to use its methods and variables
//
//
//    store things: single data -> variable, bunch of data -> array, list etc, datas with identifier (eg. dictionary) -> hashmap
//          datas with lots of different properties - class

//    class - just a field for the data structure(do things or just for store the data)
//      the message is the method - tells what to do eg. dog.eat() you don't need to know how the dog works
//    some class doesn't have message (method) / it can be public because we care only about the data inside. But when I don't care about
//      the data itself, but wanna do things with them, -> methods. Then the data is private, none of the other part of the
//      program will be able to change it - my data structure is safe, no one can ruin my program
//
//    relationships - superclass, subclasses
//
//
//    is-a
//
//
//    has-a
//
//
//    super(), super.getField(), super.otherMethod(), this
//
//
//    <variable> instanceof <Class>
//
//
//    access modifiers: public, protected, default, private
//
//
//    getters, setters
//
//
//    final
//
//
//    casting subClass as Class
//
//
//    Packages
//          package keyword
//
//
//          resolve to a type
//
//
//          import <package>.<class>
//
//
//          import <package>.
//
//
//       polymorphism zou are able to reference stg by its base class eg a dog as an animal

//    always refer the class which is covering all the thing eg. CAT instead Animal, because it willl purr too
//    Animal tom = new Animal() <-> Cat tom = new Cat()
//    also you can cast the animal: ((Cat)tom.purr) was if it was created as an Animal

    public static void main(String[] args) {
        Cat tom = new Cat();
        System.out.println(tom.isHungry());
        tom.eat(10);
        System.out.println(tom.isHungry());
        tom.walk();
        System.out.println(tom.isHungry());
        System.out.println(tom.poop());
        tom.purr();


        Dog snoopy = new Dog();
        dailyRoutine(snoopy);
    }


    public static void dailyRoutine (Animals animal) {
        System.out.println(animal.isHungry());
        animal.eat(10);
        System.out.println(animal.isHungry());
        animal.walk();
        System.out.println(animal.isHungry());
        System.out.println(animal.poop());
    }



}
