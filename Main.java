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

    firstComeFirstServe(jobs);
    shortestJobFirst(jobs);
    roundRobin(jobs, 2);
    roundRobin(jobs, 5);
  }

  public static void firstComeFirstServe(LinkedHashMap<String, Integer> jobs) {
    int time = 0;
    int tat = 0;

    System.out.println("First Come First Serve (FCFS)");
    System.out.println("Job\t\tStart Time\tEnd Time\tJob Description");

    for (String job : jobs.keySet()) {
      System.out.print(job + "\t\t" + time + "\t\t");
      time += jobs.get(job);
      tat += time;
      System.out.println(time + "\t\t" + "Completed " + job + " @" + time);
    }

    System.out.print("\n");
    System.out.println("Average turnaround time: " + (tat / jobs.keySet().size()));
    System.out.print("\n");
  }

  public static void shortestJobFirst(LinkedHashMap<String, Integer> jobs) {

  }

  public static void roundRobin(LinkedHashMap<String, Integer> jobs, int ts) {

  }
}
