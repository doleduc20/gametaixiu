package gametaixiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class game1 {
public static void main(String[] args) {
	double taiKhoan = 50000000;
	Scanner sc = new Scanner(System.in);
	Locale lc = new Locale("vn", "VN");
	NumberFormat numf = NumberFormat.getInstance(lc);
	
	int luaChon=1;
	do {
		System.out.println("-------mời bạn lựa chọn------");
		System.out.println("-------chọn (1) để tiếp tục------");
		System.out.println("-------chọn phím bất kỳ để thoát------");
		luaChon = sc.nextInt();
		if(luaChon==1) {
			System.out.println("-------BẮT ĐẦU CHƠI------");
			System.out.println("-------tài khoản của bạn còn: "+numf.format(taiKhoan)+"----nhập số tiền cược: ");
			//đặt cược
			double datCuoc;
			do {
				System.out.println("-------nhập số tiền cược|Tiền cược lớn hơn 0 và bé hơn hoặc bằng "+numf.format(taiKhoan));
				datCuoc=sc.nextDouble();
			}while(datCuoc<=0||datCuoc>taiKhoan);
			//lựa chọn tài xỉu
			int luaChonTaiXiu =0;
			do {
				System.out.println("Chọn 1 = Xỉu-----Chọn 6 = Tài");
				luaChonTaiXiu=sc.nextInt();
			}while(luaChonTaiXiu!=1&&luaChonTaiXiu!=6);
//			tung xúc xắc
			Random xx1 = new Random();
			int giaTri1=xx1.nextInt(5)+1;
			int giaTri2=xx1.nextInt(5)+1;
			int giaTri3=xx1.nextInt(5)+1;
			int tong= giaTri1+giaTri2+giaTri3;
//			in kết quả
			System.out.println("kết quả:"+giaTri1+ "+" +giaTri2+ "+" +giaTri3+ "=" +tong);
			if(tong==3||tong==18) {
				taiKhoan-=datCuoc;
				System.out.println("Tổng là: "+tong+"Bạn đã thua cược,nhà cái ăn hết");
				System.out.println("Số tiền còn lại là: "+numf.format(taiKhoan));
			}else if(tong>=4&&tong<=10) {
				if(luaChonTaiXiu==1) {
					taiKhoan+=datCuoc;
				System.out.println("Bạn đã thắng,tài khoản còn "+numf.format(taiKhoan));
				}else if(luaChonTaiXiu==6) {
					taiKhoan-=datCuoc;
				System.out.println("Bạn đã thua,tài khoản còn "+numf.format(taiKhoan));	
				}
			}else {
				if(luaChonTaiXiu==6) {
					taiKhoan-=datCuoc;
				System.out.println("bạn đã thua,tài khoản còn: "+numf.format(taiKhoan));
				}
				else if(luaChonTaiXiu==1) {
					taiKhoan+=datCuoc;
				System.out.println("bạn đã thắng,tài khoản còn: "+numf.format(taiKhoan));	
				}
				
				
				
				
				}
			}
			
		
	}while(luaChon==1);
}
}
