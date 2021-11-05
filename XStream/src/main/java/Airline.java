import java.util.List;
import java.util.Objects;

public class Airline {

    private String name;
    private List<String> flights;

    public Airline(String name, List<String> flights) {
        this.name = name;
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFlights() {
        return flights;
    }

    public void setFlights(List<String> flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.equals(flights, airline.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flights);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flights=" + flights +
                '}';
    }
}
