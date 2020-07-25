package StructuralPattern.Composite;

public class Demo {

    public static void main(String[] args) {
        Developer dev1 = new Developer("dev1",100, "Pro Developer");
        Developer dev2 = new Developer("dev2",101, "Developer");
        CompanyDirector engDirectory = new CompanyDirector();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager("m1", 102, "SEO Manager");
        Manager man2 = new Manager("m2", 101, "Manager");

        CompanyDirector accDirectory = new CompanyDirector();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirector directory = new CompanyDirector();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }

}


