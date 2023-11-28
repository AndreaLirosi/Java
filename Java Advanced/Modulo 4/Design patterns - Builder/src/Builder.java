public class Builder  {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    public Builder() {
    }


    public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }
    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }
    public Person Build () {
        return new Person(firstName,lastName,age,address);

    }
}
