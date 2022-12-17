package ArrayCointainment;

public class TheatreMovieGS {
	int id, releaseyear;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Movie ID : "+getId()+"\t Name : "+getName()+"\t Release Year : "+getReleaseyear()+"\n";
	}
}
