package edu.examples.behavioral.e_memento.madebyme;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        GithubRepo githubRepo = new GithubRepo();
        Project project = new Project();

        System.out.println("Creating project version 1.0");

        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("Saving current version to github");
        githubRepo.setSave(project.save());

        System.out.println("Update project to new version");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("Lets rollback to the previous");
        project.load(githubRepo.getSave());
        System.out.println(project);


    }
}
