package main;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import logoparsing.LogoLexer;
import logoparsing.LogoParser;
import logoparsing.LogoParser.ProgrammeContext;

public class Main {

	public static void main(String[] args) {
		generate();
	}
	public static void generate() {
		CharStream str;
		try {
			str = CharStreams.fromFileName("programs/logo-prg.txt");
			LogoLexer lexer = new LogoLexer(str);

			CommonTokenStream tokens = new CommonTokenStream(lexer);
			LogoParser parser = new LogoParser(tokens);

			ProgrammeContext tree = parser.programme();
			
			System.out.println(tree.toStringTree(parser));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
