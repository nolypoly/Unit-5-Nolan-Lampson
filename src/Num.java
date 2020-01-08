public class Num {
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







}
