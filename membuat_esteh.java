package tugasOOP;

public class membuat_esteh extends tugasOOP.komponen {
    public static void main(String[] args){
        //Membuat Instance/Objek dari Class Mambuat_Kue
        membuat_esteh es_teh = new membuat_esteh();
        es_teh.bahan_bahan();
        es_teh.peralatan();
        es_teh.proses_pembuatan();
    }

    @Override
    void bahan_bahan() {
        String bahan1 = "Teh celup";
        String bahan2 = "Gula";
        String bahan3 = "Air biasa dan air hangat";
        String bahan4 = "Es batu";
        System.out.println("====== BAHAN-BAHAN ======");
        System.out.println("1."+bahan1);
        System.out.println("2."+bahan2);
        System.out.println("3."+bahan3);
        System.out.println("4."+bahan4);
    }

    @Override
    void peralatan() {
        String alat1 = "Sendok teh";
        String alat2 = "Gelas";
        String alat3 = "Straw";
        System.out.println("====== ALAT-ALAT ======");
        System.out.println("1."+alat1);
        System.out.println("2."+alat2);
        System.out.println("3."+alat3);
    }

    @Override
    void proses_pembuatan() {
        System.out.println("====== PROSES ======");
        System.out.println("1.Sediakan gelas yang akan digunakkan");
        System.out.println("2.Masukkan air hangat dan gula");
        System.out.println("3.Aduk gula hingga terlarut");
        System.out.println("4.Celupkan teh ke dalam gelas hingga air berwarna merah");
        System.out.println("5.Tambahkan sedikit air");
        System.out.println("6.Beri es batu");
        System.out.println("7.Beri straw dan es teh siap diminum");
    }
}
