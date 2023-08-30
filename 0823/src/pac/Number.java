package pac;
public class Number{
	private int pnum;
	
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	private void pmethod() {
		pnum = 10;
	}
	public int dnum;	//default
//	public int getDnum() {
//		return dnum;
//	}
//	public void setDnum(int data) {
//		dnum = data;
//	}
	public void dmethod() {
		System.out.println(pnum);
	}
	public int getDnum() {
		return dnum;
	}
	public void setDnum(int dnum) {
		this.dnum = dnum;
	}
	public int punum;
	public void pumethod() {
		System.out.println(pnum);
	}
	protected int prnum;
	protected void prmethod() {
		System.out.println(prnum);
	}
}