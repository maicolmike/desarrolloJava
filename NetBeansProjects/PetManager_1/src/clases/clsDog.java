package clases;
/**
 *
 * @author maicol
 */
public class clsDog extends clsPet
{
    private String breed;
    private boolean pedigre;
// metodo constructor
    
    public clsDog(String breed, boolean pedigre, String code, String name, int bornYear, String color, String healthStatus)
    {
        super(code, name, bornYear, color, healthStatus);
        this.breed = breed;
        this.pedigre = pedigre;
    }
    
    public void WalkAround ()
     {
          System.out.println(" El perro "+ super.getName()+" esta caminando");
     }
    
    public void WalkAround (int km)
     {
          System.out.println(" El perro "+ super.getName()+" esta caminando "+km+" km");
     }
    
    public void WalkAround (boolean dogLeash)
     {
         String hasleash = dogLeash ? "con correa" : "sin correa" ;
         System.out.println(" El perro "+ super.getName()+" esta caminando "+hasleash);
     }
    
    
    @Override // para poder sobreescribir
    public void Sound ()
    {
        System.out.println("El perro "+ super.getName()+ " hace Gauuu");
    }
    
    @Override
    public int getNumberOfBones ()
    {
        return 530;
    }
    
    @Override
    public String getAnimalType ()
    {
        return "Dog";
    }
    
    // geteers y setters
    
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

    /**
     * @return the pedigre
     */
    public boolean isPedigre() 
    {
        return pedigre;
    }

    /**
     * @param pedigre the pedigre to set
     */
    public void setPedigre(boolean pedigre)
    {
        this.pedigre = pedigre;
    }
    
}