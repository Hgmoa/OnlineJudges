package AceptaElReto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema116 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String s = "Hola mundo.";

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}
