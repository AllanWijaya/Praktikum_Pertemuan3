package GUI07350;
import Entity07350.BiodataEntity07350;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class TampilPeserta07350 extends ComponentGUI07350{
    String kode,nama,notelp,alamat;
    JTable tabelpeserta = new JTable();
    JScrollPane sppeserta = new JScrollPane(tabelpeserta);
    JTextField textpilih = new JTextField();
    public TampilPeserta07350(){
        initComponent();
    }
    void initComponent() {
        for (BiodataEntity07350 peserta : AllObjectController07350.peserta07350.getPeserta07350()) {
            this.kode = peserta.getKode07350();
            this.nama = peserta.getNama07350();
            this.notelp = peserta.getNoTelp07350();
            this.alamat = peserta.getAlamat07350();
        }
        setTitle("PROGRAM PENDAFTARAN KURSUS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,480); 
        setLocationRelativeTo(null); 
        getContentPane().setBackground(Color.white);
        setLayout(null); setVisible(true);
        
        btnhapus.setBounds(540,50, 110, 25);
        btnhapus.setFocusPainted(false);
        btnhapus.setBorder(null);
        btnhapus.setBackground(Color.black);
        btnhapus.setForeground(Color.white);
        add(btnhapus);
        
        btnback.setBounds(0,0,80,25);
        btnback.setBackground (Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        sppeserta.setBounds(20, 50, 500, 350);
        tabelpeserta.setModel(AllObjectController07350.peserta07350.daftarPeserta07350());
        add(sppeserta);       
        
        btnback.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e) {
                btnback.setForeground(Color.red);
            }
            public void mouseExited(MouseEvent e) {
                btnback. setForeground(Color.black);
            }
        });
        btnback.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                AwalGUI07350 awalgui = new AwalGUI07350();
                awalgui.setVisible(true);
                dispose();
            }
        });
        tabelpeserta.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int i = tabelpeserta.getSelectedRow();
                textpilih.setText(AllObjectController07350.peserta07350.daftarPeserta07350().getValueAt(i, 0).toString());
            }
        });
        btnhapus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                kode = String.valueOf(textpilih.getText());
                AllObjectController07350.peserta07350.deleteData07350(kode);
                tabelpeserta.setModel(AllObjectController07350.peserta07350.daftarPeserta07350());
                JOptionPane.showMessageDialog(null, "Berhasil HAPUS DATA");
            }       
        });
    }
}