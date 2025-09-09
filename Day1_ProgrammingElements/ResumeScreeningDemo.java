package Generics.Day1_ProgrammingElements;
import java.util.*;

abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() { return candidateName; }
    public abstract String getRoleName();
    public abstract boolean isQualified();
}

class SoftwareEngineer extends JobRole {
    private int codingScore;

    public SoftwareEngineer(String name, int codingScore) {
        super(name);
        this.codingScore = codingScore;
    }

    public String getRoleName() { return "Software Engineer"; }
    public boolean isQualified() { return codingScore >= 70; }
}

class DataScientist extends JobRole {
    private int mlProjects;

    public DataScientist(String name, int mlProjects) {
        super(name);
        this.mlProjects = mlProjects;
    }

    public String getRoleName() { return "Data Scientist"; }
    public boolean isQualified() { return mlProjects >= 3; }
}

class ProductManager extends JobRole {
    private int leadershipYears;

    public ProductManager(String name, int leadershipYears) {
        super(name);
        this.leadershipYears = leadershipYears;
    }

    public String getRoleName() { return "Product Manager"; }
    public boolean isQualified() { return leadershipYears >= 2; }
}

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) { this.jobRole = jobRole; }
    public T getJobRole() { return jobRole; }
}

class ResumeScreeningSystem {
    public static <T extends JobRole> void processResume(Resume<T> resume) {
        JobRole role = resume.getJobRole();
        System.out.println("Screening Resume: " + role.getCandidateName() + " | Role: " + role.getRoleName());
        System.out.println("Qualified: " + role.isQualified());
    }

    public static void processMultiple(List<? extends JobRole> candidates) {
        for (JobRole role : candidates) {
            System.out.println("Candidate: " + role.getCandidateName() + " applying for " + role.getRoleName());
        }
    }
}

public class ResumeScreeningDemo {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Ayesha", 85));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bobby", 4));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Chanchal", 1));

        ResumeScreeningSystem.processResume(seResume);
        ResumeScreeningSystem.processResume(dsResume);
        ResumeScreeningSystem.processResume(pmResume);

        List<JobRole> candidates = Arrays.asList(
                new SoftwareEngineer("Ram", 60),
                new DataScientist("Mohit", 5),
                new ProductManager("Priya", 3)
        );

        System.out.println("\nProcessing Multiple Candidates:");
        ResumeScreeningSystem.processMultiple(candidates);
    }
}
