import java.security.SecureRandom;

public class NewM {
    public static void main(String[] args) {

        SecureRandom secureRandom = new SecureRandom();
        int [][] matriz = new int [3][3];   //Denerador


/// codigoP
/// codigoS
        for(int codigoP = 0; codigoP < matriz.length; codigoP++) {
            for(int codigoS  = 0; codigoS < matriz.length; codigoS++) {
                matriz[codigoP][codigoS] = secureRandom.nextInt(5000000);
            }
        }
        // println
        String rps = "";
            for(int codigoP = 0; codigoP < matriz.length; codigoP++) {
                for(int codigoS = 0; codigoS < matriz.length; codigoS++) {
                    rps = rps + "  ," + matriz[codigoP][codigoS];
                }
                rps = rps + " \n\n";
            }
            System.out.println(rps);
    }
}
