import java.util.ArrayList;
import java.util.Collections;

public class ReadNumber {
  private static String ChuSo[] = new String[]{"Khong", "Mot", "Hai", "Ba", "Bon", "Nam", "Sau", "Bay", "Tam", "Chin"};
  private static String DonVi[] = new String[]{"Tram", "Ty", "Muoi", "Tram", "Nghin", "Muoi", "Tram", "Trieu", "Muoi"};

  public static void main(String[] args) {
    int so = 12;
    int temp = so;
    String result = "";

    ArrayList<Integer> numberList = getNumberLetter(so);

    int count = countNumberLetter(numberList);
    int i = 0;

    for (int item:
      numberList) {
      String CS = ChuSo[item];
      String DV = DonVi[(count-i) % 9];

      if (CS == "Mot" && DV == "Muoi") result += "Muoi ";
      else result += CS + " " + ((i < count -1) ? DV : "") + " ";

      i++;
    }

    System.out.println(result);
  }

  private static ArrayList<Integer> getNumberLetter(int num) {
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    int temp = num;
    while (temp != 0) {
      numberList.add(temp % 10);
      temp /= 10;
    }
    Collections.reverse(numberList);
    return numberList;
  }

  private static int countNumberLetter(ArrayList<Integer> list) {
    int size = list.size();
    return size;
  }
}