import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {
    // File - a discrete container for data on a storage device.
    // Path - location of a file in the filesystem.

    // Relative Path - relative to the current working directory.

    // <script src="../js/weather/weather.js"></script>

    // Absolute Path - specified from the filesystem root.

    public static void main(String[] args) {
        // Path Interface - define an object that represents a path.

//        Paths class - contains static methods to obtain a filepath.
        // .get(String filename)
        // .get(String directory, String filename)
        // .get(String parentDirectory, String childDirectory, String filename)

        // All return a Path object that corresponds to the passed string(s).

        String directory = "data";
        String filename = "gods.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        System.out.println(dataDirectory);
        System.out.println(dataFile);

        try {
            // Files class - contains static methods to read, write, create, and delete files.
            // .exists(Path filepath) - checks whether or not the file exists.
            // .notExists(Path filepath)
            if(Files.notExists(dataDirectory)) {
                // create a new directory if the file does not exist.
                // .createDirectory(Path filepath)
                // .createDirectories(Path filepath)
                Files.createDirectory(dataDirectory);
            }

            if(!Files.exists(dataFile)) {
                // .createFile(Path filepath)
                Files.createFile(dataFile);
            }


            if(Files.exists(dataFile)) {
                // .write(Path filepath, List<String> list, StandardOpenOption.APPEND[optional])
                Files.write(dataFile, Arrays.asList("Zeus", "Hercules", "Aphrodite", "Poseidon", "Hephaestus", "Athena"));
                Files.write(dataFile, Arrays.asList("Hades", "Deimos", "Apollo"), StandardOpenOption.APPEND);
            }
        } catch(IOException iox) {
            iox.printStackTrace();
        }

        try {
            // Reading Files
            // Create a List of strings that represents the file data.

            List<String> gods = Files.readAllLines(dataFile);
            for(String god : gods) {
                System.out.println(god);
            }
            System.out.println(gods);


            // Create bucket to replace Hercules
//            List<String> bucket = new ArrayList<>();
//
//            for(String god : gods) {
//                if(god.equals("Hercules")) {
//                    // replace Hercules with Hera, then move to the next iteration.
//                    bucket.add("Hera");
//                    continue;
//                }
//                // copy all god strings to new list
//                bucket.add(god);
//            }

            // rewrite the file with the correct god list.
//            Files.write(dataFile, bucket);

            gods.remove("Hercules");
            gods.add(0, "Hera");

            Files.write(dataFile, gods);


        } catch(IOException iox) {
            iox.printStackTrace();
        }

    }



}