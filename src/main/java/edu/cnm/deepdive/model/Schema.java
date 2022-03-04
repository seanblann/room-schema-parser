package edu.cnm.deepdive.model;

import java.util.stream.Stream;

public class Schema implements Streamable{


  private Database database;

  public Database getDatabase() {
    return database;
  }

  public void setDatabase(Database database) {
    this.database = database;
  }

  @Override
  public Stream<String> stream() {
    return database.stream();
  }
}
