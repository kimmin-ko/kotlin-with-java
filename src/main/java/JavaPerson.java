import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class JavaPerson implements Comparable {

    private final String name;
    private final int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaPerson javaPerson = (JavaPerson) o;

        if (age != javaPerson.age) return false;
        return Objects.equals(name, javaPerson.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        JavaPerson p = (JavaPerson) o;
        return this.age - p.age;
    }
}
