package core.java.design.pattern.segment1;

public class UserDetail {
    private final String fName;
    private final String lName;
    private final String Number;
    private String emailId;//optional
    private String alternativeNum;//optional

    UserDetail(Builder builder) {
        this.fName = builder.getfName();
        this.lName = builder.getlName();
        this.Number = builder.getNumber();
        this.emailId = builder.getEmailId();
        this.alternativeNum = builder.getAlternativeNum();
    }

    public static class Builder {
        private final String fName;
        private final String lName;
        private final String Number;
        private String emailId;//optional
        private String alternativeNum;//optional

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public String getNumber() {
            return Number;
        }

        public String getEmailId() {
            return emailId;
        }



        public String getAlternativeNum() {
            return alternativeNum;
        }



        public Builder(String fName, String lName, String number) {
            this.lName = lName;
            this.Number = number;
            this.fName = fName;
        }

        public Builder emailID(String emailId) {
            this.emailId = emailId;
            return this;
        }


        public UserDetail acc() {
            UserDetail userDetail = new UserDetail(this);
            return userDetail;
        }


    }
    @Override
    public String toString() {
        return "Builder{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", Number='" + Number + '\'' +
                ", emailId='" + emailId + '\'' +
                ", alternativeNum='" + alternativeNum + '\'' +
                '}';
    }
}
