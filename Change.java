import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @Author Logan
 * @Date 3/6/2010 2:40PM
 * @Description For those lazy enough like I am, this program will count your change for you
 * and give back the exact dollar amount. It uses Exception handling in case the user enters
 * values that do not compute with the program. Probably need to fix this up one of these days
 * in case the user enters doubles.
 */
public class Change {
//Declare Variables
double penny =0.01;
double nickel = 0.05;
double dime = 0.10;
double quarter = 0.25;
double dollar = 1.00;
double pennycoin;
double nickelcoin;
double dimecoin;
double quartercoin;
double totalcoins;

public Change(){
   Scanner input = new Scanner(System.in);

   System.out.println("Enter your change to find Dollar amount?\n ");

//Ask user how many coins they have and store input data
//Try and catch Exception if the user enters letters instead of Integers.
   System.out.println("How many Pennies do you have?");
   try{
      pennycoin = input.nextDouble(); // Pennies
   }
   catch(Exception e1){
      System.out.println("Error: Please enter Integer values next time.");
   }

   System.out.println("How many Nickels do you have?");
   try{
      nickelcoin = input.nextDouble(); // Nickels
   }
   catch(Exception e2){
      System.out.println("Error: Please enter Integer values next time.");
   }

   System.out.println("How many Dimes do you have?");
   try{
      dimecoin = input.nextDouble(); // Dimes
   }
   catch(Exception e3){
      System.out.println("Error: Please enter Integer values next time.");
   }

   System.out.println("How many Quarters do you have?");
   try{
      quartercoin = input.nextDouble(); // Quarters
   }
   catch(Exception e4){
      System.out.println("Error: Please enter Integer values next time.");
   }
//Invoke method to getTotalcoins
   totalcoins = getTotalCoins(pennycoin,nickelcoin,dimecoin,quartercoin,penny,nickel,dime,quarter);

//check to see if total coins equal a dollar
   DecimalFormat df = new DecimalFormat("#,###,##0.00");
   if (totalcoins < dollar){
      System.out.println("You have a total of  $" + df.format(totalcoins) + " cents");
   }
   else{
      System.out.println("You have a total of  $" + df.format(totalcoins) + " Dollars" );
   }

}
// Main method
public static void main(String[] args) {
   //Instantiate my Class
   Change countChange = new Change();
}
//method for getting total coins and computing dollar amount
private double getTotalCoins(double pennycoin, double nickelcoin, double dimecoin, double quartercoin, double penny, double nickel, double dime, double quarter) {
        double total = pennycoin * penny + nickelcoin * nickel + dimecoin * dime + quartercoin * quarter;
        return total;
    }

}
