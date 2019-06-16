import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.ArrayList;

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
    float tat = 0.f;

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

  @SuppressWarnings("unchecked")
  public static void roundRobin(LinkedHashMap<String, Integer> jobs, int ts) {
    LinkedHashMap<String, Integer> jobMap = (LinkedHashMap<String, Integer>)jobs.clone();
    ArrayList<String> processQueue = new ArrayList<String>();
    int time = 0;
    float tat = 0.f;

    for (String job : jobs.keySet())  processQueue.add(job);

    System.out.println("Round Robin, time slice = " + ts + " (RR-" + ts + ")");
    System.out.println("Job\t\tStart Time\tEnd Time\tJob Description");

    while (!processQueue.isEmpty()) {
      String job = processQueue.remove(0);
      System.out.print(job + "\t\t" + time + "\t\t");

      if (jobMap.get(job) <= ts) {
        time += jobMap.get(job);
        tat += time;
        jobMap.put(job, 0);
        System.out.println(time + "\t\t" + "Completed " + job + " @" + time);
      }
      else {
        time += ts;
        jobMap.put(job, jobMap.get(job) - ts);
        System.out.println(time);
        processQueue.add(job);
      }
    }

    System.out.print("\n");
    System.out.println("Average turnaround time: " + (tat / jobs.keySet().size()));
    System.out.print("\n");
  }
}
