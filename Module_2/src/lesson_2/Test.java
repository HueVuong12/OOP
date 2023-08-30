package lesson_2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int msv;
		float diemLt, diemTh;
		String hovaten;
		Scanner sc = new Scanner(System.in);
		SinhVien sv1 = new SinhVien(124, "Nguyen Van A", 7, 9);
		SinhVien sv2 = new SinhVien(653, "Nguyen Van b", 4, 8);
		SinhVien sv3 = new SinhVien(546, "Nguyen Van c", 8, 7);
		
		System.out.println("nhap mssv: ");
		msv = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap ho va ten: ");
		hovaten = sc.nextLine();
		System.out.println("diem li thuyet ");
		diemLt = sc.nextFloat();
		System.out.println("diem Thuc hanh ");
		diemTh = sc.nextFloat();
		
		sv3.setMaSoSinhVien(msv);
		sv3.setHoVaTen(hovaten);
		sv3.setDiemLt(diemLt);
		sv3.setDiemTh(diemTh);
		System.out.println(String.format("%-5s %-30s %10s %10s %10s", "masv", "hoten", "diemlt", "diemth", "diemtb"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
