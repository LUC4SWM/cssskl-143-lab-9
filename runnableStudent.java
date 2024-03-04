public class runnableStudent implements Runnable, Cloneable{
    private double gpa;
    private String name;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

    public runnableStudent(double gpa, String name, String msg) {
        this.gpa = gpa;
        this.name = name;
        this.msg = msg;
    }

    public runnableStudent(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public runnableStudent(String msg) {
        this.msg = msg;
    }

    //Copy constructor
    public runnableStudent(runnableStudent student){
        this.name = student.name;
        this.gpa = student.gpa;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    protected Object clone() {
        return new runnableStudent(this);
    }

    @Override
    public void run() {
        System.out.println("RUNNABLE MESSAGE: Student (" + getName() + ") has a message: " + this.msg );
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new runnableStudent(3.58,"Roy" ,"Running, Running"));
        t1.start();
    }
}
