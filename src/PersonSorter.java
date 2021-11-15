import java.util.Arrays;

public class PersonSorter {

    public void start() {
        // Opret et array af Person objekter, med tre Persons i
        Person[] arr = new Person[3];
        arr[1] = new Person("Ron", "Weasley");
        arr[0] = new Person("Harry", "Potter");
        arr[2] = new Person("Hermione", "Granger");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        QuickSortPerson.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        PersonSorter app = new PersonSorter();
        app.start();
    }
}
