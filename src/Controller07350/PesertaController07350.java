package Controller07350;
import Entity07350.BiodataEntity07350;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
public class PesertaController07350 {
    public void insertData07350(String kode, String nama, String alamat, String noTelp){
        BiodataEntity07350 peserta = new BiodataEntity07350();
        peserta.setKode07350(kode);
        peserta.setNama07350(nama);
        peserta.setAlamat07350(alamat);
        peserta.setNoTelp07350(noTelp);
        AllObjectModel07350.pesertaModel.insertPeserta07350(peserta);
    }
    public void updateData07350(int urut,String data,String kode){
        switch(urut){
            case 1:
                AllObjectModel07350.pesertaModel.updateNama07350(data, kode);
                break;
            case 2:
                AllObjectModel07350.pesertaModel.updateAlamat07350(data, kode);
                break;
            case 3:
                AllObjectModel07350.pesertaModel.updateNoTelp07350(data, kode);
                break;
        }
    }
    public void deleteData07350(String kode){
        AllObjectModel07350.pesertaModel.delete07350(kode);
    }
    public ArrayList<BiodataEntity07350> getPeserta07350(){
        return AllObjectModel07350.pesertaModel.getPeserta07350();
    }
    public DefaultTableModel daftarPeserta07350(){
        DefaultTableModel dataDaftarPeserta07350 = new DefaultTableModel();
        Object[] kolom = {"Kode","Nama","Alamat","No Telp"};
        dataDaftarPeserta07350.setColumnIdentifiers(kolom);
        int size=getPeserta07350().size();
        for(int i = 0;i<size;i++){
            Object data[] = new Object[5];
            data[0]=AllObjectModel07350.pesertaModel.getPeserta07350().get(i).getKode07350();
            data[1]=AllObjectModel07350.pesertaModel.getPeserta07350().get(i).getNama07350();
            data[2]=AllObjectModel07350.pesertaModel.getPeserta07350().get(i).getAlamat07350();
            data[3]=AllObjectModel07350.pesertaModel.getPeserta07350().get(i).getNoTelp07350();
            dataDaftarPeserta07350.addRow(data);
        }
        return dataDaftarPeserta07350;
    }
}
