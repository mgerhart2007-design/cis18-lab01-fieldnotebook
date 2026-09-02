import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NotebookQueries {

    // C1 sum(s.count for s in sightings)
    public static int totalOrganisms(FieldNotebook nb){
        return nb.getSightings().stream().mapToInt(Sighting::getCount).sum();
    }
    //C2 sorted({s.species for s in sightings})
    public static List<String> speciesSeen(FieldNotebook nb) {
        return nb.getSightings().stream().map(Sighting::getSpecies).distinct().sorted().toList();
    }

    //C3 [s for s in sightings if s.count > n]
    public static List<Sighting> sightingsOver(FieldNotebook nb, int n) {
        return nb.getSightings().stream().filter(sighting -> sighting.getCount() > n ).toList();
    }

    //C4 max(totals, key=totals.get)
    public static String busiestSpecies(FieldNotebook nb){
        return nb.getSightings().stream().collect(Collectors.groupingBy(
                Sighting::getSpecies,
                Collectors.summingInt(Sighting::getCount)
        )).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    //C5", ".join(s.species for s in sightings)
    public static String sightingListAsString(FieldNotebook nb){
        return nb.getSightings().stream().map(Sighting::getSpecies).collect(Collectors.joining(", "));
    }
    //C6 return a Map<String, List<Sighting>> grouping every sighting by the month it was recorded in.
    public static Map<String, List<Sighting>> groupByMonth(FieldNotebook nb) {
        return nb.getSightings().stream().collect(Collectors.groupingBy(
                sighting -> sighting.getWhen().getMonth().toString()
        ));
    }
}


