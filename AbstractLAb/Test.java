public class Test {

    public static void main(String [] args){
        AppleEmployee a = new AppleEmployee("100", 5);

        a.setFullName("Bob Smith");
        a.setEmployeeId("001");

        System.out.println("Full Name: " + a.getFullName() +
                "\nEmployeeID: " + a.getEmployeeId() +
                "\nDepartment Name: " + a.getDepartmentName() +
                "\nEmployee Bonus: " + a.employeeBonus());

    }
}
