package lesson_4;

public class Xe {
	private String chuXe;
	private String loaiXe;
	private double giaXe;
	private float dungTichXyLanh;

	public Xe(String chuXe, String loaiXe, float giaXe, float dungTichXyLanh) {
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.giaXe = giaXe;
		this.dungTichXyLanh = dungTichXyLanh;
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public float getGiaXe() {
		return (float) giaXe;
	}

	public void setGiaXe(float giaXe) {
		if (giaXe >= 0) {
			this.giaXe = giaXe;
		} else {
			System.out.println("gia khong hop le");
		}
	}

	public float getDungTichXyLanh() {
		return dungTichXyLanh;
	}

	public void setDungTichXyLanh(float dungTichXyLanh) {
		if (dungTichXyLanh >= 0) {
			this.dungTichXyLanh = dungTichXyLanh;
		} else {
			this.dungTichXyLanh = 1;
		}
	}
	public double thuephainop(){
		 if(dungTichXyLanh <100){
			 return  (0.01 * giaXe);
		}
		 else if (dungTichXyLanh >=100 && dungTichXyLanh <= 200){
			 return (0.03 * giaXe);
		 }
		 else if (dungTichXyLanh >200) {
			 return (0.05 * giaXe);
		 }
		return dungTichXyLanh;
	}

	@Override
	public String toString() {
		return String.format("%-20s %-20s %5s %20s %20s", chuXe, loaiXe, giaXe, dungTichXyLanh, thuephainop());
	}
	
}
