package edu.southeastmn.rcarrillo.rcarrillo2740ex3b;

import java.util.Scanner;

public class Loops {
    String str = "";
    String[] tokens;
    int curIndex = 0;

    public Loops(String str) {
        super();
        this.str = str;
        tokens = str.split(" ");
    }

    public int getNext() {
        if (this.curIndex < tokens.length) {
            int value = Integer.parseInt(tokens[this.curIndex]);
            this.curIndex++;
            return value;
        }
        else return -1;
    }

    public String loop1() {
        this.curIndex = 0;
        StringBuilder str = new StringBuilder();

        int i = this.getNext();
        int product = i * 10;
        while(product < 100){
            str.append("Product = " + Integer.toString(product) + "\n");

            i = this.getNext();
            product = i * 10;

        }
        return str.toString();
    }

    public String loop2() {
        this.curIndex = 0;
        StringBuilder str = new StringBuilder();

        do {
            int i = this.getNext();
            int j = this.getNext();
            str.append(i + " + " + j + " = " + (i + j) + "\n");

	/*	i = this.getNext();
		j = this.getNext();
		str.append(i + " + " + j + " = " + (i + j) + "\n");*/
        } while (this.curIndex < tokens.length);
        return str.toString();
    }

    public String loop3() {
        this.curIndex = 0;
        StringBuilder str = new StringBuilder();

	/*	int total = 0;
		str.append(Integer.toString(total) + "\n");
		total += 10;
		str.append(Integer.toString(total) + "\n");*/
        for (int total = 0, i = 10;  total < 50;){
            total += i;
            str.append(Integer.toString(total) + "\n");
        }

        return str.toString();

    }

    public String loop4() {
        this.curIndex = 0;
        StringBuilder str = new StringBuilder();

		/*int i = this.getNext();
		int total = i;
		str.append("Total + " + i + ": " + total + "\n");
		i = this.getNext();
		total += i;
		str.append("Total + " + i + ": " + total + "\n");*/
        for ( int i = this.getNext(), total = i; this.curIndex < tokens.length; ){
            str.append("Total + " + i + ": " + total + "\n");
            i = this.getNext();
            total += i;
        }

        return str.toString();
    }



}