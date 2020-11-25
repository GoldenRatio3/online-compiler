import javax.tools.*;
import java.io.*;

class compiler {
  public static void main(String[] args) throws IOException, InterruptedException {
    String file = (args.length > 0) ? args[0] : "example.java";
    String line;
    // compile program
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    int result = compiler.run(null, null, null, file);
    // print result (successful output or error code)
    if (result == 0) {
      System.out.println("Compilation successful");
      // If successful, run program
      String[] command = {"java", "example"};
      ProcessBuilder builder = new ProcessBuilder(command);
      builder.inheritIO(); // redirects output to console
      Process p =  builder.start();
    } else {
      System.out.println("Compilation failed");
    }
  }
}


