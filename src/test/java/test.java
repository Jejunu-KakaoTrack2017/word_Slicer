import org.junit.Assert;

/**
 * Created by replay on 2017. 2. 6..
 */
public class test {

    @org.junit.Test
    public void test_문장을_단어단위로자른다(){
        String dummy = "Lead with your strengths, not your weaknesses.";
        String dummy2 = "In times of change, learners inherit the earth, while the learned find themselves beautifully equipped to deal with a world that no longer exists.";


        WordSlicer wordSlicer = new WordSlicer();

        Assert.assertNotNull(wordSlicer.slicer(dummy2));

    }
}