package tutor;

public class Subject{
    public String Name;
    public String id;
    public double popularity;


    public Subject(String name,int id, double pop ){
        AddSubject(name);
        setId(id);
        setPopularity(pop);

    }

    public String AddSubject(String subject){
        this.Name = subject;
        return subject;
    }

    public void Deletesubject(String subject) {
        this.Name = subject;
        if((this.Name = null) == null){
            System.out.println("deleted" + subject);
        }
        //return rodney;
    }

    /*private void Destroyable(String name2) {
    }*/

    /**
     * @param id the id to set
     */
    public String setId(int id) {
        this.id = "sub"+id;
        return this.id;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }
    /**
     * @return the popularity
     */
    public double getPopularity() {
        return popularity;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * @param popularity the popularity to set
     */
    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    /*public static void main(String[] args) {
 
        Subject rodney = new Subject();
        Subject math = new Subject();
        
        math.setName("Mathematics");
        math.setPopularity(4.6);
        math.setId(14);
        System.out.println("popularity "+math.getPopularity()+" name: "+math.getName()+" id "+math.getId());
        System.out.println("..............math..............");
        rodney.setName("biology");
        System.out.println(rodney.getName());
        rodney.setPopularity(4.5);
        System.out.println(rodney.getPopularity());
        rodney.Deletesubject("biology");
    }*/
}