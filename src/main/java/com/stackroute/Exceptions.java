package com.stackroute;

public class Exceptions {


    public String Negative()
    {
        try{

            throw new NegativeArraySizeException();

        }
        catch (NegativeArraySizeException n){
            return "NegativeArraySizeException";
        }
    }
    public String Index()
    {
        try{

            throw new IndexOutOfBoundsException();

        }
        catch (IndexOutOfBoundsException n){
            return "IndexOutOfBoundsException";
        }
    }
    public String Null()
    {
        try{

            throw new NullPointerException();

        }
        catch (NullPointerException n){
            return "NullPointerException";
        }
    }

}
