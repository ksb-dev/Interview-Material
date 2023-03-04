public class RatInAMaze {

	public static void main(String[] args) {
		int[][] maze = {{1, 1, 0}, {0, 1, 0}, {1, 1, 1}};
		System.out.println(ratInAMaze(maze));
	}

	public static boolean ratInAMaze(int[][] maze) {
		int n = maze.length;
		int[][] path = new int[n][n];

		return solveMaze(maze, 0, 0, path);
	}

	public static boolean solveMaze(int[][] maze, int x, int y, int[][] path) {
		int n = maze.length;

		// 1. check x & y are valid or not

		if(x < 0 || x >= n || y < 0 || y >= n || maze[x][y] == 0 || path[x][y] == 1) {
			return false;
		}

		// 2. Include the cell in the current path

		path[x][y] = 1;

		// 3. Check for destination

		if(x == n - 1 && y == n - 1) {
			return true;
		}

		// 4. Explore further in all directions
		// check for TOP path

		if(solveMaze(maze, x - 1, y, path)) {
			return true;
		}

		// check for RIGHT path

		if(solveMaze(maze, x, y + 1, path)) {
			return true;
		}

		// check for BOTTOM path

		if(solveMaze(maze, x + 1, y, path)) {
			return true;
		}

		// check for LEFT path

		if(solveMaze(maze, x, y - 1, path)) {
			return true;
		}
		return false;
	}
}