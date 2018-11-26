import lombok.*;

@Builder
@Getter
public class People {
    final private int age;
    final private String name;
    final private String lastName;
    final private String city;
    final private String job;
    final private String GREET = "hello";

    public String greet() {
        return GREET + " my name is " + name;
    }
}