package com.dikayaav.tests;

public class TestData extends TestBase{

    static String
    firstName = "Alexandra",
    lastName = "Dikaya",
    email = "dikaya@gmail.com",
    maleGender = "Male",
    phone = "1234567880",
    day = "24",
    month = "May",
    year = "1988",
    subject = "Maths",
    hobbie = "Music",
    picture = "img/Alukard.jpg",
    address = "Saint-P, Red kursant, house 4, app 15",
    state = "Haryana",
    city = "Karnal";

    public static String
    randomFirstName = faker.name().firstName(),
    randomLastName = faker.name().lastName(),
    randomEmail = faker.internet().emailAddress(),
    randomAddress = faker.address().fullAddress(),
    randomPhoneNumber = faker.phoneNumber().subscriberNumber(10);




}
