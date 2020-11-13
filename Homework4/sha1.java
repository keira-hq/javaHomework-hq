import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

public class sha1 {
    public static byte[] SHA1Checksum(String path) throws Exception {
        // 用于计算hash值的文件缓冲区
        byte[] buffer = new byte[1024];
        // 使用SHA1哈希/摘要算法
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead = 0;

        //文件夹深度优先遍历
        File dir = new File(path);
        File[] fs = dir.listFiles();
        if(fs==null){
          return complete.digest();
        }
        //排序 防止读重
        Arrays.sort(fs);

        for (int i = 0; i < fs.length; i++) {
            if (fs[i].isFile()) {
                FileInputStream is = new FileInputStream(fs[i]);
                do {
                    // 读出numRead字节到buffer中
                    numRead = is.read(buffer);
                    if (numRead > 0) {
                        // 根据buffer[0:numRead]的内容更新hash值
                        complete.update(buffer, 0, numRead);
                    }
                    // 文件已读完，退出循环
                } while (numRead != -1);
                // 关闭输入流
                is.close();
            }
            if (fs[i].isDirectory()) {
                SHA1Checksum(path + File.separator + fs[i].getName());
            }
        }
        return complete.digest();
    }


    public static void main(String[] args) {
        try {
            byte[] sha1 = SHA1Checksum("/Users/huangqi/sha1test");
            String result = "";
            for (int i = 0; i < sha1.length; i++) {
                result += Integer.toString((sha1[i] & 0xff) + 0x100, 16).substring(1);
            }
            System.out.println("hash-sha1 for directory is: "+result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
