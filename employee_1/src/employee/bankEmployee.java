package employee;


public class bankEmployee extends Employee {
    
    private String bankName;
    
    public bankEmployee(){
        
    }
    
    public bankEmployee(String name, int employeeType, int age, int salary, String bankName){
        super(name, employeeType,age,salary);
        this.bankName = bankName;
    }
    
    public String getBankName() {
        return bankName;
    }

  
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    @Override
    public String toString(){
        return "Employee Name: " + name + " , Job: " + employeeType + " , Age: " + age + " , Salary: " + salary + " , Bank: " + bankName;
    }

    
    @Override
    public void displayEmployee(){
        System.out.println("Employee Name: " + name + " , Job: " + employeeType + " , Age: " + age + " , Salary: " + salary + " , Bank: " + bankName);
    }
    
    public boolean equals(Object obj){
        boolean equal = false;
        bankEmployee emp = (bankEmployee)obj;
        if (emp.bankName.equals(this.bankName) &&
                super.equals(obj)
                ){
            equal = true;
        }
        
       
        return equal;
        
    }
}
