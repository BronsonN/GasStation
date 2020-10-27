import java.util.Scanner;

public class GasStation {

    public static void main(String [] args) {

      Scanner keyboard = new Scanner(System.in);
      double regularGas = 1.129;
      double diesel = 1.079;
      double total = 0;
      double totalDiesel = 0;
      int sale = 0;
      double litresRegular = 0;
      double litresDiesel = 0;
      double total1 = 0;
      double total2 = 0;
      double totalLitresRegular = 0;
      double totallitresDiesel = 0;
      double grandTotalLitres = 0;
      double grandTotalPrice = 0;

      do {
      System.out.print("Enter type of sale (1=Regular, 2=Diesel, 0=exit): ");
      sale = keyboard.nextInt();

      switch(sale) {
        case 1:
        System.out.print("How many litres? ");
         litresRegular = keyboard.nextDouble();
         total = regularGas * litresRegular;
         totalLitresRegular += litresRegular;
         total1 = total1 += total;
         System.out.println("Regular Gas");
         System.out.println("Litres sold = " +litresRegular);
         break;
         case 2:
         System.out.print("How many litres? ");
         litresDiesel = keyboard.nextDouble();
         totalDiesel = diesel * litresDiesel;
         totallitresDiesel += litresDiesel;
         total2 = total2 += totalDiesel;
         System.out.println("Diesel");
         System.out.println("Litres sold = " +litresDiesel);
         break;
      }

      grandTotalLitres += (totalLitresRegular + totallitresDiesel);
      grandTotalPrice = total1 + total2;

      switch(sale) {
      case 1:
      System.out.printf("Sale total $%.2f\n", total);
      break;
      case 2:
      System.out.printf("Sale total $%.2f\n", totalDiesel);
      break;
      case 0:
      System.out.println();
      System.out.println("Station Totals");
      System.out.println("     Type      Litres      Total");
      System.out.printf("  Regular%12.1f", totalLitresRegular);
      System.out.printf("     %6.2f\n", total1);
      System.out.printf("   Diesel%12.1f", totallitresDiesel);
      System.out.printf("     %6.2f\n", total2);
      System.out.printf("   Totals%12.2f", grandTotalLitres);
      System.out.printf("    %7.2f", grandTotalPrice);
      break;
      }


    } while (sale != 0);

    }

}
