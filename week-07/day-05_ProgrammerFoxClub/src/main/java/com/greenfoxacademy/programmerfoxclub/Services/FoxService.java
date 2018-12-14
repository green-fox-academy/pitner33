package com.greenfoxacademy.programmerfoxclub.Services;

import com.greenfoxacademy.programmerfoxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {
    List<Fox> foxList;

    public FoxService() {
        this.foxList = new ArrayList<>();
//        foxList.add(new Fox("Foxy"));
    }

    public List<Fox> getFoxList() {
        return foxList;
    }

    public void setFoxList(List<Fox> foxList) {
        this.foxList = foxList;
    }

    public Optional<Fox> findFox(String name) {  //for finding any elements in the ArrayList of Fox items for thymeleaf and for webapps its important
        for (Fox fox : foxList) {                   //that they can get back null elements (if the list is empty) - so primitive types in the field are not allowed.
            if( fox.getName().equals(name)) {       //Also you need to use OPTIONAL thingy - it gives you back the actual list element IF it exist, and null if its not
                return Optional.of(fox);            //here we return an Optional fox (if the given name is in the list) (
            }                                       //it is a FOX element OR null - I need to unwrap it - see at if(optionalFox.isPresent()) in controllers
        }
        return Optional.empty();                    //here I give back an empty optional, since there is no name matcning
    }

    public void addFox(String name){                //adds a new Fox element to the list - it is used on the login page when the name field is filled and you click on GO to send a post request
        foxList.add(new Fox(name));                 //it needs a FIX: it is now allow the same names to create
    }
}
