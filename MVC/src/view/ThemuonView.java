package view;

import java.util.Scanner;

import controller.Quanlythemuon;
import model.Sinhvien;
import model.Themuon;


public class ThemuonView {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quanlythemuon quanLyTheMuon = new Quanlythemuon();

        while (true) {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm thẻ mượn sách");
            System.out.println("2. Xóa thẻ mượn sách");
            System.out.println("3. Hiển thị danh sách thẻ mượn sách");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng new line sau khi nhập số

            switch (choice) {
                case 1:
				
				Themuon themuon = nhapthongtinthemuon( sc);
                    quanLyTheMuon.themThemuon(themuon);
                    System.out.println("Thêm thẻ mượn sách thành công.");
                    break;
                case 2:
                    System.out.print("Nhập mã phiếu mượn sách cần xóa: ");
                    String maPhieuMuon = sc.nextLine();
                    quanLyTheMuon.xoaThemuon(maPhieuMuon);
                    break;
                case 3:
                    quanLyTheMuon.hienThiThongTin();
                    break;
                case 0:
                    System.out.println("Ứng dụng kết thúc.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
            System.out.println();
        }
    }

	public static Themuon nhapthongtinthemuon(Scanner sca) {
        System.out.print("Nhập mã phiếu mượn sách: ");
        String maphieumuon = sca.nextLine();

        System.out.print("Nhập ngày mượn: ");
        int ngaymuon = sca.nextInt();

        System.out.print("Nhập hạn trả: ");
        int hantra = sca.nextInt();

        System.out.print("Nhập số hiệu sách: ");
        int sohieusach = sca.nextInt();
        sca.nextLine(); // Đọc bỏ dòng new line sau khi nhập số

        System.out.print("Nhập họ tên sinh viên: ");
        String hoten = sca.nextLine();

        System.out.print("Nhập tuổi sinh viên: ");
        int tuoi = sca.nextInt();
        sca.nextLine(); // Đọc bỏ dòng new line sau khi nhập số

        System.out.print("Nhập lớp sinh viên: ");
        String lop = sca.nextLine();

        Sinhvien sinhVien = new Sinhvien(hoten, tuoi, lop);

        return new Themuon(maphieumuon, ngaymuon, hantra, sohieusach, sinhVien);
    }
	
}
