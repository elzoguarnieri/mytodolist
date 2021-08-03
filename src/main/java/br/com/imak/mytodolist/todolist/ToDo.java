package br.com.imak.mytodolist.todolist;

import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
    private Long id;
    private String item;
    private String description;
    private String assignedTo;
    private LocalDate dueDate;
    private Status status;
    private String note;
}