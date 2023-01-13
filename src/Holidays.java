public class Holidays {

    Holiday[] holidays = {
        new Holiday( "Confraternização mundial", "01/01/2023"),
        new Holiday( "Carnaval", "21/02/2023"),
        new Holiday( "Páscoa", "17/04/2023"),
        new Holiday( "Tiradentes", "21/04/2023"),
        new Holiday( "Dia do trabalho", "01/05/2023"),
        new Holiday( "Corpus Christi", "08/06/2023"),
        new Holiday( "Independência do Brasil", "07/09/2023"),
        new Holiday( "Nossa Senhora Aparecida", "12/10/2023"),
        new Holiday( "Finados", "02/11/2023"),
        new Holiday( "Proclamação da República", "15/11/2023"),
        new Holiday( "Natal", "25/12/2023")
    };


    public String getHoliday(String date){
        for(int i = 0; i<holidays.length; i++){
            if(date == holidays[i].date) {
                return "Feriado: " + holidays[i].name;
            }
        }
        return "Não há feriados nesta data";
    }

    public Holiday[] getAllHolidays(){
        return holidays;
    }
}
