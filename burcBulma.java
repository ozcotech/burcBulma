import java.util.Scanner;

public class burcBulma{

  public static void main(String[] args) {
    
    int gun, ay;

    Scanner date = new Scanner(System.in);

    System.out.print("Doğduğunuz Günü Giriniz: ");
    gun = date.nextInt();

    System.out.print("Doğduğunuz Ayı Giriniz: ");
    ay = date.nextInt();

    System.out.print("Burcunuz: ");

    if (ay > 12 || gun > 31){
      System.out.println("Hatalı Vergi Girdiniz..");
    }

    else if (ay == 1){
      if (gun >= 22){
        System.out.println("Kova");
      }
      else{
        System.out.println("Oğlak");
      }
    }

    else if (ay == 2){
      if (gun >=20){
        System.out.println("Balık");
      }
      else{
        System.out.println("Kova");
      }
    }

    else if (ay == 3){
      if (gun >=21){
        System.out.println("Koç");
      }
      else{
        System.out.println("Balık");
      }
    }

    else if (ay == 4){
      if (gun >=21){
        System.out.println("Boğa");
      }
      else{
        System.out.println("Koç");
      }
    }

    else if (ay == 5){
      if (gun >=21){
        System.out.println("İkizler");
      }
      else{
        System.out.println("Boğa");
      }
    }

    else if (ay == 6){
      if (gun >=22){
        System.out.println("Yengeç");
      }
      else{
        System.out.println("İkizler");
      }
    }

    else if (ay == 7){
      if (gun >=22){
        System.out.println("Aslan");
      }
      else{
        System.out.println("Yengeç");
      }
    }

    else if (ay == 8){
      if (gun >=23){
        System.out.println("Başak");
      }
      else{
        System.out.println("Aslan");
      }
    }

    else if (ay == 9){
      if (gun >=23){
        System.out.println("Terazi");
      }
      else{
        System.out.println("Başak");
      }
    }

    else if (ay == 10){
      if (gun >=23){
        System.out.println("Akrep");
      }
      else{
        System.out.println("Terazi");
      }
    }

    else if (ay == 11){
      if (gun >=22){
        System.out.println("Yay");
      }
      else{
        System.out.println("Akrep");
      }
    }

    else if (ay == 12){
      if (gun >=22){
        System.out.println("Oğlak");
      }
      else{
        System.out.println("Yay");
      }
    }

    

    date.close();

  }

}