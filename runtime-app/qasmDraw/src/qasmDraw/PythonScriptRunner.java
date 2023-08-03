package qasmDraw;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class PythonScriptRunner {
    static String scriptPath = "C:/Users/Riedler/Documents/Uni/SS2023/bachelor/runtime-EclipseApplication/qasmDraw/src/qasmDraw/qiskitPy.py";

    public static void main(String[] args) {
        String exitValue = runScript();
        if (!exitValue.equals("0")) {
            System.out.println("Fehler bei Qasm Generation.");
        } else {
            System.out.print("Build complete");
        }
    }

    public static String runScript() {
        ProcessBuilder pb = new ProcessBuilder("python", scriptPath);

        pb.directory(new File("C:/Users/Riedler/Documents/Uni/SS2023/bachelor/runtime-EclipseApplication/qasmDraw/src/qasmDraw/"));
        pb.redirectErrorStream(true);

        try {
            Process p = pb.start();
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = p.waitFor();
            return String.valueOf(exitCode);
        } catch (IOException | InterruptedException e) {
            return e.toString();
        }
    }
}
