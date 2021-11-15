package AdapterPattern;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConverter implements AmericanTimeFormatAdapter{
    private MilitaryFormatTime twentyFourFormatTime;

    public TimeConverter(MilitaryFormatTime currentTwentyFourFormatTime) {
        this.twentyFourFormatTime = currentTwentyFourFormatTime;
    }

    @Override
    public String getTime() throws ParseException {
        return convert24To12FormatTime(twentyFourFormatTime.getTime());
    }

    private String convert24To12FormatTime(String twentyFourFormatTime) throws ParseException {
        // Format of the date defined in the input String
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        // Change the pattern into 12 hour format
        DateFormat format = new SimpleDateFormat("hh:mm:ss aa");
        Date time = null;
        String twelveFormatTime = "";

        // Converting the input String to Date
        time = dateFormat.parse(twentyFourFormatTime);

        // Changing the format of date and storing it in String
        twelveFormatTime = format.format(time);
        return twelveFormatTime;
    }
}
