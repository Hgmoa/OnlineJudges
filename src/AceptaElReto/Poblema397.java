package AceptaElReto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Poblema397 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int casos, n;
    static long sum;

    public static void main(String[] args) throws Exception {
        casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            n = Integer.parseInt(br.readLine());
            for (int j = 1; j <= n; j++) {
                sum += j;
            }
            System.out.println((sum % 3 == 0) ? "SI " : "NO");
        }
    }
}
