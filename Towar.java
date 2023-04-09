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

    public String wypiszTowar()
    {
        System.out.println(this.nazwaTowaru+" "+this.cenaSztuki+"zl "+this.liczbaSztuk+"szt. "+obliczWartosc()+"zl");
        return nazwaTowaru;
    }

}