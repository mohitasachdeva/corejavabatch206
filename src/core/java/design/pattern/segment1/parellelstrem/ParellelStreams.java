package core.java.design.pattern.segment1.parellelstrem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ParellelStreams {
    public static void main(String[] args) throws IOException {


        File fileName = new File("C:\\Users\\HP\\Desktop\\parrelellStream.txt");


        Stream<String> text = Files.lines(fileName.toPath());

            text.parallel().forEach(System.out::println);


        text.close();
    }
}
