package app.serialization;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author nishom
 */
public class UserManager implements Serializable {

    private String no;
    private String jenis;
    private List<User> items;

    public void setNo(String no) {
        this.no = no;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setItems(List<User> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        String usermanager, item = "";
        usermanager = "UserManager: \r\n"
                + "No=" + no + "\r\n"
                + "Jenis=" + jenis + "\r\n"
                + "=======================\r\n"
                + "User:\r\n";
        item = items.stream().map((obj)
                -> obj.toString()).reduce(item, String::concat);
        return usermanager + item;
    }
}
