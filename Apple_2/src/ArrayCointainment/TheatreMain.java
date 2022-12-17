package ArrayCointainment;

import java.util.Scanner;

public class TheatreMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No Of Theatre");

		int size = sc.nextInt();
		Theatre th[] = new Theatre[size];

		for (int i = 0; i < th.length; i++) {
			System.out.println("Enter Theatre Details ID Name");
			int id = sc.nextInt();
			String name = sc.next();

			System.out.println("Enter No Of Movies");
			int dsize = sc.nextInt();
			TheatreMovie m[] = new TheatreMovie[dsize];

			for (int j = 0; j < m.length; j++) {
				System.out.println("Enter Movie Details: ID, Name, Release Year");
				int mid = sc.nextInt();
				String mname = sc.next();
				int releaseyear = sc.nextInt();
				m[j] = new TheatreMovie(mid, mname, releaseyear);
			}
			th[i] = new Theatre(id, name, m);
		}

		for (Theatre t : th) {
			System.out.println(t);

			for (TheatreMovie movie : t.m) {
				if (movie.releaseyear == 2020) {
					System.out.println(movie.name + " " + movie.id + " " + movie.releaseyear);
				}
			}
		}

		sc.close();

	}

}
