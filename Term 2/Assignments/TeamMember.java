
public class TeamMember<T> implements Comparable<T> {

    private String fullName;
    private String idString;

    TeamMember(String name, String id)
    {
        String fullname = "";
        for (String namestr : name.split(" ")) 
        {
            fullname += namestr.substring(0,1).toUpperCase() + namestr.substring(1).toLowerCase(); 
        }
        this.fullName = fullname;
        this.idString = id;
    }
    
    @Override
    public int compareTo(T arg0)
    {
        return fullName.compareTo(arg0.toString());
    }

    @Override
    public String toString()
    {
        return this.fullName;
    }

}
