/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkasir;
import java.util.Scanner;
/**
 *
 * @author macbook
 */
public class Programkasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

System.out.println("	Fantastic Food Restaurant ");
System.out.println("	Sekali Makan Ketagihan"); 
System.out.println("	Coba Dan Dapatkan Voucher Makanan Gratis");

Scanner scan = new Scanner (System.in);
int a = 0;
int total ,total1 ,bayar;
int price = 0;
int b= 150000 ,c=30000 ,d=28000 ,e=25000 ,f=24000 ,g=23000 ,h=21000 ,i=20000 ,j=15000 ,k=11000 ,l=8000 ,m=6000 ,n=5000;


System.out.println("*****-------------------------Fantastic Food-------------------------*****");//mencetak nilai dari objek
System.out.println("|	*-DAFTAR MENU-*	|");//mencetak nilai dari objek
System.out.println("|>Paket Hidangan Utama	|");//mencetak nilai dari objek
System.out.println("|100.Bread'n Cheese,Beef Bruschetta,Berry Breeze ice............Rp.150000|");//mencetak nilai dari objek 
System.out.println("|>Daftar Menu Pasta	|");//mencetak nilai dari objek
System.out.println("|1.Beef/Chicken Spaghetti........................................Rp.24000|");//mencetak nilai dari objek
System.out.println("|2.Beef/Chicken Lasagna..........................................Rp.23000|");//mencetak nilai dari objek
System.out.println("|3.Creamy Beef/Chicken Classic........... ...................... .Rp.28000|");//mencetak nilai dari objek
System.out.println("|4.Beef/Chicken Fusilli..........................................Rp.21000|");//mencetak nilai dari objek
System.out.println("|5.Beef/Sausage Spaghetti........................................Rp.20000|");//mencetak nilai dari objek
System.out.println("|Daftar Menu Nasi	|");//mencetak nilai dari objek
System.out.println("|6.Meatballs Beef Mushroom Sauce.................................Rp.30000|");//mencetak nilai dari objek
System.out.println("|7.Fried Rice Black Paper........................................RP.25000|");//mencetak nilai dari objek
System.out.println("|8.Rice Oriental Chicken/Beef....................................Rp.28000|");//mencetak nilai dari objek
System.out.println("|>Daftar Menu Drink	|");//mencetak nilai dari objek
System.out.println("|9.Choco Mint (Cold)..............................................Rp.6000|");//mencetak nilai dari objek
System.out.println("|10.Pepsi/Cola Float..............................................Rp.6000|");//mencetak nilai dari objek
System.out.println("|11.Berry Breeze.................................................Rp.11000|");//mencetak nilai dari objek
System.out.println("|12.Vanilla/Strawberry/Chocolate Milkshake........................Rp.8000|");//mencetak nilai dari objek
System.out.println("|Daftar Menu Dessert	|");//mencetak nilai dari objek
System.out.println("|13.Fruit/Oreo Parfait...........................................Rp.15000|");//mencetak nilai dari objek
System.out.println("|14.Choco Bits................................................... Rp.5000|");//mencetak nilai dari objek
System.out.println("|15.Ice Cream Banana Split........................................Rp.6000|");//mencetak nilai dari objek
System.out.println("Memesan seharga Rp 200000,Anda mendapatkan Beef/Sausage Spaghetti Gratis! ");//mencetak nilai dari objek
System.out.println("Memesan seharga Rp 100000,Anda mendapatkan Fruit/Oreo Parfait Gratis! ");//mencetak nilai dari objek
System.out.println("Memesan seharga Rp 50000,Anda mendapatkan Fruit/Oreo Parfait Gratis! ");//mencetak nilai dari objek


for(String z = "y" ;z.equals("y")||z.equals("Y");)
{
System.out.print("Siahkan Pilih Nomor Menu : ");
a = scan.nextInt();

if (a==100){
System.out.println("Makanan Yang Anda Pilih Hidangan Utama Rp."+b);
price = price + b;
}
else if(a==1){
System.out.println("Makanan Yang Anda Pilih Beef/Chicken Spaghetti Rp."+f);
price = price + f;
}
else if(a==2){
System.out.println("Makanan Yang Anda Pilih Beef/Chicken Lasagna Rp."+g);
price = price + g;
}

else if(a==3){
System.out.println("Makanan Yang Anda Pilih Creamy Beef/Chicken Classic Rp."+d);
price = price + d;
}
else if(a==4){
System.out.println("Makanan Yang Anda Pilih Beef/Chicken Fusilli Rp."+h);
price = price + h;
}
else if(a==5){
System.out.println("Makanan Yang Anda Pilih Beef/Sausage Spaghetti Rp."+i);
price = price + i;
}

else if(a==6){
System.out.println("Makanan Yang Anda Pilih Meatballs Beef Mushroom Sauce Rp."+c);
price = price + c;
}

else if(a==7){
System.out.println("Makanan Yang Anda Pilih Fried Rice Black Paper Rp."+e);
price = price + e;
}

else if(a==8){
System.out.println("Makanan Yang Anda Pilih Rice Oriental Chicken/Beef Rp."+d);
price = price + d;
}
else if(a==9){
System.out.println("Makanan Yang Anda Pilih Choco Mint (Cold) Rp."+m);
price = price + m;
}
else if(a==10){
System.out.println("Makanan Yang Anda Pilih Pepsi/Cola Float Rp."+m);
price = price + m;
}
else if(a==11){
System.out.println("Makanan Yang Anda Pilih Berry Breeze Rp."+k);
price = price + k;
}
else if(a==12){
System.out.println("Makanan Yang Anda Pilih Vanilla/Strawberry/Chocolate Milkshake Rp."+l);
price = price + l;
}

else if(a==13){
System.out.println("Makanan Yang Anda Pilih Fruit/Oreo Parfait Rp."+j);
price = price + j;
}
else if(a==14){
System.out.println("Makanan Yang Anda Pilih Choco Bits Rp."+n);
price = price + n;
}
else if(a==15){
System.out.println("Makanan Yang Anda Pilih Ice Cream Banana Split Rp."+m);
price = price + m;
}
{ 
System.out.print("Apakah ingin memilih menu lagi? Y/T : ");
z = scan.next();
}



System.out.println();
total = price; // melakukan proses perhitungan dari nilai 
System.out.println("Anda harus membayar : Rp. " + total);//mencetak nilai dari objek total
if (price == 200000) {
System.out.println("Selamat Anda mendapatkan Voucher Beef/Sausage Spaghetti Gratis!");
}
if (price == 100000) {
System.out.println("Selamat Anda mendapatkan Voucher Fruit/Oreo Parfait Gratis!");
}
if (price == 50000) {
System.out.println("Selamat Anda mendapatkan Voucher Berry Breeze Gratis!");
}
System.out.print("Bayar : Rp. ");
bayar = scan.nextInt();
total1 = (int) (bayar - total);
System.out.println("Kembaliannya : Rp. " +total1);//mencetak nilai dari objek total1
System.out.println("TERIMA KASIH TELAH MEMESAN");
System.out.println("===============================================================================");
}
}
}
    }
    
}
