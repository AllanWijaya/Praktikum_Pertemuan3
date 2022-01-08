package Model07350;
import Entity07350.BiodataEntity07350;
import Helper07350.KoneksiDb07350;
import java.sql.*;
import java.util.ArrayList;
public class PesertaModel07350 {
    private String sql;
    public Connection conn=KoneksiDb07350.getConnection();
    public ArrayList<BiodataEntity07350> getPeserta07350(){
        ArrayList<BiodataEntity07350> arraylistpeserta = new ArrayList<>();
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT *from peserta07350";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                BiodataEntity07350 pesertaEntity07350 = new BiodataEntity07350();
                pesertaEntity07350.setKode07350(rs.getString("kode07350"));
                pesertaEntity07350.setNama07350(rs.getString("nama07350"));
                pesertaEntity07350.setAlamat07350(rs.getString("alamat07350"));
                pesertaEntity07350.setNoTelp07350(rs.getString("noTelp07350"));
                arraylistpeserta.add(pesertaEntity07350);
            }    
        }catch(SQLException e){
            System.out.println(e);
        }
        return arraylistpeserta;
    }       
    public void insertPeserta07350(BiodataEntity07350 BiodataEntity07350){
        try{
            sql = "INSERT INTO peserta07350(kode07350,nama07350,alamat07350,noTelp07350) Values(?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, BiodataEntity07350.getKode07350());
            stat.setString(2, BiodataEntity07350.getNama07350());
            stat.setString(3, BiodataEntity07350.getAlamat07350());
            stat.setString(4, BiodataEntity07350.getNoTelp07350());
            stat.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    public void updateNama07350(String nama07350,String kode07350){
        try{
            sql="update peserta07350 SET nama07350=? WHERE kode07350=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama07350);
            stat.setString(2, kode07350);
            stat.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }        
    }
    public void updateAlamat07350(String alamat07350,String kode07350){
        try{
            sql="update peserta07350 SET alamat07350=? WHERE kode07350=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, alamat07350);
            stat.setString(2, kode07350);
            stat.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }        
    }
    public void updateNoTelp07350(String noTelp07350,String kode07350){
        try{
            sql="update peserta07350 SET noTelp07350=? WHERE kode07350=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp07350);
            stat.setString(2, kode07350);
            stat.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }        
    }
    public void delete07350(String kode){
        try{
            sql="DELETE FROM peserta07350 where kode07350 = ?";
            PreparedStatement stat=conn.prepareStatement(sql);
            stat.setString(1, kode);
            stat.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
