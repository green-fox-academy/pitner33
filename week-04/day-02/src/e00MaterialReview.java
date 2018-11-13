public class e00MaterialReview {
    public static void main(String[] args) {
//        SEE FAMILYMEMBERS.JAVA TOO
//  Object oriented coding:
//      inheritance
//      encapsulation -only this today
//      abstractism
//      polymofism
//  Class - csoportosításra, creating data structures
//          public -> filename == classname (privatenál nem kell)
//             you can use them within the same project
//        one class in one file ->rule, for not to fucked up
//  Object -
//
//
//  constractor - special method, create an object for us
//                  uppercase first letter and same as filename
//        as many times as you type "new" it will run
//        there is a shortcut to create all the constructors when you selected all the field variables
//          Alt+insert -> Constructor -> select the field variables /see in Point.java/
//
//  Fields - a classban ay eredetileg megadott alapvaltozok field variables
//
//
//  Encapsulation - egységbezárás / you use something you don't need to know how is it working eg. arrays / how does it work - who cares?
//        working and that is enough
//
//
//  This - is a fucked up thing /see in FamilyMembers
//
//
//  New
//
//
//  Static hasznalhatom a methodot anelkul, h valtozot hoznek letre
//        static field is lehet
// vs. !Static
//
//
//   public <-> private / private nem lathato a classon kivulrol POINT-ban

        FamilyMembers mom = new FamilyMembers("A"); //itten adom meg a surname-et egybol a new-nel
        FamilyMembers dad = new FamilyMembers("B");
        mom.age = 33;
        System.out.println(mom.age);
        System.out.println(dad.age); //will print 0 right now
        System.out.println(mom.name);
        System.out.println(dad.name);
        System.out.println(mom.surname);
        System.out.println(dad.surname);


        Point p1 = new Point(2, 5);


        Human bob = new Human(75);
        Human joe = new Human(22);

        System.out.println(bob.isSmart()); //kisbetus value
        System.out.println(Human.alive); //nagybetus method meghozza Static -
        bob.alive = false; //mivel static field vagy method vagy mi, ittt megvaltoztatom az alapbeallitast ->joe is ugyanaz lesz
        System.out.println(bob.alive);
        System.out.println(joe.alive);
        System.out.println(bob); //it will giv a mamoryaddress / to print out is a toStringmethod in HUMAN
    }



}
