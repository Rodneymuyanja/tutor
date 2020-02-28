package tutor;

public class Primary extends Subject{
    public Primary(String name, int id, double pop) {
        super(name, id, pop);
        // TODO Auto-generated constructor stub
    }

    public String AddSubject(String name) {
        this.Name = name;
        return name;
    }


    public void Deletesubject(String subject) {
        this.Name = subject;
        if((this.Name = null) == null){
            System.out.println("deleted" + subject);
        }
    }

    /**
     * @param id the id to set
     */
    public String setId(int id) {
        this.id = "Pri"+id;
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

    //retrieves details about the whole subject
    public Arts getDetails(Arts k){
       System.out.println(getName());
       System.out.println(getId());
       System.out.println(getPopularity());
       return k;
    }
}