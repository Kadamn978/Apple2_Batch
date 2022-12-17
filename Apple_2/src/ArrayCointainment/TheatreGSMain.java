package ArrayCointainment;

import java.util.Scanner;

public class TheatreGSMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No Of Theatre");

		int size = sc.nextInt();
		TheatreGS th[] = new TheatreGS[size];

		for (int i = 0; i < th.length; i++) {
			System.out.println("Enter Theatre Details ID Name");
			int id = sc.nextInt();
			String name = sc.next();

			System.out.println("Enter No Of Movies");
			int dsize = sc.nextInt();
			TheatreMovieGS m[] = new TheatreMovieGS[dsize];

			for (int j = 0; j < m.length; j++) {
				System.out.println("Enter Movie Details: ID, Name, Release Year");
				int mid = sc.nextInt();
				String mname = sc.next();
				int releaseyear = sc.nextInt();
				TheatreMovieGS m1 = new TheatreMovieGS();
				m1.setId(mid);
				m1.setName(mname);
				m1.setReleaseyear(releaseyear);
				m[j] = m1;

			}

			TheatreGS th1 = new TheatreGS();
			th1.setId(id);
			th1.setName(name);
			th1.setM(m);

			th[i] = th1;
		}

		for (TheatreGS t : th) {

			System.out.println(t.getId() + " " + t.getName());
//		Class_name Array_Variable_Name : (OuterForLoop) Array_Variable_Name.Array_Variable_Name(inMethod)
//	TheatreMovieGS  variable_name(movie) : (OuterForLoop)variable_name.TheatreGS(TheatreMovieGS) variable_name(m) 
			for (TheatreMovieGS movie : t.m) {

				if (movie.releaseyear == 2020) {
					System.out.println(movie.getId() + " " + movie.getName() + " " + movie.getReleaseyear());
				}

			}
		}

		sc.close();

	}

}
