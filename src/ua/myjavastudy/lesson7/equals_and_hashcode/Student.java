package ua.myjavastudy.lesson7.equals_and_hashcode;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String group;

    public Student(int id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getGroup() {
        return this.group;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (obj instanceof Student) {
            Student temp = (Student) obj;
            return this.id == temp.id && this.name.equals(temp.name)
                    && this.group.equals(temp.group);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int)(31*id + ((group == null) ? 0 : group.hashCode()) + ((name == null) ? 0 : name.hashCode()));
    }

    public String toString() {
        return getClass().getName() + "@name" + name + "id:" + id + " group:" + group;
    }
}