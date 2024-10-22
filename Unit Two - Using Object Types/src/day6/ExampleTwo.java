package day6;

public class ExampleTwo {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            String oldName = "ABCDEFG";
            int randomNum = (int)(Math.random()*(oldName.length()));
            String newName = oldName.substring(0, randomNum) + oldName.substring(randomNum+1);
            
            System.out.println(newName);
        }
    }
}
