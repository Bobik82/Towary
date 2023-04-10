public class Towar
{
    String nazwaTowaru;
    int liczbaSztuk;
    double cenaSztuki;



    public Towar(String nazwaTowaru, int liczbaSztuk, double cenaSztuki)
    {
        this.nazwaTowaru = nazwaTowaru;
        this.liczbaSztuk = liczbaSztuk;
        this.cenaSztuki = cenaSztuki;
    }
   public double obliczWartosc()
    {
    return this.cenaSztuki*this.liczbaSztuk;
    }

    public double obliczWartoscZRabatem()
    {
        double rabat = 0;
        if(liczbaSztuk>=2&&liczbaSztuk<=5)
        {
            rabat = liczbaSztuk*cenaSztuki * 0.05;
        }
        if(liczbaSztuk>=6&&liczbaSztuk<=10)
        {
            rabat=liczbaSztuk*cenaSztuki*0.10;
        }
        if(liczbaSztuk>10)
        {
            rabat=liczbaSztuk*cenaSztuki*0.15;
        }
        return liczbaSztuk*cenaSztuki-rabat;
    }

    public String wypiszTowar()
    {
        System.out.println(this.nazwaTowaru+" "+this.cenaSztuki+"zl "+this.liczbaSztuk+"szt. "+obliczWartosc()+"zl "+obliczWartoscZRabatem()+"zl");
        return nazwaTowaru;
    }

}