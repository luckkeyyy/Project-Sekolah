package ak;

public class Ak {

    public static void main(String[] args) {
        senjata vandal = new senjata("Vandal", 200, 160);
        senjata cannon = new senjata("cannon", 2, 999);
        vandal.jumlah_Peluru_Senjata = 100;
        vandal.senjata_Ini();
        vandal.dor();
        
        cannon.senjata_Ini();
        
    }
    
}
