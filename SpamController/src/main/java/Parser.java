

import java.io.FileInputStream;

import java.io.IOException;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import org.apache.james.mime4j.parser.Field;
/**
 * Created by NATA on 27.11.2017.
 */
public class Parser {
public static void Parser(String email) throws IOException {
    FileInputStream file=new FileInputStream(email);
    org.apache.james.mime4j.message.Message msg=new org.apache.james.mime4j.message.Message(file);
    String id=msg.getMessageId();

    System.out.println(id);
}

    public static void main(String[] args) throws IOException {
        Parser("ll.eml");
    }
}
