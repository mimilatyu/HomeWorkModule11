import java.util.*;

public class Main {
    public static void main(String[] args) {
        FootballPlayer fp1 = new FootballPlayer("Lukaku", "forward", 75);
        FootballPlayer fp2 = new FootballPlayer("Zidane", "midfielder", 74);
        FootballPlayer fp3 = new FootballPlayer("Ronaldo", "forward", 70);
        FootballPlayer fp4 = new FootballPlayer("Buffon", "goalkeeper", 80);
        FootballPlayer fp5 = new FootballPlayer("Lukaku", "forward", 75);
        FootballPlayer fp6 = new FootballPlayer("Ignashevich", "defender", 75);

        List<FootballPlayer> list = new ArrayList<>();
        list.add(fp1);
        list.add(fp2);
        list.add(fp3);
        list.add(fp4);
        list.add(fp5);
        list.add(fp6);

        for (FootballPlayer fp: list) {
         System.out.println(fp);
        } // пункт 1

        Set<FootballPlayer> playerSet = new HashSet<>(list);
        for(FootballPlayer fp: playerSet) {
            System.out.println(fp);
        } // пункт 2

        Set<FootballPlayer> anotherSet = new TreeSet<>(new playerComparator());
        anotherSet.addAll(list);
        for(FootballPlayer fp: anotherSet) {
            System.out.println(fp.getName());
        } // пункт 3

    }
}
