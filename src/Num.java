public class Num implements Comparable {
  private int val;
    val = 0;

  public Num(int val) {
    this.val = val;
  }

  public int getVal (); {
    return val;
  }

  public void setVal (int val); {
    this.val = val;
  }

  @Override
  public String toString() {
    return "" + val;
  }

  public boolean equals(Num otherNum)  {
    return this.val == otherNum.val;
  }

  public int compareTo (Object other) {
    Num otherNum = (num) other;
    return this.getValue() - otherNum.getValue() //should be 0 if subtracting 
  }

}
