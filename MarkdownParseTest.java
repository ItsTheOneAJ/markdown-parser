import static org.junit.Assert.*;

import java.nio.file.Files;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void test1() throws IOException{

        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of("https://something.com", "some-thing.html"));

        

        
        
    }
    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("testTwo.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of("https://google.com", "https://bing.com", "https://github.com/ItsTheOneAJ/cse15l-lab-reports"));
    }
    @Test
    public void test3() throws IOException{
        Path fileName = Path.of("testThree.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of());

    }
    @Test
    public void test4() throws IOException{
        Path fileName = Path.of("testFour.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of());
    }

    @Test
    public void test5() throws IOException{
        Path fileName = Path.of("test-FileTwo.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of("https://something.com", "some-page.html"));
    }
    @Test
    public void test6() throws IOException{
        Path fileName = Path.of("test-FileThree.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of());
    }
    @Test
    public void test7() throws IOException{
        Path fileName = Path.of("test-FileFour.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of());
    }
    @Test
    public void test8() throws IOException{
        Path fileName = Path.of("test-FileFive.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of("page.com"));
    }
    @Test
    public void test9() throws IOException{
        Path fileName = Path.of("test-FileSix.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of("page.com"));
    }
    @Test
    public void test10() throws IOException{
        Path fileName = Path.of("test-FileSeven.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of());
    }
    @Test
    public void test11() throws IOException{
        Path fileName = Path.of("test-FileEight.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of("a link on the first line"));
    }
}