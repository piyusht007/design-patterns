package com.piyush.creational.singleton;

/**
 * This is a singleton class making use of static block initialization.
 * This has advantage over {@link MySingletonEagerlyInitialized} as it allows Exception Handling.
 */
public class MySingletonStaticBlockInitialization {
    private static MySingletonStaticBlockInitialization INSTANCE;

    static {
        try{
            INSTANCE = new MySingletonStaticBlockInitialization();
        } catch (final Exception e) {
            System.out.println("Error occurred while instance creation.");
        }
    }

    private MySingletonStaticBlockInitialization(){}

    public static MySingletonStaticBlockInitialization getInstance(){
        return INSTANCE;
    }
}
