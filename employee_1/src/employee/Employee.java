package employee;

/**
 *
 * @author A221137
 */
public abstract class Employee implements IEmployee {

  String name;
  int employeeType;
  int salary;
  int age;
  private boolean active = false;
  
  public Employee(){
      
  }

    public Employee(String name, int employeeType, int salary, int age) {
        this.name = name;
        this.employeeType = employeeType;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public void displayEmployee() {
        System.out.print("Employee Name: " + name + " , Job: " + employeeType + " , Age: " + age + " , Salary: " + salary );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getSalary() {
        return salary;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void activateEmployee() {
         active = true;
    }

    @Override
    public void deactivateEmployee() {
        active = false;
    }

    public void setSalary(int salary) throws Exception {
        if (salary < 10000) {
            throw new Exception("Salary too low");
        } else {
            if (salary > 100000) {
                throw new Exception("Salary too high");
            }
            if (employeeType == MANAGER && salary < 20000) {
                throw new Exception("Salary not enough");
            } else if (employeeType == DEVELOPER && salary > 30000) {
                throw new Exception("Salary out of range");
            } else if (employeeType == EXEC && salary < 50000) {
                throw new Exception("Salary not in range");

            }
        }

        this.salary = salary;
    }

   @Override
    public String toString() {
        return "Employee Name: " + name + " , Job: " + employeeType + " , Age: " + age + " , Salary: " + salary;
    }
    public boolean equals(Object obj){
        boolean equal = false;
        Employee emp = (Employee)obj;
        String s = emp.name;
        if (    this.name.equalsIgnoreCase(emp.name)&&
                this.age == emp.age &&
                this.employeeType == emp.employeeType &&
                this.salary == emp.salary)
                {
            equal = true;
        }
        return equal; 
    }

}