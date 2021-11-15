package AdapterPattern;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime implements MilitaryFormatTime {
    @Override
    public String getTime() {
        return new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    }
}
