public class App {
    public static void main(String[] args) throws Exception {

        String isHoliday = new Holidays().getHoliday("21/02/2023");
        Holiday[] allHolidays = new Holidays().getAllHolidays();

        System.out.println(isHoliday);
        System.out.println(allHolidays[0].name + " - " + allHolidays[0].date);
        System.out.println(allHolidays[1].name + " - " + allHolidays[1].date);
        System.out.println(allHolidays[2].name + " - " + allHolidays[2].date);
        System.out.println(allHolidays[3].name + " - " + allHolidays[3].date);
        System.out.println(allHolidays[4].name + " - " + allHolidays[4].date);
        System.out.println(allHolidays[5].name + " - " + allHolidays[5].date);
        System.out.println(allHolidays[6].name + " - " + allHolidays[6].date);
        System.out.println(allHolidays[7].name + " - " + allHolidays[7].date);
        System.out.println(allHolidays[8].name + " - " + allHolidays[8].date);
        System.out.println(allHolidays[9].name + " - " + allHolidays[9].date);
        System.out.println(allHolidays[10].name + " - " + allHolidays[10].date);

    }
}
