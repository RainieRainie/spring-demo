package com.example.demo.poc;

import com.example.demo.poc.model.RowsItem;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class TAP {
    public static void main(String[] args) {
        List<Integer> luckNumbers = Arrays.asList(5, 13, 19, 26, 38, 48);
        try (JsonReader reader = new JsonReader
                (new FileReader("C:\\Users\\hughx\\Documents\\Rainie\\Java\\project\\Project Powerball\\tap_data.txt")))
        {

            reader.beginObject();
            Gson gson = new GsonBuilder().create();
            reader.nextName();
            reader.beginArray();
            while (reader.hasNext()) {
                RowsItem item = gson.fromJson(reader, RowsItem.class);
                if (item.getEntrynumbers().stream().filter(luckNumbers::contains).count() >= 4) {
                    System.out.println(item.getPurchaser() + ":" + item.getEntrynumbers());
                }
////
//                List<Integer> nums=item.getEntrynumbers();
//                int count=0;
//                for(Integer n:nums){
//                   if(luckNumbers.contains(n)){
//                       count++;
//                   }
//                }
//                if(count>=4){
//                    if(count>=4){
//                        System.out.println(item.getPurchaser()+":"+item.getEntrynumbers());
                }



            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
