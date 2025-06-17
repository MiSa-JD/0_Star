public class Main {
  public static void main(String[] args) {
    System.out.println("1.");
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n2.");
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j) {
        if (i == j)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    System.out.println("\n3.");
    for (int i = 4; i >= 0; --i) {
      for (int j = 0; j < 5; ++j) {
        if (i == j)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    System.out.println("\n4.");
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j) {
        if(i == j || 4 - i == j)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    System.out.println("\n5.");
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j) {
        if (i >= j)
          System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n6.");
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j) {
        if (j < 4-i)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n7.");
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j)
        System.out.print("*");
      for (int j = 0; j < i; ++j)
        System.out.print("*");
      System.out.println();
    }

    System.out.println("\n8.");
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j) {
        if (j < 4-i)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      for (int j = 0; j < i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n9.");
    for (int i = 0; i < 5; ++i) {
      if (i < 3) {
        for (int j = 0; j < i; ++j) {
          System.out.print(" ");
        }
        for(int j = 0; j < 5-i*2; ++j)
          System.out.print("*");
      }
      else {
        for (int j = 0; j < (4-i); ++j) {
          System.out.print(" ");
        }
        for(int j = 0; j < 5-(4-i)*2; ++j)
          System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n10.");
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j) {
        if (i < 3) {
          if (j <= i || 4 - i <= j)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        if (i >= 3) {
          if (i <= j || 4 - i >= j)
            System.out.print("*");
          else
            System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}