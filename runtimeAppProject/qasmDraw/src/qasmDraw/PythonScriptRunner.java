package qasmDraw;

import java.io.File;
import java.io.IOException;

public class PythonScriptRunner {
    static String scriptPath = "C:/Users/Riedler/Documents/Uni/SS2023/bachelor/runtime-EclipseApplication/qasmDraw/src/qasmDraw/qiskitPy.py";

    public static void main(String[] args) {
        int exitValue=runScript();
        if(exitValue!=1) System.out.println("Fehler bei Qasm Generation");
        else
        {
        	System.out.print("Build complete");
        }
    }

    public static int runScript() {
        ProcessBuilder pb = new ProcessBuilder("python", scriptPath);

        pb.directory(new File("C:/Users/Riedler/Documents/Uni/SS2023/bachelor/runtime-EclipseApplication/qasmDraw/src/qasmDraw/"));

        try 
        {
            Process p = pb.start();
            int exitValue=p.waitFor();
            return exitValue;
        } 
        catch(IOException | InterruptedException e) 
        {
            System.out.println("Error occurred: " + e.toString());
            return -1;
        }
    }
}
