package clases;
/**
 *
 * @author maicol
 */
public class clsCat extends clsPet
{
    private String breed;

    // constructor

    public clsCat(String breed, String code, String name, int bornYear, String color, String healthStatus) 
    {
        super(code, name, bornYear, color, healthStatus);
        this.breed = breed;
    }
      
  // metodos
    
    public void SelfCleaning()
    {
        System.out.println("El gato "+ super.getName()+" se esta autolimpiando");
    }
    
    @Override // para poder sobreescribir
    public void Sound ()
    {
        System.out.println("El gato "+ super.getName()+ " hace miauuu");
    }
    
    @Override
    public int getNumberOfBones ()
    {
        return 230;
    }
    
    @Override
    public String getAnimalType ()
    {
        return "Cat";
    }
    
   // getters y setters

    /**
     * @return the breed
     */
    public String getBreed() 
    {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) 
    {
        this.breed = breed;
    }
    
}