package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTesting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true){
            System.err.print("input (add or remove): ");
            String input = in.nextLine();
            if (input.equals("add")){
                list.add(in.nextInt());
                in.nextLine();
            }else if (input.equals("remove")){
                list.remove(in.nextInt());
                in.nextLine();
            }
            for (int n : list){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
