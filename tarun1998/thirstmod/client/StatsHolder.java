package tarun1998.thirstmod.client;

/**
 * Only used on Client. ThirstStats was giving me a headache. Updated every
 * tick, or whenever server decides to send stuff.
 */
public class StatsHolder {
    public int level;
    public float saturation;
    public boolean isPoisoned;

    private static StatsHolder instance;

    public static StatsHolder getInstance() {
        if (instance != null)
            return instance;
        else {
            instance = new StatsHolder();
            return instance;
        }
    }
}