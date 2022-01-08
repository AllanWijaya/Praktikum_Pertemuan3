package GUI07350;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class DaftarGUI07350 extends ComponentGUI07350 { 
    public DaftarGUI07350(){
        initComponent();
    }
    void initComponent(){
        setTitle("Tambah Data Peserta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        btnback.setBounds(0,0,80,25);
        btnback.setBackground (Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        labeltambah.setBounds(80, 50, 200, 25);
        add(labeltambah);
        labelkode.setBounds(35, 95, 80, 25);
        add(labelkode);
        fieldkode.setBounds(130, 95, 130, 25);
        add(fieldkode);
        
        labelnama.setBounds(35, 140, 80, 25);
        add(labelnama);
        fieldnama.setBounds(130, 140, 130, 25);
        add(fieldnama);
        
        labelalamat.setBounds(35, 185, 80, 25);
        add(labelalamat);
        fieldalamat.setBounds(130, 185, 130, 25);
        add(fieldalamat);
        
        labelnotelp.setBounds(35, 230, 80, 25);
        add(labelnotelp);
        fieldnotelp.setBounds(130, 230, 130, 25);
        add(fieldnotelp);
        
        btntambah.setBounds(80, 350, 140, 25);
        btntambah.setBorder(null);
        btntambah.setBackground(Color.black);
        btntambah.setForeground(Color.white);
        btntambah.setFocusPainted(false);
        add(btntambah);
        
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
        
        btntambah.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btntambah.setForeground(Color.black);
                btntambah.setBackground(Color.green);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btntambah.setForeground(Color.white);
                btntambah.setBackground(Color.black);
            }
        });        
        btntambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String kode = fieldkode.getText();
                String nama = fieldnama.getText();
                String alamat = fieldalamat.getText();
                String notelp = fieldnotelp.getText();
                if(kode.length() != 0 && nama.length() != 0 && alamat.length() != 0 && notelp.length() != 0){
                    AllObjectController07350.peserta07350.insertData07350(kode, nama, alamat, notelp);
                    JOptionPane.showMessageDialog(null, "Anda kembali ke menu utama");
                    dispose();
                    new AwalGUI07350().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
            }
        });
    }
}
