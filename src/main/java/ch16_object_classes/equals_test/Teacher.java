package ch16_object_classes.equals_test;

import java.util.Objects;

public class Teacher {
    // 필드 설정
    private String name;
    private String schoolName;

    // AllArgsConstructor 정의
    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    // getter setter 정의
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // toString Override 정의
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    // equals Override 정의
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ch16_object_classes.Teacher teacher = (ch16_object_classes.Teacher) o;
        return Objects.equals(getName(), teacher.getName()) && Objects.equals(getSchoolName(), teacher.getSchoolName());
    }

    // hashCode Override 정의
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSchoolName());
    }
}
