package ecommerce;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Client {

    public int clientId;
    private String clientName;
    private String surname;
    private String email;
    public LocalDate registerationDate;

    public  Client(int clientId, String clientName, String surname, String email){
        Random rndm = new Random();
        this.clientId = rndm.nextInt(1, 500);
        this.clientName = clientName;
        this.surname = surname;
        this.email = email;
        this.registerationDate = LocalDate.now();
    }



}
