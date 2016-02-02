import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.JodaTimePermission;

/**
 * Created by zhanglei on 15/11/1.
 */
public class JodaTimeTest {
    public static void main(String[] args) {

        System.setSecurityManager(new SecurityManager());
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(new JodaTimePermission("CurrentTime.setProvider"));
        }
    }
}
