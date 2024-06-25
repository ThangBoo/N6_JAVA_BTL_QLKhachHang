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
public class DonHangTable extends AbstractTableModel{
    public String Name[] = {"Mã đơn hàng","Mã khách hàng","Tên thuốc","Số tiền"};
    public Class classess[] = {String.class,String.class,String.class,Float.class};
    
    ArrayList<DonHang> dsDH = new ArrayList<DonHang>();
    public DonHangTable(ArrayList<DonHang> kh){
          dsDH = kh;
    } 

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dsDH.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Name.length;
    }

    @Override
    public Object getValueAt(int RowIndex, int ColumnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(ColumnIndex){
            case 0 :
                return dsDH.get(RowIndex).getMadh();
                 case 1 :
                return dsDH.get(RowIndex).getMakh();
                 case 2 :
                return dsDH.get(RowIndex).getTenThuoc();
                 case 3 :
                return dsDH.get(RowIndex).getTien();
                
                 default: return null;
        }
      
     
    }
     public Class getColumnClass(int ColumnIndex){
           return classess[ColumnIndex];
       }
     public String getColumnName(int Column){
           return Name[Column];
       }
}
