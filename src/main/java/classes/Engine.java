package classes;

import interfaces.Command;

import java.util.List;


/**
 * This abstract class represents an engine.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public abstract class Engine implements Command {

    private Command nextCommand;

    /**
     * Returns the supported commands.
     *
     * @return The supported commands.
     * @since 1.0
     */
    abstract protected List<String> getSupportedCommands ();

    /**
     * Executed the given command.
     *
     * @param command The command to set.
     * @since 1.0
     */
    abstract protected void executeCommand ( String command );

    @Override
    public void processCommand ( String commandText ) {
        if ( getSupportedCommands ().contains ( commandText ) ) {
            executeCommand ( commandText );
        } else {
            if ( nextCommand != null ) {
                nextCommand.processCommand ( commandText );
            }
        }
    }

    @Override
    public void nextCommand ( Command nextCommand ) {
        this.nextCommand = nextCommand;
    }
}
