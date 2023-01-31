public class Person {
    protected String name;
    protected String lastname;
    protected int ticket;

    public Person(String name, String lastname, int ticket) {
        this.name = name;
        this.lastname = lastname;
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return (name + " " + lastname);
    }
}
