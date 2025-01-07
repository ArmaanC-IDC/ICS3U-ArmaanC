package day2;

public class ApFRQ1 {
    private int currentFood;

    public ApFRQ1(int currentFood){
        this.currentFood = currentFood;
    }

    public void simulateOneDay(int numOfBirds){
        if (Math.random()<0.95){
            int gramsPerBird = (int)(Math.random()*40) + 10;
            this.currentFood -= numOfBirds * gramsPerBird;
            System.out.println("grams: " + gramsPerBird);
        }else{
            this.currentFood = 0;
            System.out.println("a bear ate it all");
        }

        System.out.println(this.currentFood);
    }
}
