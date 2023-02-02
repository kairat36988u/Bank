import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        account.name = "Kairat";
        System.out.println("<<<<<<<< Salamatsyzby MBanka kosh krldiniz >>>>>>>>");
        while (true) {
            account.balance = 1000;
            System.out.println("1 : Karta dagy balansty koruu uchun 1 basygyz \n" + "2 : Akcha koshuu uchun 2 basynuz \n" + "3 : Akcha chugaryp alush uchun 3 basynyz\n" + "4 : Toktitu uchun 4 basynyz !!!");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println(account.name + " Zizdin kartanyzdagy azyrky summa : " + account.balance + "\n");
            } else if (a == 2) {
                System.out.println(account.name + " Kancha summa koshoturganynyz dy jazynyz :");
                account.deposit(sc.nextDouble());
            } else if (a == 3) {
                System.out.println(account.name + " Kancha summa chygaryp alyshynyz dy  jazynyz :");
                account.withdrawal(sc.nextDouble());
            } else if (a == 4) {
                System.out.println("-------------Salamatta kalynyz---------------- \n");
                break;

            }
        }

        Account account1 = new Account();
        account1.name = "Ernazar";
        System.out.println("<<<<<<<<<<<<<< Salamatsyzby Demir Banka kosh krldiniz >>>>>>>>>>>>>");
        while (true) {
            account1.balance = 1000;
            System.out.println("1 : Karta dagy balansty koruu uchun 1 basygyz \n" + "2 : Akcha koshuu uchun 2 basynuz \n" + "3 : Akcha chugaryp alush uchun 3 basynyz\n" + "4 : Toktitu uchun 4 basynyz !!!");
            int b = sc.nextInt();
            if (b == 1) {
                System.out.println(account1.name + " Zizdin kartanyzdagy azyrky summa : " + account1.balance + "\n");
            } else if (b == 2) {
                System.out.println(account1.name + " Kancha summa koshoturganynyz dy jazynyz :");
                account1.deposit(sc.nextDouble());
            } else if (b == 3) {
                System.out.println(account1.name + " Kancha summa chygaryp alyshynyz dy  jazynyz :");
                account1.withdrawal(sc.nextDouble());
            } else if (b == 4) {
                System.out.println("-------------Salamatta kalynyz---------------- \n");
                break;

            }
        }

        Account account2 = new Account();
        account2.name = "Aizat";
        System.out.println("<<<<<<<<<<<<<< Salamatsyzby OptimaBanka kosh krldiniz >>>>>>>>>>>>>");
        for (; true; ) {
            account2.balance = 1000;
            System.out.println("1 : Karta dagy balansty koruu uchun 1 basygyz \n" + "2 : Akcha koshuu uchun 2 basynuz \n" + "3 : Akcha chugaryp alush uchun 3 basynyz\n" + "4 : Toktitu uchun 4 basynyz !!!");
            int v = sc.nextInt();
            if (v == 1) {
                System.out.println(account2.name + " Zizdin kartanyzdagy azyrky summa : " + account2.balance + "\n");
            } else if (v == 2) {
                System.out.println(account2.name + " Kancha summa koshoturganynyz dy jazynyz :");
                account2.deposit(sc.nextDouble());
            } else if (v == 3) {
                System.out.println(account2.name + " Kancha summa chygaryp alyshynyz dy  jazynyz :");
                account2.withdrawal(sc.nextDouble());
            } else if (v == 4) {
                System.out.println("-------------Salamatta kalynyz---------------- ");
                break;
            }
        }
    }
}