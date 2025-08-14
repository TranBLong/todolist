package com.example.todolist.Service;

import com.example.todolist.Model.Task;
import com.example.todolist.Repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> getAll() {
        return repo.findAll();
    }

    public Task add(Task task) {
        return repo.save(task);
    }

    public Task update(Task task) {
        return repo.save(task);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
