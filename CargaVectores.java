import java.security.SecureRandom;

public class CargaVectores {
    public static void main(String[] args) {


    //Declaracion de vectores//

    System.out.println(" " + "SERIAL TICKET");

        int [] codigoP = new int[10];
        codigoP[0] = 0;
        codigoP[1] = 0;
        codigoP[2] = 1;
        codigoP[3] = 12; 
        codigoP[4] = 0;
        codigoP[5] = 0;
        codigoP[6] = 0;
        codigoP[7] = 0;
        codigoP[8] = 0;
        codigoP[9] = 310;

        for(int contador = 0; contador < 10; contador++ ) {
            System.out.print(" " + codigoP[contador]);
        }


       
    }
}
