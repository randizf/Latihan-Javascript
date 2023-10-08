import java.util.*;

public class Main {

    // switch case

    public static void main(string[] args){

        

        string input;

        scanner inputuser = new scanner(system.in);
        input = inputuser.next();

        // ekspresinya berupa satuan (int, long, short, byte), string, atau enum
        switch(input){
            case "Dudung":
                system.out.println("Saya Dudung hadir bos!!!");
            case "Mumun":
                system.out.println("Saya Mumun hadir bos!!!");
            case "Didin":
                system.out.println("Saya Didin hadir bos!!!");
            default:
                system.out.println(input + "tidak hadir bos!!!"); 
        }
        system.out.println("selesai program");

    }
      
}