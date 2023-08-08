package Bank.application;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//        SBI account1 = new SBI("123",50000);
//        SBI account2 = new SBI("143",10000);
//        HBFC account3 = new HBFC("124",1000000);
//
//        String str = account1.addMoney(111,"123");
//        System.out.println(str);
//
//        int interest = account1.rateOfInterest(20);
//        System.out.println(interest);
//
//        String balance = account1.checkBalance("123");
//        System.out.println(balance);
//
//
//        int intersetofHDFC = account3.rateOfInterest(20);
//        System.out.println(intersetofHDFC);

        System.out.println("Enter the account  password");
        String  password = sc.next();
        System.out.println("enter the amount");
        int intitalbalance = sc.nextInt();


        SBI account4 = new SBI(password, intitalbalance);

        String ans1 = account4.addMoney(231,"shr");
        System.out.println(ans1);


    }
}