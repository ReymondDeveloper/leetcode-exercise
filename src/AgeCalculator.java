import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

    public static int AgeCalculate(String formatDate){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDate = LocalDate.parse(formatDate, dateTimeFormatter );
        LocalDate currentDate = LocalDate.now();

        return Period.between(birthDate, currentDate).getYears();

    }
}
