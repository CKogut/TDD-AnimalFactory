package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testAnimalCreateDogName(){
        Date dob = new Date(2020-03-01);
        Dog dog = AnimalFactory.createDog("Rover",dob);
        Assert.assertEquals("Rover",dog.getName());
    }

    @Test
    public void testAnimalCreateDogDOB(){
        Date dob = new Date(2020-03-01);
        Dog dog = AnimalFactory.createDog("Rover",dob);
        Assert.assertEquals(dob,dog.getBirthDate());
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testAnimalCreateCatName(){
        Date dob = new Date(2020-04-01);
        Cat cat = AnimalFactory.createCat("Chell",dob);
        Assert.assertEquals("Chell",cat.getName());
    }

    @Test
    public void testAnimalCreateCatDOB(){
        Date dob = new Date(2020-04-01);
        Cat cat = AnimalFactory.createCat("Chell",dob);
        Assert.assertEquals(dob,cat.getBirthDate());
    }
}
