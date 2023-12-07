package gk;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachSach {
	int soLuong;
	Sach[] DS;
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		if(soLuong <= 0) soLuong = 1;
		this.soLuong = soLuong;
	}
	/**
	 * @param soLuong
	 * @param dS
	 */
	public DanhSachSach(int n) {
		super();
		DS = new Sach[n];
		this.soLuong = 0;
	}
	/**
	 * 
	 */
	public DanhSachSach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isMaTrung(int ma) {
		for(int i = 0; i < soLuong; i++) {
			if(DS[i].getMaSach() == ma) {
				return true;
			}
		}
		return false;
	}
	public boolean isFull() {
		if(soLuong == DS.length) return true;
		return false;
	}
	public void Add(Sach sach) throws Exception {
		if(isFull()) {
			throw new Exception("Mang da day.");
		}
		if(isMaTrung(sach.getMaSach())) {
			throw new Exception("Da trung ma.");
		}
		DS[soLuong] = sach;
		soLuong++;
	}
	public double TongGiaTri() {
		double tong = 0;
		for(int i = 0; i < soLuong; i++) {
			tong += DS[i].getGiaSach();
		}
		return tong;
	}
	public void sapXepTheoTuaSach() {
		Arrays.sort(DS, new Comparator<Sach>() {
			public int compare(Sach o1, Sach o2) {
				if(o1 != null && o2 != null) {
					if(o1.getTuaSach().compareToIgnoreCase(o2.getTuaSach()) > 0) {
						return 1;
					}
					else if(o1.getTuaSach().compareToIgnoreCase(o2.getTuaSach()) < 0) {
						return -1;
					}
				}
				return 0;
			}
		});
	}
	public int TimKiemTheoMaSach(int maSach) {
		for(int i = 0; i < soLuong; i++) {
			if(DS[i].getMaSach() == maSach) {
				return i;
			}
		}
		return -1;
	}
	public int SuaGiaSach(int maSach, double giaSachSua) {
		if(TimKiemTheoMaSach(maSach) == -1) {
			return -1;
		}
		DS[TimKiemTheoMaSach(maSach)].setGiaSach(giaSachSua);
		return 1;
	}
	public int remove(int maSach) {
		if(TimKiemTheoMaSach(maSach) == -1) {
			return -1;
		}
		for(int i = TimKiemTheoMaSach(maSach); i < soLuong - 1; i++) {
			DS[i] = DS[i + 1];
		}
		soLuong--;
		return 1;
	}
}
