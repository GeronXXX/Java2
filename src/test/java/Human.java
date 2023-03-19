import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private int age;
    private String[] hobbies;

    public Human(String name, int age, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public void voiditerateOverHobbies() {
        for (String hobby : hobbies) {

        }
    }
/** И трети момент, если мы переопределяем equals для наших классов, мы должны помнить про это ключевое правило и
 * обязаны преопределить метод хеш кода, по то мучто мы должны выдерживать это правило, что если объекты одинаковы по
 * методу equals, то тогда их хеш функция должна быть одинаковая.
 * В Java можно переопределить поведение класса object и любого другого класса у которого наследуютесь с помощью
 * миханизма @Override. Теперь - Human dima = new Human("Дима", 33, hobbies);
 *                               Human dima1 = new Human("Дима", 33, hobbies);
 * будут считаться одинаковыми по методу equals, но разными по методу хеш кода.
 */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Arrays.equals(hobbies, human.hobbies);
    }
/** Ниже метод для переопределения метода хеш кода, что бы хеш коды были одинаковые после переопределения */

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age);
        result = 31 * result + Arrays.hashCode(hobbies);
        return result;
    }
}

