import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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
        try (BufferedReader br = Files.newBufferedReader(pathToFile)) {
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

    public   static HomeOwners createHomeowner(String[] metadata) {
        String data = metadata[0];

        String[] splitData = data.split("\\s+");
        System.out.println(Arrays.toString(splitData));
        System.out.println(splitData.length);

        Set<String> specialCases = new HashSet<String>();
        specialCases.add("Dr");
        specialCases.add("Prof");
        specialCases.add("Sir");
        specialCases.add("Madam");
        if (splitData.length == 1) {
            return null;
        } else if (splitData.length == 3 && splitData[1] != "and" && splitData[1].length() > 2) {
            String title1 = splitData[0];
            String firstName1 = splitData[1];
            String lastName1 = splitData[2];
            String initial1 = null;


            return new HomeOwners(title1, firstName1, lastName1, initial1);

        } else if (splitData.length == 3 && splitData[1] != "and" && splitData[1].length() <= 2) {
            String title1 = splitData[0];
            String firstName1 = null;
            String lastName1 = splitData[2];
            String initial1 = splitData[1];


            return new HomeOwners(title1, firstName1, lastName1, initial1);
        } else if(splitData.length==4){
            String title1=splitData[0];
            String title2=splitData[2];
            String firstName1=null;
            String firstName2=null;
            String lastName2=null;
            String initial1=null;
            String initial2=null;
            String lastName1=splitData[3];
            return  new HomeOwners(title1,firstName1,lastName1,initial1,title2,firstName2,lastName2,initial2);
        }
        else if(splitData.length==5){
            String title1=splitData[0];
            String title2=splitData[2];
            String firstName1=splitData[3];
            String lastName1=splitData[4];
            String initial1=null;
            String firstName2=null;
            String lastName2=null;
            String initial2=null;
            return  new HomeOwners(title1,firstName1,lastName1,initial1,title2,firstName2,lastName2,initial2);

        }
        else if(splitData.length==7){
            String title1=splitData[0];
            String title2=splitData[4];
            String firstName1=splitData[1];
            String lastName1=splitData[2];
            String initial1=null;
            String firstName2=splitData[5];
            String lastName2=splitData[6];
            String initial2=null;
            return  new HomeOwners(title1,firstName1,lastName1,initial1,title2,firstName2,lastName2,initial2);

        }



        else {
            return null;
        }


    }




}

