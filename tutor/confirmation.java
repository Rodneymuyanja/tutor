//confirmation 
package tutor;

public interface confirmation{
    //called by the Student class
    public String ConfirmSession(String tutorID, String tutorName, String studentName, String subject, String day);
    public boolean Accept(int x);//called by the tutor
    public String ConfirmCompletion(String sessionID, String studentID);//called by tutor 
    public String ConfirmComplete(String sessionID, String tutorID);//called by the student
}