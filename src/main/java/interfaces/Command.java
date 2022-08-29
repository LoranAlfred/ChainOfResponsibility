package interfaces;

/**
 * This interface contains the methods for commands.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public interface Command {

    /**
     * Processes the command.
     *
     * @param commandText The command text to set.
     * @since 1.0
     */
    void processCommand ( String commandText );

    /**
     * Calling next given command
     *
     * @param nextCommand The command to set.
     * @since 1.0
     */
    void nextCommand ( Command nextCommand );
}
