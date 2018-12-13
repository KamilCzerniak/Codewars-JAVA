import java.util.ArrayList;
import java.util.List;

public class Dinglemouse {
    private String name;
    private int age;
    private char sex;
    private List<Dinglemouse> list = new ArrayList<>();

    public Dinglemouse() {
    }

    public Dinglemouse setAge(int age) {
        if (list.stream().allMatch(o -> o.age == 0)) {
            Dinglemouse dinglemouse = new Dinglemouse();
            dinglemouse.age = age;
            list.add(dinglemouse);
        } else {
            list.stream().filter(o -> o.age != 0).findAny().get().age = age;
        }
        return this;
    }

    public Dinglemouse setSex(char sex) {
        if (list.stream().allMatch(o -> o.sex == 0)) {
            Dinglemouse dinglemouse = new Dinglemouse();
            dinglemouse.sex = sex;
            list.add(dinglemouse);
        } else {
            list.stream().filter(o -> o.sex != 0).findAny().get().sex = sex;
        }
        return this;
    }

    public Dinglemouse setName(String name) {
        if (list.stream().allMatch(o -> o.name == null)) {
            Dinglemouse dinglemouse = new Dinglemouse();
            dinglemouse.name = name;
            list.add(dinglemouse);
        } else {
            list.stream().filter(o -> o.name != null).findAny().get().name = name;
        }
        return this;
    }

    public String hello() {
        StringBuilder sb = new StringBuilder("Hello. ");
        for (int i = 0; i < list.size(); i++) {
            Dinglemouse dinglemouse = list.get(i);
            if (dinglemouse.name != null) {
                sb.append(String.format("My name is %s.", dinglemouse.name));
            } else if (dinglemouse.age != 0) {
                sb.append(String.format("I am %d.", dinglemouse.age));
            } else {
                sb.append(String.format("I am %s.", dinglemouse.sex == 'M' ? "male" : "female"));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}