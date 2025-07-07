package in.shivesh;

/**
https://leetcode.com/problems/design-underground-system/description/
An underground railway system is keeping track of customer travel times between different stations. They are using this data to calculate the average time it takes to travel from one station to another.

Implement the UndergroundSystem class:

void checkIn(int id, string stationName, int t)
A customer with a card ID equal to id, checks in at the station stationName at time t.
A customer can only be checked into one place at a time.
void checkOut(int id, string stationName, int t)
A customer with a card ID equal to id, checks out from the station stationName at time t.
double getAverageTime(string startStation, string endStation)
Returns the average time it takes to travel from startStation to endStation.
The average time is computed from all the previous traveling times from startStation to endStation that happened directly, meaning a check in at startStation followed by a check out from endStation.
The time it takes to travel from startStation to endStation may be different from the time it takes to travel from endStation to startStation.
There will be at least one customer that has traveled from startStation to endStation before getAverageTime is called.
*/
class UndergroundSystem {
 
    // count, sum
    Map<String, Integer[]> data;
    Map<Integer, Pair<String, Integer>> transit;

    public UndergroundSystem() {
        this.data = new HashMap();
        this.transit = new HashMap();
    }

    public void checkIn(int id, String stationName, int t) {
        Pair<String, Integer> p = new Pair(stationName, t);
        this.transit.put(id, p);
    }

    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> p = this.transit.remove(id);
        String key = p.getKey() + "-" + stationName;
        Integer start = p.getValue();
        Integer[] sdata = data.get(key);
        if (sdata == null) {
            sdata = new Integer[] { 1, t - start };
            data.put(key, sdata);
        } else {
            sdata[0] = sdata[0] + 1;
            sdata[1] = sdata[1] + (t - start);
        }
        System.out.println(id + "["+ start + "->" + t + "=" + (t - start) +"] : "+key+"="+sdata[1]+"@"+sdata[0]);
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation  + "-" + endStation;
        Integer[] sdata = data.get(key);
        return ((double)sdata[1])/((double)sdata[0]);
    }

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */

}
