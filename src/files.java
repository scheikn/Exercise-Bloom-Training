import java.io.File;
import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.StandardOpenOption; 

public class files { 
    public static void main (String[] args) {
    
       Path filename = Path.of ("file.txt"); 
        String text = "newtesttext";
        String text2 = "Anhang1, Anhang2, XY";    
        try {
            //throw new IOException ("fehler1");
            Files.writeString (filename, text);
            String content = Files.readString (filename);
            System.out.println (content);
            Files.writeString (
                filename, 
                text2,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            );
            String contentnew = Files.readString (filename);
            System.out.println (contentnew);

        } catch (IOException e) {
            System.out.println ("could not write the file" + " " + e.getMessage ()); 

        }     
}
}