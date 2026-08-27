package polymorphism.methodoverriding;

// Example : increasing the visibility

public class College {
    protected void collegeName(){
        System.out.println("Name of the college Aco Acs");
    }
    protected void estYear(){
        System.out.println("Establish year 2000");
    }
}
class MyCollege extends College{
    @Override
    public void collegeName(){
        super.collegeName();
        super.estYear();
        System.out.println("Name of the college Tdit");
    }

    @Override
    public void estYear(){
        System.out.println("Establish year 2020");
    }

}

class MainForObj2{
    public static void main(String[]args){
        College obj = new MyCollege();
        obj.collegeName();
        obj.estYear();
    }
}

/// In this program  we are increasing the visibility of the access modifier
// We can increase the visibility but we cannot decrease it