package net.wawczak.brian.etchingscollectionassignmentbrianw.DataPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BookData {
    public static List<ListData> dataItemList;
    public static Map<String, ListData> dataItemMap;

    static {
        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();

        addToList(new ListData("Washington", "Ron Chernow", "Biography", "A more in depth account of Washington's life has never been written.  Chernow carries" +
                "readers from Washington's boyhood, through the French and Indian War, his error fraught leading of the Continental Army, and into his time as America's first president." ));

        addToList(new ListData("Automate the Boring Stuff With Python", "Al Sweigart", "Computers and programming", "Use Python to complete " +
                "common tasks such as searching the web and downloading content, or send emails and notifications."));

        addToList(new ListData("The Back of the Napkin", "Dan Roam", "Problem Solving and Self Help", "The author not only points out the importance " +
                "of visual thinking, but shows how even the most complex problems can be broken down and solved using simple drawing. "));

        addToList(new ListData("Gray Hat Python", "Justin Seitz", "Computers and programming", "Python programming for hackers and reverse engineers.  " +
                "Learn to automate reversing and security tasks, as well as program debuggers and fuzzers from scratch."));

        addToList(new ListData("Murach's JavaScript and JQuery 3rd Edition", "Mary Delamater", "Computers and programming", "Learn JavaScript, " +
                "from the essentials to mastering advanced skills.  Walk through 50 complete applications."  ));

        addToList(new ListData("On the Origin of Species", "Charles Darwin", "Science", "Considered to be the foundation of evolutionary biology,\"On the Origin of Species\"" +
                " is Charles Darwin's magnum opus."));





    }
    private static void addToList(ListData item) {
        dataItemList.add(item);
        dataItemMap.put(item.getBookTitle(), item);
    }

}
