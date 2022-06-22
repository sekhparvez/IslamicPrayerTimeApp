import com.batoulapps.adhan.*;
import com.batoulapps.adhan.data.DateComponents;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Test {

    public void testData(int year, int month, int day){



            //Coordinates coordinates = null;
            CalculationParameters params = CalculationMethod.NORTH_AMERICA.getParameters();
            params.madhab = Madhab.HANAFI;
            params.adjustments.fajr = +12;
            params.adjustments.dhuhr = -5;
            params.adjustments.asr = -83;
            params.adjustments.maghrib = -12;
            params.adjustments.isha = -20;
            Coordinates coordinates = new Coordinates(43, -75);
            DateComponents dateToday = new DateComponents(year, month, day);
            //DateComponents dateNow = null;

            PrayerTimes prayerTimes = new PrayerTimes(coordinates, dateToday, params);
//        System.out.println(20 - prayerTimes.fajr.getHours());
//        prayerTimes.fajr.setTime(1655703840000L);
//        prayerTimes.dhuhr.setTime(1655729820000L);
//        prayerTimes.asr.setTime(1655744220000L);
//        prayerTimes.maghrib.setTime(1655757000000L);
//        prayerTimes.isha.setTime(1655763000000L);


            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
            formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        System.out.println("Fajr Time: ");
        System.out.println(formatter.format(prayerTimes.fajr));

        System.out.println("Dhuhr Time: ");
        System.out.println(formatter.format(prayerTimes.dhuhr));

        System.out.println("Asr Time: ");
        System.out.println(formatter.format(prayerTimes.asr));

        System.out.println("Maghrib Time: ");
        System.out.println(formatter.format(prayerTimes.maghrib));

        System.out.println("Isha Time: ");
        System.out.println(formatter.format(prayerTimes.isha));
    }


}
