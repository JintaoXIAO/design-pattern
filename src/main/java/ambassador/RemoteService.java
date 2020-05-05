package ambassador;

import ambassador.util.RandomProvider;

import java.util.concurrent.TimeUnit;

public class RemoteService implements RemoteServiceInterface {
    private static final int THRESHOLD = 200;
    private static RemoteService service = null;
    private final RandomProvider randomProvider;

    public RemoteService(RandomProvider randomProvider) {
        this.randomProvider = randomProvider;
    }

    static synchronized RemoteService getRemoteService(){
        if (service == null) {
            service = new RemoteService();
        }
        return service;
    }

    private RemoteService() {
        this(Math::random);
    }


    @Override
    public long doRemoteFunction(int value) {
        long waitTime = (long) Math.floor(randomProvider.random() * 1000);
        try {
            TimeUnit.MILLISECONDS.sleep(waitTime);
        } catch (InterruptedException e) {
            // log it
        }
        return waitTime <= THRESHOLD ? value * 10 : FAILURE;
    }
}
