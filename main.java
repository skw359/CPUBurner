public class CPUBurner {
  public static void main(String[] args) {
    for (int i = 0; i < 100000; i++) {
      new Thread(() -> {
        while (true) {
          // Do nothing
        }
      }).start();
    }
  }
}
