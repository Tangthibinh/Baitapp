package model;

public class Sinhvien {
	private String Ten;
	private int Tuoi;
	private String Lop;
	public Sinhvien(String ten, int tuoi, String lop) {
		super();
		Ten = ten;
		Tuoi = tuoi;
		Lop = lop;
	}
	
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getTuoi() {
		return Tuoi;
	}
	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	
	

}
