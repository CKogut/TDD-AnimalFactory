package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogNameTest(){
        Dog dog = new Dog("Arrow", null, null);

        Assert.assertEquals("Arrow",dog.getName());
    }

    @Test
    public void newDogDobTest(){
        Date expected = new Date(2010,01,01);
        Dog dog = new Dog(null, expected, null);

        String dogName = dog.getName();
        Assert.assertEquals(expected,dog.getBirthDate());
    }

    @Test
    public void newDogIdTest(){
        Dog dog = new Dog(null, null, 1234);

        String dogName = dog.getName();
        Assert.assertEquals("1234",dog.getBirthDate());
    }


    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given (a dog exists)
        Dog dog = new Dog(null, null, null);

        // Then (what we expect returned)
        String str = "bark!";
        Assert.assertEquals(dog.speak(), str);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Date expected = new Date(2010,01,01);
        Dog dog = new Dog(null,null,null);







    }
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword
}
