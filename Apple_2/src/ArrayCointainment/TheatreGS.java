package ArrayCointainment;

import java.util.Arrays;

public class TheatreGS {
	int id;
	String name;
	TheatreMovieGS m[];

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TheatreMovieGS[] getM() {
		return m;
	}

	public void setM(TheatreMovieGS[] m) {
		this.m = m;
	}

	public String toString() {
		return "Theatre ID : " + getId() + "\t Name : " + getName() + "\n Movies : \n" + Arrays.toString(m);
	}

}
