import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
       this.moment = moment.atTime(0,0).plusSeconds(1000000000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return moment;
    }
}
