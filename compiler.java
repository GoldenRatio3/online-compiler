import javax.tools.*;

class compiler {
  public static void main(String[] args) {
    // TODO: Implement
    String file = "example.java";
    // compile program
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    int result = compiler.run(null, null, null, file);
    // print result (successful output or error code)
    if (result == 0) {
      System.out.println("Compilation successful");
    } else {
      System.out.println("Compilation failed");
    }
  }
}


