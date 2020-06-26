package pl.pawtel.inner;

public class Main {

    public static void main(String[] args){
        Gearbox mcLaren = new Gearbox(6);
        //to create instance of inner class have to have instance of outer class
        // until inner class is static you can't use Gearbox.Gear syntax
        //has to be instance.new, means mcLaren.new
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));
    }


}
