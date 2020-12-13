package com;

import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.After;

public class PrepareToRequest
{
    RequestSpecification requestSpecification;
    public String wantedData;

    @Before
    public void setUp() throws Exception
    {
        init();
    }

    private void init() throws Exception
    {
        RestAssured.baseURI="http://www.omdbapi.com/";  //Baseurl'i tanımla
        wantedData= "Harry Potter";
    }

    @After
    public void tearDown()
    {
    }
}
