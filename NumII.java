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
            int contador = variable.nextInt(10);
          //  System.out.println(contador);


        SecureRandom variable_II = new SecureRandom();
            int contadorII = variable_II.nextInt(10);

        SecureRandom variable_III = new SecureRandom();
            int contadorIII = variable_III.nextInt(10);

        SecureRandom variableIV = new SecureRandom();
            int contadorIV = variableIV.nextInt(10);

        //Carga_Vectores  
        System.out.println("\tSERIAL TICKET");

        int [] codigoP = new int [13];
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
        codigoP[10] = contadorII;   
        codigoP[11] = contadorIII;
        codigoP[12] = contadorIV;

            for(int codificador = 0; codificador < 13; codificador++) {
                System.out.print(" " + codigoP[codificador]);
            }
        }
}
