import org.junit.Assert;

/**
 * Created by replay on 2017. 2. 6..
 */
public class test {

    @org.junit.Test
    public void test_문장을_단어단위로자른다(){
        String dummy = "Lead with your strengths, not your weaknesses.";
        String dummy2 = "In times of change, learners inherit the earth, while the learned find themselves beautifully equipped to deal with a world that no longer exists.";
        String dummy3 = "abc a the an thth w ";
        String dummy4 = "Dear Kim Jae Hyeon,\n" +
                "Thank you for the reservation.\n" +
                "Cherry blossoms are very beautiful. I hope cherry blossoms can be seen on the day you come.\n" +
                "Here is the house guide. Please go to the following website to download it, and read it through before your trip.\n" +
                "http://firestorage.com/groups/86bd89b20c670eda205408edd114ef42964f91b5\n" +
                "It is a zip file and cannot be opened on mobile phones. \n" +
                "If you cannot open the zip file, please download the divided files from the following URL.\n" +
                "http://firestorage.com/groups/c8b519036b2a5d9b97c672f3775a8793024f2bda\n" +
                "Please message me if you cannot download those files.\n" +
                "Normally you can use the room from 4PM. \n" +
                "CHECK IN - after 4PM \n" +
                "CHECK OUT - before 10AM \n" +
                "Cleaning should be done sometime between 10AM and 4PM. \n" +
                "You can come to drop off your luggage anytime after 11AM on the day of your check-in. Please let me know beforehand if you want to do it. \n" +
                "Please understand that I cannot keep your luggage after you check out. \n" +
                "There are coin-lockers around the apartment or the station. Please use them after your check-out.\n" +
                "Please do not take a call from stranger on an intercom.\n" +
                "Some guests press an emergency button by mistake. This button is connected to all rooms and a management room. If you press it, a fire truck might come. Please don’t press it by mistake.\n" +
                "Please check the following sections in the manual carefully again. \n" +
                "- Entrance auto unlock way from the room \n" +
                "- Switch-related operation method in the room\n" +
                "An elevator and bicycle parking on the ground floor are common space for people living in the apartment. It is prohibited to leave you own luggage.\n" +
                "I will prepare a mobile wi-fi in the room. \n" +
                "Although you can use it anywhere inside and outside of the apartment, please return it and its cords when checking out.\n" +
                "**Important** \n" +
                "Please be sure to download and print out the following documents. \n" +
                "There is information for getting to the apartment from a station and also checking in. \n" +
                "Some guests forget to print out those instructions and get lost in Japan. Therefore I really recommend bringing them to avoid troubles and to make your checking smooth. \n" +
                "・How to access from Kansai Airport to the apartment \n" +
                "・How to receive the apartment key\n" +
                "Thank you for your cooperation and understanding in advance. \n" +
                "If you need further assistance, please feel free to contact me. \n" +
                "I would be happy to help you.\n" +
                "Sorry for the long message.\n" +
                "Best regards, \n" +
                "Toyoko";


        WordSlicer wordSlicer = new WordSlicer();

        Assert.assertNotNull(wordSlicer.slicer(dummy4));

    }
}