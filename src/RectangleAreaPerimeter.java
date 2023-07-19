public class RectangleAreaPerimeter {

    public void FromArea(){
        int height,width;
        for(int loopCounter =1; loopCounter<42;loopCounter++){
            height=loopCounter;
            width =42/loopCounter;
            if((height*width)==42){
                System.out.println("Height and Width of the rectangle with area of 42 is "+height +" and "+width);
            }
        }

    }
    public void FromPerimeter(){
        int height,width;
        for (int loopCounter=1; loopCounter<10; loopCounter++){
            height =loopCounter;
            width =21-loopCounter;
            System.out.println("the height and width from 42 perimeter is "+ height +" and " +width);
        }
    }
}
