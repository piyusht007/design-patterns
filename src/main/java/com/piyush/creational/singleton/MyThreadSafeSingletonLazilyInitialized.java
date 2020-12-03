package com.piyush.creational.singleton;

public class MyThreadSafeSingletonLazilyInitialized {
    private static MyThreadSafeSingletonLazilyInitialized instance;

    private MyThreadSafeSingletonLazilyInitialized() {
    }

    /**
     * Below method uses double checked locking idiom to reduce the overhead
     * of locking the object everytime getInstance is called (happens
     * when we declare whole getInstance method as synchronized).
     *
     * Instead, We could start by verifying if we need to create the object in
     * the first place and only in that case we would acquire the lock.
     *
     * @return
     */
    public static MyThreadSafeSingletonLazilyInitialized getInstance() {
        if (instance == null) {
            synchronized (MyThreadSafeSingletonLazilyInitialized.class) {
                if (instance == null) {
                    instance = new MyThreadSafeSingletonLazilyInitialized();
                }
            }
        }

        return instance;
    }
}
