public class SummedMatrix {
	public static void main(String[] args) {
		int n = 3;
		int q = 4;

		long total = 0;

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (i + j == q)
				{
					total++;
				}
			}
		}
        System.out.println(total);
	}
}