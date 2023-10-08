public class Student {
    private int id;
    private char name;
    private double cgpa;

    public void setid(int i) {
        id = i;
    }

    public void setname(char x) {
        name = x;
    }

    public void setcgpa(double c) {
        cgpa = c;
    }

    public int getid() {
        return id;
    }

    public char getname() {
        return name;
    }

    public double getcgpa() {
        return cgpa;
    }

    public static void main(String args[]) {
        Student b = new Student(); 

        b.setid(50293);
        b.setname('g');
        b.setcgpa(3.89);

        System.out.println("ID is: " + b.getid());
        System.out.println("Name: " + b.getname());
        System.out.println("CGPA is: " + b.getcgpa());
    }
}
