import java.util.ArrayList;
import java.util.List;

class HogwartsStudent {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        if (house.equals("Gryffindor") || house.equals("Hufflepuff") || house.equals("Ravenclaw") || house.equals("Slytherin")) {
            this.house = house;
        } else {
            throw new IllegalArgumentException("Invalid house name: " + house);
        }
    }

    public String toString() {
        return firstName + " " + lastName + " (House: " + house + ")";
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        List<HogwartsStudent> students = new ArrayList<>();

        HogwartsStudent student1 = new HogwartsStudent("Harry", "Potter");
        student1.setHouse("Gryffindor");
        students.add(student1);

        HogwartsStudent student2 = new HogwartsStudent("Hermione", "Granger");
        student2.setHouse("Gryffindor");
        students.add(student2);

        HogwartsStudent student3 = new HogwartsStudent("Draco", "Malfoy");
        student3.setHouse("Slytherin");
        students.add(student3);

        HogwartsStudent student4 = new HogwartsStudent("Ron", "weasley");
        student4.setHouse("Ravenclaw");
        students.add(student4);

        HogwartsStudent student5 = new HogwartsStudent("Maja","Larsen");
        student5.setHouse("Slytherin");
        students.add(student5);

        students.sort((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));

        for (HogwartsStudent student : students) {
            System.out.println(student);
        }
    }
}
