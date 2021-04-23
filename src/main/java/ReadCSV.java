import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {


    public static void main(String... args) {
        List<HomeOwners> homeOwners = readHomeOwnerFromCSV("src/main/resources/examples.csv");
        for (HomeOwners h : homeOwners) {
            System.out.println(h);
        }
    }

    public static List<HomeOwners> readHomeOwnerFromCSV(String fileName) {
        List<HomeOwners> homeOwners = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                HomeOwners homeOwner = createHomeowner(attributes);
                homeOwners.add(homeOwner);
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return homeOwners;
    }

    private static HomeOwners createHomeowner(String[] metadata) {


        String firstName= metadata[0];
        String title=metadata[0];
        String inital=metadata[0];
        String lastName=metadata[0];



        return new HomeOwners(title,firstName,inital,lastName);
    }


}

