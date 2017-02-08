import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by replay on 2017. 2. 4..
 */
public class WordSlicer {


    public List<String> slicer(String dummy){
        //모두 소문자로 변환
        dummy = dummy.toLowerCase();

        //마침표나 콤마를 지운다.
        dummy = dummy.replaceAll(",","").replaceAll("\\.","");

        //삭제를 용이하게 할수있게 리스트 사용
        //띄어쓰기를 기준으로 자른다.
        List<String> data = new ArrayList<String>();
        Collections.addAll(data, dummy.split(" "));


        //데이터 필터링
        data = filtering(data);



        // 테스트용 출력
        for (int i = 0; i <data.size(); i++){
            System.out.println(data.get(i));
        }

        return data;
    }

    private List<String> filtering(List<String> data){

        //한 글자인 것을 삭제


        for (int i = 0; i <data.size(); i++){
            if (data.get(i).length() <= 1){
                data.remove(i);
            }

        }


        //문자 삭제
        String[] needremove = {"i","you","the", "an", "in"};

        for (int i = 0 ; i < needremove.length; i++ ){
            data = removeWord(data, needremove[i]);
        }

        return data;
    }



    private List<String> removeWord(List<String> data, String needremove){
        for (int i = 0 ; i<data.size(); i++){
            if (data.get(i).equals(needremove)){
                data.remove(i);
            }
        }

        return data;
    }

}
