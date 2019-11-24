package lt.sdacademy.Fundamentalscoding.practicalexercises.reversetext.worker;

public class Worker {

        private String name;
        private double salary;
        private double age;
        private String gender;

        public Worker(String name, double salary, double age, String gender) {
            this.name = name;
            this.salary = salary;
            this.age = age;
            this.gender = gender;
        }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

}
