package day5;

public class RandomExample {
    static public void main(String[] args) {
        // random number from 0-1 (not inclusive)
        // for (int i = 0; i < 10000; i++) {
        //     System.out.println(Math.random());
        // }

        //generate a num from 1 to 10 -> int only
        // for (int i = 0; i < 100; i++) {
        //     System.out.println((int)(Math.random()*21)-10);
        // }
        int start = -5, stop=5;
        for (int i = 0; i < 100; i++) {
            System.out.println((int)(Math.random()*(stop-start+1))+start);
        }
    }
}
