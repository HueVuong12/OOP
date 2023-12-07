package baiCK;

import java.util.Objects;

public abstract class PhongHoc {
	protected String MaPHong; 
	protected String DayNha; 
	protected float DienTich; 
	protected int SoLuongDen;
	
	public PhongHoc(String maPHong, String dayNha, float dienTich, int soLuongDen) {
		super();
		setMaPHong(maPHong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoLuongDen(soLuongDen);
	}
	
	public String getMaPHong() {
		return MaPHong;
	}
	public String getDayNha() {
		return DayNha;
	}
	public float getDienTich() {
		return DienTich;
	}
	public int getSoLuongDen() {
		return SoLuongDen;
	}
	public void setMaPHong(String maPHong) {
		MaPHong = maPHong;
	}
	public void setDayNha(String dayNha) {
		DayNha = dayNha;
	}
	public void setDienTich(float dienTich) {
		DienTich = dienTich;
	}
	public void setSoLuongDen(int soLuongDen) {
		SoLuongDen = soLuongDen;
	}

	@Override
	public String toString() {
		return "PhongHoc [MaPHong=" + MaPHong + ", DayNha=" + DayNha + ", DienTich=" + DienTich + ", SoLuongDen="
				+ SoLuongDen + "]";
	} 	
	
	@Override
	public int hashCode() {
		return Objects.hash(DayNha, DienTich, MaPHong, SoLuongDen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(DayNha, other.DayNha)
				&& Float.floatToIntBits(DienTich) == Float.floatToIntBits(other.DienTich)
				&& Objects.equals(MaPHong, other.MaPHong) && SoLuongDen == other.SoLuongDen;
	}

	abstract boolean DatChuan(); 

}
