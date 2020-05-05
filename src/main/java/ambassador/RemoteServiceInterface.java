package ambassador;

public interface RemoteServiceInterface {
    int FAILURE = -1;

    long doRemoteFunction(int value);
}
