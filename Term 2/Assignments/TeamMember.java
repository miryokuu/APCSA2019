/**
 *  APCSA Term 2 Assignment 6 TeamMember
 */
public class TeamMember {

    private String fullName;
    public String idString;

    TeamMember(String name, String id)
    {
        String fullname = "";
        for (String namestr : name.split("\\s")) 
        {
            fullname += namestr.substring(0,1).toUpperCase() + namestr.substring(1).toLowerCase();
            try {
                fullname += name.charAt(name.indexOf(namestr) + namestr.length());
            } catch (java.lang.StringIndexOutOfBoundsException e) 
            {
                //
            }
        }

        this.fullName = fullname;
        this.idString = id;
    }
    
    public int compareTo(TeamMember arg0)
    {
        int result = idString.compareTo(arg0.idString);
        return result > 0 ? 1 : result == 0 ? 0 : -1;
    }

    @Override
    public String toString()
    {
        return this.fullName;
    }

}
