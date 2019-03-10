/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 *
 * @author shahzad
 */
public class TestFile {

    public static void main(String[] args) throws IOException {

        File nf = new File("c:/ab.txt");

        File[] drives = File.listRoots();
        // List all files
//        for (File d : drives) {
//            System.out.println("---DRIVE---" + d.getPath());
//            if (d.listFiles() != null) {
//                for (File f : d.listFiles()) {
//                    System.out.println(
//                            (f.isFile() ? "--FILE--" : "--DIR--")
//                            + f.getPath());
//                }
//            }
//        }

        // File Filter
        FilenameFilter txtFile = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith("txt");
            }
        };

        for (File d : drives) {
            System.out.println("---DRIVE---" + d.getPath());
            if (d.listFiles() != null) {
                for (File f : d.listFiles(txtFile)) {
                    System.out.println(
                            (f.isFile() ? "--FILE--" : "--DIR--")
                            + f.getPath());
                    System.out.println(
                            found(f, "v.txt")
                    );
                }
            }
        }

        // Delete 
        File fD = new File("c:/abc.txt");
        fD.createNewFile() ;
        if (fD.exists() == true) {
            System.out.println("File [" + fD.getPath() + "] doesn't exists ");
        }
        if (fD.delete() == false) {
            System.out.println("File [" + fD.getPath() + "] cannot be deleted ");
        }

        // Rename / Move
        fD.renameTo(new File("c:/bcd.txt"));

    }

    public static boolean found(File f, String fileName) {
        if (f.isFile()) {
            return f.getPath().contains(fileName);
        }
        if (f.listFiles() != null) {
            for (File ff : f.listFiles()) {
                boolean b = found(ff, fileName);
                if (b == true) {
                    return b;
                }
            }
        }
        return false;
    }

}
