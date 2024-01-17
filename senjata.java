package ak;

public class senjata {
    String nama_Senjata;
    int jumlah_Peluru_Senjata, damage_Senjata;
    
    // constructor
    senjata(String nama, int jumlah_peluru, int damage) {
        nama_Senjata = nama;
        jumlah_Peluru_Senjata = jumlah_peluru;
        damage_Senjata = damage;
    }
    
    void senjata_Ini() {
        System.out.println("Nama saya " + nama_Senjata);
    }
    
    void dor(){
        if (jumlah_Peluru_Senjata > 0) {
            System.out.println("Peluru akan keluar");
            jumlah_Peluru_Senjata--;
            damage_Senjata++;
        }
        else{
            System.out.println("Peluru sudah habis");
            System.out.println("Mengisi ulang.....");
            ngisi();
        }
    }
    void ngisi(){
        jumlah_Peluru_Senjata = 100;
    }
}
