package clases;
/**
 *
 * @author maicol
 */
public class clsVeterinary extends AbsHospital
{
    private String name;
    private String phone;
    private String addres; 
    private clsDoctor doctor;

    // metodo constructor
    public clsVeterinary(String name, String phone, String addres, clsDoctor doctor) 
    {
        this.name = name;
        this.phone = phone;
        this.addres = addres;
        this.doctor = doctor;
    }
    
    //metodos
     public String PetCare (clsPet pet)
     {
         System.out.println("Atendiendo a la mascota "+ pet.getName());
         return pet.getHealthStatus();
     }
    
    // getters y setters
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
     * @return the phone
     */
    public String getPhone() 
    {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    /**
     * @return the addres
     */
    public String getAddres() 
    {
        return addres;
    }

    /**
     * @param addres the addres to set
     */
    public void setAddres(String addres) 
    {
        this.addres = addres;
    }

    /**
     * @return the doctor
     */
    public clsDoctor getDoctor() 
    {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(clsDoctor doctor) 
    {
        this.doctor = doctor;
    }   

    @Override
    public String getPatientType() 
    {
        return "Animal";
    }

    @Override
    public String Surgery() 
    {
        return "Surgery animal data";
    }
    
}