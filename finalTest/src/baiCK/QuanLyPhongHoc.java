package baiCK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class QuanLyPhongHoc {

	private ArrayList<PhongHoc> ListPhongHoc;

 
	//khoi tao 
	public void khoiTao() { 	
		ListPhongHoc = new ArrayList<PhongHoc>();
	}
	
	Scanner sc = new Scanner(System.in);

	/// them phong hoc
	public int themPhongHoc(PhongHoc p) { 
		for(PhongHoc pro : ListPhongHoc) { 
			if(pro.getMaPHong().compareTo(p.getMaPHong()) == 0) { 
				return 0; 
			}
		}
		ListPhongHoc.add(p); 
		return 1; 
	}
	
	// lay thong tin toan do cach phong hoc 
	public int inTatCaPhongHoc() { 	
		if(ListPhongHoc.size() == 0) { 
			System.out.println("Mang Rong");
			return 0; 
		}else { 
			for(PhongHoc pro : ListPhongHoc)
				System.out.println(pro.toString());
			return 1;
		}	
	}
	
	/// tim kiem theo ma phong
	public int timKiemTheoMaPhong(String keySearch) { 
		for(PhongHoc pro : ListPhongHoc)
			if(pro.getMaPHong().compareTo(keySearch) == 0) { 
				System.out.println(pro.toString());
				return 1; 
			}
		System.out.println("Khong Tim Thay Ma Phong " + keySearch);
		return 0; 
	}
	
	// toString lay thong tin Tat Ca Phong
	public String layRatTatCaThongTin() { 
		String str = ""; 
//		for(PhongHoc pro : ListPhongHoc)
		for (PhongHoc phongHoc : ListPhongHoc) 
			str += phongHoc + "\n";
//			str += pro + "\n"; 
		
		return str; 
	}
	
	// lay thong tin phong dat chuan
	public String layRaTatCaPhongDatChuan() { 	
		String str = ""; 
		for(PhongHoc pro : ListPhongHoc) {
			if(pro.DatChuan())
				str += pro + "\n"; 
		}
		return str; 
	}
	
	// tang dan theo day nha 
	public int sapXepTangDanTheoDayNha() { 	
		if(ListPhongHoc.size() <= 1)
			return 0; 
		else { 
			Collections.sort(ListPhongHoc, new Comparator<PhongHoc>() {
				@Override
				public int compare(PhongHoc o1, PhongHoc o2) {
					return o1.getDayNha().compareTo(o2.getDayNha()); // tang dan 
//					return o2.getDayNha().compareTo(o1.getDayNha()); // giam dan
//					return -o1.getDayNha().compareTo(o2.getDayNha()); // tang dan
				}
			});
			return 1;
		}
	}
	// tang dan theo so bong den
		public int sapXepTangDanTheoBongDen() { 
			if(ListPhongHoc.size() <= 1)
				return 0; 
			else { 
				Collections.sort(ListPhongHoc, new Comparator<PhongHoc>() {
					@Override
					public int compare(PhongHoc o1, PhongHoc o2) {
						if(o1.getSoLuongDen() > o2.getSoLuongDen())
							return 1; 
						else { 
							if(o1.getSoLuongDen() == o2.getSoLuongDen())
								return 0; 
							else 
								return -1;
						}
					}
				});
				return 1; 
			}
		}
	// giam dan theo dien tich 
	public int sapXepGiamDanTheoDienTich() { 
		if(ListPhongHoc.size() <= 1)
			return 0; 
		else { 
			Collections.sort(ListPhongHoc, new Comparator<PhongHoc>() {
				@Override
				public int compare(PhongHoc o1, PhongHoc o2) {
					if(o1.getDienTich() > o2.getDienTich())
						return -1; 
					else { 
						if(o1.getDienTich() == o2.getDienTich())
							return 0; 
						else 
							return 1;
					}
				}
			});
			return 1; 
		}
	}

	//cap nhat so may tinh khi biet ma phong  
	public int capNhatSoMayTinhTheoMaPhong(String keyPhong, int keyCapNhat) { 
		if(ListPhongHoc.size() == 0) { 
			System.out.println("Mang Rong Can Them Phong");
			return 0; 
		}
		else { 
			for(PhongHoc pro : ListPhongHoc) { 
				if(pro instanceof PhongMayTinh && pro.getMaPHong().compareToIgnoreCase(keyPhong) ==0) { 
					((PhongMayTinh)pro).setSoMay(keyCapNhat); 
					return 1; 
				}
			}
			System.out.println("Khong Co Ma Phong Theo Yeu Cau");
			return 0;
		}
	}
		
	// xoa một phong học nao do khi biet ma phong 
//	public int xoaTheoMaPhong(String keyPhong) { 
//		for(PhongHoc pro : ListPhongHoc) { 
//			if(pro.getMaPHong().compareToIgnoreCase(keyPhong) ==0) { 
////				System.out.println("Da tim thay Ma Phong. Ban co chan chan Xoa khong (Y/N)");
////				String check = sc.nextLine(); 
////				if(check.compareToIgnoreCase("Y") == 0) { 
//					ListPhongHoc.remove(pro); 
//					return 1; 
////				}else
////					return 0;
//			}
//				
//		}
//		System.out.println("Khong Co Ma Phong Theo Yeu Cau");
//		return 0; 
//	}
	public int xoa(String p) {
		for (PhongHoc phongHoc : ListPhongHoc) {
			if(phongHoc.getMaPHong().compareToIgnoreCase(p)==0) {
				ListPhongHoc.remove(phongHoc);
				return 1;
			}
		}
		System.out.println("khong ton tai");
		return 0;
	}
	
	
	/// tong so phong 
	public int tongSoPhong() { 
		return ListPhongHoc.size(); 
	}
	
	// lay phong co 60 may 
	public String phongCo60May() { 
		String str = ""; 
		for(PhongHoc pro: ListPhongHoc) { 
			if(pro instanceof PhongMayTinh && ((PhongMayTinh)pro).getSoMay() == 60)
				str += pro + "\n"; 
		}
		return str; 
	}
	
}	
