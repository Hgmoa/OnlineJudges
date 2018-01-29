package AceptaElReto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema435 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String linea;
    static char[] nums;

    public static void main(String[] args) throws Exception {
        while ((linea = br.readLine()) != null && linea.length() != 0) {
            nums = new char[10];
            for (char c : linea.toCharArray()) {
                switch (c) {
                    case '0':
                        nums[0]++;
                        break;
                    case '1':
                        nums[1]++;
                        break;
                    case '2':
                        nums[2]++;
                        break;
                    case '3':
                        nums[3]++;
                        break;
                    case '4':
                        nums[4]++;
                        break;
                    case '5':
                        nums[5]++;
                        break;
                    case '6':
                        nums[6]++;
                        break;
                    case '7':
                        nums[7]++;
                        break;
                    case '8':
                        nums[8]++;
                        break;
                    case '9':
                        nums[9]++;
                        break;
                }
            }
            if (nums[0] == nums[1] && nums[1] == nums[2] && nums[2] == nums[3] && nums[3] == nums[4] && nums[4] == nums[5] && nums[5] == nums[6] && nums[6] == nums[7] && nums[7] == nums[8] && nums[8] == nums[9])
                System.out.println("subnormal");
            else
                System.out.println("no subnormal");
        }
    }
}
