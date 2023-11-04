package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

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

        Assert.assertEquals("Arrow", dog.getName());
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
        int expected = 1234;
        int actual = dog.getId();
        Assert.assertEquals(expected, actual);
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
        Dog dog = new Dog(null,null,null);
        Date expected = new Date(2010,01,01);

        dog.setBirthDate(expected);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatFoodTest(){
        //create a dog
        Dog dog = new Dog(null, null, null);

        //have dog eat three meals
        Food food = new Food();
        dog.eat(food);
        dog.eat(food);
        dog.eat(food);

        //Should increase the eaten meals +3, so check length of eatenMeals
        int actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(3,actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void GetIDTest(){
        Dog dog = new Dog(null, null, 1111);
        int expected = 1111;
        int actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword
    @Test
    public void mammalInheritanceTest() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
