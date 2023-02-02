public class Account {
    String name;
    double balance ;
    double akaca =0;

    public void deposit(double summa) {

        System.out.print(name+" Zizdin kartadagi summanyz : ");
        akaca=balance+summa;
        System.out.println(akaca+"\n");
    }
    public void withdrawal(double suma){
        System.out.print(name+" Zizdin kartadagi summanyz : " );
        akaca=akaca-suma;
        System.out.println(akaca+"\n");

    }
}
