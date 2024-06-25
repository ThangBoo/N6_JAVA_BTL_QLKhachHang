/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.io.Serializable;

/**
 *
 * @author AN
 */
public class DonHang implements Serializable {

    private String madh;
    private String makh;
    private String tenThuoc;
    private double tien;

    // Getter và setter cho các thuộc tính
    public DonHang() {
    }

    public DonHang(String madh, String makh, String tenThuoc, double tien) {
        this.madh = madh;
        this.makh = makh;
        this.tenThuoc = tenThuoc;
        this.tien = tien;
    }

    public String getMadh() {
        return madh;
    }

    public String getMakh() {
        return makh;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public double getTien() {
        return tien;
    }

    public void setMadh(String madh) {
        this.madh = madh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    @Override
    public String toString() {
        return "DonHang{" + "madh:" + madh + " makh: " + makh + " tenThuoc: " + tenThuoc + " tien: " + tien + "}";
    }

//   @Override
//    public int compareTo(DonHang o) {
//        return this.madh.compareTo(o.madh);
//    }
}
