package com.greenfoxacademy.connectionwithmysql.Controllers;

import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import com.greenfoxacademy.connectionwithmysql.Repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }




    //    MULTIPLE REQUESTMETHODS TO THE SAME CONTROLLER METHOD
    @RequestMapping( value = {"/", "/list" }, method = GET)
    public String list(Model model,  @RequestParam(value = "isActive", required=false) Boolean isActive, @RequestParam(value="search", required=false) String search){
        if (search != null) {
            model.addAttribute("todos", todoRepository.findByTitleContainsOrDescriptionContains(search, search));
        } else if(isActive == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else {
            model.addAttribute("todos", todoRepository.findByDone(!isActive));
        }

        return "todolist";
    }

    @GetMapping("/add")
    public String add(Model model, @ModelAttribute (name="newtodo") Todo todo) {  //átadok neki egy üres Todo objectet ("ModelAttrib) amit összekötök a mezőmmel (Th:field) - és a html-hetz átpasszolást a Model csinálja
        model.addAttribute("newtodo", todo);
        return "addtodo";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute(value="newtodo") Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("{id}/delete")
    public String delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoRepository.findById(id).get());
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "edittodo";
    }

    @PostMapping("{id}/edit")
    public String editing(@ModelAttribute("todo") Todo todo, @ModelAttribute(value = "assig") String assig) {
        todo.setAssignee(assigneeRepository.findByName(assig));
        todoRepository.save(todo);
        return "redirect:/todo/list";

    }

    @GetMapping("{id}/details")
    public String details(Model model, @PathVariable Long id) {
        model.addAttribute("todo", todoRepository.findById(id).get());
        return "todoDetails";
    }

//    @GetMapping("/search")
//    public String search(Model model, @RequestParam(value="search", required=false) String search) {
//        model.addAttribute("todos", todoRepository.findByTitleContains(search));
//        return "todolist";
//    }


}
