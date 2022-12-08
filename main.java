public class CPUIntensive {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        while (true) {
          // Do nothing
        }
      }).start();
    }
  }
}
