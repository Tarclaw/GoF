package edu.examples.behavioral.c_iterator.madebyme;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String [] skills = new String[] {"Java", "Maven", "Spring", "Hibernate", "PostgreSQL"};
        JavaDeveloper developer = new JavaDeveloper("Some Dude", skills);

        Iterator iterator = developer.getIterator();
        System.out.println("Name: " + developer.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}
