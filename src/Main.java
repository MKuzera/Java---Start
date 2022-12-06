public class Main {
    String imie;
    String nazwisko;
    int lat;
    double stan_portfela;

    public Main(String imieS, String nazwiskoS, int latS , double moneyS){
        imie = imieS;
        nazwisko = nazwiskoS;
        lat = latS;
        stan_portfela = moneyS;
    }

    public void display()
    {
        System.out.println(imie + " " + nazwisko + " lat" + lat + "stan portfela " +stan_portfela + " zl!" );
    }

    public static void main(String[] args) {

        Main Ja = new Main("Mateusz","Kuzera",19, 100.50);
        Ja.display();

    }
}