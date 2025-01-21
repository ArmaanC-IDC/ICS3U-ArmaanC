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

    }
}