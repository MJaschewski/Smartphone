package de.neuefische;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    void startRadio_return_true(){
        //given
        Smartphone testPhone = new Smartphone();

        //when
        boolean actual = testPhone.startRadio();

        //then
        assertTrue(actual);
    }

    @Test
    void stopRadio_return_false(){
        //given
        Smartphone testPhone = new Smartphone();

        //when
        boolean actual = testPhone.stopRadio();

        //then
        assertFalse(actual);
    }

    @Test
    void getPosition_returns_Cologne(){
        //Given
        Smartphone testPhone = new Smartphone();

        //When
        String actual = testPhone.getPosition();

        //Then
        assertEquals("Cologne",actual);
    }

    @Test
    void toString_returns_Model_Manufacturer_contactList(){
        //Given
        String model = "Iphone";
        String manufacturer = "Apple";

        Contact tom = new Friend();
        Contact max = new Friend();
        Contact ana = new Friend();

        Contact[] contactList = {tom,max,ana};

        Smartphone testPhone = new Smartphone(model, manufacturer, contactList);
        String expected = "Smartphone{model='Iphone', manufacturer='Apple', contactList=[Friend{phoneNumber=0} Contact{contactName='null'}, Friend{phoneNumber=0} Contact{contactName='null'}, Friend{phoneNumber=0} Contact{contactName='null'}]}";

        //When
        String actual = testPhone.toString();

        //Then
        assertEquals(expected,actual);

    }
}