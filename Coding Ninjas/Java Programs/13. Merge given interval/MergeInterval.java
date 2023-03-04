import java.util.*;

class Interval {
	int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

class Solution {

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval){

		if(intervals == null || intervals.size() == 0) {
		      return null;
		}

		for(int i = 0; i < intervals.size(); i++){

		    if(intervals.get(i).start > intervals.get(i).end){

			    int temp = intervals.get(i).start;
			    intervals.get(i).start = intervals.get(i).end;
			    intervals.get(i).end = temp;
			}

	    }

        Interval current = newInterval;                 // current = [2, 5]  current = [2, 7]

        int i = 0;

        while(i < intervals.size())                     // 0 < 2 = true      0 < 2 = true            1 < 2 = true
        {
            Interval in = intervals.get(i);             // in = [1, 3]       in = [1, 3]             in = [6, 8]

            if(in.end < current.start){                 // 3 < 2 = false     3 < 2 = false  8 < 2 = false

                i++;
            }
            else if(in.start > current.end){            // 1 > 5 = false     1 > 7 = false           6 > 7 = false

                intervals.add(i, current);
                break;
            }
            else{

                current.start = Math.min(in.start, current.start);   //  current.start = min(1, 2) = 1  current.start = min(1, 2) = 1   current.start = min(6, 1) = 1
                current.end = Math.max(in.end, current.end);         //  current.end = max(3, 5) = 5    current.end = max(3, 7) = 7     current.end = max(8, 7) = 8

                intervals.remove(i);                                 //  remove(i) = (0) = [1, 3];      remove(i) = (0) = [1, 3];       remove(i) = (1) = [6, 8];
            }
        }

        if(i == intervals.size()){
            intervals.add(current);
        }

        return intervals;
    }
}

public class MergeInterval{

	public static void main(String[] args){

		Solution s = new Solution();

		ArrayList<Interval> a = new ArrayList();

		a.add(new Interval(3, 1));
		a.add(new Interval(9, 6));

		System.out.println("Intervals before merging \n");

		for(int i = 0; i < a.size(); i++){

		      System.out.println("["+a.get(i).start+" "+a.get(i).end+"]");
        }

        System.out.println("\n Interval to be merged : [2 7]");

		ArrayList<Interval> result = s.insert(a, new Interval(2, 7));

		System.out.println("\n");

		System.out.println("Intervals after merging \n");

		for(int i = 0; i < result.size(); i++){

		      System.out.println("["+result.get(i).start+" "+result.get(i).end+"]");
        }
	}
}