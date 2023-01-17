package helloworld;import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HelloName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

      // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using reaAsdLine
        String name = reader.readLine();
        
        System.out.println("Hello " + name);  // Output user input
    }
    
}
