package ua.myjavastudy.lesson7.immutable_object;

public final class ImmutableObject {

    private final String name;
    private final Age age;

    public ImmutableObject(String name, Age age){
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public String getName() { return name; }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }

    public ImmutableObject setName(String name) { return new ImmutableObject(name, this.age);}

    public ImmutableObject setAge(Age age) { return new ImmutableObject(this.name,age);}

}
