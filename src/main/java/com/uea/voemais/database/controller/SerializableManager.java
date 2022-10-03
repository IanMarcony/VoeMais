package com.uea.voemais.database.controller;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableManager {

  public static <T> void saveObject(String filename, T object) {
    try {
      FileOutputStream fileOut = new FileOutputStream(filename);
      ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
      objectOut.writeObject(object);
      objectOut.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
