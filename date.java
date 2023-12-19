import java.util.Calendar;

public class date {

        static Calendar Hora = Calendar.getInstance();
        static Calendar Fecha = Calendar.getInstance();

        public static void main(String[] args) {

        int hora, segundos, minutos, dia, mes, anno;
        
        hora = Hora.get(Calendar.HOUR_OF_DAY);
        minutos = Hora.get(Calendar.MINUTE);
        segundos = Hora.get(Calendar.SECOND);

            System.out.print(hora + "/" + minutos + "/" + segundos);

        dia = Fecha.get(Calendar.DAY_OF_MONTH);
        mes = Fecha.get(Calendar.MONDAY);
        anno = Fecha.get(Calendar.YEAR);

            System.out.println("\n");

            System.out.print(dia + "/" + mes + "/" + anno);
    }
}
