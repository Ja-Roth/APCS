package Ch8Classes;

public class BankAccountClient {
    BankAccountV1 Henry = new BankAccountV1("Henry Eaton", "123456789","1 Jina road", "09072001",100000000,1234);
    BankAccountV1 matt = new BankAccountV1("Mathew Poopyface", "324453645645", "123 doodoo road", "02032001");
    //matt
    Adress jasonadress = new Adress(1, "lansdowne Dr","Larchmont",10538,"NY", "USA");
    Dob jasondob = new Dob(23,3,2002);
    BankAccountV2 jason = new BankAccountV2("Jason Rothman","123456789",jasonadress,jasondob,100000000.00,1234);
}
