package ArrayCointainment;

public class TheatreMovie {
	int id,releaseyear;
	String name;
	
	
	public TheatreMovie(int id,String name,int releaseyear) {
		this.id=id;
		this.name=name;
		this.releaseyear=releaseyear;
	}
	
	public String toString() {
		return "Movie ID : "+id+"\t Name : "+name+" Release Year : "+releaseyear+"\n";
	}

}
