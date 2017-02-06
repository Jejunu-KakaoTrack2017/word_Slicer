/**
 * Created by replay on 2017. 2. 4..
 */
public class Main {
    public static String dummy = "Lead with your strengths, not your weaknesses.";

    public static void main(String[] args){
        Main main = new Main();
        main.slicer();
    }

    public void slicer(){
        //마침표나 콤마를 지운다.
        dummy = dummy.replaceAll(",","").replaceAll("\\.","");

        //띄어쓰기를 기준으로 자른다.
        String[] data = dummy.split(" ");

        for (int i = 0; i <data.length; i++){
            System.out.println(data[i]);
        }
    }
}
