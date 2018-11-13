public class FamilyMembers {
    String name; //field variables
    int age;
    String surname;

    public FamilyMembers(String surname) {
        System.out.println("It is a constructor"); //it will run whenever you call it in other files (like "new  FamilyMembers"
        name = "someething"; //igy amom.name ;s a dad.name is something lesy ha kiirom - ha nem adtam neki erteker mashol (lsd age for mom)
       // surname = surename; nem ok, mert fent  a constructor meghataroyasaban syerepel
        this.surname = surname; //ey igy ok THIS / a field variablere hivatkozik es a new FalilyMembersnel fog megjelenni - megadhatom rogton a new-nal a surname-t is

    }
}
