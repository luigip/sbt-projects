package topcoder.java;

import java.util.ArrayList;

public class SRM419_2_2 {
    public static String getText(String[] commands, int[] time) {

        ArrayList<Command> t = new ArrayList<Command>();
        for(int i = 0; i < commands.length; i++) {
            Command c = new Command(time[i], commands[i]);
            if (c.cmds[0].equals("type")) {
                String m = t.isEmpty() ?  "" : t.get(t.size() - 1).message;
                c.message = m + c.cmds[1];
            } else {
                int back = c.time - Integer.parseInt(c.cmds[1]);
                int j = t.size() - 1;
                while (j >= 0 && t.get(j).time >= back) j--;
                c.message = j < 0 ? "" : t.get(j).message;
            }
            t.add(c);
        }
        return t.get(t.size() -1).message;
    }
    

}
class Command {
    Command(int t, String c) {
        time = t; command = c;
        cmds = c.split(" ");
    }
    int time;
    String command;
    String[] cmds;
    String message = "";
}