import java.util.Scanner;

public class RezerwacjaMobilna extends Rezerwacja{
    String rodzajDostawy;
    String rodzajPlatnosci;
    Scanner scan = new Scanner(System.in);

    public void wybierzDostawe()
    {
        int chuj;
        System.out.println("Dostawa:" +
                "1.Kurier"+
                "2.Poczta"+
                "3.odbior osobisty"+
                "Wybierz rodzaj dostawy:");
        chuj=scan.nextInt();
      switch(chuj)
        {
            case 1:
            rodzajDostawy = "Kurier";
            break;
            case 2:
            rodzajDostawy = "Poczta";
            break;
            default:
            rodzajDostawy = "Odbior osobisty";
            break;
        }
    }
    public void wybierzPlatnosc()
    {
        int chuj;
        System.out.println("Platnosc:" +
                "1.Karta"+
                "2.Przelew"+
                "3.Platnosc przy odbiorze"+
                "Wybierz rodzaj dostawy:");
        chuj=scan.nextInt();
        switch(chuj)
        {
            case 1:
                rodzajPlatnosci = "Karta";
                break;
            case 2:
                rodzajPlatnosci = "Przelew";
                break;
            default:
                rodzajPlatnosci = "Platnosc przy odbiorze";
                break;
        }
    }
}
