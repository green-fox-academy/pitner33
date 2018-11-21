package e02Comparator;

import e07Printable.Printable;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing>, Printable {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing o) {
    if (this.completed == o.completed) {
      return this.name.compareTo(o.name);
    } else if (this.completed) {
      return 1;
    } else return  -1;

  }

  @Override
  public void printAllFields() {
    System.out.println(name);
    System.out.println("Completed: " + completed);
  }
}
