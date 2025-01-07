package day2;

public class Lottery {
    private int numberOfNumbers; 
    private int range; 
    private String generatedNumbers;
    
    public Lottery(int numberOfNumbers, int range){
        this.numberOfNumbers = numberOfNumbers;
        this.range = range; 
        this.generatedNumbers = ""; 

    }

    public void generateUniqueLotteryNumbers(){
        int numOfNumsGenerated = 0;
        while (numOfNumsGenerated <= numberOfNumbers){
            String num = "" + ((int)(Math.random() * range) + 1);
            if (generatedNumbers.indexOf(num)<0){
                numOfNumsGenerated++;
                generatedNumbers += num + " ";
            }
        }

        generatedNumbers = generatedNumbers.substring(0, generatedNumbers.length()-1);

        int prevSpace = 0;
        for (int i = 0; i<generatedNumbers.length(); i++){
            if(generatedNumbers.substring(i, i+1).equals(" ")){
                System.out.println(generatedNumbers.substring(prevSpace + 1, i));
                prevSpace = i;
            }
        }
    }

    public int getnumberOfNumbers(){
        return numberOfNumbers;
    }

    public int getrange(){
        return range; 
    }

    public String getgeneratedNumbers(){
        return generatedNumbers;
    }

    public void setnumberOfNumbers(int numberOfNumbers){
        this.numberOfNumbers = numberOfNumbers; 
    }

    public void setrange(int range){
        this.range = range; 
    }
}
