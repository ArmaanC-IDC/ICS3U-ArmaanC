package day4;

public class BoxOfCandy {
    private Candy[][] box;

    public BoxOfCandy(Candy[][] box){
        this.box = box;
    }

    public boolean moveCandyToFirstRow(int col){
        if (this.box[0][col]!=null){
            return true;
        }
        for (int i = 0; i < box.length; i++) {
            if (this.box[i][col]!=null){
                this.box[0][col]=this.box[i][col];
                this.box[i][col]=null;
                break;
            }
        }
        return false;
    }

    public Candy removeNextByFlavor(String flavor){
        for (int i = box.length-1; i>=0; i--){
            for (int k = 0; k < box[i].length; k++) {
                if (box[i][k]!=null && box[i][k].getFlavor().equals(flavor)){
                    Candy candy = box[i][k];
                    box[i][k] = null;
                    return candy;
                }else if (box[i][k]!=null){
                    System.out.println(box[i][k].getFlavor());
                }
            }
        }
        return null;
    }
}