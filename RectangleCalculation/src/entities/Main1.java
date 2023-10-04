package entities;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main1 {
    public static void main(String[] args)
    {

        SimCard details = new SimCard(7488478, "20€");

        details.addCall(73563674, 4);

        System.out.println(details);

    }
}