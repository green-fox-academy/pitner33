package com.greenfoxacademy.connectionwithmysql.Controllers;

import com.greenfoxacademy.connectionwithmysql.Models.Assignee;
import com.greenfoxacademy.connectionwithmysql.Repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping("/assignees")
    public String assigneeList(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assigneeMain";
    }

    @GetMapping("{id}/deleteassignee")
    public String deleteAssignee(@PathVariable Long id) {
        assigneeRepository.deleteById(id);
        return "redirect:/todo/assignees";
    }

    @GetMapping("{id}/editassignee")
    public String editAssignee(@PathVariable Long id, Model model) {
        model.addAttribute("assignee", assigneeRepository.findById(id).get());
        return "editAssignee";
    }

    @PostMapping("{id}/editassignee")
    public String editAssigneeDone(@ModelAttribute(value = "assignee")Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/todo/assignees";
    }

    @GetMapping("assignees/add")
    public String addAssigneeG(Model model, @ModelAttribute(value = "assignee") Assignee assignee) {
        model.addAttribute("assignee", assignee);
        return "addAssignee";
    }

    @PostMapping("assignees/add")
    public String addAssigneeP(@ModelAttribute(value="assignee") Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/todo/assignees";
    }

}
