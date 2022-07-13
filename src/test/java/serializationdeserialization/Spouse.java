package serializationdeserialization;

public class Spouse {

	String Sname;
	String Scomp;
	int[] Sphone;
	public Spouse(String sname, String scomp, int[] sphone) {
		super();
		Sname = sname;
		Scomp = scomp;
		Sphone = sphone;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getScomp() {
		return Scomp;
	}
	public void setScomp(String scomp) {
		Scomp = scomp;
	}
	public int[] getSphone() {
		return Sphone;
	}
	public void setSphone(int[] sphone) {
		Sphone = sphone;
	}
	

}
