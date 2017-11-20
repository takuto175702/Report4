package jp.ac.uryukyu.ie.e175702;

public class Main {
    public static void main(String[] args){
        try {
            String str = "3．14";
            double value = Double.parseDouble(str);

        }catch(NullPointerException e){
            System.out.println("例外が発生しました!!");
            System.out.println("代入されている文字列：" + e.getMessage());



        }
    }
}
