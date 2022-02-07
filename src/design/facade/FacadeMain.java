package design.facade;

import design.facade.Ftp;
import design.facade.Reader;
import design.facade.SftpClient;
import design.facade.Writer;

public class FacadeMain {

    public static void main(String[] args) {
        /**
         * Facade 미적용
         */
        Ftp ftpClient = new Ftp("www.chu.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();

        /**
         * Facade 패턴 적용
         */
        SftpClient sftpClient = new SftpClient("www.chu.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();
    }
}
