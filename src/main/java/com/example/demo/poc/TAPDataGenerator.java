package com.example.demo.poc;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.demo.poc.model.RowsItem;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


public class TAPDataGenerator {

  public static void main(String[] args) {

    List<Integer> luckNumbers = Arrays.asList(5, 13, 19, 26, 38, 48);

    RowsItem item = null;
    try (JsonReader reader = new JsonReader(new FileReader("C:\\Users\\hughx\\Documents\\Rainie\\Java\\project\\Project Powerball\\tap.txt"))) {

      reader.beginObject();
      Gson gson = new GsonBuilder().create();
      reader.nextName();
      reader.beginArray();
      item = gson.fromJson(reader, RowsItem.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    List<Integer> numbers=Stream.iterate(1,x->x+1).limit(45).collect(Collectors.toList());
    try (JsonWriter writer = new JsonWriter(new FileWriter("C:\\Users\\hughx\\Documents\\Rainie\\Java\\project\\Project Powerball\\tap_data.txt"))) {

      writer.setIndent("    ");
      writer.beginObject();
      Gson gson = new GsonBuilder().create();
      writer.name("rows");
      writer.beginArray();
      for(long i=0;i<1000*1000;i++) {
        item.setPurchaser("buyer"+i);
        Collections.shuffle(numbers);
        List<Integer> entryNumbers=numbers.subList(0,6);
            entryNumbers.sort(Comparator.comparingInt(x->x));
        item.setEntrynumbers(entryNumbers);
        gson.toJson(item, RowsItem.class, writer);
      }

      writer.endArray();
      writer.endObject();
//      System.out.println(item.getPurchaser()+":"+item.getEntrynumbers());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
