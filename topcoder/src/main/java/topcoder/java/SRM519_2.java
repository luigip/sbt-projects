package topcoder.java;

import java.util.*;

/*
 * Currently doesn't work!
 */

public class SRM519_2 {
    public int shortestDistance(int xMe, int yMe, int xHome, int yHome, String[] teleports) {
        return (int)s2( xMe,  yMe,  xHome,  yHome,  teleports, Integer.MAX_VALUE, 0);

    }
    
    long s2(long xMe, long yMe, long xHome, long yHome, String[] teleports, long best, long total) {
        List<Teleport> ts = new ArrayList<Teleport>();
        long nx = xMe, ny = yMe;
        long subtot = 0;
        
        for(String s: teleports) {
            ts.add(new Teleport(s));
        }
        
        long time = Math.abs(xMe - xHome) + Math.abs(yMe - yHome);
        
        for (Teleport t: ts ) {
            long a1 = Math.abs(xMe - t.x1) + Math.abs(yMe - t.y1);
            long a2 = Math.abs(xHome - t.x2) + Math.abs(yHome - t.y2);
            long at = a1 + a2 + 10;
            if(at < time){
                time = at;
                nx = t.x2; ny = t.y2;
                subtot = a1 + 10;
            }
            
            long b1 = Math.abs(xMe - t.x2) + Math.abs(yMe - t.y2);
            long b2 = Math.abs(xHome - t.x1) + Math.abs(yHome - t.y1);
            long bt = b1 + b2 + 10;
            if(bt < time) {
                time = bt;
                nx = t.x1; ny = t.y1;     
                subtot = b1 + 10;
            }       
        }

        if(best > total + subtot){
            best = total + subtot;
            return (total + s2(nx, ny, xHome, yHome, teleports, best, total + subtot));
        }
        else return (int)best;
    }
    
    class Teleport {
        int x1, y1, x2, y2;
        
        Teleport(String s) {
            String[] ts = s.split(" ");
            x1 = Integer.valueOf(ts[0]);
            y1 = Integer.valueOf(ts[1]);
            x2 = Integer.valueOf(ts[2]);
            y2 = Integer.valueOf(ts[3]);
        }
    }
    
}
