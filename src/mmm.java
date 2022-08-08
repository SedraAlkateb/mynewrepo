import Ast.nodes.Page;
import Ast.vistor.BaseVisitor;
import gen.Lexerp;
import gen.Parserp;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class mmm {

    public static void main(String[] args) throws IOException {

        String s = "";
        Tree myTree = new Tree();

        try {
            System.out.println("Enter the choice");
            System.out.println("1)Ngfor Standard " + "2)Ngfor Key " + "3)Ngfor Index " + "4)Ngfor Direct Array ");
            System.out.println("5)Switch " + "6)Show " + "7)Event " + "8)Hide " + "9)If" + "10)Model " + "11)Event");
            System.out.println("12)Full " + "13)Exit");

            String source = "sample1.txt";

            CharStream cs = fromFileName(source);
            Lexerp lexer = new Lexerp(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            Parserp parser = new Parserp(token);
            ParseTree tree = parser.pages();
            System.out.println("--------------------------");
            Page doc = (Page) new BaseVisitor().visit(tree);
            System.out.println();

            System.out.println(doc);

        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream myFileObject = new FileInputStream("sample1.txt");

        int myData;

        while ((myData = myFileObject.read()) != -1) {

            char data = (char) myData;
            s = Character.toString(data);
            //  System.out.print(s);


            myTree.insert(s);
            myTree.preOrder();


        }
        myTree.insert("search");
        myTree.insert("add");
        myTree.preOrder();
        if (myTree.search("adddd"))
            System.out.print("true");



    }

    public static void write(String filename, String word) {
        try {
            FileWriter fw = new FileWriter(filename, true); //the true will append the new data
            fw.write(word + "\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

}

