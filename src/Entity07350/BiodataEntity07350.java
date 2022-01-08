package Entity07350;
public class BiodataEntity07350 {
    private String nama07350,alamat07350,noTelp07350,kode07350;
    public BiodataEntity07350(){};
    public BiodataEntity07350(String nama07350,String alamat07350,String noTelp07350,String kode07350){
        this.nama07350=nama07350;
        this.alamat07350=alamat07350;
        this.noTelp07350=noTelp07350;
        this.kode07350=kode07350;
    }
    public String getKode07350(){
        return kode07350;
    }
    public void setKode07350(String kode07350){
        this.kode07350=kode07350;
    }
    public String getNama07350(){
        return nama07350;
    }
    public void setNama07350(String nama07350){
        this.nama07350=nama07350;
    }
    public String getAlamat07350(){
        return alamat07350;
    }
    public void setAlamat07350(String alamat07350){
        this.alamat07350=alamat07350;
    }
    public String getNoTelp07350(){
        return noTelp07350;
    }
    public void setNoTelp07350(String noTelp07350){
        this.noTelp07350=noTelp07350;
    }
}
