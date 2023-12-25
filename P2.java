import java.security.SecureRandom;

public interface P2 {
    static public void main(String[] args) {

    //  Dodificacion numerica prefija 
        int [] codigoP = new int [8];

        codigoP[0] = 0;
        codigoP[1] = 0;
        codigoP[2] = 1;
        codigoP[3] = 0;
        codigoP[4] = 0;
        codigoP[5] = 0;
        codigoP[6] = 0;
        codigoP[7] = 0;



    //  Declaracion CondificacionNumerica
        int [] codigoS = new int [3];

        SecureRandom codigoSecure = new SecureRandom();
            int contador_i = codigoSecure.nextInt(10);

        SecureRandom codigoSecure_ii = new SecureRandom();
            int contador_ii = codigoSecure_ii.nextInt(10);
           
        SecureRandom codigoSecure_iii = new SecureRandom();
            int contador_iii = codigoSecure_iii.nextInt(10);    

        codigoS[0] = contador_i;
        codigoS[1] = contador_ii;
        codigoS[2] = contador_iii;



    //  Sistema de Impresion  
     
         for(int codificador = 0; codificador < 8; codificador++ ) {
            System.out.print(" " + codigoP[codificador]);
        } 

      

        for(int codificador_II = 0; codificador_II < 3; codificador_II++) {
            System.out.print(codigoS[codificador_II]);
        }
            
    

        



    }
}
