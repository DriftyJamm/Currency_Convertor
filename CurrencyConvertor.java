import java.util.Scanner;

public class CurrencyConvertor

{
    public static void main(String[] args)
    {
        System.out.println("1. Rupees");
        System.out.println("2. Dollar");
        System.out.println("3. Euro");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter currency number");
        int choice = sc.nextInt();

        System.out.println("Enter amount to be converted");
        double amt = sc.nextDouble();

        if(choice == 1)
        {
            Rupee_to_other(amt);
        }
        else if(choice == 2)
        {
            Dollar_to_other(amt);
        }
        else if(choice == 3)
        {
            Euro_to_other(amt);
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }

    public static void Rupee_to_other(double amt)
    {
        System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
        System.out.println();

        System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
        System.out.println();
    }

    public static void Dollar_to_other(double amt)
    {
        System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
        System.out.println();

        System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
        System.out.println();

    }

    public static void Euro_to_other(double amt)
    {
        System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
        System.out.println();

        System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
        System.out.println();
    }
}  