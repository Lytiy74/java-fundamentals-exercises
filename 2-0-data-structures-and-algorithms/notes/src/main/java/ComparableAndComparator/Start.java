package ComparableAndComparator;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        Student firstStudent = new Student("Andrew", "Zaika", 5, 2004);
        Student secondStudent = new Student("Sergey", "Maksimenko", 4, 2000);
        Student thirdStudent = new Student("Artem", "Protsenko", 2, 2010);

        List<Student> students = Arrays.asList(secondStudent,firstStudent,thirdStudent);
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

        //Sort using COMPARATOR
//        students.sort((o1, o2) -> o1.getSurname().compareTo(o2.getSurname()
//        ));
//        System.out.println(students);

        students.sort(new NameComparator());
        System.out.println(students);

        students.sort((o1, o2) -> o1.getYear() - o2.getYear());
        System.out.println(students);
        SortedMap<Student, Student> sortedMap1 = new TreeMap<>();
        sortedMap1.put(firstStudent, firstStudent);
        sortedMap1.put(secondStudent, secondStudent);
        sortedMap1.put(thirdStudent, thirdStudent);
        System.out.println(sortedMap1);

// Це важливо для SortedMap інтерфейсу!
        SortedMap<UncomparableStudent, UncomparableStudent> sortedMap = new TreeMap<>((o1, o2) -> o1.getYear() - o2.getYear());
        UncomparableStudent UnfirstStudent = new UncomparableStudent("Andrew", "Zaika", 5, 2004);
        UncomparableStudent UnsecondStudent = new UncomparableStudent("Sergey", "Maksimenko", 4, 2000);
        UncomparableStudent UnthirdStudent = new UncomparableStudent("Artem", "Protsenko", 2, 2010);
        sortedMap.put(UnfirstStudent, UnfirstStudent);
        sortedMap.put(UnsecondStudent, UnsecondStudent);
        sortedMap.put(UnthirdStudent, UnthirdStudent);
        System.out.println(sortedMap);
    }
}
