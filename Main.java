import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int wybor;
        Towar t1=new Towar("Dildo", 5000, 50);
        Towar t2=new Towar("Marihuanol", 5000, 40);
        Rezerwacja r1=new Rezerwacja();
        do
        {
            System.out.println("MENU");
            System.out.println("1. Wypisz baze danych");
            System.out.println("2. Dodaj Rezerwacje");
            System.out.println("3. Wypisz Rezerwacje");
            System.out.println("4. Wyjście");
            wybor = scan.nextInt();
            switch (wybor)
            {
                case 1:
                        t1.wypiszTowar();
                        t2.wypiszTowar();
                    break;
                case 2:
                    r1.dodajTowar(t2,0);
                    r1.dodajTowar(t1,1);
                    System.out.println("Dodano towary");
                    break;
                case 3:
                    r1.wypiszRezerwacje();
                    break;
                    case 4:
                     break;
            }
        } while (wybor!=4);
    }


}