package cab.booking.system;

public interface SignupActions {
    void logSignupAttempt(String username);
    void validateUserData(String data);
}
