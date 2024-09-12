import java.util.Random;
import java.util.Scanner;

public class exam {

    public static void getOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Burger-Joint. Is it true or false that your order will be to go?");
        boolean isToGo =scanner.hasNextBoolean();
        scanner.nextLine();
        System.out.println("What type of burger do you want today? Cheese, ham or turkey?");
        scanner.nextLine();
        System.out.println("Please enter a tip of 0%, 5%,10%, 15% or 20% tip!");
        double tipPercentage= scanner.nextDouble();
        System.out.println("What is the name for your order?");
        scanner.nextLine();

        double price = getPrice();
        double tipAmount = (tipPercentage/100)*price;
        double totalPrice = price + tipAmount;
        System.out.println(totalPrice);



    }
}







    public static void printSizes(char[] size) {
         for(char c: size)
       {
            System.out.println(c);
        }
    }


    static int getPrice() {
    Random random = new Random();
    return random.nextInt(11)+5;
    }


    public static String printFullName(String firstname,String lastname ) {
       String fullname = firstname + lastname;
       return fullname;
   }

    public static void main(String[] args) {
        String firstname = "Ryan";
        String lastname ="Boodhoo";
        int x = 26;
        char[] sizes={'S','M','L',};
        int price= new Random().nextInt(11) + 5;

        System.out.println(printFullName("ryan"," boodhoo"));
        System.out.println("Random Number:" + price);
        printSizes(sizes);



    }


