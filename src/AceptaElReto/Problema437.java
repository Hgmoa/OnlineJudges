package AceptaElReto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problema437 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int casos;
    static String linea;
    static String[] hora;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            linea = br.readLine();
            hora = linea.split(":");
            sb = new StringBuilder();
            sb
                    .append(
                            String.format("%02d", 24 - 1 - Integer.parseInt(hora[0]))
                    )
                    .append(":")
                    .append(
                            String.format("%02d", 60 - 1 - Integer.parseInt(hora[1]))
                    )
                    .append(":")
                    .append(
                            String.format("%02d", 60 - Integer.parseInt(hora[2]))
                    );
            System.out.println(sb.toString());
        }
    }
}
