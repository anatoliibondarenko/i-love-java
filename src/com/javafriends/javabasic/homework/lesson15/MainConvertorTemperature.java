package com.javafriends.javabasic.homework.lesson15;

import com.javafriends.javabasic.homework.utils.Utils;

import java.io.IOException;
import java.util.Locale;

public class MainConvertorTemperature {

    public static void main(String[] args) throws IOException {

        Convertor convertor = null;
        do {
            double temperature = Utils.getIntNumber("Enter degrees of celsius to convert", -273);
            String scale;
            do {
                scale = Utils.getString("Input scale to convert. Valid input is 'K' or 'F':").toUpperCase(Locale.ROOT);
            }
            while (!(scale.equals("K") || scale.equals("F")));

            switch (scale) {
                case "K" -> convertor = new KelvinTemperature();
                case "F" -> convertor = new FahrenheitTemperature();
            }
            System.out.println(convertor.convert(temperature));
        }

        while (!Utils.getString("Type EXIT to exit or anything for next convert").equals("EXIT"));
    }
}
