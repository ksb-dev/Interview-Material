class TestHotelBooking{

	 public int testHotelBooking(int[] a, int[] b, int c){

		 int result = 0;
		 int count1 = 0;

		 for(int i = 0; i < a.length - 1; i++){

			 result = a[i + 1] - b[i];

			 if(result < 0){

				 count1++;
			 }
		 }

		 if(count1 == c){

			 return -1;
		 }
		 else{

			 return 1;
		 }
	 }
 }

 public class HotelBooking{

	 public static void main(String[] args){

		 TestHotelBooking t = new TestHotelBooking();

		 int[] a = {1, 3, 5, 7};
		 int[] b = {2, 6, 8, 9};
         int c = 2;

         int result = t.testHotelBooking(a, b, c);

         System.out.println(result);
	 }
 }