import java.util.Calendar;
import java.security.SecureRandom;


public class Pruebas {

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

        SecureRandom variableV = new SecureRandom();
            int contadorV = variableV.nextInt(10);

        SecureRandom variableVI = new SecureRandom();
            int contadorVI = variableVI.nextInt(10); 
            
        //Carga_Vectores  
        System.out.println("\tSERIAL TICKET");

            int [] codigoP = new int [15];
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
            codigoP[13] = contadorV;
            codigoP[14] = contadorVI;

           
            //VALIDACION_ FORMATOS DE IMPRESION

             for(int aletorio = 1; aletorio < 100; aletorio++) {
                for(int codificador = 0; codificador <15; codificador++) {
                    System.out.print("|" + codigoP[codificador]);
                }
            }


        }
}

            /*  for(int codigoP = 1; codigoP <=10; codigoP++) {
                double Aletorio = Math.random();
                    System.out.println(codigoP);
            } */