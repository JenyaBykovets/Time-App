package app.converter;

import net.time4j.ClockUnit;
import net.time4j.Duration;


public class TimeConverter {
    public static String formatDurationInSeconds() {
        Duration<ClockUnit> dur = Duration.of(15973, ClockUnit.SECONDS).with(Duration.STD_CLOCK_PERIOD);
        return Duration.Formatter.ofPattern(ClockUnit.class, "hh:mm:ss").format(dur);
    }
}
