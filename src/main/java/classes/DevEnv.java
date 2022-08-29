package classes;

import interfaces.Command;


/**
 * This class represents the development environment.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class DevEnv {

    private Command firstEngine;

    /**
     * Constructor.
     *
     * @since 1.0
     */
    public DevEnv () {
        firstEngine = new BuildEngine ();
        DebugEngine debugEngine = new DebugEngine ();
        firstEngine.nextCommand ( debugEngine );
    }

    /**
     * Handles the given command.
     *
     * @param commandText The command text to set.
     * @since 1.0
     */
    public void commandInputHandler ( String commandText ) {
        firstEngine.processCommand ( commandText );
    }
}
