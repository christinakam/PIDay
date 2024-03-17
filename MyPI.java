public class MyPI {
  private static String PI;  // millions of digits of PI
  private static long NUMPI; // number of digits of PI
  public static String getPI() {
    return PI;
  }
  public static void setPI(String in_) {
    PI = in_;
  }
  public static long getNUMPI() {
    return NUMPI;
  }
  public static String [] getSubs(String s_) {
    s_ = s_.replace("/", "");
    String[] us = new String[s_.length()];
    for (int i = 0; i < s_.length(); i++) {
      char single = s_.charAt(i);
      if (single == '/') {
        continue;
      }
      us[i] = s_.substring(0, i+1);
    }
    return us;
  }
  public static int findinPI(String in_) {
   int out = -1;
    for (int i = 0; i < PI.length() - in_.length(); i++) {
      if (PI.substring(i, i + in_.length()).equals(in_)) {
        out = i;
        break;
      }
    } 
    return out;
  }
}
