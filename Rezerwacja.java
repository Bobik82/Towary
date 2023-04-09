import java.util.Scanner;

public class Rezerwacja {
    Towar[] towary;
    int ileTowarow;
    int maksRozmiar;

    public Rezerwacja()
    {
        this.maksRozmiar =10;
        towary=new Towar[maksRozmiar];
    }

    public Rezerwacja(int maksimum)
    {
        this.maksRozmiar=maksimum;
    }

    public void dodajTowar(Towar t)
    {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe towaru: ");
        t.nazwaTowaru=scan.nextLine();
        System.out.println("Podaj ilosć: ");
        this.ileTowarow=scan.nextInt();*/

       towary[0]=t;


    }

    public double obliczWartoscRezerwacji()
    {

        return 0;
    }

    public String wypiszRezerwacje()
    {
        return this.towary[0].wypiszTowar();
    }


}
