public class Hotel implements arenda{
    private String adress;

    public Hotel(String adress) {
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
        return "Hotel\n " +
                "adress '" + adress + '\'' ;
    }

    @Override
    public void arenda() {
        System.out.println(" sutka 5000 som ");
    }
}
