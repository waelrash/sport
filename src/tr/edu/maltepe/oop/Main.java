package tr.edu.maltepe.oop;


import javax.xml.stream.util.StreamReaderDelegate;
import java.lang.annotation.Target;

public class Main {

    public static void main(String [] er)  {


        Student st1 = new Student();
        Student st2 = new Student();
        Prof prof1 = new Prof();
        prof1.setName("wael");

        SportCenter sc = new SportCenter();

        st1.playing();
        st1.setName("rashed");
        st2.setName("selin");
        st1.playingFootball(st1.getName(), sc);
        st1.swimming(st2.getName(),sc);
        sc.printMembers();

        System.out.println();


        prof1.playingFootball(prof1.getName(), sc);
        sc.printMembers();






    }
}
