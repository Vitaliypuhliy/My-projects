package lesson10.src.com.geekhub.javalessons.task2;

import java.io.File;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class WorkWithFilesApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input 1 for create/reneme and 2 to delete");
        String whatChoose = in.nextLine();
        if (whatChoose.equals("1")) {
            System.out.println("copi here name of the folder you want to rename ");
            System.out.println("dont input nothing for create new");
            String nameForRename = in.nextLine();
            System.out.println("new name folder");
            String newNameFile = in.nextLine();
            try {
                renameOrCreateFolder(nameForRename, newNameFile);
            } catch (NoSuchFieldError e) {
                e.getMessage();
            }
        } else {
            System.out.println("input name folder to delete");
            String nameFolderToDelete = in.nextLine();
            try {
                deleteFolder(nameFolderToDelete);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void renameOrCreateFolder(String nameForRename, String newNameFile) {
        File dir = new File(nameForRename);
        File newNameDir = new File(newNameFile);
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("do you really want to rename");
            dir.renameTo(newNameDir);
        } else {
            dir.mkdir();
            dir.renameTo(newNameDir);
        }
    }

    private static void deleteFolder(String nameFolder) throws Exception {
        File folderToDelete = new File(nameFolder);
        if (folderToDelete.exists()) {
            folderToDelete.delete();
        } else {
            throw new NoSuchFileException("no exist folder ");
        }
    }

}
