package Quiz;

public class Box {
    private int width, height;
    private char fillChar;
    public Box(){
        this.width=10;
        this.height=1;
    }
    public Box(int width, int height){
        this.width=width;
        this.height=height;
    }
    public void draw(){
        for(int i=0; i<height;i++){
            System.out.println(fillChar*width);
        }
    }
}
