package hashSetExample;

public class Calısan {

	private String tcNo;
	private String isim;

	public Calısan() {

	}

	public Calısan(String tcNo, String isim) {
		this.tcNo = tcNo;
		this.isim = isim;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public int hashCode() {
		return Integer.valueOf(tcNo);
	}
	
	@Override
	public boolean equals(Object other) {
		Calısan calısan = (Calısan) other;
		return this.tcNo.equals(calısan.tcNo);
	}

	@Override
	public String toString() {
		return "TcNo: " + tcNo + ",Isim: " + isim;
	}
}
