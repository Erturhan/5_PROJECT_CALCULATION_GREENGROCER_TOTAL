import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceOfApple = 3.11;
        double priceOfGrape = 4.14;
        double priceOfTomato = 2.90;
        double priceOfEggplant = 5.25;
        double priceOfCucumber = 2.75;
        double priceOfCarrot = 3.60;

        double apple, grape, tomato, eggplant, carrot, cucumber, total;

        System.out.print("Pleas , enter how many kilo of apples you bought :");
        apple = scan.nextDouble();
        System.out.print("Pleas , enter how many kilo of grapes you bought :");
        grape = scan.nextDouble();
        System.out.print("Pleas , enter how many kilo of tomato you bought :");
        tomato = scan.nextDouble();
        System.out.print("Pleas , enter how many kilo of eggplant you bought :");
        eggplant = scan.nextDouble();
        System.out.print("Pleas , enter how many kilo of cucumber you bought :");
        cucumber = scan.nextDouble();
        System.out.print("Pleas , enter how many kilo of carrot you bought :");
        carrot = scan.nextDouble();

        total = (apple * priceOfApple)+(grape*priceOfGrape)+(tomato*priceOfTomato)
                +(eggplant*priceOfEggplant)+(cucumber*priceOfCucumber)+(carrot*priceOfCarrot);

        System.out.println("Total cost :"+total+"£");


    }
}