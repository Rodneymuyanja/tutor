package tutor;

public class Arts extends Subject{

    public Arts(String name, int id, double pop) {
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
        this.id = "Arts_"+id;

        return this.id;
    }

    /**
     * @return the id
     */
    public String getId() {
        if(id == null){
            System.out.println("no id set");
        }
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        if (Name == null ){
            System.out.println("no name set..");
        }
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
       //return getName();
       //return ;
    }

   /* public static void main(String[] args) {
        Arts art = new Arts();
        art.setName("art");
        art.setId(01);
        art.setPopularity(2.6);
        System.out.println(art.getDetails(art));
        System.out.println(".......................");

        Arts History = new Arts();
        History.setName("History");
        History.setPopularity(3.9);
        History.setId(58);
        System.out.println(History.getDetails(History));


    }*/
}