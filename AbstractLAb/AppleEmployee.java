public class AppleEmployee extends Employee implements Department{
    private String departmentCode;
    private int commission;

    public AppleEmployee(String departmentCode, int commission){
        this.departmentCode = departmentCode;
        this.commission = commission;
    }

    public String getDepartmentCode(){
        return departmentCode;
    }

    public double getCommission() {
        return commission;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public String getDepartmentName() {
        String department = "None";

        if (departmentCode.equals("100")){
            department = "IPhone";
        }else if (departmentCode.equals("101")){
            department = "IPad";
        }


        return department;
    }

    @Override
    public int getDepartmentBonus() {
        String name = getDepartmentName();
        int bonus = 0;
        if (name.equals("IPhone"))
            bonus = 100;
        else if (name.equals("IPad"))
            bonus = 50;

        return bonus;
    }

    @Override
    public double employeeBonus() {
        return getDepartmentBonus() * commission;
    }
}
