package model;

public class Themuon {
	private String Maphieumuon;
	private int Ngaymuon;
	private int Hantra;
	private int Sohieusach;
	private Sinhvien sinhVien;
	
public Themuon(String maphieumuon, int ngaymuon, int hantra, int sohieusach, Sinhvien sinhVien) {
		super();
		Maphieumuon = maphieumuon;
		Ngaymuon = ngaymuon;
		Hantra = hantra;
		Sohieusach = sohieusach;
		this.sinhVien = sinhVien;
	}
    
	public String getMaphieumuon() {
		return Maphieumuon;
	}
	public void setMaphieumuon(String maphieumuon) {
		Maphieumuon = maphieumuon;
	}
	public int getNgaymuon() {
		return Ngaymuon;
	}
	public void setNgaymuon(int ngaymuon) {
		Ngaymuon = ngaymuon;
	}
	public int getHantra() {
		return Hantra;
	}
	public void setHantra(int hantra) {
		Hantra = hantra;
	}
	public int getSohieusach() {
		return Sohieusach;
	}
	public void setSohieusach(int sohieusach) {
		Sohieusach = sohieusach;
	}
	public Sinhvien getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(Sinhvien sinhVien) {
		this.sinhVien = sinhVien;
	}
}
