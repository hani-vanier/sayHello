public class HelloSomething {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         // check if length of args array is
        // greater than 0
        if (args.length > 0) {
 
            for (String val : args)
                System.out.println(val);
        }


    }
    
}
