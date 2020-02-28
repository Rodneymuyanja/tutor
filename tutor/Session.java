package tutor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import java.awt.*;
import java.awt.TrayIcon.MessageType;


public class Session extends TimerTask {
    public String StartTime;
    public int Duration;
    public String EndTime;
    public static Subject Subject;
    public Tutor TutorName;
    public Student StudentName;
    public String Venue;
    public String sessionID;

    public boolean timer() throws ParseException {
        /**
         * we'll start off by converting the period to minutes since its in hours
         * 
         */
        final int period = this.Duration;
        int Duration = period * 60;
        /**
         * Call the SimpleDateFormat object and use "HH:mm" as the format
         */
        final SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        /**
         * the StartTime is the time this particular session started, and change it to a
         * date
         */
        final Date date = df.parse(StartTime);
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, Duration);
        EndTime = df.format(cal.getTime());
        Date end = cal.getTime();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Instant instant = end.toInstant();
        LocalTime Stoptime = instant.atZone(defaultZoneId).toLocalTime();

        LocalTime timeOnCallForCompletion = LocalTime.now();
        System.out.println("current time " + timeOnCallForCompletion);
        System.out.println("Stop time " + Stoptime);

        boolean isBefore = timeOnCallForCompletion.isBefore(Stoptime);
        boolean isAfter = timeOnCallForCompletion.isAfter(Stoptime);
        // boolean time = timeOnCallForCompletion.isEqual(Stoptime);

        System.out.println(isBefore);
        System.out.println(isAfter);

        /*
         * looking for a time after the allocated time for example while testing,
         * timeOnCallForCompletion = 21:02:58.596773 and Stoptime = 19:00 if we catch a
         * false that means the timeOnCallForCompletion is not before Stoptime its after
         * that means we've exceeded the allocated time this session shouldn't carry on
         */

        if (isBefore == false) {
            System.out.println("its past the allocated time");
        } else {
            // this should imply someone tried to call this method
            // since timeOnCallForCompletion is within the acceptable bounds
            // before the time got done
            // this should be reported
            System.out.println("We,re within the allocated time");
        }
        /*
         * Next we look for a time before the allocated time ie within the allocated
         * boundaries. if we catch a true that means timeOnCallForCompletion is after
         * the newtime thats why we look for a false..... that session should be set to
         * null
         */
        if (isAfter == false) {
            // System.out.println("its past time");
        }

        return isAfter;
    }

    public static void main(String[] args) {

        Session fourty = new Session("12:00", 3, new Subject("physics", 56, 4.9), new Student("rodney", "45"),
                new Tutor(), "Acacia", 45);
        System.out.println(Student.getName());
        System.out.println(fourty.getStartTime());
        System.out.println(Subject.getName());
        Timer t = new Timer();
        t.scheduleAtFixedRate(fourty, 0, 10000);
        try {
            fourty.showTray();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        /*Scanner scanner = new Scanner(System.in);
        final String nt = scanner.next(nt);*/
    }

    /**
     * constructor
     */
    public Session(String StartTime, int Duration, Subject Subject, Tutor TutorName, Student StudentName, String Venue,
            int sessionID) {

                        this.StartTime = StartTime;
                        this.Duration = Duration;
                        Session.Subject = Subject;
                        this.TutorName = TutorName;
                        this.StudentName = StudentName;
                        this.Venue = Venue;
                        setSessionID(sessionID);


    }
    
     public Session(String startTime2, int duration2, tutor.Subject subject2, Student student, Tutor tutor,
            String venue2, int sessionID2) {
                this.StartTime = startTime2;
                this.Duration = duration2;
                Session.Subject = subject2;
    }

    /**
     * @param sessionID the sessionID to set
     */
    public void setSessionID(int sessionID) {
        this.sessionID = "Session_"+sessionID;
        if (sessionID == 0){
        this.sessionID = null;
        }
    }

    /**
     * @return the sessionID
     */
    public String getSessionID() {
        return sessionID;
    }
    /**
     * @return the startTime
     */
    public String getStartTime() {
        return StartTime;
    }

    /**
     * we now try to send a notification when we find out that the session is done
     * having set sessionID to 0
     * 
     * @return
     */
    public void sendNotificaton() {
      //ghh
    }

    /**
     * this notification is sent when the user tries to
     * end session before time
     */
    public void catchBreach(){
        


    }

    @Override
    public void run() {
        try {
           if ( this.timer() == true){
            setSessionID(0);
            System.out.println("session ended");
           }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    /**
     * here comes the tray
     */

     public void showTray() throws AWTException {
         SystemTray tray = SystemTray.getSystemTray();
         Image image = Toolkit.getDefaultToolkit().createImage("Icon.png");
         TrayIcon trayIcon = new TrayIcon(image,"tray demo");
         tray.add(trayIcon);
         trayIcon.displayMessage("Tutor", "it's not yet time", MessageType.INFO);
     }
}