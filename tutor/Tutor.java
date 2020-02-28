package tutor;

public class Tutor implements confirmation{
    public String Name,school,email,freedays,password;
    public String field;
    public long phone_number;
    public int charge_per_hour;

    @Override
    public String ConfirmSession(String tutorID, String tutorName, String studentName, String subject, String day) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean Accept(int x) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String ConfirmCompletion(String sessionID, String studentID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String ConfirmComplete(String sessionID, String tutorID) {
        // TODO Auto-generated method stub
        return null;
    }
    
}