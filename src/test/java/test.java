import org.junit.Assert;

/**
 * Created by replay on 2017. 2. 6..
 */
public class test {

    @org.junit.Test
    public void test_문장을_단어단위로자른다(){
        String dummy = "Lead with your strengths, not your weaknesses.";

        WordSlicer wordSlicer = new WordSlicer();

        Assert.assertNotNull(wordSlicer.slicer(dummy));

    }
}