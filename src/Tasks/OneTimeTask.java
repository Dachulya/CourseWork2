package Tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {
    @Override
    public boolean appearsIn(LocalDate date) {
        return date.equals(dateTime.toLocalDate());
    }

    public OneTimeTask(String title, Type type, LocalDateTime localDateTime, String description) {
        super(title, type, localDateTime, description);
    }
}
