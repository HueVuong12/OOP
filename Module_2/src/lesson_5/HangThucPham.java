package lesson_5;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private float donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private DateTimeFormatter formatter;

	public HangThucPham(String maHang, String tenHang, float donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}

	public HangThucPham(String maHang) {
		if (maHang.isEmpty()) {
			throw new IllegalArgumentException("Mã hàng không được rỗng");
		}
		this.maHang = maHang;
		this.tenHang = "xxx";
		this.donGia = 0;
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = this.ngaySanXuat;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	@Override
	public String toString() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("  " + maHang + "   " + tenHang + "                 " + df.format(donGia) + "      "
				+ dtf.format(ngaySanXuat) + "            " + dtf.format(ngayHetHan) + "            "
				+ kiemTraHetHanSuDung());
	}
	/**
	 * nếu đúng trả true, ngược lại false
	 * 
	 * @return
	 */
	public boolean kiemTraHetHanSuDung() {
		if (LocalDate.now().isAfter(this.ngayHetHan))
			return true;
		return false;
	}

}
