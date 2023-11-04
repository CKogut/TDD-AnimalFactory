package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName() {
        Cat cat = new Cat(null, null, null);

        cat.setName("Balthy");

        Assert.assertEquals("Balthy", cat.getName());
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        Cat cat = new Cat(null, null, null);

        Assert.assertEquals("meow!", cat.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        Cat cat = new Cat(null, null, null);
        Date expected = new Date(2020 - 02 - 02);
        cat.setBirthDate(expected);

        Assert.assertEquals(expected, cat.getBirthDate());

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEatFood(){
        Cat cat = new Cat(null, null, null);

        //have dog eat three meals
        Food food = new Food();
        cat.eat(food);
        cat.eat(food);

        //Should increase the eaten meals +3, so check length of eatenMeals
        int actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(2,actual);
    }

    // TODO - Create tests for `Integer getId()`
    

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

}
