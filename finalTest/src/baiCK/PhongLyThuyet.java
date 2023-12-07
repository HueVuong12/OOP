package baiCK;
	
public class PhongLyThuyet extends PhongHoc{
	private boolean CoMayChieu;

	public PhongLyThuyet(String maPHong, String dayNha, float dienTich, int soLuongDen, boolean coMayChieu) {
		super(maPHong, dayNha, dienTich, soLuongDen);
		setCoMayChieu(coMayChieu);
	}
	
	public boolean isCoMayChieu() {
		return CoMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		CoMayChieu = coMayChieu;
	}

	@Override
	public String toString() {
		return "PhongLyThuyet [CoMayChieu=" + CoMayChieu + ", MaPHong=" + MaPHong + ", DayNha=" + DayNha + ", DienTich="
				+ DienTich + ", SoLuongDen=" + SoLuongDen + "]";
	}

	@Override
	boolean DatChuan() {
		float check = SoLuongDen / DienTich; 	
		if(check >= 0.1 && CoMayChieu == true)
			return true; 	
		else 
			return false; 	
	}

	
	
}
