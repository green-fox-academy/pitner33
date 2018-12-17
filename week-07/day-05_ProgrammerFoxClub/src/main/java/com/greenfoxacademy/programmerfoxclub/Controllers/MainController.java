package com.greenfoxacademy.programmerfoxclub.Controllers;

import com.greenfoxacademy.programmerfoxclub.Models.Fox;
import com.greenfoxacademy.programmerfoxclub.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class MainController {                           //its a controller
    private FoxService foxService;                      //create a FoxService (it is our Service)

    @Autowired                                          //to connect the service with the controller @Autowired the constructor of the Controller class
    public MainController(FoxService foxService) {      //here I can specify all variables I will need in the controllers
        this.foxService = foxService;
    }

//    @REQUESTPARAM - identifier which is in the browserfield and helps to identify the actual element
//    RedirectAttributes - this way I can carry the requestparam @Requestparam(value="XXX", required=false) MUST BE THE SAME AS attributes.addAttribute("XXX", name);
//    @MODELATTRIBUTE - those thing which I want to modify from the html with a POST request
//    @ModelAttribute("XXX") MUST be the same as  <select name="trick"> in the HTML or the name or id I suppose if the infut field is not a select but text type

    //Model for transfer a FOX to my html @Request param for I can use the name in the browser field from the html
    // <a th:href="@{'/information?NAME=' THE NAME IN THIS MUST BE THE SAME AS @RequestParam(value = "NAME"
    //Request param can be false (name is not needed in the browserfield
    //RedirectAttributes is for carrying the name with me in the browserfield after a get/post request
    @GetMapping("/")
    public String main(Model model, @RequestParam(value = "name", required=false) String name, RedirectAttributes attributes) {
//        model.addAttribute("foxes", foxService.getFoxList()); //NE HASZNALJ LISTAT, MERT BELEBUKSZ ;)
        attributes.addAttribute("name", name);
        if (name == null) {                                         //if name null you go to the loginpage where you can add name
            return "redirect:/login";
        } else {
            Optional<Fox> optionalFox = foxService.findFox(name);       //check the name for it is in the list of foxes or not. findFox() from FxService gives be bec Optional Foxes
            if(optionalFox.isPresent()) {                                 //now I am "unwrapping" it. If there is a fox in the optional thingy
                model.addAttribute("fox", optionalFox.get());           //I will use it in my model and will pass it to the html as "fox" ATTRIBUTENAME important in html!!
            } else {
                return "redirect:/login";                                       // else just go to ligin where a name can be presented
            }
        }
        return "index";                                                     //if I've had a fox, I will implement the index html
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam("name") String name, RedirectAttributes attributes) { //@RequestParam("name") IS ok, but if I need false or true, then VALUE needed see  @GetMapping("/")
            foxService.addFox(name);
            attributes.addAttribute("name", name);      //REQUEST PARAM "NAME" ;S AZ ATTRIBUTE NAME "NAME" (ZOLDEK) UGYANAZ KELL LEGYEN!!!!
        return "redirect:/";
    }

    @GetMapping("/nutritionStore")
    public String nutritionStore(Model model, @RequestParam(value = "name", required=false) String name, RedirectAttributes attributes){
        attributes.addAttribute("name", name);
        if (name == null) {
            return "redirect:/login";
        } else {
            Optional<Fox> optionalFox = foxService.findFox(name);
            if(optionalFox.isPresent()) {
                model.addAttribute("fox", optionalFox.get());
            } else {
                return "redirect:/login";
            }
        }
        return "nutrition";
    }

    @PostMapping("/nutritionStore/add")     //here  just make a plus /add place (appears at HTML form: action=)(Its just for reference, I will never go there actually) / this way it will not crash with the getmappingg for the same page
    public String addNutrition(@RequestParam(value = "name", required=false) String name, @ModelAttribute("food") String food, @ModelAttribute("drink") String drink, RedirectAttributes attributes) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        optionalFox.get().setFood(food);
        optionalFox.get().setDrink(drink);
        attributes.addAttribute("name", name);
        return "redirect:/";
    }

    @GetMapping("/trickcenter")
    public String trickCenter(Model model, @RequestParam(value = "name", required=false) String name, RedirectAttributes attributes){
        attributes.addAttribute("name", name);
        if (name == null) {
            return "redirect:/login";
        } else {
            Optional<Fox> optionalFox = foxService.findFox(name);
            if(optionalFox.isPresent()) {
                model.addAttribute("fox", optionalFox.get());
            } else {
                return "redirect:/login";
            }
        }
        return "tricks";
    }

    @PostMapping("/trickcenter/add")
    public String addTricks(@RequestParam(value = "name", required=false) String name, @ModelAttribute("trick") String trick, RedirectAttributes attributes) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (!optionalFox.get().getListOfTricks().contains(trick)) {
            optionalFox.get().addTrick(trick);
        }
        attributes.addAttribute("name", name);
        return "redirect:/";
    }
}
