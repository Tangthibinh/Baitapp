package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Sinhvien;
import model.Themuon;

public class Quanlythemuon {
	private List<Themuon> dsThemuon;

    public Quanlythemuon() {
    	dsThemuon = new ArrayList<>();
    }

    public void themThemuon(Themuon themuon) {
    	dsThemuon.add(themuon);
    }

    public void xoaThemuon(String Maphieumuon) {
        Iterator<Themuon> iterator = dsThemuon.iterator();
        while (iterator.hasNext()) {
            Themuon themuon = iterator.next();
            if (themuon.getMaphieumuon().equals(Maphieumuon)) {
                iterator.remove();
                System.out.println("Xóa thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy mã phiếu mượn " + Maphieumuon);
    }

    public List<Themuon> LaydshThemuon() {
        return dsThemuon;
    }
//    List<Themuon> dsThemuon
    public void hienThiThongTin() {
        for (Themuon themuon : dsThemuon) {
            System.out.println("Mã phiếu mượn: " + themuon.getMaphieumuon());
            System.out.println("Ngày mượn: " + themuon.getNgaymuon());
            System.out.println("Hạn trả: " + themuon.getHantra());
            System.out.println("Số hiệu sách: " + themuon.getSohieusach());
            Sinhvien sinhVien = themuon.getSinhVien();
            System.out.println("Họ và tên sinh viên: " + sinhVien.getTen());
            System.out.println("Tuổi sinh viên: " + sinhVien.getTuoi());
            System.out.println("Lớp: " + sinhVien.getLop());
            System.out.println("----------------------------------");
        }
    }
    
}
