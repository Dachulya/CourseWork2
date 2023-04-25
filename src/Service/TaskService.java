package Service;

import Tasks.Task;
import exception.TaskNotFunctionException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TaskService {

    private Map<Integer, Task> taskMap;
    private Collection<Task> removedTasks;

    public TaskService(Map<Integer, Task> taskMap, Collection<Task> removedTasks) {
        this.taskMap = new HashMap<>();
        this.removedTasks = new ArrayList<>();
    }
    public void add(Task task){
        taskMap.put(task.getId(),task);
    }
    public Task remove(int id){
        Task removedTask=taskMap.remove(id);
        if (removedTask !=null){
            removedTasks.add(removedTask);

        }else {
            throw new TaskNotFunctionException("Задача указана с неверным id");
        }
        return removedTask;
    }
    public Collection<Task> getAllByDate(LocalDate date){
        Collection<Task> taskList=new ArrayList<>();
        for (Task task: taskMap.values()){
            if (task.appearsIn(date)){
                taskList.add(task);
            }
        }
        return taskList;
    }
}
