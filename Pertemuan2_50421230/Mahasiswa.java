public class Mahasiswa {
    private String nama;
    private String npm;
    private int umur;

    public Mahasiswa(String nama, String npm, int umur){
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }
    public void tampilkanData(){
        System.out.println("Nama: "+nama);
        System.out.println("NPM: " + npm);
        System.out.println("Umur: "+umur);
    }
}
