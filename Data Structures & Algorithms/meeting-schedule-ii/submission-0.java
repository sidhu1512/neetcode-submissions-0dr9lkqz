/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        if(intervals.isEmpty() || intervals == null){
            return 0;
        }

        intervals.sort((a,b) -> Integer.compare(a.start ,b.start));

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(intervals.get(0).end);

        for(int i=1; i<intervals.size(); i++){
            int stime = intervals.get(i).start;
            int etime = intervals.get(i).end;

            int cEndTime = queue.peek();

            if(cEndTime <= stime){
                queue.poll();
            }
            queue.add(etime);
        }
        return queue.size();
    }
}
