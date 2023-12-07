package baiCK;

public class PhongThucHanh extends PhongHoc{
	private String ChuyenNganh; 	
	private int SuaChua; 
	private boolean CoBonChua;
	
	public PhongThucHanh(String maPHong, String dayNha, float dienTich, int soLuongDen, 
			String chuyenNganh, int suaChua, boolean coBonChua) {
		super(maPHong, dayNha, dienTich, soLuongDen);
		setChuyenNganh(chuyenNganh);
		setSuaChua(suaChua);
		setCoBonChua(coBonChua);
	}

	public String getChuyenNganh() {
		return ChuyenNganh;
	}

	public int getSuaChua() {
		return SuaChua;
	}

	public boolean isCoBonChua() {
		return CoBonChua;
	}

	public void setChuyenNganh(String chuyenNganh) {
		ChuyenNganh = chuyenNganh;
	}

	public void setSuaChua(int suaChua) {
		SuaChua = suaChua;
	}

	public void setCoBonChua(boolean coBonChua) {
		CoBonChua = coBonChua;
	}

	@Override
	public String toString() {
		return "PhongThucHanh [ChuyenNganh=" + ChuyenNganh + ", SuaChua=" + SuaChua + ", CoBonChua=" + CoBonChua
				+ ", MaPHong=" + MaPHong + ", DayNha=" + DayNha + ", DienTich=" + DienTich + ", SoLuongDen="
				+ SoLuongDen + "]";
	}
	
	@Override
	boolean DatChuan() {
		float check = SoLuongDen / DienTich; 	
		if(check >= 0.1 && CoBonChua == true)
			return true; 	
		else 
			return false; 	
	}
	
	
}
