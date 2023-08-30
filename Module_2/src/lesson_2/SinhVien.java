package lesson_2;

public class SinhVien {
	private int maSoSinhVien;
	private String hoVaTen;
	private float diemLt;
	private float diemTh;

	public SinhVien(int maSoSinhVien, String hoVaTen, float diemLt, float diemTh) {
		this.maSoSinhVien = maSoSinhVien;
		this.hoVaTen = hoVaTen;
		this.diemLt = diemLt;
		this.diemTh = diemTh;
	}

	public int getMaSoSinhVien() {
		return maSoSinhVien;
	}

	public void setMaSoSinhVien(int maSoSinhVien) {
		this.maSoSinhVien = maSoSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public float getDiemLt() {
		return diemLt;
	}

	public void setDiemLt(float diemLt) {
		if (diemLt <= 10 && diemLt >= 0) {
			this.diemLt = diemLt;
		} else {
			this.diemLt = 1;
		}
	}

	public float getDiemTh() {
		return diemTh;
	}

	public void setDiemTh(float diemTh) {
		if (diemTh <= 10 && diemTh >= 0) {
			this.diemTh = diemTh;
		} else {
			this.diemTh = 1;
		}
	}

	public float tinhdiemtrungbinh() {
		return (this.diemLt + this.diemTh) / 2;
	}

	@Override
	public String toString() {
		return String.format("%-5s %-30s %10s %10s %10s", maSoSinhVien,  hoVaTen, diemLt, diemTh	, tinhdiemtrungbinh()	);
	}

//	@Override
//	public String toString() {
//		return String.format("%-5s %-30s %10s %10s %10s", maSoSinhVien, hoVaTen, diemLt, diemTh, tinhdiemtrungbinh());
//	}
	
}

