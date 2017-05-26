package constants;

public interface NameCaseConstants {

	String[][] NAME_SPLITS = new String[][] { { "\\s", " " }, { "[-]", "-" },
			{ "[']", "'" }, { "\"", "" } };
	
	String[][] MAC_EXCEPTIONS = new String[][] {
			{ "\\bMacEvicius\\b", "Macevicius" },
			{ "\\bMacHado\\b", "Machado" }, { "\\bMacHar\\b", "Machar" },
			{ "\\bMacHin\\b", "Machin" }, { "\\bMacHlin\\b", "Machlin" },
			{ "\\bMacIas\\b", "Macias" }, { "\\bMacIulis\\b", "Maciulis" },
			{ "\\bMacKie\\b", "Mackie" }, { "\\bMacKle\\b", "Mackle" },
			{ "\\bMacKlin\\b", "Macklin" }, { "\\bMacQuarie\\b", "Macquarie" },
			{ "\\bMacOmber\\b", "Macomber" }, { "\\bMacIn\\b", "Macin" },
			{ "\\bMacKintosh\\b", "Mackintosh" }, { "\\bMacKen\\b", "Macken" },
			{ "\\bMacHen\\b", "Machen" }, { "\\bMacHiel\\b", "Machiel" },
			{ "\\bMacIol\\b", "Maciol" }, { "\\bMacKell\\b", "Mackell" },
			{ "\\bMacKlem\\b", "Macklem" }, { "\\bMacKrell\\b", "Mackrell" },
			{ "\\bMacLin\\b", "Maclin" }, { "\\bMacKey\\b", "Mackey" },
			{ "\\bMacKley\\b", "Mackley" }, { "\\bMacHell\\b", "Machell" },
			{ "\\bMacHon\\b", "Machon" } };

	String[][] ODD_MAC_EXCEPTIONS = new String[][] {
			{ "\\bMacmurdo\\b", "MacMurdo" }, { "\\bMacisaac", "MacIsaac" } };

	String[][] LOCAL_EXCEPTIONS = new String[][] {
			{ "\\bAl(?=\\s+\\w)", "al" }, { "\\bAp\\b", "ap" },
			{ "\\bBen(?=\\s+\\w)\\b", "ben" },
			{ "\\bDell([ae])\\b", "dell$1" }, { "\\bD([aeiu])\\b", "d$1" },
			{ "\\bDe([lr])\\b", "de$1" }, { "\\bEl\\b", "el" },
			{ "\\bLa\\b", "la" }, { "\\bL([eo])\\b", "l$1" },
			{ "\\bVan(?=\\s+\\w)", "van" }, { "\\bVon\\b", "von" } };
}
