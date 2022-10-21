import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private String name;
    private int number;
    private static Map<String , Integer> book = new HashMap<>();

    public PhoneBook(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static Map<String, Integer> getBook() {
        return book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void addBook(String name, Integer phone) {
        book.put(name,phone);
    }

    @Override
    public String toString() {
        return "\n" + "PhoneBook{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
