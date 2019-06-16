import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Main {
  public static void main(String[] args) throws IOException {
    LinkedHashMap<String, Integer> jobs = new LinkedHashMap<String, Integer>();
    Scanner file = new Scanner(new File(args[0]));

    while (file.hasNextLine())
      jobs.put(file.nextLine(), Integer.parseInt(file.nextLine()));

    firstComeFirstServe((LinkedHashMap)jobs.clone());
    shortestJobFirst((LinkedHashMap)jobs.clone());
    roundRobin2((LinkedHashMap)jobs.clone());
    roundRobin5((LinkedHashMap)jobs.clone());

    for (String key : jobs.keySet())
      System.out.println(key + " => " + jobs.get(key));
  }

  public void firstComeFirstServe(LinkedHashMap jobs) {

  }

  public void shortestJobFirst(LinkedHashMap jobs) {

  }

  public void roundRobin2(LinkedHashMap jobs) {

  }

  public void roundRobin5(LinkedHashMap jobs) {

  }
}
