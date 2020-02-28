package tutor;

public class Student implements confirmation{

    public static String Name;
    public String school;
    public String username;
    public String Studentclass;
    public String email;
    public String StudentId;
    public int sessionID;
    //private String Password;
    
    public Student(String name, String id){
        Student.Name = name;
        this.StudentId = id;

    }
    /**
     * @return the username
     */
    public static String getName() {
        return Name;
    }
    @Override
    public String ConfirmSession(String tutorID, String tutorName, String studentName, String subject, String day) {
        
        return null;
    }

    @Override
    public boolean Accept(int x) {
        if (x == 1){
            // send notification for confirmation
        }else{
            // send decline notification
        }
        return false;
    }

    @Override
    public String ConfirmCompletion(String sessionID, String studentID) {
        // not defined here
        return null;
    }

    @Override
    public String ConfirmComplete(String sessionID, String tutorID) {
        
        return null;
    }
    
}