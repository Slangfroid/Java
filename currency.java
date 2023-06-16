import java.util.Scanner;

public class CurrencyConverter {
    private static final double USD_TO_EUR = 0.83;
    private static final double USD_TO_GBP = 0.72;
    private static final double USD_TO_JPY = 110.57;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount in USD: ");
        double amountUSD = scanner.nextDouble();
        
        System.out.println("1. Convert to EUR");
        System.out.println("2. Convert to GBP");
        System.out.println("3. Convert to JPY");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        
        double convertedAmount;
        String currencySymbol;
        
        switch (option) {
            case 1:
                convertedAmount = amountUSD * USD_TO_EUR;
                currencySymbol = "€";
                break;
            case 2:
                convertedAmount = amountUSD * USD_TO_GBP;
                currencySymbol = "£";
                break;
            case 3:
                convertedAmount = amountUSD * USD_TO_JPY;
                currencySymbol = "¥";
                break;
            default:
                System.out.println("Invalid option. Exiting the program.");
                return;
        }
        
        System.out.println("Converted amount: " + currencySymbol + convertedAmount);
    }
}