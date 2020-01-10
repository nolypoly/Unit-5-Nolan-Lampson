public class Task implements PriorityInterface {

  private String name;
  private int priorityLevel;
  private boolean isComplete;

  public Task (String name, int priorityLevel) {
    this.name = name;
    isComplete = false;
    this.priorityLevel = priorityLevel;
  }

  public void setPriority (int priorityLevel) {
    this.priorityLevel = priorityLevel;
  }

  public int getPriority() {
    return priorityLevel;
  }

  public void doTask() {
    System.out.println("Doing task...");
    isComplete = true;
    this.setPriority(0);
  }

  public String toString() {
    return "Task: " + name + "\n Priority: " + this.getPriority(); 
  }

}
