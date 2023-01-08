package core.java.design.pattern.segment1.lazyloading;

import java.util.List;

public class LazyLoadingMain {
    public static void main(String[] args) {
        ContactListI contactListObj =  new ContactProxy();


// instantiating the company class
        Company companyObj = new Company("ABC", "India", "+91-011-55512347", contactListObj);

        System.out.println("Company Name: " + companyObj.getCompnyName());
        System.out.println("Company Address: " + companyObj.getCompnyAddress());
        System.out.println("Company Contact No.: " + companyObj.getCompnyContactNo() + "\n");
        System.out.println("Requesting for the contact list ...");

        contactListObj = companyObj.getContctList();
        List<Employee> employeeList = contactListObj.getEmployeesList();

// printing the fetched list
        for (Employee emp : employeeList)
        {
            System.out.println(emp);
        }
    }
}



