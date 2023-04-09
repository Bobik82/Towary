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
        towary=new Towar[maksRozmiar];
    }

    public void dodajTowar(Towar t, int i)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ile towarow do zamowienia: ");
            System.out.println(t.nazwaTowaru);
        this.ileTowarow=scan.nextInt();
        towary[i] = t;
        towary[i].liczbaSztuk=ileTowarow;
        System.out.println(t.nazwaTowaru);

    }

    public double obliczWartoscRezerwacji()
    {
        double suma=0;
        for (int i=0; i<this.towary.length;i++) {
            if(towary[i]!=null)
            suma+=towary[i].obliczWartosc();
            else
                break;
        }

        return suma;
    }

    public String wypiszRezerwacje()
    {
        String napis="";
        double wartosc=0;
        for(int i=0; i<towary.length;i++)
        {

            if(towary[i]!=null)
            {
                napis = this.towary[i].wypiszTowar();
            }
            else
            {
                napis="brak";
            }
            wartosc+=obliczWartoscRezerwacji();
        }
        return napis+ " "+ wartosc;
    }


}
