package Ch8Classes;

public class Adress {
    private  int houseNum;
    private  String aptNum;
    private String street;
    private String city;
    private int zip;
    private String State;
    private String country;

    public String getState() {
        return State;
    }

    public String getCountry() {
        return country;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public String getAptNum() {
        return aptNum;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public Adress(int houseNum, String aptNum, String street, String city, int zip, String state, String country) {
        this.houseNum = houseNum;
        this.aptNum = aptNum;
        this.street = street;
        this.city = city;
        this.zip = zip;
        State = state;
        this.country = country;
    }

    public Adress(int houseNum, String street, String city, int zip, String state, String country) {
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.zip = zip;
        State = state;
        this.country = country;
    }
}
