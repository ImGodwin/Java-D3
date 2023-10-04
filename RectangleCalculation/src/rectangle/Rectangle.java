package rectangle;

public class Rectangle {

    private int length;
    private int width;

    public  Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void stampaRettangolo(int length, int width){
        int num = this.length * this.width;
        System.out.println("the area of: " + this.length + " "  + this.width + " is " + (num));
    }


    public void setSize(int length) {
        if(length == 0 && width == 0)
        {
            System.out.println("Please add a number higher than zero");
        }else {
            this.length = length;
            this.width = width;
        }
    }
}
