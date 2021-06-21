import java.util.Objects;

public class FootballPlayer {
    private String name;
    private String position;
    private double weight;

    public FootballPlayer(String name, String position, double weight) {
        if(name==null || position==null || weight<=0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.position = position;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballPlayer that = (FootballPlayer) o;
        return name.equals(that.name) && position.equals(that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }


}
