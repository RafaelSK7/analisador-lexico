package br.com.rafaelkiss.compiler.main;

import br.com.rafaelkiss.compiler.excpetions.IsiLexicalException;
import br.com.rafaelkiss.compiler.lexico.IsiScanner;
import br.com.rafaelkiss.compiler.lexico.Token;

public class MainClass {
    public static void main(String[] args) {
        try {
            IsiScanner sc = new IsiScanner("input.isi");
            Token token = null;
            do {
                token = sc.nextToken();
                if (token != null) {
                    System.out.println(token);
                }

            } while (token != null);
        } catch (IsiLexicalException ex) {
            System.out.println("Lexical ERROR: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Generic error!!!");
        }
    }
}
