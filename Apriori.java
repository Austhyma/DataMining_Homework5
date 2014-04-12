/*
* File: Apriori.java
*/

import java.util.*;
import java.io.*;

public class Apriori {
  private BufferedReader file;
  private double minSupp;
  private double minConf;
  private boolean saveRules;
  
  public Apriori(BufferedReader file, double minSupp, double minConf, boolean saveRules) {
    this.file = file;
    this.minSupp = minSupp;
    this.minConf = minConf;
    this.saveRules = saveRules;
  }
  
  //java Apriori <filename> <minSupp[0, 100]> <minConf[0, 100]> <keepRules>
  public static void main(String[] args) {
    BufferedReader file;
    try {
      file = new BufferedReader(new FileReader(args[0]));
    }
    catch (FileNotFoundException e) {
      System.out.println("Could not find file: " + args[0]);
      return;
    }
    double minSupp = Double.parseDouble(args[1])/100;
    double minConf = Double.parseDouble(args[2])/100;
    boolean rules = (args[3].equals("1"));
    Apriori current = new Apriori(file, minSupp, minConf, rules);
  }
}