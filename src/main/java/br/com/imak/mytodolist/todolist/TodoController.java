package br.com.imak.mytodolist.todolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/todos")
public class TodoController {

    @GetMapping
    public List<ToDo> getAllTodos() {
        List<ToDo> todo = Arrays.asList(
                new ToDo(
                        1l,
                        "Call John",
                        "Review marketing data",
                        "EFG",
                        LocalDate.of(2021, 7, 31),
                        Status.IN_PROCESS,
                        "Take a look at the data first"),

                new ToDo(
                        2l,
                        "Schedule meeting",
                        "Review new org chart",
                        "EFG",
                        LocalDate.of(2021, 8, 10),
                        Status.NOT_STARTED,
                        "Meeting not yet confirmed"),

                new ToDo(
                        3l,
                        "Meeting report",
                        "Write last meeting report",
                        "EFG",
                        LocalDate.of(2021, 8, 03),
                        Status.COMPLETED,
                        "Already sent to Bob")

                );
                return todo;
    }
}
