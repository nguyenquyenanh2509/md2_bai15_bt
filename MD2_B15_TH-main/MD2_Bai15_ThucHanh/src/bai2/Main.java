package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        for (int i=0; i<arr.length;i++){
            arr[i]= (int) (Math.random()*100);
        }
        System.out.println("Nhap vao chi so index muon kiem tra gia tri: ");
        do {
            try {
                int inutindex=Integer.parseInt(sc.nextLine());
                System.out.println("Giá trị của phần tử có chỉ số " + inutindex + " là "+ arr[inutindex]);
            }catch (IndexOutOfBoundsException e){
                System.err.println("Chỉ số vượt quá giới hạn của mảng nhập lại: ");
            }catch (NumberFormatException e){
                System.out.println("Nhap vao 1 so nguyen");
            }
        }while (true);
    }
}