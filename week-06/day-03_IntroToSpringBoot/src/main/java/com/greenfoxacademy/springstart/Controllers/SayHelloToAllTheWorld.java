package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class SayHelloToAllTheWorld {
    int fontSize;
    String fontColor;
    String[] fontColorArray;
    int[] fontSizeArray;
    Random random = new Random();

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/helloAll")
    public String helloToAll(Model model) {
        model.addAttribute("hellos", hellos);
        model.addAttribute("fontColor", getFontColor());
        model.addAttribute("fontSize", getFontSize());

        return "helloToAll";
    }
    public int getFontSize() {
        fontSize = random.nextInt(18) + 18;
        return fontSize;
    }

    public String getFontColor() {
            int randomColor = random.nextInt(0xffffff + 1);
            fontColor =String.format("#%06x", randomColor);
        return fontColor;
    }



  /*  public int[] getFontSize() {
        for (int i = 0; i < hellos.length; i++) {
            fontSize = random.nextInt(18) + 18;
            fontSizeArray[i] = fontSize;
        }
        return fontSizeArray;
    }

    public String[] getFontColor() {
        for (int i = 0; i < hellos.length; i++) {
            int randomColor = random.nextInt(0xffffff + 1);
            fontColor =String.format("#%06x", randomColor);
            fontColorArray[i] = fontColor;
        }
        return fontColorArray;
    }*/
}
