package core.java.design.pattern.segment1.parellelstrem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ParellelStream2 {
    public static void main(String[] args) throws IOException
    {


        File fileName = new File("C:\\Users\\HP\\Desktop\\parrelellStream.txt");


        List<String> text = Files.readAllLines(fileName.toPath());


        text.parallelStream().forEach(System.out::println);
    }
}
