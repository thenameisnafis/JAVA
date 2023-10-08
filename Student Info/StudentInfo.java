public class StudentInfo {
    private String name;
    private int id;
    private double cgpa;


    public StudentInfo(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCGPA() {
        return cgpa;
    }

    public static void main(String[] args) {
		
        Student student = new Student("Nafis Hasan", 12345, 3.75);


        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("CGPA: " + student.getCGPA());
    }
}
