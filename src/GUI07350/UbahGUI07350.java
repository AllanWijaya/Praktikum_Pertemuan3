package GUI07350;
import Entity07350.BiodataEntity07350;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class UbahGUI07350 extends ComponentGUI07350 {
    String kode, nama, alamat, notelp;
    public UbahGUI07350(String kode){
        initComponent(kode);
    }
    void initComponent(String kode) {
        for (BiodataEntity07350 peserta : AllObjectController07350.peserta07350.getPeserta07350()) {
            this.kode = peserta.getKode07350();
            this.nama = peserta.getNama07350();
            this.notelp = peserta.getNoTelp07350();
            this.alamat = peserta.getAlamat07350();
        }
        setTitle("UBAH DATA PESERTA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,480); 
        setLocationRelativeTo(null); 
        getContentPane().setBackground(Color.white);
        setLayout(null); setVisible(true);
        btnback.setBounds(0,10,80,25);
        btnback.setBackground (Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);

        labelnama.setBounds (25,90,40,25);
        add(labelnama);
        fieldnama.setBounds (120,90,100,25);
        fieldnama.setText(nama);
        fieldnama.setEditable(false);
        add(fieldnama);

        labelalamat.setBounds(25,135,80,25);
        add(labelalamat);
        fieldalamat.setBounds (120,135,100,25);
        fieldalamat.setText(alamat);
        fieldalamat.setEditable(false);
        add(fieldalamat);

        labelnotelp.setBounds (25,180,80,25);
        add(labelnotelp);
        fieldnotelp.setBounds(120, 180, 100,25);
        fieldnotelp.setText(notelp);
        fieldnotelp.setEditable(false);
        add(fieldnotelp);

        btnubahnama.setBounds(245,90,80,25);
        btnubahalamat.setBounds(245,135,80,25);
        btnubahnotelp.setBounds(245,180,80,25);
        add(btnubahnama);
        add(btnubahalamat);
        add(btnubahnotelp);
        btnback.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e) {
                btnback.setForeground(Color.white);
                btnback.setBackground(Color.red);
            }
            public void mouseExited(MouseEvent e) {
                btnback.setForeground(Color.black);
            }
        });
        btnback.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                AwalGUI07350 awalGUI = new AwalGUI07350();
                awalGUI.setVisible(true);
                dispose();
            }
        });
        btnubahnama.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputnama = JOptionPane.showInputDialog("Masukkan Nama Baru");
                    if(inputnama.length() >0){
                        AllObjectController07350.peserta07350. updateData07350(1, inputnama,kode);
                        fieldnama.setText(inputnama);
                    }else{
                        JOptionPane.showMessageDialog(null,"Data Kosong");
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Gagal");
                }
            }
            });
        btnubahalamat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputalamat = JOptionPane.showInputDialog("Masukkan Alamat Baru");
                    if(inputalamat.length() >0){
                        AllObjectController07350.peserta07350. updateData07350(2, inputalamat,kode);
                        fieldalamat.setText(inputalamat);
                    }else{
                        JOptionPane.showMessageDialog(null,"Data Kosong");
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Gagal");
                }
            }
            });
        btnubahnotelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputnotelp = JOptionPane.showInputDialog("Masukkan No Telp Baru");
                    if(inputnotelp.length() >0){
                        AllObjectController07350.peserta07350. updateData07350(3, inputnotelp,kode);
                        fieldnotelp.setText(inputnotelp);
                    }else{
                        JOptionPane.showMessageDialog(null,"Data Kosong");
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Gagal");
                }
            }
            });
                
    }
}
