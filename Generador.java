public class Generador {
    public static void main(String[] args) {

        int matriz[][] = new int [3][3];
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                matriz[x][y] = (int) (Math.random()* 9 + 1);
            }
        }

    }
}
