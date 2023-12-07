package baiCK;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		QuanLyPhongHoc quanly = new QuanLyPhongHoc();
		quanly.khoiTao();

		Scanner sc = new Scanner(System.in); 	
		
			PhongHoc p1 = new PhongLyThuyet("001", "Nha B", 30, 3, true); 
			PhongHoc p2 = new PhongMayTinh("002", "Nha H", 40, 5, 15); 
			PhongHoc p3 = new PhongThucHanh("003", "Nha A", 50, 4, "Hoa Hoc", 30, false);
			PhongHoc p4 = new PhongThucHanh("004", "Nha B", 50, 3, "Hoa Hoc", 30, true); 
			PhongHoc p5 = new PhongMayTinh("005", "Nha F", 40, 5, 60);
			PhongHoc p6 = new PhongMayTinh("006", "Nha H", 40, 5, 60); 
			
			quanly.themPhongHoc(p1); 
			quanly.themPhongHoc(p2); 
			quanly.themPhongHoc(p3); 
			quanly.themPhongHoc(p4); 
			quanly.themPhongHoc(p5); 
			quanly.themPhongHoc(p6); 
			
			System.out.println("\nthong tin tat ca cac phong\n"+quanly.layRatTatCaThongTin());
			
			System.out.println("Nhap Ma Can Tim");
			String keytimkiem = sc.nextLine(); 
			quanly.timKiemTheoMaPhong(keytimkiem);
			
			System.out.println("cac phong dat chuan\n"+quanly.layRaTatCaPhongDatChuan());
			
			quanly.sapXepTangDanTheoDayNha();
			System.out.println("sap xep tang dan theo day nha\n"+quanly.layRatTatCaThongTin());
			
			quanly.sapXepGiamDanTheoDienTich(); 
			System.out.println("sap xep giam dan theo dien tich\n"+quanly.layRatTatCaThongTin());
			
			System.out.println("Nhap Ma Phong Can Cap Nhat: ");
			String keyMaCapNhat = sc.nextLine(); 
			System.out.println("Nhap So May: ");
			int keySoMay = sc.nextInt(); 
			quanly.capNhatSoMayTinhTheoMaPhong(keyMaCapNhat, keySoMay);
			
			System.out.println("Nhap Ma Phong Can Xoa: ");
			sc.nextLine();
			String keyXoa = sc.nextLine(); 
			quanly.xoa(keyXoa);
			System.out.println(quanly.layRatTatCaThongTin());

			System.out.println("tong so phong: "+quanly.tongSoPhong());

			System.out.println("\nphong co 60 may: "+quanly.phongCo60May());
		
	}
}
