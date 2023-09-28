import java.util.ArrayList;

public class final_OOP {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Tom");
        e1.setPosition("UX/UI");
        e1.setEmpID("0001");
        Project webA = new Project();
        webA.setProjectName("Web A");
        webA.setDescription("Developing a web application");
        e1.AddProject(webA);
        Project appA = new Project();
        appA.setProjectName("Mobile app A");
        appA.setDescription("Developing a mobile app");
        e1.AddProject(appA);
        e1.ShowDetails();

        Employee e2 = new Employee();
        e2.setName("Tim");
        e2.setPosition("FontEnd");
        e2.setEmpID("0002");
        e2.AddProject(webA);
        e2.ShowDetails();
    }
}

interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}
interface Jop {
    String getPosition();
    void setPosition(String position);
    String getEmpID();
    void setEmpID(String empID);
}

class Employee implements Person, Jop {
    private String name;
    private double age;
    private String position;
    private String empID;
    private ArrayList<Project> myproject;

    Employee (){
        this.myproject = new ArrayList<Project>();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return (int) this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getEmpID() {
        return this.empID;
    }
    public void setEmpID(String empID) {
        this.empID = empID;
    }
    public void AddProject(Project project) {
    this.myproject.add(project);
    }
    public void ShowDetails() {
        System.out.println("****************");
        System.out.println("Name : " + this.name);
        System.out.println("Position : " + this.position);
        System.out.println("EmpID : " + this.empID);
        System.out.println("Projects");
        for (int i = 0; i < this.myproject.size(); i++) {
            System.out.println("    " + this.myproject.get(i).getProject());
        }
    }
}
class Project {
    private String projectName;
    private String description;

    public String getProjectName() {
        return this.projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getProject() {
        return this.projectName + " : " + this.description;
    }
}