
public class Rettangolo {
    public int length;
    public int width;


    public  Rettangolo(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void stampaRettangolo(int length, int width){
        int num = length * width;
        System.out.println("the area of: " + length + " "  + width + " is " + (num));
    }


}

//constructor

