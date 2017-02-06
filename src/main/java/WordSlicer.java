/**
 * Created by replay on 2017. 2. 4..
 */
public class WordSlicer {


    public String[] slicer(String dummy){
        //마침표나 콤마를 지운다.
        dummy = dummy.replaceAll(",","").replaceAll("\\.","");

        //띄어쓰기를 기준으로 자른다.
        String[] data = dummy.split(" ");

        for (int i = 0; i <data.length; i++){
            System.out.println(data[i]);
        }

        return data;
    }
}
