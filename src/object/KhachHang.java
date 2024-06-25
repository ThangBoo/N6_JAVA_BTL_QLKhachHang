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
public class KhachHang implements Comparable<KhachHang>, Serializable {
    private String makh;
    private String tenKh;
    private String diaChi;
    private int tuoi;
    private String gioiTinh;
    private String soDt;

    // Getter và setter cho các thuộc tính

    public KhachHang() {
    }

    public KhachHang(String makh, String tenKh, String diaChi, int tuoi, String gioiTinh, String soDt) {
        this.makh = makh;
        this.tenKh = tenKh;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.soDt = soDt;
    }

    public String getMakh() {
        return makh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    
    @Override
    public String toString() {
        return "KhachHang{" +
                "makh='" + makh + '\'' +
                ", tenKh='" + tenKh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDt='" + soDt + '\'' +
                '}';
    }

    @Override
    public int compareTo(KhachHang o) {
       return this.tenKh.compareTo(o.tenKh);
    }
}
