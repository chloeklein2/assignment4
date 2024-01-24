import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
    String str ="";
    char letter;
    Scanner scanner = new Scanner (System.in);
    System.out.println("enter a string"); 
    str= scanner.next();
    scanner.close();   
    int i =str.length()-1;
    while (i>=0){        
        letter=str.charAt(i);
        System.out.print(letter);
        i--;
    }

    }
    
}
    
