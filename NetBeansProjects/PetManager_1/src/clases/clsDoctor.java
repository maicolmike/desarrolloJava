package clases;
/**
 *
 * @author maicol
 */
public class clsDoctor 
{
    private String name;
    private String license;

    public clsDoctor(String name, String license)
    {
        this.name = name;
        this.license = license;
    }

 
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * @return the license
     */
    public String getLicense()
    {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license)
    {
        this.license = license;
    } 
}