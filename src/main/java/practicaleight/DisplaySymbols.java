package practicaleight;

/**
 * The DisplaySymbols class will input a symbol and a count and create a
 * symbolic triangular display in the terminal window.
 **/
public class DisplaySymbols {

  // TODO Add a Javadoc comment describing what this method does
  public void displaySymbolInTriangle(int maximumRows, String symbol) {
    int row = 1;
    while (row <= maximumRows) {
      int symbolCount = 1;
      while (symbolCount <= row) {
        System.out.print(symbol);
        symbolCount++;
      }
      row++;
      System.out.println();
    }
  }

  // TODO Add a Javadoc comment describing what this method does
  public void displaySymbolInDoubleTriangle(int maximumRows, String symbol) {
    // TODO: Add a full implementation of this method, leveraging the
    // source code from the displaySymbolInTriangle method and your knowledge
    // of iteration constructs.
  }
}
