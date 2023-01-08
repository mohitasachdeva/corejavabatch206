package core.java.design.pattern.segment1.lazyloading;

public class Company {
    String cName;
    String cAddress;
    String cContactNo;
    ContactListI contactListI;

    // constructor of the list for  initializing the class fields
    public Company(String cName, String cAddress, String cContactNo, ContactListI contactListI)
    {
        this.cName = cName;
        this.cAddress = cAddress;
        this.cContactNo = cContactNo;
        this.contactListI = contactListI;
    }

    // a getter method to retrieve the company name
    public String getCompnyName()
    {
        return this.cName;
    }

    // a getter method to retrieve the address of the company
    public String getCompnyAddress()
    {
        return this.cAddress;
    }
    public String getCompnyContactNo()
    {
        return this.cContactNo;
    }

    // a getter method to retrieve the contact list
    public ContactListI getContctList()
    {
        return this.contactListI;
    }
}
