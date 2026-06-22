package MVCPatternExample;

public class Student {
    private String name;
    private int id;
    private char grade;

    private Student(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.grade = builder.grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public char getGrade() {
        return grade;
    }

    public static class Builder {
        private String name;
        private int id;
        private char grade;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setGrade(char grade) {
            this.grade = grade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
    public String toString(){
        return this.id+"   "+this.name+"   "+this.grade;
    }
}