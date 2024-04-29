import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import sample.DateSorter;

public class Main {

    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = List.of(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)
        );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        System.out.println(sortedDates);
    }
}
