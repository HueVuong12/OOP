package gk;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
	private int maSach;
	private String tuaSach;
	private double giaSach;
	private LocalDate ngayNhap;
	private String tacGia;
	/**
	 * @return the maSach
	 */
	public int getMaSach() {
		return maSach;
	}
	/**
	 * @param maSach the maSach to set
	 */
	public void setMaSach(int maSach) {
		if(maSach <= 0) {
			maSach = 111;
		}
		this.maSach = maSach;
	}
	/**
	 * @return the tuaSach
	 */
	public String getTuaSach() {
		return tuaSach;
	}
	/**
	 * @param tuaSach the tuaSach to set
	 */
	public void setTuaSach(String tuaSach) throws Exception{
		if(tuaSach.trim().equals(null)) {
			throw new Exception("Tua sach khong duoc rong.");
		}
		this.tuaSach = tuaSach;
	}
	/**
	 * @return the giaSach
	 */
	public double getGiaSach() {
		return giaSach;
	}
	/**
	 * @param giaSach the giaSach to set
	 */
	public void setGiaSach(double giaSach) {
		if(giaSach <= 0) {
			giaSach = 1000;
		}
		this.giaSach = giaSach;
	}
	/**
	 * @return the ngayNhap
	 */
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	/**
	 * @param ngayNhap the ngayNhap to set
	 */
	public void setNgayNhap(LocalDate ngayNhap) {
		if(!ngayNhap.isBefore(LocalDate.now())) {
			ngayNhap = LocalDate.now();
		}
		this.ngayNhap = ngayNhap;
	}
	/**
	 * @return the tacGia
	 */
	public String getTacGia() {
		return tacGia;
	}
	/**
	 * @param tacGia the tacGia to set
	 */
	public void setTacGia(String tacGia) {
		if(tacGia.trim().equals(null)) {
			tacGia = "nhom tac gia";
		}
		this.tacGia = tacGia;
	}
	/**
	 * 
	 */
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maSach
	 * @param tuaSach
	 * @param giaSach
	 * @param ngayNhap
	 * @param tacGia
	 * @throws Exception 
	 */
	public Sach(int maSach, String tuaSach, double giaSach, LocalDate ngayNhap, String tacGia) throws Exception {
		super();
		this.setMaSach(maSach);
		this.setTuaSach(tuaSach);
		this.setGiaSach(giaSach);
		this.setNgayNhap(ngayNhap);
		this.setTacGia(tacGia);
	}
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-7d %-10s %12.4fVND %10s %-20s",this.maSach, this.tuaSach, this.giaSach, df.format(ngayNhap), this.tacGia);
	}
}
