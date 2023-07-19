public class RectangularBox {

    private int boxLength,boxWidth;
    public RectangularBox(){
        boxLength=0;
        boxWidth=0;
    }
    public int SetLegnth(int boxLength){
        this.boxLength=boxLength;
        return boxLength;
    }
    public int SetWidth(int boxWidth){
        this.boxWidth=boxWidth;
        return boxWidth;
    }
    public int GetArea(){
        return boxWidth*boxLength;
    }
    public int GetPerimeter(){
        return 2*(boxLength+boxWidth);
    }

}
