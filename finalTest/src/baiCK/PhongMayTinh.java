package baiCK;

public class PhongMayTinh extends PhongHoc{
	private int SoMay;

	public PhongMayTinh(String maPHong, String dayNha, float dienTich, int soLuongDen, int soMay) {
		super(maPHong, dayNha, dienTich, soLuongDen);
		setSoMay(soMay);
	}

	public int getSoMay() {
		return SoMay;
	}

	public void setSoMay(int soMayChieu) {
		SoMay = soMayChieu;
	}

	@Override
	public String toString() {
		return "PhongMayTinh [SoMayChieu=" + SoMay + ", MaPHong=" + MaPHong + ", DayNha=" + DayNha + ", DienTich="
				+ DienTich + ", SoLuongDen=" + SoLuongDen + "]";
	} 
	
	@Override
	boolean DatChuan() {
		float check = SoLuongDen / DienTich;
		float checkDTChua = DienTich / SoMay; 
		if(check >= 0.1 && checkDTChua >= 1.5)
			return true; 	
		else 
			return false; 	
	}
		
}
