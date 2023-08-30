package lesson_4;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		String tenchuxe, loaixe;
		float trigia, dungtich;
		Xe xe1 = new Xe("vuong ngoc hue", "yamaha", 45, 150);
		Xe xe2 = new Xe("nguyen van b", "ab", 50, 510);
		Xe xe3 = new Xe("nguyen van b", "sh", 150, 50);
		
		System.out.println("ten chu xe: ");
		tenchuxe = sc.toString();
		sc.nextLine();
		System.out.println("loai xe: ");
		loaixe = sc.toString();
		sc.nextLine();
		System.out.println("tri gia: ");
		trigia = sc.nextFloat();
		System.out.println("dung tich: ");
		dungtich = sc.nextFloat();
//		xe3.setChuXe(tenchuxe);
//		xe3.setLoaiXe(loaixe);
//		xe3.setDungTichXyLanh(dungtich);
//		xe3.setGiaXe(trigia);
//		
		System.out.println(String.format("%-20s %-20s %5s %20s %20s", "chuXe", "loaiX"
				+ "e", "giaXe", "dungTichXyLanh", "thuephainop"));
		System.out.println("---------------------------------------------------------");
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
	}
}
}
