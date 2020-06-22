package pl.pawtel.interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone adamsPhone;
        adamsPhone = new DeskPhone(123456);
        adamsPhone.powerOn();
        adamsPhone.callPhone(123456);
        adamsPhone.answer();

        adamsPhone = new MobilePhone(24356);
        adamsPhone.powerOn();
        adamsPhone.callPhone(24356);
        adamsPhone.answer();
    }
}
