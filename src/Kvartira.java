public class Kvartira implements komUsluga{
    private String adress;

    public Kvartira(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Kvartira\n" +
                "adress '" + adress + '\'';
    }

    @Override
    public void oplata() {
        System.out.println(" oplata 5000 som ");

    }
}
