public class BalokKubusBeraksi {
    public static void main(String[] args) {
        Kubus k = new Kubus();
        Balok b = new Balok(); 

        k.SetData(5);
        b.SetData(3,4,5);

        System.out.println("Volume Kubus = " + k.volume());
        System.out.println("Luas Permukaan Kubus = " + k.luasPermukaan());

        System.out.println("Volume Balok = " + b.volume());
        System.out.println("Luas Permukaan Balok = " + b.luasPermukaan());
    }
}
