import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


       /* System.out.println("Type in length: ");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("Type in width: ");
        int width = Integer.parseInt(input.nextLine());

        System.out.println("Area: " + StampaRettangolo(length, width) + " " + "length: " + length + " " + "width: " + width);*/

        System.out.println("Type in length: ");
        int length2 = Integer.parseInt(input.nextLine());

        System.out.println("Type in width: ");
        int width2 = Integer.parseInt(input.nextLine());

        System.out.println("Type in length: ");
        int length3 = Integer.parseInt(input.nextLine());

        System.out.println("Type in width: ");
        int width3 = Integer.parseInt(input.nextLine());

        System.out.println("Rectangle 1 Area: " + stampaDueRettangoli(length2, width2) + " Parameters sum: "  + length2 + width2 + ". " + "Rectangle 2 Area: " +
                stampaDueRettangoli(length3, width3) + " " + "Sum: " + " " + length3 + width3);

        input.close();
    }

    public static int StampaRettangolo(int l, int w)
    {
        return l * w;
    }

    public static int stampaDueRettangoli(int a, int b)
    {
        int rec1 = a * b;
        int rec2 = a * b;
        return (rec1 );
    }


}
