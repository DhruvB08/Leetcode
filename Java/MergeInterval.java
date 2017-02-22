import java.util.*;

public class MergeInterval{
	public static void main(String[] args){
		MergeInterval mi = new MergeInterval();
		List<Interval> list = new LinkedList<Interval>();
		Interval i1 = new Interval(1, 3);
		Interval i2 = new Interval(2, 6);
		Interval i3 = new Interval(8, 10);
		Interval i4 = new Interval(15, 18);
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);

		System.out.println(list);
		System.out.println(mi.merge(list));
	}

	public List<Interval> merge(List<Interval> intervals){
		if(intervals.size() <= 1){
			return intervals;
		}

		intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));

		List<Interval> result = new LinkedList<Interval>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).start;

		for(Interval interval : intervals){
			//overlapping intervals, move end if needed
			if(interval.start <= end){
				end = Math.max(end, interval.end);
			} 

			//disjoint intervals, add previous interval and reset bounds to new interval
			else{
				result.add(new Interval(start, end));
				start = interval.start;
				end = interval.end;
			}
		}

		//add last interval
		result.add(new Interval(start, end));
		return result;
	}
}

class Interval{
	int start;
	int end;

	Interval(){
		start = 0;
		end = 0;
	}

	Interval(int s, int e){
		start = s;
		end = e;
	}
}