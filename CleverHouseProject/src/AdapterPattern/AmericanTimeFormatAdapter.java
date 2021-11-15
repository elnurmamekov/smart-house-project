package AdapterPattern;

import java.text.ParseException;

public interface AmericanTimeFormatAdapter {
    //gets time in 12-hour format
    String getTime() throws ParseException;
}
