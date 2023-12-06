package Controller;

import clases.*;
import Model.*;

/**
 *
 * @author maicol
 */
public class ctlPet
{
    private modelDog modelDog; // asi conecto el controlador con el modelo
    private modelCat modelCat;
    //metodo constructor
    public ctlPet() 
    {
        this.modelDog= new modelDog(); //puente para hacer la coneccion
        this.modelCat = new modelCat();
    }
    
    //metodos
    public boolean CreatePet (clsPet pet)
    {
        try 
        {
            switch (pet.getAnimalType()) 
            {
                case "Cat":
                    this.modelCat.CreatePet((clsCat)pet);// conversion extrinsa (clsCat)
                    break;
                case "Dog":
                    this.modelDog.CreatePet((clsDog)pet);// conversion extrinsa (clsDog)
                    break;
            }
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
        
    }
    
    public boolean EditPet (clsPet pet)
    {
        try 
        {
            switch (pet.getAnimalType()) 
            {
                case "Cat":
                    break;
                case "Dog":
                    this.modelDog.EditPet((clsDog)pet);
                    break;
            }
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
        
    }
    
    public boolean DeletePet (clsPet pet)
    {
        try 
        {
            switch (pet.getAnimalType()) 
            {
                case "Cat":
                    break;
                case "Dog":
                    this.modelDog.DeletePet((clsDog)pet);
                    break;
            }
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
        
    }
    
    public clsPet SearchPet (String code, String type)
    {
        clsPet pet = null;
        try 
        {
            switch (type) 
            {
                case "Cat":
                    break;
                case "Dog":
                   pet = this.modelDog.SearchPet(code);
                    break;
            }
            return pet;
        } 
        catch (Exception e) 
        {
            return null;
        }
        
    }
    
}
