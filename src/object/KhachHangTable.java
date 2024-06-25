/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AN
 */
public class KhachHangTable extends AbstractTableModel {

    public String Name[] = {"Mã khách hàng", "Họ tên", "Địa chỉ", "Tuổi", "Giới tính", "Số điện thoại"};
    public Class classess[] = {String.class, String.class, String.class, Integer.class, String.class, String.class};

    ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();

    public KhachHangTable(ArrayList<KhachHang> kh) {
        dsKH = kh;
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dsKH.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Name.length;
    }

    @Override
    public Object getValueAt(int RowIndex, int ColumnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (ColumnIndex) {
            case 0:
                return dsKH.get(RowIndex).getMakh();
            case 1:
                return dsKH.get(RowIndex).getTenKh();
            case 2:
                return dsKH.get(RowIndex).getDiaChi();
            case 3:
                return dsKH.get(RowIndex).getTuoi();
            case 4:
                return dsKH.get(RowIndex).getGioiTinh();
            case 5:
                return dsKH.get(RowIndex).getSoDt();

            default:
                return null;
        }

    }

    public Class getColumnClass(int ColumnIndex) {
        return classess[ColumnIndex];
    }

    public String getColumnName(int Column) {
        return Name[Column];
    }

    // ds là danh sách các KhachHang trong KhachHangTable
    public KhachHang getKhachHangAt(int rowIndex) {
        return dsKH.get(rowIndex);
    }

}
