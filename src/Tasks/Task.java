package Tasks;

import exception.IncorrectArgumentException;

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
        setTitle(title);
        this.type = type;
        id = ++idGenerator;
        this.dateTime = dateTime;
        setDescription(description);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IncorrectArgumentException("title");
        }
        this.title = title;
    }


    public void setDescription(String description) {
        if (description == null || description.isBlank()) {
            throw new IncorrectArgumentException("description");
        }
        this.description = description;
    }

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

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
