public class Student {
    private String name;
    private int mark1, mark2, mark3;

    public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int getTotal() {
        return mark1 + mark2 + mark3;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "Fail";
    }

    @Override
    public String toString() {
        return "Name: " + name +
                " | Total: " + getTotal() +
                " | Avg: " + getAverage() +
                " | Grade: " + getGrade();
    }
}
