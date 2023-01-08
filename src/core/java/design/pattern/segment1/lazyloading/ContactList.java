package core.java.design.pattern.segment1.lazyloading;

import java.util.ArrayList;
import java.util.List;

public class ContactList implements ContactListI {

    public List<Employee> getEmployeesList()
    {
        return getEmpList();
    }
    private static List<Employee> getEmpList()
    {
        List<Employee> empList = new ArrayList<Employee>(5);

// adding employees to the list
        empList.add(new Employee("Mukesh", 3452.67, "JSE"));
        empList.add(new Employee("Amit", 22345, "ASE"));
        empList.add(new Employee("Naman", 3256.17, "G4"));
        empList.add(new Employee("Vipul", 4895.34, "SDE1"));
        empList.add(new Employee("Akhil", 2857.91, "SDE2"));

        return empList;
    }
}
