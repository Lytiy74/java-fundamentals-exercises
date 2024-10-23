package ComparableAndComparator;

public class UncomparableStudent {
    private String name;
    private String surname;
    private int scores;
    private int year;

    public UncomparableStudent(String name, String surname, int scores, int year) {
        this.name = name;
        this.surname = surname;
        this.scores = scores;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "UnStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", scores=" + scores +
                ", year=" + year +
                '}';
    }
}
