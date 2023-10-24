public class IllegalArgument {
    int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than zero");
        } else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        IllegalArgument person = new IllegalArgument();
        person.setAge(-1);
    }
}
