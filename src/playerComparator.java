import java.util.Comparator;

public class playerComparator implements Comparator<FootballPlayer> {

    @Override
    public int compare(FootballPlayer player1, FootballPlayer player2) {
        return player1.getName().compareTo(player2.getName());
    }

}
