
package clases;

/**
 *
 * @author maicol
 */
public abstract class AbsHospital 
{
    private String data;
    
    public abstract String getPatientType ();
    public abstract String Surgery ();
    
    public String getHospitalInformation()
    {
        return "La informacion es"+ this.getData();
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

}
