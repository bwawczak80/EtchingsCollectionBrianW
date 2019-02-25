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

        addToList(new ListData("The Back of the Napkin", "Dan Roam", "Business and Finance", "The author not only points out the importance " +
                "of visual thinking, but shows how even the most complex problems can be broken down and solved using simple drawing. "));

        addToList(new ListData("Gray Hat Python", "Justin Seitz", "Computers and programming", "Python programming for hackers and reverse engineers.  " +
                "Learn to automate reversing and security tasks, as well as program debuggers and fuzzers from scratch."));

        addToList(new ListData("Murach's JavaScript and JQuery 3rd Edition", "Mary Delamater", "Computers and programming", "Learn JavaScript, " +
                "from the essentials to mastering advanced skills.  Walk through 50 complete applications."  ));

        addToList(new ListData("On the Origin of Species", "Charles Darwin", "Science", "Considered to be the foundation of evolutionary biology,\"On the Origin of Species\"" +
                " is Charles Darwin's magnum opus."));

        addToList(new ListData("Ordinary People, Extraordinary Wealth", "Ric Edelman", "Business and Finance",
                "The 8 secrets of how 5,000 ordinary Americans became succesfull investors and how you can too."));

        addToList(new ListData("Mutual Funds for Dummies", "Eric Tyson", "Business and Finance",
                "Learn how to pick the best funds and avoid loser, assemble and maintain a portfolio, select the best stock funds for growth, " +
                        "and choose bond and money funds."));

        addToList(new ListData("The Total Money Makeover", "Dave Ramsey", "Business and Finance",
                "This is not a get rich quick scheme.  This is a simple and straightforward plan to completely make over " +
                        "your money and spending habits."));

        addToList(new ListData("The Prince", "Niccolo Machiavelli", "Political Science",
                "Written in 1514, \"The Prince\" was a pioneer of political science texts" +
                        "and was conceived as a treatise in the manner of Aristotle on the acquisition and maintenance of political power."));

        addToList(new ListData("The Automatic Millionaire Homeowner", "David Bach", "Business and Finance",
                "A lifetime plan to finish rich in real estate.  David Bach shows that buying a home and investment properties" +
                        "is not only possible, it is still the surest way to reach your seven figure dreams on an ordinary income."));

        addToList(new ListData("Secrets of the Millionaire Mind", "T. Harv Eker", "Business and Finance",
                "In this life changing book, you will learn how to identify and revise your own money blueprint to dramatically" +
                        "increase your income and accumulate wealth."));

        addToList(new ListData("Rich Dad Poor Dad", "Robert Kiyosaki", "Business and Finance",
                "Explode the myth that you need to earn a high income to become rich.  Challenge the belief that your house is an asset." +
                        "Show parents why they can't rely on the school system to teach their kids about money."));

        addToList(new ListData("101 Weird Ways to Make Money", "Steve Gillman", "Business and Finance",
                "Using interview with unconventional entrepreneurs, the author's own wide-ranging experience with weird jobs, and extensive research," +
                        "\"101 Weird Ways to Make Money\" reveals fun, sometimes dirty, occasionally dangerous, yet always incredibly profitable jobs and businesses."));

        addToList(new ListData("The Millionaire Next Door", "Thomas J Stanley, and William D Danko", "Business and Finance",
                "The never before told story about wealth in America.  The implication of \"The Millionaire Next Door\"" +
                        "is that nearly anybody with a steady job can amass a tidy fortune."));

        addToList(new ListData("Long Walk to Freedom, The Autobiography of Nelson Mandela", "Nelson mandela", "Biography",
                "\"Long Walk to Freedom\" is Nelson Mandela's moving and exhilarating autobiography, a book destined to take its place" +
                        "among the finest memoirs of history's greatest figures."));

        addToList(new ListData("Benjamin Franklin, An American Life", "Walter Isaacson", "Biography",
                "Benjamin Franklon was an ambitious urban entrepreneur who rose up the social ladder, from leather-aproned shopkeeper to dining with kings," +
                        "he seems make of flesh rather than marble.  In this full-scale biography, we discover why Franklin seems to turn to us from history's " +
                        "stage with eyes that twinkle from behind new-fangled spectacles.  Isaacson shows how Franklin helped to define both his own time and ours."));

        addToList(new ListData("Steve Jobs", "Walter Isaacson", "Biography",
                "Based on more than forty interviews with Jobs conducted over two years, as well as interview with more than " +
                        "a hundred family members, friends, adversaries, competitors, and colleagues, Walter Isaacson has written a riveting story of the roller-coasterlife and searingly" +
                        "intense personality of a creative entrepreneur."));


        addToList(new ListData("The FountainHead", "Ayn Rand", "Fiction", "This book is based on a challenging belief in the " +
                "importance of selfishness, on the provocative idea that man's ego is the fountainhead of human progress.  "));

        addToList(new ListData("A Universe From Nothing", "Lawrence M Krauss", "Science and Biology",
                "Krauss describes the staggeringly beautiful experimental observations and mind-bending new theories that demonstarte" +
                        "not only can something arise from nothing, something will always arise from nothing,"));
        addToList(new ListData("Catch-22", "Joseph Heller", "Fiction", "Set in " +
                "the closing months of World War II in an American bomber squadron off the coast of Italy, \"Catch-22\" is the story" +
                " of a bombardier name Yossarian who is frantic and furious because thousands of people he has never even met keep trying " +
                "to kill him.  "));
        addToList(new ListData("The Hitchhikers Guide to the Galazy", "Douglas Adams", "Fiction",
                "Arthur Dent (Martin Freeman) is trying to prevent his house from being bulldozed when his friend Ford Prefect (Mos Def) whisks him into outer space." +
                        " It turns out Ford is an alien who has just saved Arthur from Earth's total annihilation. Ford introduces Arthur to his myriad friends, including many-headed President" +
                        " Zaphod Beeblebrox (Sam Rockwell) and sexy refugee Trillian (Zooey Deschanel). Arthur makes his way across the stars while seeking the meaning of life, or something close to it."));
        addToList(new ListData("Disgrace", "J.M. Coetzee", "Fiction", "At fifty-two, Professor David Lurie is divorced, filled with desire, but lacking in passion.  " +
                "When an affair with a student leaves him jobless, shunned by friends, and ridiculed by his ex-wife, he retreats to his daughter Lucy's smallholding." +
                "David's visit becomes an extended stay as he attempts to find meaning in his one remaining relationship.  Instead, an incident of unimaginable terror and violence forces father and daughter to confront" +
                "their strained relationship, and the equally complicated racial complexities of the new South Africa."));
        addToList(new ListData("The Kite Runner", "Khaled Hosseini", "Fiction", "The Kite Runner tells the story of " +
                "fierce crueelty and fierce yet redeeming love.  Both transform the life of Amir, Khaled Hosseini's privileged young narrator who comes of age during the last peaceful days of the monarchy, just before his" +
                "country's revolution and its invasion by Russian forces. "));
        addToList(new ListData("Thomas Jefferson", "Christopher Hitchens", "Biography", "In this unique Biography, Hitchens offers a new and provacative interpretation of our Founding Father." +
                "A man conflicted by power who wrote the Declaration of Independance and acted as ambassador to France yet yearned for a quieter career in the Virginia legislature."));
        addToList(new ListData("Ther Reproductive Husbandry of Pythons and Boas", "Richard A Ross", "Science and Biology",
                "The Reproductive Husbandry of Pythons and Boas is the first reptile textbook to integrage the data accumulated" +
                        "by professional and amateur herptologists in reptile husbandry with research of in the reproductive physiology of reptiles.  The result of ten years of research conducted by the Institute for Herpetological Research," +
                        " this book is the most comprehensive guid to maintaining and breeding reptiles in captivity available."));
        addToList(new ListData("The God Delusion", "Richard Dawkins", "Science and Biology", "With rigor and wit, Dawkins examines God in all his forms, from the sex-obsessed tyrant of the" +
                " Old Testament to the more benign (but still illogical) Celestial Watchmaker favored by some Enlightenment thinkers. He eviscerates the major arguments for religion and demonstrates the supreme improbability of a supreme being. " +
                "He shows how religion fuels war, foments bigotry, and abuses children, buttressing his points with historical and contemporary evidence. The God Delusion makes a compelling case that belief in God is not just wrong but potentially deadly. " +
                "It also offers exhilarating insight into the advantages of atheism to the individual and society, not the least of which is a clearer, truer appreciation of the universe's wonders than any faith could ever muster."));
        addToList(new ListData("Freakonomics", "Steven D. Levitt and Stephen J. Dubner", "Business and Finance", "Which is more dangerous, a gun or a swimming pool? " +
                "What do schoolteachers and sumo wrestlers have in common?  Why do drug dealers still live with their moms?  In Freakonomics the authors set out to explore the hidden side of everything.  From the inner workings of a crack gang, to the truth " +
                "about real estate agents, Levitt and Dubner show that economics is, at root, the study of incentives, and how people get what they want or need."));
        addToList(new ListData("The Greatest Show on Earth", "Richard Dawkins", "Science and Biology", "Intelligent Design\" is being taught in our schools; educators are being asked to \"teach the controversy\" " +
                "behind evolutionary theory. There is no controversy. Dawkins sifts through rich layers of scientific evidence—from living examples of natural selection to clues in the fossil record; from natural clocks that mark the vast epochs wherein evolution ran " +
                "its course to the intricacies of developing embryos; from plate tectonics to molecular genetics—to make the airtight case that \"we find ourselves perched on one tiny twig in the midst of a blossoming and flourishing tree of life and it is no accident," +
                " but the direct consequence of evolution by non-random selection.\""));


    }
    private static void addToList(ListData item) {
        dataItemList.add(item);
        dataItemMap.put(item.getBookTitle(), item);
    }

}
