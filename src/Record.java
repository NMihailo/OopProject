// Клас Record
import java.time.LocalDate;

public class Record {
    private Habit habit;
    private LocalDate timeCreated;
    private boolean isPerformed;
    private LocalDate timeUpdated;

    public Record(Habit habit, LocalDate timeCreated, boolean isPerformed, LocalDate timeUpdated) {
        this.habit = habit;
        this.timeCreated = timeCreated;
        this.isPerformed = isPerformed;
        this.timeUpdated = timeUpdated;
    }

}
