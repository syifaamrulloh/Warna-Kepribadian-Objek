/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan40.warna.kepribadian;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh 
 * Kelas:IF11K 
 * NIM  :10118910
 *
 * Description : Program kepribadian dengan warna favorit
 */
public class Kepribadian {
    private final String NORMAL = "\u001b[0m";
    private final String MERAH = "\u001b[31m";
    private final String HIJAU = "\u001b[32m";
    private final String KUNING = "\u001b[33m";
    private final String BIRU = "\u001b[34m";
    private final String UNGU = "\u001b[35m";
    private final String BIRUMUDA = "\u001b[36m";
    private final String PUTIH = "\u001b[37m";
    private final String BG_HITAM = "\u001b[40m";
    private final String BG_MERAH = "\u001b[41m";
    private final String BG_HIJAU = "\u001b[42m";
    private final String BG_KUNING = "\u001b[43m";
    private final String BG_BIRU = "\u001b[44m";
    private final String BG_UNGU = "\u001b[45m";
    private final String BG_BIRUMUDA = "\u001b[46m";
    private final String WHITE_BG = "\u001b[47m";
    
    private void tcln(String warna,String teks){
        System.out.println(warna + teks + NORMAL);
    }
    private void tc(String warna,String teks){
        System.out.print(warna + teks + NORMAL);
    }
    private void bgtcln(String warna,String teks,String bg){
        System.out.println(bg + warna+ "\t" + teks + "\t\t" + NORMAL);
    }
    
    private void merah(){
        System.out.println("1.\tPeriang,");
        System.out.println("2.\tPemberani,");
        System.out.println("3.\tBerani mengambil keputusan,");
        System.out.println("4.\tMenyukai tantangan,");
        System.out.println("5.\tKurang sabar,");
        System.out.println("6.\tDapat menahan marah namun jika suda di tahap puncak toleransi, kemarahanya akan sulit dikontrol,");
        System.out.println("7.\tMemiliki energi kehangatan dan cinta");
    }
    
    private void hijau(){
        System.out.println("1.\tRomantis,");
        System.out.println("2.\tMenyukai hal yang berbau alami dan keindahan,");
        System.out.println("3.\tTeguh pada prinsip,");
        System.out.println("4.\tMengiginkan kesempurnaan,");
        System.out.println("5.\tMudah cemburu,");
        System.out.println("6.\tMudah merasa iri,");
        System.out.println("7.\tMenjungjung tinggi satu nilai toleransi dan kepercayaan");
    }
    
    private void kuning(){
        System.out.println("1.\tOptimis,");
        System.out.println("2.\tSuka bergaul,");
        System.out.println("3.\tPriang,");
        System.out.println("4.\tSenang menolong,");
        System.out.println("5.\tLincah dan aktif,");
        System.out.println("6.\tTidak suka meremehkan kekurangan orang lain,");
        System.out.println("7.\tLoyal");
        System.out.println("8.\tHangat");
        System.out.println("9.\tMeskipun karakternya optimis dan ideal,sering kali goyah dan tidak stabil");
        System.out.println("10.\tCenderung penakut");
    }
    
    private void biru(){
        System.out.println("1.\tMenyenangkan,");
        System.out.println("2.\tBijaksana,");
        System.out.println("3.\tPembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4.\tDinamis,");
        System.out.println("5.\tSenang berbagi,");
        System.out.println("6.\tBersahabat,");
        System.out.println("7.\tTidak terlalu suka menjadi sorotan banyak orang orang");
        System.out.println("8.\tMenyembunyikan perasaan karna karakternya yang cendrung mencari jalan damai");
    }
    
    private void ungu(){
        System.out.println("1.\tOptimis,");
        System.out.println("2.\tTIdak pernah ragu,");
        System.out.println("3.\tMenurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4.\tMemiliki ambis & empati yang besar,");
        System.out.println("5.\tMemiliki sisi misterius, sebab seringkali menutupi perasaanya,");
        System.out.println("6.\tTerkadang bersikap keras kepala dan angkuh,");
    }
    public void showk(){
        tc(MERAH,"YUK ");
        tc(HIJAU,"CEK ");
        tc(KUNING,"KEPRIBADIANMU ");
        tc(BIRUMUDA,"DARI ");
        tc(UNGU,"WARNA ");
        tc(BIRUMUDA,"FAVORITMU\n");
        bgtcln(PUTIH,"MERAH",BG_MERAH);
        bgtcln(PUTIH,"HIJAU",BG_HIJAU);
        bgtcln(PUTIH,"KUNING",BG_KUNING);
        bgtcln(PUTIH,"BIRU",BG_BIRU);
        bgtcln(PUTIH,"UNGU",BG_UNGU);
    }
    public void view(String d){
        System.out.print("Warna Favoritmu Adalah ");
        
        switch(d){
            case "MERAH":
                tcln(MERAH, d);
                merah();
                break;
            case "HIJAU":
                tcln(HIJAU, d);
                hijau();
                break;
            case "KUNING":
                tcln(KUNING, d);
                kuning();
                break;
            case "BIRU":
                tcln(BIRU, d);
                biru();
                break;
            case "UNGU":
                tcln(UNGU, d);
                ungu();
                break;
        }
    }
    
}
