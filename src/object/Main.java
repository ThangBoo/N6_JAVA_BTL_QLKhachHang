/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AN
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Tạo danh sách đơn hàng
        ArrayList<DonHang> donHangList = new ArrayList<>();
        donHangList.add(new DonHang("DH01", "KH01", "Thuốc cảm", 50000));
        donHangList.add(new DonHang("DH02", "KH02", "Thuốc hạ sốt", 30000));

        try {
            // Lưu danh sách đơn hàng vào file txt
            FileUtils.ghiObjectVaoFile("donhang.txt", donHangList);
        } catch (Exception e) {
            System.out.println("khong luu dc file");
        }
        

        // Đọc danh sách đơn hàng từ file txt
        try {
            ArrayList<DonHang> donHangDoc = FileUtils.docDanhSachTuFile("donhang.txt");
            System.out.println("Danh sách đơn hàng đã đọc:");
            for (DonHang donHang : donHangDoc) {
                System.out.println(donHang);
            }
        } catch (Exception e) {
            System.out.println("khong doc dc file");
        }
        
        
    }
}
