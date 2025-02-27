package contests;

import java.util.*;

public class JuniorWaterlooCCC2024 {
    public static void main(String[] args) {
        // Q1();
        // Q2();
        // Q3();
        // Q4();
        Q5();
    }

    private static void Q1(){
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        in.nextLine();
        int G = in.nextInt();
        in.nextLine();
        int B = in.nextInt();
        in.nextLine();
        System.out.println(R*3 + G*4 + B*5);
    }

    private static void Q2(){
        Scanner in = new Scanner(System.in);
        int dusaSize = in.nextInt();
        in.nextLine();
        while (true){
            int yobiSize = in.nextInt();
            in.nextLine();
            if (yobiSize>dusaSize){
                System.out.println(dusaSize);
                break;
            }
            dusaSize += yobiSize;
        }
    }

    private static void Q3(){
        Scanner in = new Scanner(System.in);
        int numPeople = in.nextInt();
        in.nextLine();
        int[] scores = new int[numPeople];

        int biggest = 0;
        int biggest2 = 0;
        int biggest3 = 0;
        int numBiggest3 = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
            in.nextLine();
            if (scores[i]>biggest){
                biggest3 = biggest2;
                biggest2 = biggest;
                biggest = scores[i];
            } else if (scores[i]>biggest2 && scores[i]<biggest){
                biggest3 = biggest2;
                biggest2 = scores[i];
            } else if (scores[i]>biggest3 && scores[i]<biggest2){
                biggest3 = scores[i];
                numBiggest3 = 0;
            }
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i]==biggest3){
                numBiggest3++;
            }
        }

        System.out.println(biggest3 + " " + numBiggest3);
    }

    private static void Q4(){
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.nextLine();
        String[] top = in.nextLine().split(" ");
        String[] bottom = in.nextLine().split(" ");

        int totalLength = 0;
        for (int i = 0; i < top.length; i++) {
            if (top[i].equals("1")){
                if (i!=0 && top[i-1].equals("0")){
                    System.out.println("Top " + i);
                    totalLength++;
                }
                if (i!=top.length-1 && top[i+1].equals("0")){
                    System.out.println("Top " + i);
                    totalLength++;
                }
                if (i%2==1 && bottom[i].equals("0")){
                    System.out.println("Top " + i);
                    totalLength++;
                }
            }
        }

        for (int i = 0; i < bottom.length; i++) {
            if (bottom[i].equals("1")){
                if (i!=0 && bottom[i-1].equals("0")){
                    System.out.println("Bottom " + i);
                    totalLength++;
                }
                if (i!=bottom.length-1 && bottom[i+1].equals("0")){
                    System.out.println("Bottom " + i);
                    totalLength++;
                }
                if (i%2==0 && top[i].equals("0")){
                    System.out.println("Bottom " + i);
                    totalLength++;
                }
            }
        }

        System.out.println(totalLength);
    }

    private static void Q5(){
        Scanner in = new Scanner(System.in);
        
    }
}
