import java.security.SecureRandom;
import java.util.Calendar;

public class NewVector {
    static Calendar Fecha = Calendar.getInstance();
    public static void main(String[] args) {

    //Vectorizacion fecha
        int cMonth;
        
        cMonth = Fecha.get(Calendar.MONTH);
    
        // Declaraciones de vecatores


        int [] codigoP = new int[10];
        codigoP[0] = 0; 
        codigoP[1] = 0;
        codigoP[2] = 1;
        codigoP[3] = cMonth;
        codigoP[4] = 0;
        codigoP[5] = 0;
        codigoP[6] = 0;
        codigoP[7] = 0;
        codigoP[8] = 0;
        codigoP[9] = 310;


        for(int contador = 0; contador < 10; contador++) {
            System.out.print(" " + codigoP[contador]);
        }


    }
}
