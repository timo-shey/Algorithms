package CodeWars;

public class PersonalizedMassage {
    static String greet(String name, String owner) {
        // Add code here
        return (name.equals(owner)) ? "Hello boss" : "Hello guest";
    }
}
