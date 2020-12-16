import java.time.Period;
import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
//    int[] numbers = {1, 2, 3, 4, 5};
//System.out.println(numbers);
//
//
        Person[] personArr = new Person[3];
            personArr[0] = new Person("ted");
            personArr[1] = new Person("ted");
            personArr[2] = new Person("ted");
//        for(Person person : personArr) {
//            System.out.println(person.getName());
//        }
//
       Person[] newPArr = addPerson(personArr, new Person("tod"));
        for (Person person: newPArr) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] pArr, Person person) {
    Person[] newArr = Arrays.copyOf(pArr,pArr.length + 1);
       newArr[newArr.length-1] = person;
       return newArr;
    }



}
