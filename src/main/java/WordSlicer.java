import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by replay on 2017. 2. 4..
 */
public class WordSlicer {


    public List<String> slicer(String dummy){
        //마침표나 콤마를 지운다.
        dummy = dummy.replaceAll(",","").replaceAll("\\.","");

        //삭제를 용이하게 할수있게 리스트 사용
        //띄어쓰기를 기준으로 자른다.
        List<String> data = new ArrayList<String>();
        Collections.addAll(data, dummy.split(" "));

        //한 글자인 것을 삭제
        for (int i = 0; i <data.size(); i++){
            if (data.get(i).length() <= 1){
                data.remove(i);
            }
            else{

            }

        }


        // 테스트용 출력ㄱ
        for (int i = 0; i <data.size(); i++){
            System.out.println(data.get(i));
        }

        return data;
    }
}
