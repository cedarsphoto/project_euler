package eulerProblems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

import common.helper.*;

public class Euler_Problem_22 {

    /*

    Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?

     */

    // use a treeset for sorted, unique entries
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\david\\Documents\\GitHub\\project_euler\\src\\main\\java\\common\\p022_names.txt";

        // reads the file from the path above into a BufferedReader object called reader
        BufferedReader reader = new BufferedReader(new FileReader(path));
        // reads into a single line string
        String firstline = reader.readLine();
        // strings all " characters out of the file to make it easier to parse
        String cleanline = firstline.replaceAll("\"","");
        // splits the string into an array based on comma delimiting
        String[] names = cleanline.split(",");
        // Creates new treeset to read each element of the string array into, to get the sorted list
        TreeSet<String> treeSet = new TreeSet<String>();

        // this adds each name to the treeset until it runs out of names to find - sorted alphabetically
        for (int j =0; j < names.length; j++) treeSet.add(names[j]);

        // Calculate value of each name.
        // calculate

                    for (String value : treeSet) {

                    }


            }


    }


