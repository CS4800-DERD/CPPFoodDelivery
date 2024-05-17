import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        TimeShift la = new LACountyShift();
        TimeShift orange = new OrangeCountyShift();
        TimeShift sb = new SanBernardinoCountyShift();

        Driver driver1 = new Driver("Daniel", "19939 Gary St", "Los Angeles");

        driver1.setTimeShift(la);

        System.out.println(driver1.getEndTime());
    }
}