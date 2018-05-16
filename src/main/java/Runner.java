
import folder.db.DBFolder;
import folder.db.DBHelper;
import folder.models.File;
import folder.models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("week08day02");
        DBHelper.save(folder1);
        Folder folder2 = new Folder("Recycle Bin");
        DBHelper.save(folder2);

        File file1 = new File("Homework", ".java", 2, folder1);
        DBHelper.save(file1);
        File file2 = new File("Autoclicker", ".bat", 2, folder2);
        DBHelper.save(file2);

        List<File> files = DBHelper.getAll(File.class);

        List<Folder> folders = DBHelper.getAll(Folder.class);

        File foundfile = DBHelper.find(File.class, file2.getId());

        Folder foundfolder = DBHelper.find(Folder.class, folder1.getId());

        List<File> filesInFolder = DBFolder.getFilesInFolder(foundfolder);
    }
}
