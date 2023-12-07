package gk;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Xuat danh sach");
		System.out.println("2. Thong ke tong gia sach trong danh sach");
		System.out.println("3. Sap xep theo tua sach");
		System.out.println("4. Tim kiem theo ma sach");
		System.out.println("5. Cap nhat gia mot cuon sach");
		System.out.println("6. Xoa mot cuon sach");
		System.out.println("7. Thoat chuong trinh.");
		System.out.print("Nhap lua chon cua ban: ");
		int opt = input.nextInt();
		return opt;
	}
	public static void main(String[] args) throws Exception {
		Sach[] sach = new Sach[10];
		DanhSachSach List = new DanhSachSach(10);
		try {
			sach[0] = new Sach(1111,"Naruto", 4000, LocalDate.of(2022,10,10), "Nguyen Hoai Nhan");
			sach[1] = new Sach(2222,"Naruto", 4000, LocalDate.of(2022,10,10), "Nguyen Hoai Nhan");
			sach[2] = new Sach(3333,"Naruto", 4000, LocalDate.of(2022,10,10), "Nguyen Hoai Nhan");
			sach[3] = new Sach(4444,"Naruto", 4000, LocalDate.of(2022,10,10), "Nguyen Hoai Nhan");
			sach[4] = new Sach(5555,"Naruto", 4000, LocalDate.of(2022,10,10), "Nguyen Hoai Nhan");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < 4; i++) {
		List.Add(sach[i]);
		}
		int opt = 0;
		while(opt != 7) {
			opt = menu();
			if(opt == 1) {
				System.out.println(String.format("%5s %-15s %10s %10s %-20s","Ma Sach", "Tua Sach", "Gia sach", "Ngay nhap", "Tac gia"));
				for(int i = 0; i < List.soLuong; i++) {
					System.out.println(List.DS[i].toString());
				}
			}
			if(opt == 2) {
				System.out.println("Tong gia gia sach trong mang: " + List.TongGiaTri());
			}
			if(opt == 3) {
				System.out.println("Danh sach sach sau khi sap xep: ");
				List.sapXepTheoTuaSach();
				System.out.println(String.format("%5s %-15s %10s %10s %-20s","Ma Sach", "Tua Sach", "Gia sach", "Ngay nhap", "Tac gia"));
				for(int i = 0; i < List.soLuong; i++) {
					System.out.println(List.DS[i].toString());
				}
			}
			if(opt == 4) {
				int maSach;
				System.out.print("Nhap ma sach can tim kiem: ");
				Scanner input = new Scanner(System.in);
				maSach = input.nextInt();
				if(List.TimKiemTheoMaSach(maSach) != -1) 
				System.out.println("Vi tri sach co ma " + maSach + " la : " + List.TimKiemTheoMaSach(maSach));
				else System.out.println("Khong tim thay sach co ma tuong ung.");
			}
			if(opt == 5) {
				int maSach;
				System.out.print("Nhap ma sach can cap nhat: ");
				Scanner input = new Scanner(System.in);
				maSach = input.nextInt();
				if(List.TimKiemTheoMaSach(maSach) == -1) {
					System.out.println("Khong tim thay sach co ma tuong ung.");
					continue;
				}
				System.out.print("Nhap gia sach thay moi: ");
				input = new Scanner(System.in);
				int giaSach = input.nextInt();
				List.SuaGiaSach(maSach, giaSach);
			}
			if(opt == 6) {
				int maSach;
				System.out.print("Nhap ma sach can xoa: ");
				Scanner input = new Scanner(System.in);
				maSach = input.nextInt();
				if(List.TimKiemTheoMaSach(maSach) == -1) {
					System.out.println("Khong tim thay sach co ma tuong ung.");
					continue;
				}
				List.remove(maSach);
			}
			if(opt == 7) {
				System.out.println("Dung chuong trinh.");
				break;
			}

		}
	}
}
