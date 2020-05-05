package ambassador;

import java.util.concurrent.TimeUnit;

public class ServicerAmbassador implements RemoteServiceInterface {

    private static final int RETRIES = 3;
    private static final int DELAY_MS = 3000;

    ServicerAmbassador() {

    }

    @Override
    public long doRemoteFunction(int value){
        return safeCall(value);
    }

    private long safeCall(int value) {
        var retries = 0;
        var result = (long) FAILURE;

        for (int i = 0; i < RETRIES; i++) {
            if ((result = checkLatency(value)) == FAILURE) {
                retries++;
                try {
                    TimeUnit.MILLISECONDS.sleep(DELAY_MS);
                } catch (InterruptedException e) {

                }
            } else {
                break;
            }
        }
        return result;
    }

    private long checkLatency(int value) {
        var startTime = System.currentTimeMillis();
        var result = RemoteService.getRemoteService().doRemoteFunction(value);
        var timeTaken = System.currentTimeMillis() - startTime;
        // log timeTaken
        return result;
    }

}
