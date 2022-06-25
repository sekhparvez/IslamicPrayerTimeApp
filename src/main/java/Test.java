import com.batoulapps.adhan.*;
import com.batoulapps.adhan.data.DateComponents;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Test {

    public void testData(int year, int month, int day, double latitude, double longitude, String ID) {



                    //Coordinates coordinates = null;
                    CalculationParameters params = CalculationMethod.MUSLIM_WORLD_LEAGUE.getParameters();
                    params.madhab = Madhab.HANAFI;
                    params.adjustments.fajr = +42;
                    params.adjustments.dhuhr = -5;
                    params.adjustments.asr = -83;
                    params.adjustments.maghrib = -12;
                    params.adjustments.isha = -40;
                    Coordinates coordinates = new Coordinates(latitude, longitude);
                    DateComponents dateToday = new DateComponents(year, month, day);

                    PrayerTimes prayerTimes = new PrayerTimes(coordinates, dateToday, params);


                    SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
                    formatter.setTimeZone(TimeZone.getTimeZone(ID));

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
