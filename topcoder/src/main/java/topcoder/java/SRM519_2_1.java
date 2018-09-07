package topcoder.java;

public class SRM519_2_1 {
    public String getDay(String[] notOnThisDay) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String all = "";
        for(String d : notOnThisDay) all += d;
        
        for(String s : days) {
            if(! all.contains(s)) return s;
        }
        return "";
    }
}
