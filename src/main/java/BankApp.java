import java.util. *;

public class BankApp {
    String firstName;
    String otherNames;
    String dateOfBirth;
    String residence;
    String kin;
    double ID;
    float amount;
    float withdrawalAmount;
    float balance = 0;

    Scanner scanner = new Scanner(System.in);

    public void createAccount() {
        System.out.println("Kindly enter the following details.");
        System.out.print("First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Other Names: ");
        otherNames = scanner.nextLine();
        System.out.print("Place  of residence: ");
        residence = scanner.nextLine();
        System.out.print("Next of kin: ");
        kin = scanner.nextLine();
        System.out.print("National ID number: ");
        ID = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Date of birth: ");
        dateOfBirth = scanner.nextLine();
        System.out.println("Account created successfully!");
    }

    public void makeDeposit() {
        System.out.println("Make deposit.");
        System.out.print("Amount to deposit: ");
        amount = scanner.nextFloat();
        balance += amount;
        System.out.println("You have made a deposit of " + amount + ".");
    }

    public void withdrawal() {
        System.out.println("Withdrawal amount: ");
        withdrawalAmount = scanner.nextInt();

        if (withdrawalAmount > balance){
            System.out.println("Insufficient funds");
        }
        else{
            balance -= withdrawalAmount;
            System.out.println("You withdrew " + withdrawalAmount);
        }
    }

    public void check_balance() {
        System.out.println("Check your balance");
        System.out.println(balance);
    }

    public void exit(){
        System.out.println("Thank you for using our application");
    }

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        BankApp bankApp = new BankApp();

        do {
            System.out.println("Bank Menu");
            System.out.println("1. Create Account");
            System.out.println("2. Make Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bankApp.createAccount();
                    break;
                case 2:
                    bankApp.makeDeposit();
                    break;
                case 3:
                    bankApp.withdrawal();
                    break;
                case 4:
                    bankApp.check_balance();
                    break;
                case 5:
                    bankApp.exit();
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");

            }
        }
            while (choice != 5) ;

    }

}


