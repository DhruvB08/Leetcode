import java.util.*;

public class InsertInterval{
	public static void main(String[] args){
		InsertInterval ii = new InsertInterval();
		List<Interval> list = new LinkedList<Interval>();
		Interval i1 = new Interval(1, 2);
		list.add(i1);
		Interval i2 = new Interval(3, 5);
		list.add(i2);
		Interval i3 = new Interval(6, 7);
		list.add(i3);
		Interval i4 = new Interval(8, 10);
		list.add(i4);
		Interval i5 = new Interval(12, 16);
		list.add(i5);

		System.out.println(list);
		System.out.println(ii.insert(list, new Interval(4, 9)));
	}

	public List<Interval> insert(List<Interval> intervals, Interval newInterval){
		List<Interval> result = new LinkedList<Interval>();
		int i = 0;

		//add all intervals already in list before new interval
		while(i<intervals.size() && intervals.get(i).end<newInterval.start){
			result.add(intervals.get(i));
			i++;
		}

		//merge overlapping intervals into one new interval
		while(i<intervals.size() && intervals.get(i).start<=newInterval.end){
			newInterval = new Interval(
						Math.min(newInterval.start, intervals.get(i).start),
						Math.max(newInterval.end, intervals.get(i).end));
			i++;
		}
		result.add(newInterval);

		//add rest of intervals
		while(i<intervals.size()){
			result.add(intervals.get(i));
			i++;
		}

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