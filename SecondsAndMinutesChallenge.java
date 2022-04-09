public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString (int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hrs = minutes / 60;
            int remMins = minutes % 60;

            String hrsString = hrs + "h";
            if (hrs < 10) {
                hrsString = "0" + hrsString;
            }

            String remMinsString = remMins + "m";
            if (remMins < 10) {
                remMinsString = "0" + remMinsString;
            }

            String secondString = seconds + "s";
            if (seconds < 10) {
                secondString = "0" + secondString;
            }

            return hrsString + " " + remMinsString + " " + secondString + " ";
        }
        return INVALID_VALUE_MESSAGE;
    }
    public static String getDurationString (int seconds) {
        if (seconds > 0) {
            int minutes = seconds / 60;
            int remSec = seconds % 60;
            return getDurationString(minutes, remSec);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
