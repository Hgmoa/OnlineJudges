package AceptaElReto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema413 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int casos = 0, alto, ancho, dim;
    static String linea;

    public static void main(String[] args) throws IOException {
        casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            linea= br.readLine();
            alto = Integer.parseInt(linea.split(" ")[0]);
            ancho = Integer.parseInt(linea.split(" ")[1]);
            dim=alto*ancho;
            if (dim%2 == 0){
                System.out.println(dim/2 + " " + dim/2);
            }else{
                System.out.println((dim/2)+1 + " " + dim/2);
            }
        }
    }
}
