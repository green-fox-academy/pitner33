public class e00MaterialReview {
//    implements - the connection to an interface
//
//
//    interface - contains only abstract methods, no field values
//               use: when you have child classes (spoon, fork, bed) and a common method (clean) but it works differently for them, or they are
//              create a cleanable interface which will define a method (access modifier must be public - dont need to write - it is that anyways)
//              but the implementation for the method will be different in the child classes ('implement Cleanable' in class line)
//              you MUST specify the method there
//            benefit: (polymorphism ?) Like in Garden excercise you created a Plant and then in Garden you were able to create a common List<Plants> for trees and flowers
//              you can create List<Cleanable> thingsToClean = new ArrayList()<>
//                             Bed bed = new Bed or Cleanable bed2 = new Bed()
//                             thingsToClean.add(bed)
//              and for fork, and all
//              BUT like this you wont able use methods of bed, eg. bed.sleepIn()(IF you specified like the second - bed2) because  this way bed is just a thing to clean
//            interface name usually ends with '...able'
//
//    abstract class - any class in which has an abstract method (or more)
//              you cannot create objects from them
//              'abstract' must be in the name of abstract methods in it too
//
//
//
//    abstract methods - no arguments, no body for them, only create a signature for the method
//                  they can be protected or public (no private)in abstract classes (whereas in interface they must be public!)
//
//    polymorphism
//
//
//    method overriding - override a parent method
//
//
//    method overloading - like the constructor with same names but different values
//                              or two methods with different implementations
                                //    public void hey() {
                                //        System.out.println("hey, name");
                                //
                                //    }
                                //    public void hey(String name) {
                                //        System.out.println("hey" + name);
                                //    }
//
//    Diamond problem - two parent with the same stuff - which one the child will inherit?
//
//
//    Comparison
//      compareTo()
//
//      Comparable
//
//      Comparator
//

}
