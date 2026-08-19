class Solution {
    public int findClosest(int x, int y, int z) {
        int d1 = Math.abs(x - z); // distance from Person 1 to Person 3
        int d2 = Math.abs(y - z); // distance from Person 2 to Person 3
        if (d1 < d2) return 1;    // Person 1 is closer
        else if (d2 < d1) return 2;    // Person 2 is closer
        else return 0;                  // both are equally close
    }
}