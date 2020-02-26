import java.io.File;

public class FileSize {

    public static long getSize(File file){
        long size = 0;
        if(!file.exists())
            return 0;
        if (file.isDirectory()){
            File[] list = file.listFiles();
            if(list != null){
                for(File element : list)
                    size += getSize(element);
            }
        } else {
            size += file.length();
        }
        return size;
    }

    public static void main(String[] args) {
        File file = new File("D:\\");
        System.out.println(getSize(file));
    }

}
