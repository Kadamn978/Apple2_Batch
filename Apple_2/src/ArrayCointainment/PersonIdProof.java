package ArrayCointainment;

public class PersonIdProof {
	int validity;
	String idname;

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public String getIdname() {
		return idname;
	}

	public void setIdname(String idname) {
		this.idname = idname;
	}

	@Override
	public String toString() {
		return "Name : " + idname + "\t Validity : " + validity;
	}

}
