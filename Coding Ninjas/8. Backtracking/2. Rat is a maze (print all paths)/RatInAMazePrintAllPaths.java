public class RatInAMazePrintAllPaths {

	public static void main(String[] args) {
		int[][] maze = {{1, 1, 0}, {1, 1, 0}, {1, 1, 1}};
		ratInAMaze(maze);
	}

	public static void ratInAMaze(int[][] maze) {
		int n = maze.length;
		int[][] path = new int[n][n];

		printAllPaths(maze, 0, 0, path);
	}

	public static void printAllPaths(int[][] maze, int x, int y, int[][] path) {
		int n = maze.length;

		// 1. check x & y are valid or not

		if(x < 0 || x >= n || y < 0 || y >= n || maze[x][y] == 0 || path[x][y] == 1) {
			return;
		}

		// 2. Include the cell in the current path

		path[x][y] = 1;

		// 3. Check for destination

		if(x == n - 1 && y == n - 1) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(path[i][j]+" ");
				}
			}
			System.out.println();
			path[x][y] = 0;
			return;
		}

		// 4. Explore further in all directions
		// check for TOP path

		printAllPaths(maze, x - 1, y, path);

		// check for RIGHT path

		printAllPaths(maze, x, y + 1, path);

		// check for BOTTOM path

		printAllPaths(maze, x + 1, y, path);

		// check for LEFT path

		printAllPaths(maze, x, y - 1, path);

		path[x][y] = 0;
	}
}