
public class Rettangolo {
    private int length;
    private int width;


    public  Rettangolo(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void stampaRettangolo(){
        int num = this.length * this.width;
        System.out.println("the area of: " + this.length + " "  + this.width + " is " + (num));
    }

    public void stampaDuerettangoli(){

    }
}

//constructor

