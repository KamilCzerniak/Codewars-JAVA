import java.util.function.Function;

public class JavaFunctionalProgrammingPartTheBeginning {

    public static Function<Student, Boolean> f = p -> p.getFullName().equals("John Smith")
            && p.studentNumber.equals("js123");

}

