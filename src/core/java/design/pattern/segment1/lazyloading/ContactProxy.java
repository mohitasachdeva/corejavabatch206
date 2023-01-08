package core.java.design.pattern.segment1.lazyloading;

import java.util.List;

public class ContactProxy  implements ContactListI {

    private ContactListI contctList;


    public List<Employee> getEmployeesList() {
        if (contctList == null) {
            System.out.println("Fetching the list of employees ... \n");
            contctList = new ContactList();
        }
        return contctList.getEmployeesList();
    }
}


