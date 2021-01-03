public class Main {
    public static void main(String[] args) {
        Person person = new Person("코코", 19);
        PersonAdapter adapter = new PersonAdapter(person);

        System.out.println(adapter.showName());
        System.out.println(adapter.showAge());
    }
}