package de.neuefische;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FriendTest {

    @Test
    void Friend_Constructor_Getter() {
        //Given
        int numberTom = 02242123456;
        String contactTom = "Tom";
        Friend tom = new Friend(contactTom, numberTom);

        //when
        String actualName = tom.getContactName();
        int actualContactNumber = tom.getPhoneNumber();

        //then
        assertEquals(numberTom,actualContactNumber);
        assertEquals(contactTom,actualName);

    }
    @Test
    void Friend_toString_Name_PhoneNumber(){
        //Given
        int numberTom = 02242123456;
        String contactTom = "Tom";
        Friend tom = new Friend(contactTom, numberTom);

        //when
        String actual = tom.toString();
        System.out.println(tom.toString());
        //then
        assertEquals("Friend{phoneNumber=310945582} Contact{contactName='Tom'}",actual);
    }
}