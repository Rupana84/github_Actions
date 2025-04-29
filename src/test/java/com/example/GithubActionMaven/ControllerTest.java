package com.example.GithubActionMaven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControllerTest {

    @Test
    void methodShouldreturnSum(){
        //arange
        Controller controller=new Controller();


        //act
        int result =controller.add(5,5);
        //assert
        assertEquals(10,result);
    }

    @Test
    void methodreturndivision(){
        //arange
        Controller controller=new Controller();


        //act
        double result =controller.division( 5, 2);
        //assert
        assertEquals(2.5 ,result);
    }


}
