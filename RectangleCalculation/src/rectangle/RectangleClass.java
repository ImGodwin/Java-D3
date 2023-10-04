package rectangle;

public class RectangleClass {

    public boolean stampaRettangolo;
    private int length;
    private int width;

    public RectangleClass(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public boolean stampaRettangolo(int length, int width){
        int num = this.length * this.width;
        System.out.println("the area of: " + this.length + " "  + this.width + " is " + (num));
        return false;
    }


    public void setLength(int length) {
        if(length == 0)
        {
            System.out.println("Please add a number higher than zero");
        }else {
            this.length = length;

        }
    }

    public void setWidth(int width) {
        if(width == 0)
        {
            System.out.println("Please add a number higher than zero");
        }else {
            this.width = width;

        }
    }

    @Override
    public String toString() {
        return "Sim{" +
                "length=" + length +
                ", width='" + width + '\'' +
                '}';
    }


}
