class Solution {
    public double angleClock(int hour, int minutes) {
 double hangle=30*hour+0.5*minutes;
double mangle=6*minutes;
 double angle=Math.abs(hangle-mangle);
     return Math.min(angle,360-angle);
    } 
}
