package GUI07350;
import javax.swing.*;
public class ComponentGUI07350 extends JFrame{
    protected JButton btntambah = new JButton("TAMBAH PESERTA");
    protected JButton btnubah = new JButton("UBAH DATA PESERTA");
    protected JButton btnlihat = new JButton("LIHAT PESERTA");
    protected JButton btnhapus = new JButton("HAPUS PESERTA");
    protected JButton btnback = new JButton("KEMBALI");
    protected JButton btnkeluar = new JButton("KELUAR");
    protected JButton btnubahkode = new JButton("Ubah");
    protected JButton btnubahnama = new JButton("Ubah");
    protected JButton btnubahalamat = new JButton("Ubah");
    protected JButton btnubahnotelp = new JButton("Ubah");
    
    protected JLabel labeltambah = new JLabel("TAMBAH DATA PESERTA");
    protected JLabel labelubah = new JLabel("UBAH DATA PESERTA");
    protected JLabel labellihat = new JLabel("LIHAT DATA PESERTA");
    protected JLabel labelhapus = new JLabel("HAPUS DATA PESERTA");
    protected JLabel labelkode = new JLabel("KODE");
    protected JLabel labelnama = new JLabel("NAMA");
    protected JLabel labelalamat = new JLabel("ALAMAT");
    protected JLabel labelnotelp = new JLabel("NO TELP");
  
    protected JTextField fieldkode = new JTextField();
    protected JTextField fieldnama = new JTextField();
    protected JTextField fieldalamat = new JTextField();
    protected JTextField fieldnotelp = new JTextField();
    
    void kosong(){
        fieldkode.setText(null);
        fieldnama.setText(null);
        fieldalamat.setText(null);
        fieldnotelp.setText(null);
    }
}
