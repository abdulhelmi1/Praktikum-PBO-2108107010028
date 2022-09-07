import java.util.Scanner;

public class barang
{
    public static void main(String[] args)
    {

      Scanner input = new Scanner(System.in);
      int hrg , jml , tot , dskn , totbayar;

      System.out.print("harga barang :");                                      
      hrg = input.nextInt();

      System.out.print("jumlah barang:");
      jml = input.nextInt();
  
     tot = hrg*jml;
     dskn = hrg*jml*15/100;
     totbayar=(hrg*jml) -(hrg * jml * 15/100);
  
    System.out.println("total : " +tot);
    System.out.println("diskon : " +dskn);
    System.out.println("total yang harus dibayar : " +totbayar);
    }
}