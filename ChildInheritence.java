class Inheritence {
    int rollNo;
    String name;

    // Default constructor
    Inheritence(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class ChildInheritence extends Inheritence {
    int marks;

    // Constructor
    ChildInheritence(int rollNo, String name, int marks) {
        super(rollNo, name);
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Total: Pass with " + marks + " marks!");
    }

    public static void main(String[] args) {
        ChildInheritence obj = new ChildInheritence(101, "Anitha", 85);
        obj.display();
    }
}
