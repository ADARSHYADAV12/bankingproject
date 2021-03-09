package Banks;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
public class Dev_MainMenu {
long acNo;
String acHolderName;
char acType;   //'S' for saving, 'C' for current
double acBal;
final int TOTAL_ACCTS_LIMIT = 10;
Dev_Account[] accts;
int acCount;
public Dev_MainMenu() {
   accts = new Dev_Account[TOTAL_ACCTS_LIMIT];
   acCount = 0;
}
static ArrayList<Integer> list = getRandomNonRepeatingIntegers1(1, 90000, 99999);
public static String name; 
public static String gender;
public static String dob;
public static String address;
public static String city;
public static String state;
public static int pin;
public static long mobileNo;
public static String email;
public static String password;
static char choice;
public static int date;
public static int month;
public static int year;
public static int customerId=(list.get(0));
int ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void MainMenu() throws Exception
{
Dev_MenuOption de=new Dev_MenuOption();
String cont;
int m;
do
{
    System.out.println("Press 1 to Add New Customer");
    System.out.println("Press 2 to Edit a Customer");
    System.out.println("Press 3 for Accounts related procedures");
    System.out.println("Press 0 to log out and go back to login screen ");
    m=Integer.parseInt(br.readLine());
    switch(m)
    {
    case 1 :
        de.addCustomer();
        de.addedCustomerDetails();
            break;
    case 2:
        de.editCustomer();
            break;
    case 3 :
        do {
            System.out.println("Main Menu");
            System.out.println("1. Open New Account");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.println("Make Your Choice (1-6): ");
             BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            ch =Integer.parseInt(in.readLine());
            System.out.println();
            switch(ch) {
                case 1:
               de.openAccount();
                break;
                case 2:
                de.makeDeposit();
                break;
                case 3:
                de.makeWithdrawal();
                break;
                case 4:
                de.balanceEnquiry();
                break;
                case 5:
                de.displayAllAccounts();
                break;
                case 6 :
                    break;
                default:
                System.out.println("Incorrect choice!!!");
            }
        } while (ch != 6);
            break;
    default :
         break;
    }
}while(m!=0);
}


public static ArrayList<Integer> getRandomNonRepeatingIntegers1(int size, int min, int max) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    while (numbers.size() < size) {
        int random = getRandomInt1(min, max);
        if (!numbers.contains(random)) {
            numbers.add(random);
        }
    }
    return numbers;
}
public static int getRandomInt1(int min, int max) {
    Random random = new Random();
    return random.nextInt((max - min) + 1) + min;
}
}