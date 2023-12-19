import java.util.Calendar;
import java.security.SecureRandom;

public class NumII {

    static Calendar Fecha = Calendar.getInstance();
    public static void main(String [] args) {

        //DeclaraFecha
        int cMonth;

        cMonth = Fecha.get(Calendar.MONTH);


        //DeclaraNum_Aletorios
        SecureRandom variable = new SecureRandom();
            int contador = variable.nextInt(4000);
          //  System.out.println(contador);



        //Carga_Vectores  
        System.out.println("  SERIAL TICKET");

        int [] codigoP = new int [10];
        codigoP[0] = 0;
        codigoP[1] = 0;
        codigoP[2] = 1;
        codigoP[3] = cMonth;
        codigoP[4] = 0;
        codigoP[5] = 0;
        codigoP[6] = 0;
        codigoP[7] = 0;
        codigoP[8] = 0;
        codigoP[9] = contador;      

            for(int codificador = 0; codificador < 10; codificador++) {
                System.out.print(" " + codigoP[codificador]);
            }
        }
}
