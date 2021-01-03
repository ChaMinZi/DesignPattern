public class PersonAdapter implements Student {
    private Person person;

    public PersonAdapter(Person person) {
        this.person = person;
    }

    @Override
    public String showName() {
        return person.getName();
    }
    
    @Override
    public String showAge() {
        return person.getAge();
    }
}