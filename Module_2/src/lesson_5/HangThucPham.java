package lesson_5;

import java.sql.Date;
import java.time.LocalDate;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private float donGia;
	private Date ngaySanXuat;
	private Date ngayHetHan;
	public HangThucPham(String maHang, String tenHang, float donGia, Date ngaySanXuat, Date ngayHetHan) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	
}
