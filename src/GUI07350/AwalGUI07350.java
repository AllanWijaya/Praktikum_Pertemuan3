package GUI07350;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class AwalGUI07350 extends ComponentGUI07350 {
    protected JLabel labelatas = new JLabel("DAFTAR MENU PENDAFTARAN KURSUS");
    protected Scanner input = new Scanner(System.in);
    public AwalGUI07350(){
        initComponent();
    }
    void initComponent(){
        setTitle("DAFTAR MENU PENDAFTARAN KURSUS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelatas.setBounds(45,30,300,25);
        labelatas.setBorder(null);
        add(labelatas);
        
        btntambah.setBounds(60, 90, 200, 25);
        btntambah.setBackground(Color.cyan);
        btntambah.setBorder(null);
        add(btntambah);
        btnubah.setBounds(60, 130, 200, 25);
        btnubah.setBackground(Color.cyan);
        btnubah.setBorder(null);
        add(btnubah);
        
        btnlihat.setBounds(60, 170, 200, 25);
        btnlihat.setBackground(Color.cyan);
        btnlihat.setBorder(null);
        add(btnlihat);
        
        btnhapus.setBounds(60, 210, 200, 25);
        btnhapus.setBackground(Color.cyan);
        btnhapus.setBorder(null);
        add(btnhapus);
        
        btnkeluar.setBounds(120, 400, 80, 25);
        btnkeluar.setBackground(Color.red);
        btnkeluar.setBorder(null);
        add(btnkeluar);

        btntambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                DaftarGUI07350 daftarGUI = new DaftarGUI07350();
                daftarGUI.setVisible(true);
            }
        });
        btntambah.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btntambah.setForeground(Color.blue);
            }
            public void mouseExited(MouseEvent e){
                btntambah.setForeground(Color.black);
            }
        });
        btnubah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputkode = JOptionPane.showInputDialog("Masukkan Kode : ");
                    if(inputkode.length() >0){                   
                        fieldkode.setText(inputkode);
                        dispose();
                        UbahGUI07350 ubahgui = new UbahGUI07350(inputkode);
                        ubahgui.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null,"Data Kosong");
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }    
            }          
        });
        btnubah.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnubah.setForeground(Color.blue);
                
            }
            public void mouseExited(MouseEvent e){
                btnubah.setForeground(Color.black);
            }
        });
        btnlihat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                TampilPeserta07350 tampil07350 = new TampilPeserta07350();
                tampil07350.setVisible(true);
            }
        });
        btnlihat.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnlihat.setForeground(Color.blue);
                
            }
            public void mouseExited(MouseEvent e){
                btnlihat.setForeground(Color.black);
            }
        });
        btnhapus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                TampilPeserta07350 tampil07350 = new TampilPeserta07350();
                tampil07350.setVisible(true);
            }
        });
        btnhapus.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnhapus.setForeground(Color.blue);
                
            }
            public void mouseExited(MouseEvent e){
                btnhapus.setForeground(Color.black);
            }
        });
        btnkeluar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            System.exit(0);
            }
        });
        btnkeluar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnkeluar.setForeground(Color.DARK_GRAY);
                
            }
            public void mouseExited(MouseEvent e){
                btnkeluar.setForeground(Color.white);
            }
        });
    }
}
