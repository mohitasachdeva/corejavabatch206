//package core.java.design.pattern.segment1;

//public class Builder {
//    private   final String fName;
//    private final String lName;
//    private final String Number;
//    private  String emailId;//optional
//    private String alternativeNum;//optional
//
//    public String getfName() {
//        return fName;
//    }
//
//    public String getlName() {
//        return lName;
//    }
//
//    public String getNumber() {
//        return Number;
//    }
//
//    public String getEmailId() {
//        return emailId;
//    }
//
//    public void setEmailId(String emailId) {
//        this.emailId = emailId;
//    }
//
//    public String getAlternativeNum() {
//        return alternativeNum;
//    }
//
//    public void setAlternativeNum(String alternativeNum) {
//        this.alternativeNum = alternativeNum;
//    }
//
//    public Builder(String fName, String lName, String number) {
//        this.lName = lName;
//       this. Number = number;
//       this.fName = fName;
//    }
//    public Builder emailID(String emailId){
//       this.emailId = emailId;
//       return this;
//    }
//    public Builder alternative(String alternativeNum){
//        this.alternativeNum = alternativeNum;
//        return this;
//    }
//    public UserDetail acc(){
//        UserDetail userDetail = new UserDetail(this);
//        return userDetail;
//    }
//}
