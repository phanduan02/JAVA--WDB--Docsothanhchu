import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadNumber {
  private static String ChuSo[] = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
  private static String DonVi[] = new String[]{"Hundered", "Billion", "Ten", "Hundred", "Thousand", "Ten", "Hundred", "Million", "Ten"};

  public static void main(String[] args) {
    long so = new Scanner(System.in).nextLong();
    long temp = so;
    String result = "";

    ArrayList<Long> numberList = getNumberLetter(so);

    int count = countNumberLetter(numberList);

    for (int j = 0; j<numberList.size(); j++) {
      String CS = ChuSo[Math.toIntExact(numberList.get(j))];
      String DV = DonVi[(count - j) % 9];

      if (CS == "Zero") {
        continue;
      }
      else if (CS == "One" && DV == "Ten") {
        long num = numberList.get(j)*10+numberList.get(j+1);
        j++;
        result += " " + readNumberBetween10and20(num) + " ";
      }
      else if (CS == "Two" && DV == "Ten") {
        result += "Twenty ";
      }
      else if (CS == "Three" && DV == "Ten") {
        result += "Thirty ";
      }
      else if (CS == "Four" && DV == "Ten") {
        result += "Forty ";
      }
      else if (CS == "Five" && DV == "Ten") {
        result += "Fifty ";
      }
      else if (CS == "Six" && DV == "Ten") {
        result += "Sixty ";
      }
      else if (CS == "Seven" && DV == "Ten") {
        result += "Seventy ";
      }
      else if (CS == "Eight" && DV == "Ten") {
        result += "Eighty ";
      }
      else if (CS == "Nine" && DV == "Ten") {
        result += "Ninety ";
      }
      else result += CS + " " + ((j < count - 1) ? DV : "") + " ";
    }
    System.out.println(result);
  }

  private static ArrayList<Long> getNumberLetter(long num) {
    ArrayList<Long> numberList = new ArrayList<Long>();
    long temp = num;
    while (temp != 0) {
      numberList.add(temp % 10);
      temp /= 10;
    }
    Collections.reverse(numberList);
    return numberList;
  }

  private static int countNumberLetter(ArrayList<Long> list) {
    int size = list.size();
    return size;
  }

  private static String readNumberBetween10and20(long num) {
    switch ((int) num) {
      case 10:
        return "ten";
      case 11:
        return "eleven";
      case 12:
        return "twelve";
      case 13:
        return "thirteen";
      case 14:
        return "fourteen";
      case 15:
        return "fifteen";
      case 16:
        return "sixteen";
      case 17:
        return "seventeen";
      case 18:
        return "eighteen";
      case 19:
        return "nineteen";
      case 20:
        return "twenty";
    }
    return null;
  }
}

//import java.util.ArrayList;
//import java.util.Collections;
//
//public class ReadNumber {
//  private static String ChuSo[] = new String[]{"Khong", "Mot", "Hai", "Ba", "Bon", "Nam", "Sau", "Bay", "Tam", "Chin"};
//  private static String DonVi[] = new String[]{"Tram", "Ty", "Muoi", "Tram", "Nghin", "Muoi", "Tram", "Trieu", "Muoi"};
//
//  public static void main(String[] args) {
//    int so = 12;
//    int temp = so;
//    String result = "";
//
//    ArrayList<Integer> numberList = getNumberLetter(so);
//
//    int count = countNumberLetter(numberList);
//    int i = 0;
//
//    for (int item:
//      numberList) {
//      String CS = ChuSo[item];
//      String DV = DonVi[(count-i) % 9];
//
//      if (CS == "Mot" && DV == "Muoi") result += "Muoi ";
//      else result += CS + " " + ((i < count -1) ? DV : "") + " ";
//
//      i++;
//    }
//
//    System.out.println(result);
//  }
//
//  private static ArrayList<Integer> getNumberLetter(int num) {
//    ArrayList<Integer> numberList = new ArrayList<Integer>();
//    int temp = num;
//    while (temp != 0) {
//      numberList.add(temp % 10);
//      temp /= 10;
//    }
//    Collections.reverse(numberList);
//    return numberList;
//  }
//
//  private static int countNumberLetter(ArrayList<Integer> list) {
//    int size = list.size();
//    return size;
//  }
//}