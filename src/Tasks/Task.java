package Tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Task {

    private static int idGenerator = 0;
    private String title;

    public int getId() {
        return id;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        Task.idGenerator = idGenerator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDateTime getLocalDateTime() {
        return dateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.dateTime = localDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public abstract boolean appearsIn(LocalDate date);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private Type type;

    protected LocalDateTime dateTime;
    private String description;
    private final int id;

    public Task(String title, Type type, LocalDateTime dateTime, String description) {
        this.title = title;
        this.type = type;
        id = ++idGenerator;
        this.dateTime = dateTime;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tasks.Task{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", localDateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }

    public enum Type {
        WORK,
        PERSONAL
    }
}
