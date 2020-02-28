package tutor;

public class priTutor extends Tutor{
        /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }
    /**
     * @param charge_per_hour the charge_per_hour to set
     */
    public void setCharge_per_hour(int charge_per_hour) {
        this.charge_per_hour = charge_per_hour;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @param field the field to set
     */
    public void setField(String field) {
        this.field = field;
    }
    /**
     * @param freedays the freedays to set
     */
    public void setFreedays(String freedays) {
        this.freedays = freedays;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }
    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the charge_per_hour
     */
    public int getCharge_per_hour() {
        return charge_per_hour;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @return the field
     */
    public String getField() {
        return field;
    }
    /**
     * @return the freedays
     */
    public String getFreedays() {
        return freedays;
    }
    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }
    /**
     * @return the phone_number
     */
    public long getPhone_number() {
        return phone_number;
    }
    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }
 
        // here we'll only define accept() and confirmCompletion()
        public boolean Accept(int x){
            if (x == 1){
              // send 
            }else{
    
            }
            return false;
        }
    
        public String confirmCompletion(String sessionID, String studentID){
    
            return null;
        }

}