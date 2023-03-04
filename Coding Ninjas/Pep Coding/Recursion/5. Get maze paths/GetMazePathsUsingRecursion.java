import java.util.*;

public class GetMazePathsUsingRecursion {
	public static void main(String[] args) {
		int n = 3;
		int m = 3;

		ArrayList<String> list = getMazePaths(1, 1, n, m);

		System.out.println(list);
	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

		if (sr == dr && sc == dc) {
		      ArrayList< String> bres = new ArrayList< >();
		      bres.add("");
		      return bres;
        }

		ArrayList<String> hPaths = new ArrayList<>();
		ArrayList<String> vPaths = new ArrayList<>();

		if(sc < dc) {
			hPaths = getMazePaths(sr, sc + 1, dr, dc);
		}

		if(sr < dr) {
			vPaths = getMazePaths(sr + 1, sc, dr, dc);
		}

		ArrayList<String> paths = new ArrayList<>();

		for(String hPath : hPaths) {
			paths.add("h" + hPath);
		}

		for(String vPath : vPaths) {
			paths.add("v" + vPath);
		}

		return paths;
	}
}