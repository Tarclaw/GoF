package edu.examples.behavioral.f_observer.madebyme;

public class JobSearchDemo {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Ugin");
        Observer secondSubscriber = new Subscriber("Peter");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
