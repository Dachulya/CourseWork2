package Tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task {
    @Override
    public boolean appearsIn(LocalDate date) {
        return date.isAfter(dateTime.toLocalDate()) || date.equals(dateTime.toLocalDate())
                && date.getDayOfMonth() == dateTime.getDayOfMonth();
    }


    public MonthlyTask(String title, Type type, LocalDateTime localDateTime, String description) {
        super(title, type, localDateTime, description);
    }
}


