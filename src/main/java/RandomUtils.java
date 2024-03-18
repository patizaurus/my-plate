import com.github.javafaker.Faker;

public class RandomUtils {

    private static final Faker faker = new Faker();

    public static String generateRandomUsername() {
        return faker.name().username();
    }

    public static String generateRandomPassword(int length) {
        return faker.internet().password(length, length + 5);
    }

    public static String generateRandomEmail() {
        return faker.internet().emailAddress();
    }
}



