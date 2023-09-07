package lesson_5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//LocalDate.now() hiện này hiện tại
		HangThucPham htp = new HangThucPham("001", "Gao", 100000, LocalDate.of(2018, 7, 10), LocalDate.of(2018, 7, 10));
		HangThucPham htp1 = new HangThucPham("002", "Mi", 500000, LocalDate.of(2018, 8, 1), LocalDate.of(2018, 9, 1));
		HangThucPham htp2 = new HangThucPham("003", "Nuoc", 500000, LocalDate.of(2019, 2, 10),LocalDate.of(2024, 2, 12));
		System.out.println(String.format("%-5s %-20s %1s %20s %20s %15s", "ma_hang", "ten_hang", "don_gia", "ngay_san_xuat",
				"ngay_het_han", "Ghi_chu"));
		System.out.println(htp);
		System.out.println(htp1);
		System.out.println(htp2);
//		System.out.println(df.format(htp.getDonGia()));
//		System.out.println(dtf.format(htp.getNgayHetHan()));
	}
}
