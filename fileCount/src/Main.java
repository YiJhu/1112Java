import java.io.File;

public class Main {
    public static void main(String[] args) {
        String[] dirList = new String[10000];
        // 路徑
        dirList[0] = "c:/windows";
        int dirCount = 1;
        // 副檔名
        String fileExt = ".exe";
        int fileCount = 0;

        do {
            dirCount--;
            String path = dirList[dirCount];
            File dir = new File(path);
            String[] fileList = dir.list();

            if (fileList != null) {
                try {
                    for (int i = 0; i < fileList.length; i++) {
                        File f = new File(path + "/" + fileList[i]);
                        if (f.isDirectory()) {
                            dirList[dirCount] = f.getPath();
                            dirCount++;
                        } else if (fileList[i].endsWith(fileExt)) {
                            System.out.println(fileList[i]);
                            fileCount++;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.toString());
                }
            }
        }
        while (dirCount > 0);
        System.out.println("exe檔案數量:" + fileCount);
    }
}