package ecommerce;

public class Cart {

    private String clientPurchasingthisProduct;
    private String[] articlesList;
    private int totalPrice;

    public  Cart(String clientPurchasingthisProduct, String[] articlesList, int totalPrice){
        this.clientPurchasingthisProduct = clientPurchasingthisProduct;
        this.articlesList = articlesList;
        this.totalPrice = totalPrice;
    }
}
