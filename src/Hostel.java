public class Hostel implements arenda{
    private String adress;

    public Hostel(String adress) {
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
        return "Hostel\n" +
                "adress '" + adress + '\'';
    }

    @Override
    public void arenda() {
        System.out.println("2500");
    }
}
