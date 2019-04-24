package com.sparta.vk;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RatesDeserialiser ratesDeserialiser = new RatesDeserialiser("resources/rates.json");

        System.out.println(ratesDeserialiser.ratesMappedDTO.isSuccess());

        System.out.println(ratesDeserialiser.ratesMappedDTO.getRates("GBP"));

        System.out.println(ratesDeserialiser.ratesMappedDTO.getBase());

        System.out.println(ratesDeserialiser.ratesMappedDTO.getDate());

        System.out.println(ratesDeserialiser.ratesMappedDTO.getTimestamp());
    }
}
