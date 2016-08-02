package Week3.day4;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HatsMachine {

    public static void main(String[] args) {
        Hats hats = new Hats();
        Path myFilePath = Paths.get("GummyBears.json");
        ObjectMapper mapper = new ObjectMapper();
        readfile(hats,myFilePath,mapper);
        System.out.println("------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Want to change your order?  [YES/NO]");
        String changeOrder = scanner.nextLine();
        if(changeOrder.equalsIgnoreCase("yes")) {
            System.out.println("What color?");
            hats.setColor(scanner.nextLine());
            System.out.println("What weight?");
            hats.setWeight(scanner.nextLine());
            System.out.println("What Brand?");
            hats.setBrand(scanner.nextLine());
            writeFiles(hats,myFilePath,mapper);

            System.out.println("------------------------");
            System.out.println("This is what you wrote");
            readfile(hats,myFilePath,mapper);
        }
    }

    private static void readfile(Hats h, Path p, ObjectMapper m) {
        try {
            h = m.readValue(Files.newInputStream(p), Hats.class);
            System.out.println("COLOR: "+h.getColor());
            System.out.println("WEIGHT: "+h.getWeight());
            System.out.println("FLAVOR: "+h.getBrand());
        } catch (IOException e) {
            System.out.println("Files does not exist yet...");
        }
    }

    private static void writeFiles(Hats h, Path p, ObjectMapper m) {
        try {
            m.writeValue(Files.newOutputStream(p), h);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}