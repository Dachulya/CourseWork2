package Tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task {
    @Override
    public boolean appearsIn(LocalDate date) {
        return date.isAfter(dateTime.toLocalDate()) || date.equals(dateTime.toLocalDate()) && date.getDayOfMonth() == dateTime.getDayOfMonth()
                && date.getMonth().equals(dateTime.getMonth());
    }

    public YearlyTask(String title, Type type, LocalDateTime localDateTime, String description) {
        super(title, type, localDateTime, description);
    }
}
