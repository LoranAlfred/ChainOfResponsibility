package classes;

import java.util.Arrays;
import java.util.List;


/**
 * This class represents the build engine.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class BuildEngine extends Engine {

    @Override
    protected List<String> getSupportedCommands () {
        return Arrays.asList ( "build", "buildwindow" );
    }

    @Override
    protected void executeCommand ( String command ) {
        switch ( command ) {
        case "build":
            buildProject (); // Müsste man implementieren
            break;
        case "buildwindow":
            showBuildWindow (); // Müsste man implementieren
            break;
        }
        System.out.println ( "Command executed: " + command );
    }
}
