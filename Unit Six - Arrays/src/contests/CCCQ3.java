package contests;
import java.util.*;

public class CCCQ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++) {
            String s = in.nextLine();
            String prefix = "";
            int finalNum = 0;
            int currentNum = 0;

            for (int j = 0; j < s.length(); j++) {
                int asciiVal = (int)s.charAt(j);
                
                if (asciiVal>=65 && asciiVal<=90){ //capital letter
                    prefix += s.substring(j, j+1);
                } else if (asciiVal>=48 && asciiVal<=57){
                    while (j<s.length()-1 && (int)s.charAt(j)>=48 && (int)s.charAt(j)<=57) {

                        currentNum  = currentNum * 10 + ((int)s.charAt(j) - 48);

                        j++;
                    }
                }
                finalNum += currentNum;
                currentNum = 0;
            }
        System.out.println(prefix + finalNum);
        }
    }
}
