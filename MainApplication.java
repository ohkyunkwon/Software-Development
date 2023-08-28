package chapter_2;

import java.io.IOException;

import chapter_02.BankStatementParser;

public class MainApplication {
	public static void main(final String... args) throws IOException{
		   final BankStatementAnalyzer bankStatementAnalyzer
           = new BankStatementAnalyzer();

		   final BankStatementParser bankStatementParser
           = new BankStatementParser();

		   bankStatementAnalyzer.analyze(args[0], bankStatementParser);

	}
}
