class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class AgeExceptionDemo {
    static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Age is less than 18");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
