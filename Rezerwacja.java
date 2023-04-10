import java.util.Scanner;

public class Rezerwacja {
    Towar[] towary;
    int ileTowarow;
    int maksRozmiar;

    public Rezerwacja()
    {
        this.maksRozmiar =10;
        towary=new Towar[maksRozmiar];
        Scanner scan = new Scanner(System.in);
    }

    public Rezerwacja(int maksimum)
    {
        this.maksRozmiar=maksimum;
        towary=new Towar[maksRozmiar];
        Scanner scan = new Scanner(System.in);

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
        double wartosczrabatem=0;
        for(int i=0; i<towary.length;i++)
        {

            if(towary[i]!=null)
            {
                napis = this.towary[i].wypiszTowar();
                wartosc+=towary[i].obliczWartosc();
                wartosczrabatem+=towary[i].obliczWartoscZRabatem();
            }
            else
            {
                napis="brak";
            }
        }
        System.out.println("Wartosc zamowienia: "+wartosc+"zl");
        System.out.println("Wartosc zamowienia z rabatem: "+wartosczrabatem+"zl");

        return napis;
    }


}
