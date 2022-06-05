import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ExtractDates {

    public static void DateExtraction(String regex) {
        Pattern pattern = Pattern.compile(regex);
        String line;
        int flag = 0;
        try {

            String location = "date.txt";
            BufferedReader lineReader = new BufferedReader(new FileReader(location));


            while ((line = lineReader.readLine()) != null) {

                Matcher matchPattern = pattern.matcher(line);

                while(matchPattern.find()) {

                    System.out.println(matchPattern.group());
                    flag = 1;
                }
            }

            if(flag == 0) {

                System.out.println("The file does not contain dates.");
            }
            lineReader.close();
        }
        catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String regex = "(0?[1-9]|[12][0-9]|3[01])[/|-](0?[1-9]|1[0-2])[/|-][0-9]{4}";
        DateExtraction(regex);
    }
}