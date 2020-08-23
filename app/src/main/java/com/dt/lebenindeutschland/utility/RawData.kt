package com.dt.lebenindeutschland.utility

class RawData {
    fun createData(): ArrayList<Question> {

        val list: ArrayList<Question> = arrayListOf()

        list.add(
			Question(
				1,
				"In Deutschland dürfen Menschen offen etwas gegen die Regierung sagen, weil…",
				"hier Religionsfreiheit gilt.",
				"die Menschen Steuern zahlen.",
				"die Menschen das Wahlrecht haben.",
				"hier Meinungsfreiheit gilt.",
				"Grundrechte", 5,
				"D",
				"90,6%",
				false
			)
		)
        list.add(
			Question(
				2,
				"In Deutschland können Eltern bis zum 14. Lebensjahr ihres Kindes entscheiden, ob es in der Schule am …",
				"Geschichtsunterricht teilnimmt.",
				"Religionsunterricht teilnimmt.",
				"Politikunterricht teilnimmt.",
				"Sprachunterricht teilnimmt.",
				"Grundrechte", 5,
				"B",
				"92,3%",
				false
			)
		)
        list.add(
			Question(
				3,
				"Deutschland ist ein Rechtsstaat. Was ist damit gemeint?",
				"Alle Einwohner / Einwohnerinnen und der Staat müssen sich an die Gesetze halten.",
				"Der Staat muss sich nicht an die Gesetze halten.",
				"Nur Deutsche müssen die Gesetze befolgen.",
				"Die Gerichte machen die Gesetze.",
				"Verfassungsprinzipien", 2,
				"A",
				"94,2%",
				false
			)
		)
        list.add(
			Question(
				4,
				"Welches Recht gehört zu den Grundrechten in Deutschland?",
				"Waffenbesitz",
				"Faustrecht",
				"Meinungsfreiheit",
				"Selbstjustiz",
				"Grundrechte", 5,
				"C",
				"96,4%",
				false
			)
		)
        list.add(
			Question(
				5,
				"Wahlen in Deutschland sind frei. Was bedeutet das?",
				"Man darf Geld annehmen, wenn man dafür einen bestimmten Kandidaten / eine bestimmte Kandidatin wählt.",
				"Der Wähler darf bei der Wahl weder beeinflusst noch zu einer bestimmten Stimmabgabe gezwungen werden und keine Nachteile durch die Wahl haben.",
				"Nur Personen, die noch nie im Gefängnis waren, dürfen wählen.",
				"Alle wahlberechtigten Personen müssen wählen.",
				"Wahlen und Beteiligung", 6,
				"B",
				"96,2%",
				false
			)
		)
        list.add(
			Question(
				6,
				"Wie heißt die deutsche Verfassung?",
				"Volksgesetz",
				"Bundesgesetz",
				"Deutsches Gesetz",
				"Grundgesetz",
				"Verfassungsprinzipien", 2,
				"D",
				"82,7%",
				false
			)
		)
        list.add(
			Question(
				7,
				"Welches Recht gehört zu den Grundrechten, die nach der deutschen Verfassung garantiert werden? Das Recht auf …",
				"Glaubens- und Gewissensfreiheit",
				"Unterhaltung",
				"Arbeit",
				"Wohnung",
				"Grundrechte", 5,
				"A",
				"87,4%",
				false
			)
		)
        list.add(
			Question(
				8,
				"Was steht nicht im Grundgesetz von Deutschland?",
				"Die Würde des Menschen ist unantastbar.",
				"Alle sollen gleich viel Geld haben.",
				"Jeder Mensch darf seine Meinung sagen.",
				"Alle sind vor dem Gesetz gleich.",
				"Grundrechte", 5,
				"B",
				"86,4%",
				false
			)
		)
        list.add(
			Question(
				9,
				"Welches Grundrecht gilt in Deutschland nur für Ausländer / Ausländerinnen? Das Grundrecht auf …",
				"Schutz der Familie",
				"Menschenwürde",
				"Asyl",
				"Meinungsfreiheit",
				"Grundrechte", 5,
				"C",
				"93,6%",
				false
			)
		)
        list.add(
			Question(
				10,
				"Was ist mit dem deutschen Grundgesetz vereinbar?",
				"die Prügelstrafe",
				"die Folter",
				"die Todesstrafe",
				"die Geldstrafe",
				"Grundrechte", 5,
				"D",
				"93,1%",
				false
			)
		)
        list.add(
			Question(
				11,
				"Wie wird die Verfassung der Bundesrepublik Deutschland genannt?",
				"Grundgesetz",
				"Bundesverfassung",
				"Gesetzbuch",
				"Verfassungsvertrag",
				"Verfassungsprinzipien", 2,
				"A",
				"76,3%",
				false
			)
		)
        list.add(
			Question(
				12,
				"Eine Partei im Deutschen Bundestag will die Pressefreiheit abschaffen. Ist das möglich?",
				"Ja, wenn mehr als die Hälfte der Abgeordneten im Bundestag dafür sind.",
				"Ja, aber dazu müssen zwei Drittel der Abgeordneten im Bundestag dafür sein.",
				"Nein, denn die Pressefreiheit ist ein Grundrecht. Sie kann nicht abgeschafft werden.",
				"Nein, denn nur der Bundesrat kann die Pressefreiheit abschaffen.",
				"Grundrechte", 5,
				"C",
				"87,3%",
				false
			)
		)
        list.add(
			Question(
				13,
				"Im Parlament steht der Begriff \"Opposition\" für…",
				"die regierenden Parteien.",
				"alle Abgeordneten, die nicht zu der Regierungspartei/den Regierungsparteien gehören.",
				"die Fraktion mit den meisten Abgeordneten.",
				"alle Parteien, die bei der letzten Wahl die 5%-Hürde erreichen konnten.",
				"Verfassungsorgane", 1,
				"B",
				"96,2%",
				false
			)
		)
        list.add(
			Question(
				14,
				"Meinungsfreiheit in Deutschland heißt, dass ich …",
				"auf Flugblättern falsche Tatsachen behaupten darf.",
				"meine Meinung in Leserbriefen äußern kann.",
				"Nazi-Symbole tragen darf.",
				"Meine Meinung sagen darf, solange ich der Regierung nicht widerspreche.",
				"Grundrechte", 5,
				"B",
				"78,5%",
				false
			)
		)
        list.add(
			Question(
				15,
				"Was verbietet das deutsche Grundgesetz?",
				"Militärdienst",
				"Zwangsarbeit",
				"freie Berufswahl",
				"Arbeit im Ausland",
				"Grundrechte", 5,
				"B",
				"87,1%",
				false
			)
		)
        list.add(
			Question(
				16,
				"Wann ist die Meinungsfreiheit in Deutschland eingeschränkt?",
				"bei der öffentlichen Verbreitung falscher Behauptungen über einzelne Personen",
				"bei Meinungsäußerungen über die Bundesregierung",
				"bei Diskussionen über Religionen",
				"bei Kritik am Staat",
				"Grundrechte", 5,
				"A",
				"80,4%",
				false
			)
		)
        list.add(
			Question(
				17,
				"Die deutschen Gesetze verbieten …",
				"Meinungsfreiheit der Einwohner und Einwohnerinnen.",
				"Petitionen der Bürger und Bürgerinnen.",
				"Versammlungsfreiheit der Einwohner und Einwohnerinnen.",
				"Ungleichbehandlung der Bürger und Bürgerinnen durch den Staat.",
				"Grundrechte", 5,
				"D",
				"77,8%",
				false
			)
		)
        list.add(
			Question(
				18,
				"Welches Grundrecht ist in Artikel 1 des Grundgesetzes der Bundesrepublik Deutschland garantiert?",
				"die Unantastbarkeit der Menschenwürde",
				"das Recht auf Leben",
				"Religionsfreiheit",
				"Meinungsfreiheit",
				"Grundrechte", 5,
				"A",
				"63,6%",
				false
			)
		)
        list.add(
			Question(
				19,
				"Was versteht man unter dem Recht der \"Freizügigkeit\" in Deutschland?",
				"Man darf sich seinen Wohnort selbst aussuchen.",
				"Man kann seinen Beruf wechseln.",
				"Man darf sich für eine andere Religion entscheiden.",
				"Man darf sich in der Öffentlichkeit nur leicht bekleidet bewegen.",
				"Grundrechte", 5,
				"A",
				"77,3%",
				false
			)
		)
        list.add(
			Question(
				20,
				"Eine Partei in Deutschland verfolgt das Ziel, eine Diktatur zu errichten. Sie ist dann …",
				"tolerant.",
				"rechtsstaatlich orientiert.",
				"gesetzestreu.",
				"verfassungswidrig.",
				"Verfassungsorgane", 1,
				"D",
				"73,8%",
				false
			)
		)
        list.add(
			Question(
				21,
				"Welches ist das Wappen der Bundesrepublik Deutschland?",
				"1",
				"2",
				"3",
				"4",
				"Staatssymbole", 10,
				"A",
				"89,5%",
				true
			)
		)
        list.add(
			Question(
				22,
				"Was für eine Staatsform hat Deutschland?",
				"Monarchie",
				"Diktatur",
				"Republik",
				"Fürstentum",
				"Verfassungsprinzipien", 2,
				"C",
				"95,2%",
				false
			)
		)
        list.add(
			Question(
				23,
				"In Deutschland sind die meisten Erwerbstätigen…",
				"bei einer Firma oder Behörde beschäftigt.",
				"in kleinen Familienunternehmen beschäftigt.",
				"ehrenamtlich für ein Bundesland tätig.",
				"selbständig mit einer eigenen Firma tätig.",
				"Sozialsystem", 4,
				"A",
				"97,4%",
				false
			)
		)
        list.add(
			Question(
				24,
				"Wie viele Bundesländer hat die Bundesrepublik Deutschland?",
				"14",
				"15",
				"16",
				"17",
				"Föderalismus", 3,
				"C",
				"93,6%",
				false
			)
		)
        list.add(
			Question(
				25,
				"Was ist kein Bundesland der Bundesrepublik Deutschland?",
				"Nordrhein-Westfalen",
				"Elsass-Lothringen",
				"Mecklenburg-Vorpommern",
				"Sachsen-Anhalt",
				"Föderalismus", 3,
				"B",
				"97,3%",
				false
			)
		)
        list.add(
			Question(
				26,
				"Deutschland ist …",
				"eine kommunistische Republik.",
				"ein demokratischer und sozialer Bundesstaat.",
				"eine kapitalistische und soziale Monarchie.",
				"ein sozialer und sozialistischer Bundesstaat.",
				"Verfassungsprinzipien", 2,
				"B",
				"95,6%",
				false
			)
		)
        list.add(
			Question(
				27,
				"Deutschland ist …",
				"ein sozialistischer Staat.",
				"ein Bundesstaat.",
				"eine Diktatur.",
				"eine Monarchie.",
				"Verfassungsprinzipien", 2,
				"B",
				"86,9%",
				false
			)
		)
        list.add(
			Question(
				28,
				"Wer wählt in Deutschland die Abgeordneten zum Bundestag?",
				"das Militär",
				"die Wirtschaft",
				"das wahlberechtigte Volk",
				"die Verwaltung",
				"Verfassungsorgane", 1,
				"C",
				"88,8%",
				false
			)
		)
        list.add(
			Question(
				29,
				"Welches Tier ist das Wappentier der Bundesrepublik Deutschland?",
				"Löwe",
				"Adler",
				"Bär",
				"Pferd",
				"Staatssymbole", 10,
				"B",
				"95,5%",
				false
			)
		)
        list.add(
			Question(
				30,
				"Was ist kein Merkmal unserer Demokratie?",
				"regelmäßige Wahlen",
				"Pressezensur",
				"Meinungsfreiheit",
				"verschiedene Parteien",
				"Verfassungsprinzipien", 2,
				"B",
				"80,2%",
				false
			)
		)
        list.add(
			Question(
				31,
				"Die Zusammenarbeit von Parteien zur Bildung einer Regierung nennt man in Deutschland …",
				"Einheit.",
				"Koalition.",
				"Ministerium.",
				"Fraktion.",
				"Verfassungsorgane", 1,
				"B",
				"78,8%",
				false
			)
		)
        list.add(
			Question(
				32,
				"Was ist keine staatliche Gewalt in Deutschland?",
				"Gesetzgebung",
				"Regierung",
				"Presse",
				"Rechtsprechung",
				"Verfassungsprinzipien", 2,
				"C",
				"86,7%",
				false
			)
		)
        list.add(
			Question(
				33,
				"Welche Aussage ist richtig? In Deutschland …",
				"sind Staat und Religionsgemeinschaften voneinander getrennt.",
				"bilden die Religionsgemeinschaften den Staat.",
				"ist der Staat abhängig von den Religionsgemeinschaften.",
				"bilden Staat und Religionsgemeinschaften eine Einheit.",
				"Religiöse Vielfalt", 17,
				"A",
				"74,6%",
				false
			)
		)
        list.add(
			Question(
				34,
				"Was ist Deutschland nicht?",
				"eine Demokratie",
				"ein Rechtsstaat",
				"eine Monarchie",
				"ein Sozialstaat",
				"Verfassungsprinzipien", 2,
				"C",
				"95,5%",
				false
			)
		)
        list.add(
			Question(
				35,
				"Womit finanziert der deutsche Staat die Sozialversicherung?",
				"Kirchensteuern",
				"Sozialabgaben",
				"Spendengeldern",
				"Vereinsbeiträgen",
				"Sozialsystem", 4,
				"B",
				"94,9%",
				false
			)
		)
        list.add(
			Question(
				36,
				"Welche Maßnahme schafft in Deutschland soziale Sicherheit?",
				"die Krankenversicherung",
				"die Autoversicherung",
				"die Gebäudeversicherung",
				"die Haftpflichtversicherung",
				"Sozialsystem", 4,
				"A",
				"93,3%",
				false
			)
		)
        list.add(
			Question(
				37,
				"Wie werden die Regierungschefs / Regierungschefinnen der meisten Bundesländer in Deutschland genannt?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Senator / Senatorin",
				"Ministerpräsident / Ministerpräsidentin",
				"Föderalismus", 3,
				"D",
				"89,0%",
				false
			)
		)
        list.add(
			Question(
				38,
				"Die Bundesrepublik Deutschland ist ein demokratischer und sozialer …",
				"Staatenverbund.",
				"Bundesstaat.",
				"Staatenbund.",
				"Zentralstaat.",
				"Föderalismus", 3,
				"B",
				"94,9%",
				false
			)
		)
        list.add(
			Question(
				39,
				"Was hat jedes deutsche Bundesland?",
				"einen eigenen Außenminister / eine eigene Außenministerin",
				"eine eigene Währung",
				"eine eigene Armee",
				"eine eigene Regierung",
				"Föderalismus", 3,
				"D",
				"82,3%",
				false
			)
		)
        list.add(
			Question(
				40,
				"Mit welchen Worten beginnt die deutsche Nationalhymne?",
				"Völker, hört die Signale …",
				"Einigkeit und Recht und Freiheit …",
				"Freude schöner Götterfunken …",
				"Deutschland einig Vaterland …",
				"Staatssymbole", 10,
				"B",
				"90,7%",
				false
			)
		)
        list.add(
			Question(
				41,
				"Warum gibt es in einer Demokratie mehr als eine Partei?",
				"weil dadurch die unterschiedlichen Meinungen der Bürger und Bürgerinnen vertreten werden",
				"damit Bestechung in der Politik begrenzt wird",
				"um politische Demonstrationen zu verhindern",
				"um wirtschaftlichen Wettbewerb anzuregen",
				"Verfassungsprinzipien", 2,
				"A",
				"92,5%",
				false
			)
		)
        list.add(
			Question(
				42,
				"Wer beschließt in Deutschland ein neues Gesetz?",
				"die Regierung",
				"das Parlament",
				"die Gerichte",
				"die Polizei",
				"Verfassungsorgane", 1,
				"B",
				"78,1%",
				false
			)
		)
        list.add(
			Question(
				43,
				"Wann kann in Deutschland eine Partei verboten werden?",
				"wenn ihr Wahlkampf zu teuer ist",
				"wenn sie gegen die Verfassung kämpft",
				"wenn sie Kritik am Staatsoberhaupt äußert",
				"wenn ihr Programm eine neue Richtung vorschlägt",
				"Verfassungsorgane", 1,
				"B",
				"87,7%",
				false
			)
		)
        list.add(
			Question(
				44,
				"Wen kann man als Bürger / Bürgerin in Deutschland nicht direkt wählen?",
				"Abgeordnete des EU-Parlaments",
				"den Bundespräsidenten / die Bundespräsidentin",
				"Landtagsabgeordnete",
				"Bundestagsabgeordnete",
				"Verfassungsorgane", 1,
				"B",
				"72,2%",
				false
			)
		)
        list.add(
			Question(
				45,
				"Zu welcher Versicherung gehört die Pflegeversicherung?",
				"Sozialversicherung",
				"Unfallversicherung",
				"Hausratversicherung",
				"Haftpflicht- und Feuerversicherung",
				"Sozialsystem", 4,
				"A",
				"94,3%",
				false
			)
		)
        list.add(
			Question(
				46,
				"Der deutsche Staat hat viele Aufgaben. Welche Aufgabe gehört dazu?",
				"Er baut Straßen und Schulen.",
				"Er verkauft Lebensmittel und Kleidung.",
				"Er versorgt alle Einwohner und Einwohnerinnen kostenlos mit Zeitungen.",
				"Er produziert Autos und Busse.",
				"Aufgaben des Staates", 8,
				"A",
				"95,5%",
				false
			)
		)
        list.add(
			Question(
				47,
				"Der deutsche Staat hat viele Aufgaben. Welche Aufgabe gehört nicht dazu?",
				"Er bezahlt für alle Staatsangehörigen Urlaubsreisen.",
				"Er zahlt Kindergeld.",
				"Er unterstützt Museen.",
				"Er fördert Sportler und Sportlerinnen.",
				"Aufgaben des Staates", 8,
				"A",
				"93,3%",
				false
			)
		)
        list.add(
			Question(
				48,
				"Welches Organ gehört nicht zu den Verfassungsorganen Deutschlands?",
				"der Bundesrat",
				"der Bundespräsident / die Bundespräsidentin",
				"die Bürgerversammlung",
				"die Regierung",
				"Verfassungsorgane", 1,
				"C",
				"66,4%",
				false
			)
		)
        list.add(
			Question(
				49,
				"Wer bestimmt in Deutschland die Schulpolitik?",
				"die Lehrer und Lehrerinnen",
				"die Bundesländer",
				"das Familienministerium",
				"die Universitäten",
				"Föderalismus", 3,
				"B",
				"83,0%",
				false
			)
		)
        list.add(
			Question(
				50,
				"Die Wirtschaftsform in Deutschland nennt man …",
				"freie Zentralwirtschaft.",
				"soziale Marktwirtschaft.",
				"gelenkte Zentralwirtschaft.",
				"Planwirtschaft.",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"80,0%",
				false
			)
		)
        list.add(
			Question(
				51,
				"Zu einem demokratischen Rechtsstaat gehört es nicht, dass …",
				"Menschen sich kritisch über die Regierung äußern können.",
				"Bürger friedlich demonstrieren gehen dürfen.",
				"Menschen von einer Privatpolizei ohne Grund verhaftet werden.",
				"jemand ein Verbrechen begeht und deshalb verhaftet wird.",
				"Verfassungsprinzipien", 2,
				"C",
				"87,7%",
				false
			)
		)
        list.add(
			Question(
				52,
				"Was bedeutet \"Volkssouveränität\"? Alle Staatsgewalt geht vom …",
				"Volke aus.",
				"Bundestag aus.",
				"preußischen König aus.",
				"Bundesverfassungsgericht aus.",
				"Verfassungsprinzipien", 2,
				"A",
				"84,6%",
				false
			)
		)
        list.add(
			Question(
				53,
				"Was bedeutet \"Rechtsstaat\" in Deutschland?",
				"Der Staat hat Recht.",
				"Es gibt nur rechte Parteien.",
				"Die Bürger und Bürgerinnen entscheiden über Gesetze.",
				"Der Staat muss die Gesetze einhalten.",
				"Verfassungsprinzipien", 2,
				"D",
				"83,2%",
				false
			)
		)
        list.add(
			Question(
				54,
				"Was ist keine staatliche Gewalt in Deutschland?",
				"Legislative",
				"Judikative",
				"Exekutive",
				"Direktive",
				"Verfassungsprinzipien", 2,
				"D",
				"61,6%",
				false
			)
		)
        list.add(
			Question(
				55,
				"Was zeigt dieses Bild?",
				"den Bundestagssitz in Berlin",
				"das Bundesverfassungsgericht in Karlsruhe",
				"das Bundesratsgebäude in Berlin",
				"das Bundeskanzleramt in Berlin",
				"Verfassungsorgane", 1,
				"A",
				"81,2%",
				true
			)
		)
        list.add(
			Question(
				56,
				"Welches Amt gehört in Deutschland zur Gemeindeverwaltung?",
				"Pfarramt",
				"Ordnungsamt",
				"Finanzamt",
				"Auswärtiges Amt",
				"Kommune", 11,
				"B",
				"80,1%",
				false
			)
		)
        list.add(
			Question(
				57,
				"Wer wird meistens zum Präsidenten / zur Präsidentin des Deutschen Bundestages gewählt?",
				"der / die älteste Abgeordnete im Parlament",
				"der Ministerpräsident / die Ministerpräsidentin des größten Bundeslandes",
				"ein Abgeordneter / eine Abgeordnete der stärksten Fraktion",
				"ein ehemaliger Bundeskanzler / eine ehemalige Bundeskanzlerin",
				"Verfassungsorgane", 1,
				"C",
				"69,6%",
				false
			)
		)
        list.add(
			Question(
				58,
				"Wer ernennt in Deutschland die Minister / die Ministerinnen der Bundesregierung?",
				"der Präsident / die Präsidentin des Bundesverfassungsgerichtes",
				"der Bundespräsident / die Bundespräsidentin",
				"der Bundesratspräsident / die Bundesratspräsidentin",
				"der Bundestagspräsident / die Bundestagspräsidentin",
				"Verfassungsorgane", 1,
				"B",
				"70,5%",
				false
			)
		)
        list.add(
			Question(
				59,
				"Welche Parteien wurden in Deutschland 2007 zur Partei \"Die Linke\"?",
				"CDU und SSW",
				"PDS und WASG",
				"CSU und FDP",
				"Bündnis 90/Die Grünen und SPD",
				"Parteien", 7,
				"B",
				"71,5%",
				false
			)
		)
        list.add(
			Question(
				60,
				"In Deutschland gehören der Bundestag und der Bundesrat zur …",
				"Exekutive.",
				"Legislative.",
				"Direktive.",
				"Judikative.",
				"Verfassungsprinzipien", 2,
				"B",
				"63,4%",
				false
			)
		)
        list.add(
			Question(
				61,
				"Was bedeutet \"Volkssouveränität\"?",
				"Der König / die Königin herrscht über das Volk.",
				"Das Bundesverfassungsgericht steht über der Verfassung.",
				"Die Interessenverbände üben die Souveränität zusammen mit der Regierung aus.",
				"Die Staatsgewalt geht vom Volke aus.",
				"Verfassungsprinzipien", 2,
				"D",
				"78,1%",
				false
			)
		)
        list.add(
			Question(
				62,
				"Wenn das Parlament eines deutschen Bundeslandes gewählt wird, nennt man das …",
				"Kommunalwahl.",
				"Landtagswahl.",
				"Europawahl.",
				"Bundestagswahl.",
				"Wahlen und Beteiligung", 6,
				"B",
				"60,9%",
				false
			)
		)
        list.add(
			Question(
				63,
				"Was gehört in Deutschland nicht zur Exekutive?",
				"die Polizei",
				"die Gerichte",
				"das Finanzamt",
				"die Ministerien",
				"Verfassungsprinzipien", 2,
				"B",
				"59,3%",
				false
			)
		)
        list.add(
			Question(
				64,
				"Die Bundesrepublik Deutschland ist heute gegliedert in …",
				"vier Besatzungszonen.",
				"einen Oststaat und einen Weststaat.",
				"16 Kantone.",
				"Bund, Länder und Kommunen.",
				"Föderalismus", 3,
				"D",
				"81,5%",
				false
			)
		)
        list.add(
			Question(
				65,
				"Es gehört nicht zu den Aufgaben des Deutschen Bundestages, …",
				"Gesetze zu entwerfen.",
				"die Bundesregierung zu kontrollieren.",
				"den Bundeskanzler / die Bundeskanzlerin zu wählen.",
				"das Bundeskabinett zu bilden.",
				"Verfassungsorgane", 1,
				"D",
				"52,3%",
				false
			)
		)
        list.add(
			Question(
				66,
				"Wer schrieb den Text zur deutschen Nationalhymne?",
				"Friedrich von Schiller",
				"Clemens Brentano",
				"Johann Wolfgang von Goethe",
				"Heinrich Hoffmann von Fallersleben",
				"Staatssymbole", 10,
				"D",
				"78,0%",
				false
			)
		)
        list.add(
			Question(
				67,
				"Was ist in Deutschland vor allem eine Aufgabe der Bundesländer?",
				"Verteidigungspolitik",
				"Außenpolitik",
				"Wirtschaftspolitik",
				"Schulpolitik",
				"Föderalismus", 3,
				"D",
				"74,8%",
				false
			)
		)
        list.add(
			Question(
				68,
				"Warum kontrolliert der Staat in Deutschland das Schulwesen?",
				"weil es in Deutschland nur staatliche Schulen gibt",
				"weil alle Schüler und Schülerinnen einen Schulabschluss haben müssen",
				"weil es in den Bundesländern verschiedene Schulen gibt",
				"weil es nach dem Grundgesetz seine Aufgabe ist",
				"Aufgaben des Staates", 8,
				"D",
				"78,5%",
				false
			)
		)
        list.add(
			Question(
				69,
				"Die Bundesrepublik Deutschland hat einen dreistufigen Verwaltungsaufbau. Wie heißt die unterste politische Stufe?",
				"Stadträte",
				"Landräte",
				"Gemeinden",
				"Bezirksämter",
				"Kommune", 11,
				"C",
				"76,9%",
				false
			)
		)
        list.add(
			Question(
				70,
				"Der deutsche Bundespräsident Gustav Heinemann gibt Helmut Schmidt 1974 die Ernennungsurkunde zum deutschen Bundeskanzler. Was gehört zu den Aufgaben des deutschen Bundespräsidenten / der deutschen Bundespräsidentin?",
				"Er / Sie führt die Regierungsgeschäfte.",
				"Er / Sie kontrolliert die Regierungspartei.",
				"Er / Sie wählt die Minister / Ministerinnen aus.",
				"Er / Sie schlägt den Kanzler / die Kanzlerin zur Wahl vor.",
				"Verfassungsorgane", 1,
				"D",
				"64,4%",
				true
			)
		)
        list.add(
			Question(
				71,
				"Wo hält sich der deutsche Bundeskanzler / die deutsche Bundeskanzlerin am häufigsten auf? Am häufigsten ist er / sie …",
				"in Bonn, weil sich dort das Bundeskanzleramt und der Bundestag befinden.",
				"in Berlin, weil sich dort das Bundeskanzleramt und der Bundestag befinden.",
				"auf Schloss Meseberg, dem Gästehaus der Bundesregieung, um Staatsgäste zu empfangen.",
				"auf Schloss Bellevue, dem Amtssitz des Bundespräsidenten / der Bundespräsidentin, um Staatsgäste zu empfangen.",
				"Verfassungsorgane", 1,
				"B",
				"98,1%",
				false
			)
		)
        list.add(
			Question(
				72,
				"Wie heißt der jetzige Bundeskanzler / die jetzige Bundeskanzlerin von Deutschland?",
				"Gerhard Schröder",
				"Jürgen Rüttgers",
				"Klaus Wowereit",
				"Angela Merkel",
				"Verfassungsorgane", 1,
				"D",
				"99,1%",
				false
			)
		)
        list.add(
			Question(
				73,
				"Die beiden größten Fraktionen im Deutschen Bundestag heißen zurzeit …",
				"CDU/CSU und SPD.",
				"Die Linke und Bündnis 90/Die Grünen.",
				"FDP und SPD.",
				"Die Linke und FDP.",
				"Parteien", 7,
				"A",
				"93,1%",
				false
			)
		)
        list.add(
			Question(
				74,
				"Wie heißt das Parlament für ganz Deutschland?",
				"Bundesversammlung",
				"Volkskammer",
				"Bundestag",
				"Bundesgerichtshof",
				"Verfassungsorgane", 1,
				"C",
				"86,9%",
				false
			)
		)
        list.add(
			Question(
				75,
				"Wie heißt Deutschlands heutiges Staatsoberhaupt?",
				"Frank-Walter Steinmeier",
				"Joachim Gauck",
				"Norbert Lammert",
				"Wolfgang Thierse",
				"Verfassungsorgane", 1,
				"A",
				"84,3%",
				false
			)
		)
        list.add(
			Question(
				76,
				"Was bedeutet die Abkürzung CDU in Deutschland?",
				"Christliche Deutsche Union",
				"Club Deutscher Unternehmer",
				"Christlicher Deutscher Umweltschutz",
				"Christlich Demokratische Union",
				"Parteien", 7,
				"D",
				"92,9%",
				false
			)
		)
        list.add(
			Question(
				77,
				"Was ist die Bundeswehr?",
				"die deutsche Polizei",
				"ein deutscher Hafen",
				"eine deutsche Bürgerinitiative",
				"die deutsche Armee",
				"Aufgaben des Staates", 8,
				"D",
				"94,7%",
				false
			)
		)
        list.add(
			Question(
				78,
				"Was bedeutet die Abkürzung SPD?",
				"Sozialistische Partei Deutschlands",
				"Sozialpolitische Partei Deutschlands",
				"Sozialdemokratische Partei Deutschlands",
				"Sozialgerechte Partei Deutschlands",
				"Parteien", 7,
				"C",
				"87,0%",
				false
			)
		)
        list.add(
			Question(
				79,
				"Was bedeutet die Abkürzung FDP in Deutschland?",
				"Friedliche Demonstrative Partei",
				"Freie Deutschland Partei",
				"Führende Demokratische Partei",
				"Freie Demokratische Partei",
				"Parteien", 7,
				"D",
				"91,5%",
				false
			)
		)
        list.add(
			Question(
				80,
				"Welches Gericht in Deutschland ist zuständig für die Auslegung des Grundgesetzes?",
				"Oberlandesgericht",
				"Amtsgericht",
				"Bundesverfassungsgericht",
				"Verwaltungsgericht",
				"Verfassungsorgane", 1,
				"C",
				"79,2%",
				false
			)
		)
        list.add(
			Question(
				81,
				"Wer wählt den Bundeskanzler / die Bundeskanzlerin in Deutschland?",
				"der Bundesrat",
				"die Bundesversammlung",
				"das Volk",
				"der Bundestag",
				"Verfassungsorgane", 1,
				"D",
				"63,5%",
				false
			)
		)
        list.add(
			Question(
				82,
				"Wie nennt man den Regierungschef / die Regierungschefin der Bundesrepublik Deutschland?",
				"Premierminister / Premierministerin",
				"Bundespräsident / Bundespräsidentin",
				"Bundeskanzler / Bundeskanzlerin",
				"Ministerpräsident / Ministerpräsidentin",
				"Verfassungsorgane", 1,
				"C",
				"61,2%",
				false
			)
		)
        list.add(
			Question(
				83,
				"Wer wählt den deutschen Bundeskanzler / die deutsche Bundeskanzlerin?",
				"das Volk",
				"die Bundesversammlung",
				"der Bundestag",
				"die Bundesregierung",
				"Verfassungsorgane", 1,
				"C",
				"67,3%",
				false
			)
		)
        list.add(
			Question(
				84,
				"Welche Hauptaufgabe hat der deutsche Bundespräsident / die deutsche Bundespräsidentin? Er / Sie …",
				"regiert das Land.",
				"entwirft die Gesetze.",
				"repräsentiert das Land.",
				"überwacht die Einhaltung der Gesetze.",
				"Verfassungsorgane", 1,
				"C",
				"76,9%",
				false
			)
		)
        list.add(
			Question(
				85,
				"Wer bildet den deutschen Bundesrat?",
				"die Abgeordneten des Bundestages",
				"die Minister und Ministerinnen der Bundesregierung",
				"die Regierungsvertreter der Bundesländer",
				"die Parteimitglieder",
				"Verfassungsorgane", 1,
				"C",
				"46,4%",
				false
			)
		)
        list.add(
			Question(
				86,
				"Wer wählt in Deutschland den Bundespräsidenten / die Bundespräsidentin?",
				"die Bundesversammlung",
				"der Bundesrat",
				"das Bundesparlament",
				"das Bundesverfassungsgericht",
				"Verfassungsorgane", 1,
				"A",
				"44,5%",
				false
			)
		)
        list.add(
			Question(
				87,
				"Wer ist das Staatsoberhaupt der Bundesrepublik Deutschland?",
				"der Bundeskanzler / die Bundeskanzlerin",
				"der Bundespräsident / die Bundespräsidentin",
				"der Bundesratspräsident / die Bundesratspräsidentin",
				"der Bundestagspräsident / die Bundestagspräsidentin",
				"Verfassungsorgane", 1,
				"B",
				"70,8%",
				false
			)
		)
        list.add(
			Question(
				88,
				"Die parlamentarische Opposition im Deutschen Bundestag …",
				"kontrolliert die Regierung.",
				"entscheidet, wer Bundesminister / Bundesministerin wird.",
				"bestimmt, wer im Bundesrat sitzt.",
				"schlägt die Regierungschefs / Regierungschefinnen der Länder vor.",
				"Verfassungsorgane", 1,
				"A",
				"71,9%",
				false
			)
		)
        list.add(
			Question(
				89,
				"Wie nennt man in Deutschland die Vereinigung von Abgeordneten einer Partei im Parlament?",
				"Verband",
				"Ältestenrat",
				"Fraktion",
				"Opposition",
				"Verfassungsorgane", 1,
				"C",
				"77,8%",
				false
			)
		)
        list.add(
			Question(
				90,
				"Die deutschen Bundesländer wirken an der Gesetzgebung des Bundes mit durch …",
				"den Bundesrat.",
				"die Bundesversammlung.",
				"den Bundestag.",
				"die Bundesregierung.",
				"Verfassungsorgane", 1,
				"A",
				"45,5%",
				false
			)
		)
        list.add(
			Question(
				91,
				"In Deutschland kann ein Regierungswechsel in einem Bundesland Auswirkungen auf die Bundespolitik haben. Das Regieren wird …",
				"schwieriger, wenn sich dadurch die Mehrheit im Bundestag ändert.",
				"leichter, wenn dadurch neue Parteien in den Bundesrat kommen.",
				"schwieriger, wenn dadurch die Mehrheit im Bundesrat verändert wird.",
				"leichter, wenn es sich um ein reiches Bundesland handelt.",
				"Verfassungsorgane", 1,
				"C",
				"63,8%",
				false
			)
		)
        list.add(
			Question(
				92,
				"Was bedeutet die Abkürzung CSU in Deutschland?",
				"Christlich Sichere Union",
				"Christlich Süddeutsche Union",
				"Christlich Sozialer Unternehmerverband",
				"Christlich Soziale Union",
				"Parteien", 7,
				"D",
				"93,2%",
				false
			)
		)
        list.add(
			Question(
				93,
				"Je mehr \"Zweitstimmen\" eine Partei bei einer Bundestagswahl bekommt, desto …",
				"mehr Sitze erhält die Partei im Parlament.",
				"weniger Erststimmen kann sie haben.",
				"mehr Direktkandidaten der Partei ziehen ins Parlament ein.",
				"größer ist das Risiko, eine Koalition bilden zu müssen.",
				"Wahlen und Beteiligung", 6,
				"A",
				"97,3%",
				false
			)
		)
        list.add(
			Question(
				94,
				"Ab welchem Alter darf man in Deutschland an der Wahl zum Deutschen Bundestag teilnehmen?",
				"16",
				"18",
				"21",
				"23",
				"Wahlen und Beteiligung", 6,
				"B",
				"94,2%",
				false
			)
		)
        list.add(
			Question(
				95,
				"Was gilt für die meisten Kinder in Deutschland?",
				"Wahlpflicht",
				"Schulpflicht",
				"Schweigepflicht",
				"Religionspflicht",
				"Pflichten", 9,
				"B",
				"96,7%",
				false
			)
		)
        list.add(
			Question(
				96,
				"Was muss jeder deutsche Staatsbürger / jede deutsche Staatsbürgerin ab dem 16. Lebensjahr besitzen?",
				"einen Reisepass",
				"einen Personalausweis",
				"einen Sozialversicherungsausweis",
				"einen Führerschein",
				"Pflichten", 9,
				"B",
				"93,8%",
				false
			)
		)
        list.add(
			Question(
				97,
				"Was bezahlt man in Deutschland automatisch, wenn man fest angestellt ist?",
				"Sozialversicherung",
				"Sozialhilfe",
				"Kindergeld",
				"Wohngeld",
				"Sozialsystem", 4,
				"A",
				"96,5%",
				false
			)
		)
        list.add(
			Question(
				98,
				"Wenn Abgeordnete im Deutschen Bundestag ihre Fraktion wechseln, ...",
				"kann die Regierung ihre Mehrheit verlieren.",
				"dürfen sie nicht mehr an den Sitzungen des Parlaments teilnehmen.",
				"muss der Bundespräsident / die Bundespräsidentin zuvor sein / ihr Einverständnis geben.",
				"dürfen die Wähler / Wählerinnen dieser Abgeordneten noch einmal wählen.",
				"Verfassungsorgane", 1,
				"A",
				"81,2%",
				false
			)
		)
        list.add(
			Question(
				99,
				"Wer bezahlt in Deutschland die Sozialversicherungen?",
				"Arbeitgeber / Arbeitgeberinnen und Arbeitnehmer / Arbeitnehmerinnen",
				"nur Arbeitnehmer / Arbeitnehmerinnen",
				"alle Staatsangehörigen",
				"nur Arbeitgeber / Arbeitgeberinnen",
				"Sozialsystem", 4,
				"A",
				"83,3%",
				false
			)
		)
        list.add(
			Question(
				100,
				"Was gehört nicht zur gesetzlichen Sozialversicherung?",
				"die gesetzliche Rentenversicherung",
				"die Lebensversicherung",
				"die Arbeitslosenversicherung",
				"die Pflegeversicherung",
				"Sozialsystem", 4,
				"B",
				"93,0%",
				false
			)
		)
        list.add(
			Question(
				101,
				"Gewerkschaften sind Interessenverbände der …",
				"Jugendlichen.",
				"Arbeitnehmer und Arbeitnehmerinnen.",
				"Rentner und Renterinnen.",
				"Arbeitgeber und Arbeitgeberinnen.",
				"Grundrechte", 5,
				"B",
				"78,1%",
				false
			)
		)
        list.add(
			Question(
				102,
				"Womit kann man in der Bundesrepublik Deutschland geehrt werden, wenn man auf politischem, wirtschaftlichem, kulturellem, geistigem oder sozialem Gebiet eine besondere Leistung erbracht hat? Mit dem …",
				"Bundesadler",
				"Bundesverdienstkreuz",
				"Vaterländischen Verdienstorden",
				"Ehrentitel \"Held der Deutschen Demokratischen Republik\"",
				"Recht und Alltag", 12,
				"B",
				"84,7%",
				false
			)
		)
        list.add(
			Question(
				103,
				"Was wird in Deutschland als \"Ampelkoalition\" bezeichnet? Die Zusammenarbeit …",
				"der Bundestagsfraktionen von CDU und CSU",
				"von SPD, FDP und Bündnis 90/Die Grünen in einer Regierung",
				"von CSU, Die LINKE und Bündnis 90/Die Grünen in einer Regierung",
				"der Bundestagsfraktionen von CDU und SPD",
				"Parteien", 7,
				"B",
				"75,6%",
				false
			)
		)
        list.add(
			Question(
				104,
				"Eine Frau in Deutschland verliert ihre Arbeit. Was darf nicht der Grund für diese Entlassung sein?",
				"Die Frau ist lange krank und arbeitsunfähig.",
				"Die Frau kam oft zu spät zur Arbeit.",
				"Die Frau erledigt private Sachen während der Arbeitszeit.",
				"Die Frau bekommt ein Kind und ihr Chef weiß das.",
				"Recht und Alltag", 12,
				"D",
				"89,1%",
				false
			)
		)
        list.add(
			Question(
				105,
				"Was ist eine Aufgabe von Wahlhelfern / Wahlhelferinnen in Deutschland?",
				"Sie helfen alten Menschen bei der Stimmabgabe in der Wahlkabine.",
				"Sie schreiben die Wahlbenachrichtigungen vor der Wahl.",
				"Sie geben Zwischenergebnisse an die Medien weiter.",
				"Sie zählen die Stimmen nach dem Ende der Wahl.",
				"Pflichten", 9,
				"D",
				"88,8%",
				false
			)
		)
        list.add(
			Question(
				106,
				"In Deutschland helfen ehrenamtliche Wahlhelfer und Wahlhelferinnen bei den Wahlen. Was ist eine Aufgabe von Wahlhelfern / Wahlhelferinnen?",
				"Sie helfen Kindern und alten Menschen beim Wählen.",
				"Sie schreiben Karten und Briefe mit der Angabe des Wahllokals.",
				"Sie geben Zwischenergebnisse an Journalisten weiter.",
				"Sie zählen die Stimmen nach dem Ende der Wahl.",
				"Pflichten", 9,
				"D",
				"90,1%",
				false
			)
		)
        list.add(
			Question(
				107,
				"Für wie viele Jahre wird der Bundestag in Deutschland gewählt?",
				"2 Jahre",
				"4 Jahre",
				"6 Jahre",
				"8 Jahre",
				"Wahlen und Beteiligung", 6,
				"B",
				"96,0%",
				false
			)
		)
        list.add(
			Question(
				108,
				"Bei einer Bundestagswahl in Deutschland darf jeder wählen, der …",
				"in der Bundesrepublik Deutschland wohnt und wählen möchte.",
				"Bürger / Bürgerin der Bundesrepublik Deutschland ist und mindestens 18 Jahre alt ist.",
				"seit mindestens 3 Jahren in der Bundesrepublik Deutschland lebt.",
				"Bürger / Bürgerin der Bundesrepublik Deutschland ist und mindestens 21 Jahre alt ist.",
				"Wahlen und Beteiligung", 6,
				"B",
				"93,9%",
				false
			)
		)
        list.add(
			Question(
				109,
				"Wie oft gibt es normalerweise Bundestagswahlen in Deutschland?",
				"alle drei Jahre",
				"alle vier Jahre",
				"alle fünf Jahre",
				"alle sechs Jahre",
				"Wahlen und Beteiligung", 6,
				"B",
				"86,0%",
				false
			)
		)
        list.add(
			Question(
				110,
				"Für wie viele Jahre wird der Bundestag in Deutschland gewählt?",
				"2 Jahre",
				"3 Jahre",
				"4 Jahre",
				"5 Jahre",
				"Wahlen und Beteiligung", 6,
				"C",
				"85,1%",
				false
			)
		)
        list.add(
			Question(
				111,
				"In Deutschland darf man wählen. Was bedeutet das?",
				"Alle deutschen Staatsangehörigen dürfen wählen, wenn sie das Mindestalter erreicht haben.",
				"Nur verheiratete Personen dürfen wählen.",
				"Nur Personen mit einem festen Arbeitsplatz dürfen wählen.",
				"Alle Einwohner und Einwohnerinnen in Deutschland müssen wählen.",
				"Wahlen und Beteiligung", 6,
				"A",
				"95,0%",
				false
			)
		)
        list.add(
			Question(
				112,
				"Die Wahlen in Deutschland sind …",
				"speziell.",
				"geheim.",
				"berufsbezogen.",
				"geschlechtsabhängig.",
				"Wahlen und Beteiligung", 6,
				"B",
				"92,6%",
				false
			)
		)
        list.add(
			Question(
				113,
				"Wahlen in Deutschland gewinnt die Partei, die …",
				"die meisten Stimmen bekommt.",
				"die meisten Männer mehrheitlich gewählt haben.",
				"die meisten Stimmen bei den Arbeitern / Arbeiterinnen bekommen hat.",
				"die meisten Erststimmen für ihren Kanzlerkandidaten / ihre Kanzlerkandidatin erhalten hat.",
				"Wahlen und Beteiligung", 6,
				"A",
				"89,3%",
				false
			)
		)
        list.add(
			Question(
				114,
				"An demokratischen Wahlen in Deutschland teilzunehmen ist …",
				"eine Pflicht.",
				"ein Recht.",
				"ein Zwang.",
				"eine Last.",
				"Wahlen und Beteiligung", 6,
				"B",
				"89,5%",
				false
			)
		)
        list.add(
			Question(
				115,
				"Was bedeutet \"aktives Wahlrecht\" in Deutschland?",
				"Man kann gewählt werden.",
				"Man muss wählen gehen.",
				"Man kann wählen.",
				"Man muss zur Auszählung der Stimmen gehen.",
				"Wahlen und Beteiligung", 6,
				"C",
				"85,0%",
				false
			)
		)
        list.add(
			Question(
				116,
				"Wenn Sie bei einer Bundestagswahl in Deutschland wählen dürfen, heißt das …",
				"aktive Wahlkampagne.",
				"aktives Wahlverfahren.",
				"aktiver Wahlkampf.",
				"aktives Wahlrecht.",
				"Wahlen und Beteiligung", 6,
				"D",
				"88,2%",
				false
			)
		)
        list.add(
			Question(
				117,
				"Wie viel Prozent der Zweitstimmen müssen Parteien mindestens bekommen, um in den Deutschen Bundestag gewählt zu werden?",
				"3 %",
				"4 %",
				"5 %",
				"6 %",
				"Wahlen und Beteiligung", 6,
				"C",
				"89,7%",
				false
			)
		)
        list.add(
			Question(
				118,
				"Was regelt das Wahlrecht in Deutschland?",
				"Wer wählen darf, muss wählen.",
				"Alle die wollen, können wählen.",
				"Wer nicht wählt, verliert das Recht zu wählen.",
				"Wer wählen darf, kann wählen.",
				"Wahlen und Beteiligung", 6,
				"D",
				"87,2%",
				false
			)
		)
        list.add(
			Question(
				119,
				"Wahlen in Deutschland sind frei. Was bedeutet das?",
				"Alle verurteilten Straftäter / Straftäterinnen dürfen nicht wählen.",
				"Wenn ich wählen gehen möchte, muss mein Arbeitgeber / meine Arbeitgeberin mir frei geben.",
				"Jede Person kann ohne Zwang entscheiden, ob sie wählen möchte und wen sie wählen möchte.",
				"Ich kann frei entscheiden, wo ich wählen gehen möchte.",
				"Wahlen und Beteiligung", 6,
				"C",
				"85,9%",
				false
			)
		)
        list.add(
			Question(
				120,
				"Das Wahlsystem in Deutschland ist ein …",
				"Zensuswahlrecht.",
				"Dreiklassenwahlrecht.",
				"Mehrheits- und Verhältniswahlrecht.",
				"allgemeines Männerwahlrecht.",
				"Wahlen und Beteiligung", 6,
				"C",
				"83,9%",
				false
			)
		)
        list.add(
			Question(
				121,
				"Eine Partei möchte in den Deutschen Bundestag. Sie muss aber einen Mindestanteil an Wählerstimmen haben. Das heißt …",
				"5 %-Hürde.",
				"Zulassungsgrenze.",
				"Basiswert.",
				"Richtlinie.",
				"Wahlen und Beteiligung", 6,
				"A",
				"92,6%",
				false
			)
		)
        list.add(
			Question(
				122,
				"Welchem Grundsatz unterliegen Wahlen in Deutschland? Wahlen in Deutschland sind …",
				"frei, gleich, geheim.",
				"offen, sicher, frei.",
				"geschlossen, gleich, sicher.",
				"sicher, offen, freiwillig.",
				"Wahlen und Beteiligung", 6,
				"A",
				"82,2%",
				false
			)
		)
        list.add(
			Question(
				123,
				"Was ist in Deutschland die \"5 %-Hürde\"?",
				"Abstimmungsregelung im Bundestag für kleine Parteien",
				"Anwesenheitskontrolle im Bundestag für Abstimmungen",
				"Mindestanteil an Wählerstimmen, um ins Parlament zu kommen",
				"Anwesenheitskontrolle im Bundesrat für Abstimmungen",
				"Wahlen und Beteiligung", 6,
				"C",
				"76,8%",
				false
			)
		)
        list.add(
			Question(
				124,
				"Die Bundestagswahl in Deutschland ist die Wahl …",
				"des Bundeskanzlers / der Bundeskanzlerin.",
				"der Parlamente der Länder.",
				"des Parlaments für Deutschland.",
				"des Bundespräsidenten / der Bundespräsidentin.",
				"Wahlen und Beteiligung", 6,
				"C",
				"52,4%",
				false
			)
		)
        list.add(
			Question(
				125,
				"In einer Demokratie ist eine Funktion von regelmäßigen Wahlen, …",
				"die Bürger und Bürgerinnen zu zwingen, ihre Stimme abzugeben.",
				"nach dem Willen der Wählermehrheit den Wechsel der Regierung zu ermöglichen.",
				"im Land bestehende Gesetze beizubehalten.",
				"den Armen mehr Macht zu geben.",
				"Wahlen und Beteiligung", 6,
				"B",
				"75,9%",
				false
			)
		)
        list.add(
			Question(
				126,
				"Was bekommen wahlberechtigte Bürger und Bürgerinnen in Deutschland vor einer Wahl?",
				"eine Wahlbenachrichtigung von der Gemeinde",
				"eine Wahlerlaubnis vom Bundespräsidenten / von der Bundespräsidentin",
				"eine Benachrichtigung von der Bundesversammlung",
				"eine Benachrichtigung vom Pfarramt",
				"Wahlen und Beteiligung", 6,
				"A",
				"83,0%",
				false
			)
		)
        list.add(
			Question(
				127,
				"Warum gibt es die 5 %-Hürde im Wahlgesetz der Bundesrepublik Deutschland? Es gibt sie, weil …",
				"die Programme von vielen kleinen Parteien viele Gemeinsamkeiten haben.",
				"die Bürger und Bürgerinnen bei vielen kleinen Parteien die Orientierung verlieren können.",
				"viele kleine Parteien die Regierungsbildung erschweren.",
				"die kleinen Parteien nicht so viel Geld haben, um die Politiker und Politikerinnen zu bezahlen.",
				"Wahlen und Beteiligung", 6,
				"C",
				"61,6%",
				false
			)
		)
        list.add(
			Question(
				128,
				"Parlamentsmitglieder, die von den Bürgern und Bürgerinnen gewählt werden, nennt man …",
				"Abgeordnete.",
				"Kanzler / Kanzlerinnen.",
				"Botschafter / Botschafterinnen.",
				"Ministerpräsidenten / Ministerpräsidentinnen.",
				"Wahlen und Beteiligung", 6,
				"A",
				"72,6%",
				false
			)
		)
        list.add(
			Question(
				129,
				"Vom Volk gewählt wird in Deutschland …",
				"der Bundeskanzler / die Bundeskanzlerin.",
				"der Ministerpräsident / die Ministerpräsidentin eines Bundeslandes.",
				"der Bundestag.",
				"der Bundespräsident / die Bundespräsidentin.",
				"Verfassungsorgane", 1,
				"C",
				"62,8%",
				false
			)
		)
        list.add(
			Question(
				130,
				"Welcher Stimmzettel wäre bei einer Bundestagswahl gültig?",
				"1",
				"2",
				"3",
				"4",
				"Wahlen und Beteiligung", 6,
				"A",
				"82,6%",
				true
			)
		)
        list.add(
			Question(
				131,
				"In Deutschland ist ein Bürgermeister / eine Bürgermeisterin …",
				"der Leiter / die Leiterin einer Schule.",
				"der Chef / die Chefin einer Bank.",
				"das Oberhaupt einer Gemeinde.",
				"der / die Vorsitzende einer Partei.",
				"Kommune", 11,
				"C",
				"87,7%",
				false
			)
		)
        list.add(
			Question(
				132,
				"Viele Menschen in Deutschland arbeiten in ihrer Freizeit ehrenamtlich. Was bedeutet das?",
				"Sie arbeiten als Soldaten / Soldatinnen.",
				"Sie arbeiten freiwillig und unbezahlt in Vereinen und Verbänden.",
				"Sie arbeiten in der Bundesregierung.",
				"Sie arbeiten in einem Krankenhaus und verdienen dabei Geld.",
				"Wahlen und Beteiligung", 6,
				"B",
				"92,7%",
				false
			)
		)
        list.add(
			Question(
				133,
				"Was ist bei Bundestags- und Landtagswahlen in Deutschland erlaubt?",
				"Der Ehemann wählt für seine Frau mit.",
				"Man kann durch Briefwahl seine Stimme abgeben.",
				"Man kann am Wahltag telefonisch seine Stimme abgeben.",
				"Kinder ab dem Alter von 14 Jahren dürfen wählen.",
				"Wahlen und Beteiligung", 6,
				"B",
				"93,7%",
				false
			)
		)
        list.add(
			Question(
				134,
				"Man will die Buslinie abschaffen, mit der Sie immer zur Arbeit fahren. Was können Sie machen, um die Buslinie zu erhalten?",
				"Ich beteilige mich an einer Bürgerinitiative für die Erhaltung der Buslinie oder gründe selber eine Initiative.",
				"Ich werde Mitglied in einem Sportverein und trainiere Rad fahren.",
				"Ich wende mich an das Finanzamt, weil ich als Steuerzahler / Steuerzahlerin ein Recht auf die Buslinie habe.",
				"Ich schreibe einen Brief an das Forstamt der Gemeinde.",
				"Wahlen und Beteiligung", 6,
				"A",
				"84,0%",
				false
			)
		)
        list.add(
			Question(
				135,
				"Wen vertreten die Gewerkschaften in Deutschland?",
				"große Unternehmen",
				"kleine Unternehmen",
				"Selbstständige",
				"Arbeitnehmer und Arbeitnehmerinnen",
				"Grundrechte", 5,
				"D",
				"89,3%",
				false
			)
		)
        list.add(
			Question(
				136,
				"Sie gehen in Deutschland zum Arbeitsgericht bei …",
				"falscher Nebenkostenabrechnung.",
				"ungerechtfertigter Kündigung durch Ihren Chef / Ihre Chefin.",
				"Problemen mit den Nachbarn / Nachbarinnen.",
				"Schwierigkeiten nach einem Verkehrsunfall.",
				"Recht und Alltag", 12,
				"B",
				"97,0%",
				false
			)
		)
        list.add(
			Question(
				137,
				"Welches Gericht ist in Deutschland bei Konflikten in der Arbeitswelt zuständig?",
				"das Familiengericht",
				"das Strafgericht",
				"das Arbeitsgericht",
				"das Amtsgericht",
				"Recht und Alltag", 12,
				"C",
				"93,0%",
				false
			)
		)
        list.add(
			Question(
				138,
				"Was kann ich in Deutschland machen, wenn mir mein Arbeitgeber / meine Arbeitgeberin zu Unrecht gekündigt hat?",
				"weiter arbeiten und freundlich zum Chef / zur Chefin sein",
				"ein Mahnverfahren gegen den Arbeitgeber / die Arbeitgeberin führen",
				"Kündigungsschutzklage erheben",
				"den Arbeitgeber / die Arbeitgeberin bei der Polizei anzeigen",
				"Recht und Alltag", 12,
				"C",
				"89,4%",
				false
			)
		)
        list.add(
			Question(
				139,
				"Wann kommt es in Deutschland zu einem Prozess vor Gericht? Wenn jemand …",
				"zu einer anderen Religion übertritt.",
				"eine Straftat begangen hat und angeklagt wird.",
				"eine andere Meinung als die der Regierung vertritt.",
				"sein Auto falsch geparkt hat und es abgeschleppt wird.",
				"Recht und Alltag", 12,
				"B",
				"92,6%",
				false
			)
		)
        list.add(
			Question(
				140,
				"Was macht ein Schöffe / eine Schöffin in Deutschland? Er / Sie …",
				"entscheidet mit Richtern / Richterinnen über Schuld und Strafe.",
				"gibt Bürgern / Bürgerinnen rechtlichen Rat.",
				"stellt Urkunden aus.",
				"verteidigt den Angeklagten / die Angeklagte.",
				"Recht und Alltag", 12,
				"A",
				"82,2%",
				false
			)
		)
        list.add(
			Question(
				141,
				"Wer berät in Deutschland Personen bei Rechtsfragen und vertritt sie vor Gericht?",
				"ein Rechtsanwalt / eine Rechtsanwältin",
				"ein Richter / eine Richterin",
				"ein Schöffe / eine Schöffin",
				"ein Staatsanwalt / eine Staatsanwältin",
				"Recht und Alltag", 12,
				"A",
				"87,1%",
				false
			)
		)
        list.add(
			Question(
				142,
				"Was ist die Hauptaufgabe eines Richters / einer Richterin in Deutschland? Ein Richter / eine Richterin …",
				"vertritt Bürger und Bürgerinnen vor einem Gericht.",
				"arbeitet an einem Gericht und spricht Urteile.",
				"ändert Gesetze.",
				"betreut Jugendliche vor Gericht.",
				"Recht und Alltag", 12,
				"B",
				"83,7%",
				false
			)
		)
        list.add(
			Question(
				143,
				"Ein Richter / eine Richterin in Deutschland gehört zur …",
				"Judikative.",
				"Exekutive.",
				"Operative.",
				"Legislative.",
				"Verfassungsprinzipien", 2,
				"A",
				"82,2%",
				false
			)
		)
        list.add(
			Question(
				144,
				"Ein Richter / eine Richterin gehört in Deutschland zur …",
				"vollziehenden Gewalt.",
				"rechtsprechenden Gewalt.",
				"planenden Gewalt.",
				"gesetzgebenden Gewalt.",
				"Verfassungsprinzipien", 2,
				"B",
				"83,0%",
				false
			)
		)
        list.add(
			Question(
				145,
				"In Deutschland wird die Staatsgewalt geteilt. Für welche Staatsgewalt arbeitet ein Richter / eine Richterin? Für die …",
				"Judikative.",
				"Exekutive.",
				"Presse.",
				"Legislative.",
				"Verfassungsprinzipien", 2,
				"A",
				"79,3%",
				false
			)
		)
        list.add(
			Question(
				146,
				"Wie nennt man in Deutschland ein Verfahren vor einem Gericht?",
				"Programm",
				"Prozedur",
				"Protokoll",
				"Prozess",
				"Recht und Alltag", 12,
				"D",
				"90,8%",
				false
			)
		)
        list.add(
			Question(
				147,
				"Was ist die Arbeit eines Richters / einer Richterin in Deutschland?",
				"Deutschland regieren",
				"Recht sprechen",
				"Pläne erstellen",
				"Gesetze erlassen",
				"Verfassungsprinzipien", 2,
				"B",
				"88,2%",
				false
			)
		)
        list.add(
			Question(
				148,
				"Was ist eine Aufgabe der Polizei in Deutschland?",
				"das Land zu verteidigen",
				"die Bürgerinnen und Bürger abzuhören",
				"die Gesetze zu beschließen",
				"die Einhaltung von Gesetzen zu überwachen",
				"Verfassungsprinzipien", 2,
				"D",
				"86,9%",
				false
			)
		)
        list.add(
			Question(
				149,
				"Wer kann Gerichtsschöffe / Gerichtsschöffin in Deutschland werden?",
				"alle in Deutschland geborenen Einwohner / Einwohnerinnen über 18 Jahre",
				"alle deutschen Staatsangehörigen älter als 24 und jünger als 70 Jahre",
				"alle Personen, die seit mindestens 5 Jahren in Deutschland leben",
				"nur Personen mit einem abgeschlossenen Jurastudium",
				"Recht und Alltag", 12,
				"B",
				"68,6%",
				false
			)
		)
        list.add(
			Question(
				150,
				"Ein Gerichtsschöffe / eine Gerichtsschöffin in Deutschland ist …",
				"der Stellvertreter / die Stellvertreterin des Stadtoberhaupts.",
				"ein ehrenamtlicher Richter / eine ehrenamtliche Richterin.",
				"ein Mitglied eines Gemeinderats.",
				"eine Person, die Jura studiert hat.",
				"Recht und Alltag", 12,
				"B",
				"78,1%",
				false
			)
		)
        list.add(
			Question(
				151,
				"Wer baute die Mauer in Berlin?",
				"Großbritannien",
				"die Bundesrepublik Deutschland",
				"die DDR",
				"die USA",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"78,1%",
				false
			)
		)
        list.add(
			Question(
				152,
				"Wann waren die Nationalsozialisten mit Adolf Hitler in Deutschland an der Macht?",
				"1918 bis 1923",
				"1932 bis 1950",
				"1933 bis 1945",
				"1945 bis 1989",
				"Der Nationalsozialismus und seine Folgen", 13,
				"C",
				"95,4%",
				false
			)
		)
        list.add(
			Question(
				153,
				"Was war am 8. Mai 1945?",
				"Tod Adolf Hitlers",
				"Beginn des Berliner Mauerbaus",
				"Wahl von Konrad Adenauer zum Bundeskanzler",
				"Ende des Zweiten Weltkriegs in Europa",
				"Der Nationalsozialismus und seine Folgen", 13,
				"D",
				"88,6%",
				false
			)
		)
        list.add(
			Question(
				154,
				"Wann war der Zweite Weltkrieg zu Ende?",
				"1933",
				"1945",
				"1949",
				"1961",
				"Der Nationalsozialismus und seine Folgen", 13,
				"B",
				"88,2%",
				false
			)
		)
        list.add(
			Question(
				155,
				"Wann waren die Nationalsozialisten in Deutschland an der Macht?",
				"1888 bis 1918",
				"1921 bis 1934",
				"1933 bis 1945",
				"1949 bis 1963",
				"Der Nationalsozialismus und seine Folgen", 13,
				"C",
				"89,6%",
				false
			)
		)
        list.add(
			Question(
				156,
				"In welchem Jahr wurde Hitler Reichskanzler?",
				"1923",
				"1927",
				"1933",
				"1936",
				"Der Nationalsozialismus und seine Folgen", 13,
				"C",
				"82,2%",
				false
			)
		)
        list.add(
			Question(
				157,
				"Die Nationalsozialisten mit Adolf Hitler errichteten 1933 in Deutschland …",
				"eine Diktatur.",
				"einen demokratischen Staat.",
				"eine Monarchie.",
				"ein Fürstentum.",
				"Der Nationalsozialismus und seine Folgen", 13,
				"A",
				"94,7%",
				false
			)
		)
        list.add(
			Question(
				158,
				"Das \"Dritte Reich\" war eine …",
				"Diktatur.",
				"Demokratie.",
				"Monarchie.",
				"Räterepublik.",
				"Der Nationalsozialismus und seine Folgen", 13,
				"A",
				"86,1%",
				false
			)
		)
        list.add(
			Question(
				159,
				"Was gab es in Deutschland nicht während der Zeit des Nationalsozialismus?",
				"freie Wahlen",
				"Pressezensur",
				"willkürliche Verhaftungen",
				"Verfolgung der Juden",
				"Der Nationalsozialismus und seine Folgen", 13,
				"A",
				"77,4%",
				false
			)
		)
        list.add(
			Question(
				160,
				"Welcher Krieg dauerte von 1939 bis 1945?",
				"der Erste Weltkrieg",
				"der Zweite Weltkrieg",
				"der Vietnamkrieg",
				"der Golfkrieg",
				"Der Nationalsozialismus und seine Folgen", 13,
				"B",
				"96,8%",
				false
			)
		)
        list.add(
			Question(
				161,
				"Was kennzeichnete den NS-Staat? Eine Politik …",
				"des staatlichen Rassismus",
				"der Meinungsfreiheit",
				"der allgemeinen Religionsfreiheit",
				"der Entwicklung der Demokratie",
				"Der Nationalsozialismus und seine Folgen", 13,
				"A",
				"79,8%",
				false
			)
		)
        list.add(
			Question(
				162,
				"Claus Schenk Graf von Stauffenberg wurde bekannt durch …",
				"eine Goldmedaille bei den Olympischen Spielen 1936.",
				"den Bau des Reichstagsgebäudes.",
				"den Aufbau der Wehrmacht.",
				"das Attentat auf Hitler am 20. Juli 1944.",
				"Der Nationalsozialismus und seine Folgen", 13,
				"D",
				"81,6%",
				false
			)
		)
        list.add(
			Question(
				163,
				"In welchem Jahr zerstörten die Nationalsozialisten Synagogen und jüdische Geschäfte in Deutschland?",
				"1925",
				"1930",
				"1938",
				"1945",
				"Der Nationalsozialismus und seine Folgen", 13,
				"C",
				"81,5%",
				false
			)
		)
        list.add(
			Question(
				164,
				"Was passierte am 9. November 1938 in Deutschland?",
				"Mit dem Angriff auf Polen beginnt der Zweite Weltkrieg.",
				"Die Nationalsozialisten verlieren eine Wahl und lösen den Reichstag auf.",
				"Jüdische Geschäfte und Synagogen werden durch Nationalsozialisten und ihre Anhänger zerstört.",
				"Hitler wird Reichspräsident und lässt alle Parteien verbieten.",
				"Der Nationalsozialismus und seine Folgen", 13,
				"C",
				"73,4%",
				false
			)
		)
        list.add(
			Question(
				165,
				"Wie hieß der erste Bundeskanzler der Bundesrepublik Deutschland?",
				"Konrad Adenauer",
				"Kurt Georg Kiesinger",
				"Helmut Schmidt",
				"Willy Brandt",
				"Wichtige Stationen nach 1945", 14,
				"A",
				"85,9%",
				false
			)
		)
        list.add(
			Question(
				166,
				"Bei welchen Demonstrationen in Deutschland riefen die Menschen \"Wir sind das Volk\"?",
				"bei den Montagsdemonstrationen 1989 in der DDR",
				"beim Arbeiteraufstand 1953 in der DDR",
				"bei den Demonstrationen 1968 in der Bundesrepublik Deutschland",
				"bei den Anti-Atomkraft-Demonstrationen 1985 in der Bundesrepublik Deutschland",
				"Wichtige Stationen nach 1945", 14,
				"A",
				"96,8%",
				false
			)
		)
        list.add(
			Question(
				167,
				"Welche Länder wurden nach dem Zweiten Weltkrieg in Deutschland als \"Alliierte Besatzungsmächte\" bezeichnet?",
				"Sowjetunion, Großbritannien, Polen, Schweden",
				"Frankreich, Sowjetunion, Italien, Japan",
				"USA, Sowjetunion, Spanien, Portugal",
				"USA, Sowjetunion, Großbritannien, Frankreich",
				"Wichtige Stationen nach 1945", 14,
				"D",
				"88,8%",
				false
			)
		)
        list.add(
			Question(
				168,
				"Welches Land war keine \"Alliierte Besatzungsmacht\" in Deutschland?",
				"USA",
				"Sowjetunion",
				"Frankreich",
				"Japan",
				"Wichtige Stationen nach 1945", 14,
				"D",
				"89,1%",
				false
			)
		)
        list.add(
			Question(
				169,
				"Wann wurde die Bundesrepublik Deutschland gegründet?",
				"1939",
				"1945",
				"1949",
				"1951",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"73,5%",
				false
			)
		)
        list.add(
			Question(
				170,
				"Was gab es während der Zeit des Nationalsozialismus in Deutschland?",
				"das Recht zur freien Entfaltung der Persönlichkeit",
				"Pressefreiheit",
				"das Verbot von Parteien",
				"den Schutz der Menschenwürde",
				"Der Nationalsozialismus und seine Folgen", 13,
				"C",
				"75,9%",
				false
			)
		)
        list.add(
			Question(
				171,
				"Soziale Marktwirtschaft bedeutet, die Wirtschaft …",
				"steuert sich allein nach Angebot und Nachfrage.",
				"wird vom Staat geplant und gesteuert, Angebot und Nachfrage werden nicht berücksichtigt.",
				"richtet sich nach der Nachfrage im Ausland.",
				"richtet sich nach Angebot und Nachfrage, aber der Staat sorgt für einen sozialen Ausgleich.",
				"Wichtige Stationen nach 1945", 14,
				"D",
				"77,4%",
				false
			)
		)
        list.add(
			Question(
				172,
				"In welcher Besatzungszone wurde die DDR gegründet? In der …",
				"amerikanischen Besatzungszone.",
				"französischen Besatzungszone.",
				"britischen Besatzungszone.",
				"sowjetischen Besatzungszone.",
				"Wichtige Stationen nach 1945", 14,
				"D",
				"91,2%",
				false
			)
		)
        list.add(
			Question(
				173,
				"Die Bundesrepublik Deutschland ist ein Gründungsmitglied …",
				"des Nordatlantikpakts (NATO).",
				"der Vereinten Nationen (VN).",
				"der Europäischen Union (EU).",
				"des Warschauer Pakts.",
				"Deutschland in Europa", 16,
				"C",
				"92,7%",
				false
			)
		)
        list.add(
			Question(
				174,
				"Wann wurde die DDR gegründet?",
				"1947",
				"1949",
				"1953",
				"1956",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"71,6%",
				false
			)
		)
        list.add(
			Question(
				175,
				"Wie viele Besatzungszonen gab es in Deutschland nach dem Zweiten Weltkrieg?",
				"3",
				"4",
				"5",
				"6",
				"Der Nationalsozialismus und seine Folgen", 13,
				"B",
				"74,9%",
				false
			)
		)
        list.add(
			Question(
				176,
				"Wie waren die Besatzungszonen Deutschlands nach 1945 verteilt?",
				"1=Großbritannien, 2=Sowjetunion, 3=Frankreich, 4=USA",
				"1=Sowjetunion, 2=Großbritannien, 3=USA, 4=Frankreich",
				"1=Großbritannien, 2=Sowjetunion, 3=USA, 4=Frankreich",
				"1=Großbritannien, 2=USA, 3=Sowjetunion, 4=Frankreich",
				"Der Nationalsozialismus und seine Folgen", 13,
				"C",
				"71,7%",
				true
			)
		)
        list.add(
			Question(
				177,
				"Welche deutsche Stadt wurde nach dem Zweiten Weltkrieg in vier Sektoren aufgeteilt?",
				"München",
				"Berlin",
				"Dresden",
				"Frankfurt/Oder",
				"Der Nationalsozialismus und seine Folgen", 13,
				"B",
				"93,9%",
				false
			)
		)
        list.add(
			Question(
				178,
				"Vom Juni 1948 bis zum Mai 1949 wurden die Bürger und Bürgerinnen von West-Berlin durch eine Luftbrücke versorgt. Welcher Umstand war dafür verantwortlich?",
				"Für Frankreich war eine Versorgung der West-Berliner Bevölkerung mit dem Flugzeug kostengünstiger.",
				"Die amerikanischen Soldaten / Soldatinnen hatten beim Landtransport Angst vor Überfällen.",
				"Für Großbritannien war die Versorgung über die Luftbrücke schneller.",
				"Die Sowjetunion unterbrach den gesamten Verkehr auf dem Landwege.",
				"Wichtige Stationen nach 1945", 14,
				"D",
				"81,1%",
				false
			)
		)
        list.add(
			Question(
				179,
				"Wie endete der Zweite Weltkrieg in Europa offiziell?",
				"mit dem Tod Adolf Hitlers",
				"durch die bedingungslose Kapitulation Deutschlands",
				"mit dem Rückzug der Deutschen aus den besetzten Gebieten",
				"durch eine Revolution in Deutschland",
				"Der Nationalsozialismus und seine Folgen", 13,
				"B",
				"72,8%",
				false
			)
		)
        list.add(
			Question(
				180,
				"Der erste Bundeskanzler der Bundesrepublik Deutschland war …",
				"Ludwig Erhard.",
				"Willy Brandt.",
				"Konrad Adenauer.",
				"Gerhard Schröder.",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"83,6%",
				false
			)
		)
        list.add(
			Question(
				181,
				"Was wollte Willy Brandt mit seinem Kniefall 1970 im ehemaligen jüdischen Ghetto in Warschau ausdrücken?",
				"Er hat sich den ehemaligen Alliierten unterworfen.",
				"Er bat Polen und die polnischen Juden um Vergebung.",
				"Er zeigte seine Demut vor dem Warschauer Pakt.",
				"Er sprach ein Gebet am Grab des Unbekannten Soldaten.",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"81,4%",
				true
			)
		)
        list.add(
			Question(
				182,
				"Welche Parteien wurden 1946 zwangsweise zur SED vereint, der Einheitspartei der späteren DDR?",
				"KPD und SPD",
				"SPD und CDU",
				"CDU und FDP",
				"KPD und CSU",
				"Wichtige Stationen nach 1945", 14,
				"A",
				"69,4%",
				false
			)
		)
        list.add(
			Question(
				183,
				"Wann war in der Bundesrepublik Deutschland das \"Wirtschaftswunder\"?",
				"40er Jahre",
				"50er Jahre",
				"70er Jahre",
				"80er Jahre",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"74,7%",
				false
			)
		)
        list.add(
			Question(
				184,
				"Was nannten die Menschen in Deutschland sehr lange \"Die Stunde false\"?",
				"Damit wird die Zeit nach der Wende im Jahr 1989 bezeichnet.",
				"Damit wurde der Beginn des Zweiten Weltkrieges bezeichnet.",
				"Darunter verstand man das Ende des Zweiten Weltkrieges und den Beginn des Wiederaufbaus.",
				"Damit ist die Stunde gemeint, in der die Uhr von der Sommerzeit auf die Winterzeit umgestellt wird.",
				"Der Nationalsozialismus und seine Folgen", 13,
				"C",
				"74,0%",
				false
			)
		)
        list.add(
			Question(
				185,
				"Wofür stand der Ausdruck \"Eiserner Vorhang\"? Für die Abschottung …",
				"des Warschauer Pakts gegen den Westen.",
				"Norddeutschlands gegen Süddeutschland.",
				"Nazi-Deutschlands gegen die Alliierten.",
				"Europas gegen die USA.",
				"Wichtige Stationen nach 1945", 14,
				"A",
				"76,6%",
				false
			)
		)
        list.add(
			Question(
				186,
				"Im Jahr 1953 gab es in der DDR einen Aufstand, an den lange Zeit in der Bundesrepublik Deutschland ein Feiertag erinnerte. Wann war das?",
				"1. Mai",
				"17. Juni",
				"20. Juli",
				"9. November",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"71,5%",
				false
			)
		)
        list.add(
			Question(
				187,
				"Welcher deutsche Staat hatte eine schwarz-rot-goldene Flagge mit Hammer, Zirkel und Ährenkranz?",
				"Preußen",
				"Bundesrepublik Deutschland",
				"DDR",
				"\"Drittes Reich\"",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"98,5%",
				true
			)
		)
        list.add(
			Question(
				188,
				"In welchem Jahr wurde die Mauer in Berlin gebaut?",
				"1953",
				"1956",
				"1959",
				"1961",
				"Wichtige Stationen nach 1945", 14,
				"D",
				"77,2%",
				false
			)
		)
        list.add(
			Question(
				189,
				"Wann baute die DDR die Mauer in Berlin?",
				"1919",
				"1933",
				"1961",
				"1990",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"88,0%",
				false
			)
		)
        list.add(
			Question(
				190,
				"Was bedeutet die Abkürzung DDR?",
				"Dritter Deutscher Rundfunk",
				"Die Deutsche Republik",
				"Dritte Deutsche Republik",
				"Deutsche Demokratische Republik",
				"Wichtige Stationen nach 1945", 14,
				"D",
				"94,2%",
				false
			)
		)
        list.add(
			Question(
				191,
				"Wann wurde die Mauer in Berlin für alle geöffnet?",
				"1987",
				"1989",
				"1992",
				"1995",
				"Wiedervereinigung", 15,
				"B",
				"88,7%",
				false
			)
		)
        list.add(
			Question(
				192,
				"Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?",
				"Brandenburg",
				"Bayern",
				"Saarland",
				"Hessen",
				"Wiedervereinigung", 15,
				"A",
				"86,4%",
				false
			)
		)
        list.add(
			Question(
				193,
				"Von 1961 bis 1989 war Berlin …",
				"ohne Bürgermeister.",
				"ein eigener Staat.",
				"durch eine Mauer geteilt.",
				"nur mit dem Flugzeug erreichbar.",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"94,6%",
				false
			)
		)
        list.add(
			Question(
				194,
				"Am 3. Oktober feiert man in Deutschland den Tag der Deutschen …",
				"Einheit.",
				"Nation.",
				"Bundesländer.",
				"Städte.",
				"Wiedervereinigung", 15,
				"A",
				"94,8%",
				false
			)
		)
        list.add(
			Question(
				195,
				"Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?",
				"Hessen",
				"Sachsen-Anhalt",
				"Nordrhein-Westfalen",
				"Saarland",
				"Wiedervereinigung", 15,
				"B",
				"86,1%",
				false
			)
		)
        list.add(
			Question(
				196,
				"Warum nennt man die Zeit im Herbst 1989 in der DDR \"Die Wende\"? In dieser Zeit veränderte sich die DDR politisch …",
				"von einer Diktatur zur Demokratie.",
				"von einer liberalen Marktwirtschaft zum Sozialismus.",
				"von einer Monarchie zur Sozialdemokratie.",
				"von einem religiösen Staat zu einem kommunistischen Staat.",
				"Wiedervereinigung", 15,
				"A",
				"85,8%",
				false
			)
		)
        list.add(
			Question(
				197,
				"Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?",
				"Thüringen",
				"Hessen",
				"Bayern",
				"Bremen",
				"Wiedervereinigung", 15,
				"A",
				"87,5%",
				false
			)
		)
        list.add(
			Question(
				198,
				"Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?",
				"Bayern",
				"Niedersachsen",
				"Sachsen",
				"Baden-Württemberg",
				"Wiedervereinigung", 15,
				"C",
				"79,4%",
				false
			)
		)
        list.add(
			Question(
				199,
				"Mit der Abkürzung \"Stasi\" meinte man in der DDR …",
				"das Parlament.",
				"das Ministerium für Staatssicherheit.",
				"eine regierende Partei.",
				"das Ministerium für Volksbildung.",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"82,5%",
				false
			)
		)
        list.add(
			Question(
				200,
				"Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?",
				"Hessen",
				"Schleswig-Holstein",
				"Mecklenburg-Vorpommern",
				"Saarland",
				"Wiedervereinigung",
				15,
				"C",
				"82,2%",
				false
			)
		)
        list.add(
			Question(
				201,
				"Welche der folgenden Auflistungen enthält nur Bundesländer, die zum Gebiet der früheren DDR gehörten?",
				"Niedersachsen, Nordrhein-Westfalen, Hessen, Schleswig-Holstein, Brandenburg",
				"Mecklenburg-Vorpommern, Brandenburg, Sachsen, Sachsen-Anhalt, Thüringen",
				"Bayern, Baden-Württemberg, Rheinland-Pfalz, Thüringen, Sachsen",
				"Sachsen, Thüringen, Hessen, Niedersachsen, Brandenburg",
				"Wiedervereinigung", 15,
				"B",
				"86,4%",
				false
			)
		)
        list.add(
			Question(
				202,
				"Zu wem gehörte die DDR im \"Kalten Krieg\"?",
				"zu den Westmächten",
				"zum Warschauer Pakt",
				"zur NATO",
				"zu den blockfreien Staaten",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"85,0%",
				false
			)
		)
        list.add(
			Question(
				203,
				"Wie hieß das Wirtschaftssystem der DDR?",
				"Marktwirtschaft",
				"Planwirtschaft",
				"Angebot und Nachfrage",
				"Kapitalismus",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"62,8%",
				false
			)
		)
        list.add(
			Question(
				204,
				"Wie wurden die Bundesrepublik Deutschland und die DDR zu einem Staat?",
				"Die Bundesrepublik Deutschland hat die DDR besetzt.",
				"Die heutigen fünf östlichen Bundesländer sind der Bundesrepublik Deutschland beigetreten.",
				"Die westlichen Bundesländer sind der DDR beigetreten.",
				"Die DDR hat die Bundesrepublik Deutschland besetzt.",
				"Wiedervereinigung", 15,
				"B",
				"79,3%",
				false
			)
		)
        list.add(
			Question(
				205,
				"Mit dem Beitritt der DDR zur Bundesrepublik Deutschland gehören die neuen Bundesländer nun auch …",
				"zur Europäischen Union.",
				"zum Warschauer Pakt.",
				"zur OPEC.",
				"zur Europäischen Verteidigungsgemeinschaft.",
				"Wiedervereinigung", 15,
				"A",
				"80,6%",
				false
			)
		)
        list.add(
			Question(
				206,
				"Was bedeutete im Jahr 1989 in Deutschland das Wort \"Montagsdemonstration\"?",
				"In der Bundesrepublik waren Demonstrationen nur am Montag erlaubt.",
				"Montags waren Demonstrationen gegen das DDR-Regime.",
				"Am ersten Montag im Monat trafen sich in der Bundesrepublik Deutschland Demonstranten.",
				"Montags demonstrierte man in der DDR gegen den Westen.",
				"Wiedervereinigung", 15,
				"B",
				"73,2%",
				false
			)
		)
        list.add(
			Question(
				207,
				"In welchem Militärbündnis war die DDR Mitglied?",
				"in der NATO",
				"im Rheinbund",
				"im Warschauer Pakt",
				"im Europabündnis",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"84,6%",
				false
			)
		)
        list.add(
			Question(
				208,
				"Was war die \"Stasi\"?",
				"der Geheimdienst im \"Dritten Reich\"",
				"eine berühmte deutsche Gedenkstätte",
				"der Geheimdienst der DDR",
				"ein deutscher Sportverein während des Zweiten Weltkrieges",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"81,5%",
				false
			)
		)
        list.add(
			Question(
				209,
				"Welches war das Wappen der Deutschen Demokratischen Republik?",
				"1",
				"2",
				"3",
				"4",
				"Wichtige Stationen nach 1945", 14,
				"D",
				"61,0%",
				true
			)
		)
        list.add(
			Question(
				210,
				"Was ereignete sich am 17. Juni 1953 in der DDR?",
				"der feierliche Beitritt zum Warschauer Pakt",
				"landesweite Streiks und ein Volksaufstand",
				"der 1. SED-Parteitag",
				"der erste Besuch Fidel Castros",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"57,7%",
				false
			)
		)
        list.add(
			Question(
				211,
				"Welcher Politiker steht für die \"Ostverträge\"?",
				"Helmut Kohl",
				"Willy Brandt",
				"Michail Gorbatschow",
				"Ludwig Erhard",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"60,8%",
				false
			)
		)
        list.add(
			Question(
				212,
				"Wie heißt Deutschland mit vollem Namen?",
				"Bundesstaat Deutschland",
				"Bundesländer Deutschland",
				"Bundesrepublik Deutschland",
				"Bundesbezirk Deutschland",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"97,0%",
				false
			)
		)
        list.add(
			Question(
				213,
				"Wie viele Einwohner hat Deutschland?",
				"70 Millionen",
				"78 Millionen",
				"80 Millionen",
				"90 Millionen",
				"Deutschland in Europa", 16,
				"C",
				"91,5%",
				false
			)
		)
        list.add(
			Question(
				214,
				"Welche Farben hat die deutsche Flagge?",
				"schwarz-rot-gold",
				"rot-weiß-schwarz",
				"schwarz-rot-grün",
				"schwarz-gelb-rot",
				"Staatssymbole", 10,
				"A",
				"88,5%",
				false
			)
		)
        list.add(
			Question(
				215,
				"Wer wird als \"Kanzler der Deutschen Einheit\" bezeichnet?",
				"Gerhard Schröder",
				"Helmut Kohl",
				"Konrad Adenauer",
				"Helmut Schmidt",
				"Wichtige Stationen nach 1945", 14,
				"B",
				"76,1%",
				false
			)
		)
        list.add(
			Question(
				216,
				"Welches Symbol ist im Plenarsaal des Deutschen Bundestages zu sehen?",
				"die Fahne der Stadt Berlin.",
				"der Bundesadler.",
				"der Reichsadler.",
				"die Reichskrone.",
				"Staatssymbole", 10,
				"B",
				"98,4%",
				true
			)
		)
        list.add(
			Question(
				217,
				"In welchem Zeitraum gab es die Deutsche Demokratische Republik (DDR)?",
				"1919 bis 1927",
				"1933 bis 1945",
				"1949 bis 1990",
				"1945 bis 1961",
				"Wichtige Stationen nach 1945", 14,
				"C",
				"65,0%",
				false
			)
		)
        list.add(
			Question(
				218,
				"Wie viele Bundesländer kamen bei der Wiedervereinigung 1990 zur Bundesrepublik Deutschland hinzu?",
				"4",
				"5",
				"6",
				"7",
				"Wiedervereinigung", 15,
				"B",
				"65,8%",
				false
			)
		)
        list.add(
			Question(
				219,
				"Die Bundesrepublik Deutschland hat die Grenzen von heute seit …",
				"1933.",
				"1949.",
				"1971.",
				"1990.",
				"Wiedervereinigung", 15,
				"D",
				"71,0%",
				false
			)
		)
        list.add(
			Question(
				220,
				"Der 27. Januar ist in Deutschland ein offizieller Gedenktag. Woran erinnert dieser Tag?",
				"an das Ende des Zweiten Weltkrieges",
				"an die Verabschiedung des Grundgesetzes",
				"an die Wiedervereinigung Deutschlands",
				"an die Opfer des Nationalsozialismus",
				"Der Nationalsozialismus und seine Folgen", 13,
				"D",
				"73,5%",
				false
			)
		)
        list.add(
			Question(
				221,
				"Deutschland ist Mitglied des Schengener Abkommens. Was bedeutet das?",
				"Deutsche können in viele Länder Europas ohne Passkontrolle reisen.",
				"Alle Menschen können ohne Personenkontrolle in Deutschland einreisen.",
				"Deutsche können ohne Passkontrolle in jedes Land reisen.",
				"Deutsche können in jedem Land mit dem Euro bezahlen.",
				"Deutschland in Europa", 16,
				"A",
				"95,7%",
				false
			)
		)
        list.add(
			Question(
				222,
				"Welches Land ist ein Nachbarland von Deutschland?",
				"Ungarn",
				"Portugal",
				"Spanien",
				"Schweiz",
				"Deutschland in Europa", 16,
				"D",
				"96,3%",
				false
			)
		)
        list.add(
			Question(
				223,
				"Welches Land ist ein Nachbarland von Deutschland?",
				"Rumänien",
				"Bulgarien",
				"Polen",
				"Griechenland",
				"Deutschland in Europa", 16,
				"C",
				"95,5%",
				false
			)
		)
        list.add(
			Question(
				224,
				"Was bedeutet die Abkürzung EU?",
				"Europäische Unternehmen",
				"Europäische Union",
				"Einheitliche Union",
				"Euro Union",
				"Deutschland in Europa", 16,
				"B",
				"96,7%",
				false
			)
		)
        list.add(
			Question(
				225,
				"In welchem anderen Land gibt es eine große deutschsprachige Bevölkerung?",
				"Tschechien",
				"Norwegen",
				"Spanien",
				"Österreich",
				"Deutschland in Europa", 16,
				"D",
				"96,6%",
				false
			)
		)
        list.add(
			Question(
				226,
				"Welche ist die Flagge der Europäischen Union?",
				"2",
				"1",
				"4",
				"3",
				"Deutschland in Europa", 16,
				"A",
				"98,7%",
				true
			)
		)
        list.add(
			Question(
				227,
				"Welches Land ist ein Nachbarland von Deutschland?",
				"Finnland",
				"Dänemark",
				"Norwegen",
				"Schweden",
				"Deutschland in Europa", 16,
				"B",
				"90,5%",
				false
			)
		)
        list.add(
			Question(
				228,
				"Wie wird der Beitritt der DDR zur Bundesrepublik Deutschland im Jahr 1990 allgemein genannt?",
				"NATO-Osterweiterung",
				"EU-Osterweiterung",
				"Europäische Gemeinschaft",
				"Deutsche Wiedervereinigung",
				"Wiedervereinigung", 15,
				"D",
				"96,9%",
				false
			)
		)
        list.add(
			Question(
				229,
				"Welches Land ist ein Nachbarland von Deutschland?",
				"Spanien",
				"Bulgarien",
				"Norwegen",
				"Luxemburg",
				"Deutschland in Europa", 16,
				"D",
				"92,7%",
				false
			)
		)
        list.add(
			Question(
				230,
				"Das Europäische Parlament wird regelmäßig gewählt, nämlich alle …",
				"5 Jahre.",
				"6 Jahre.",
				"7 Jahre.",
				"8 Jahre.",
				"Deutschland in Europa", 16,
				"A",
				"89,6%",
				false
			)
		)
        list.add(
			Question(
				231,
				"Was bedeutet der Begriff \"europäische Integration\"?",
				"Damit sind amerikanische Einwanderer in Europa gemeint.",
				"Der Begriff meint den Einwanderungsstopp nach Europa.",
				"Damit sind europäische Auswanderer in den USA gemeint.",
				"Der Begriff meint den Zusammenschluss europäischer Staaten zur EU.",
				"Deutschland in Europa", 16,
				"D",
				"91,9%",
				false
			)
		)
        list.add(
			Question(
				232,
				"Wer wird bei der Europawahl gewählt?",
				"die Europäische Kommission",
				"die Länder, die in die EU eintreten dürfen",
				"die europäische Verfassung",
				"die Abgeordneten des Europäischen Parlaments",
				"Deutschland in Europa", 16,
				"D",
				"85,3%",
				false
			)
		)
        list.add(
			Question(
				233,
				"Welches Land ist ein Nachbarland von Deutschland?",
				"Tschechien",
				"Bulgarien",
				"Griechenland",
				"Portugal",
				"Deutschland in Europa", 16,
				"A",
				"91,2%",
				false
			)
		)
        list.add(
			Question(
				234,
				"Wo ist der Sitz des Europäischen Parlaments?",
				"London",
				"Paris",
				"Berlin",
				"Straßburg",
				"Deutschland in Europa", 16,
				"D",
				"87,9%",
				false
			)
		)
        list.add(
			Question(
				235,
				"Der französische Staatspräsident François Mitterrand und der deutsche Bundeskanzler Helmut Kohl gedenken in Verdun gemeinsam der Toten beider Weltkriege. Welches Ziel der Europäischen Union wird bei diesem Treffen deutlich?",
				"Freundschaft zwischen England und Deutschland",
				"Reisefreiheit in alle Länder der EU",
				"Frieden und Sicherheit in den Ländern der EU",
				"einheitliche Feiertage in den Ländern der EU",
				"Deutschland in Europa", 16,
				"C",
				"85,9%",
				true
			)
		)
        list.add(
			Question(
				236,
				"Wie viele Mitgliedstaaten hat die EU heute?",
				"21",
				"23",
				"25",
				"28",
				"Deutschland in Europa", 16,
				"D",
				"74,5%",
				false
			)
		)
        list.add(
			Question(
				237,
				"2007 wurde das 50-jährige Jubiläum der \"Römischen Verträge\" gefeiert. Was war der Inhalt der Verträge?",
				"Beitritt Deutschlands zur NATO",
				"Gründung der Europäischen Wirtschaftsgemeinschaft (EWG)",
				"Verpflichtung Deutschlands zu Reparationsleistungen",
				"Festlegung der Oder-Neiße-Linie als Ostgrenze",
				"Deutschland in Europa", 16,
				"B",
				"78,4%",
				false
			)
		)
        list.add(
			Question(
				238,
				"An welchen Orten arbeitet das Europäische Parlament?",
				"Paris, London und Den Haag",
				"Straßburg, Luxemburg und Brüssel",
				"Rom, Bern und Wien",
				"Bonn, Zürich und Mailand",
				"Deutschland in Europa", 16,
				"B",
				"95,5%",
				false
			)
		)
        list.add(
			Question(
				239,
				"Durch welche Verträge schloss sich die Bundesrepublik Deutschland mit anderen Staaten zur Europäischen Wirtschaftsgemeinschaft zusammen?",
				"durch die \"Hamburger Verträge\"",
				"durch die \"Römischen Verträge\"",
				"durch die \"Pariser Verträge\"",
				"durch die \"Londoner Verträge\"",
				"Deutschland in Europa", 16,
				"B",
				"68,6%",
				false
			)
		)
        list.add(
			Question(
				240,
				"Seit wann bezahlt man in Deutschland mit dem Euro in bar?",
				"1995",
				"1998",
				"2002",
				"2005",
				"Deutschland in Europa", 16,
				"C",
				"95,3%",
				false
			)
		)
        list.add(
			Question(
				241,
				"Frau Seger bekommt ein Kind. Was muss sie tun, um Elterngeld zu erhalten?",
				"Sie muss an ihre Krankenkasse schreiben.",
				"Sie muss nichts tun, denn sie bekommt automatisch Elterngeld.",
				"Sie muss einen Antrag bei der Elterngeldstelle stellen.",
				"Sie muss das Arbeitsamt um Erlaubnis bitten.",
				"Recht und Alltag", 12,
				"C",
				"98,2%",
				false
			)
		)
        list.add(
			Question(
				242,
				"Wer entscheidet, ob ein Kind in Deutschland in den Kindergarten geht?",
				"der Staat",
				"die Bundesländer",
				"die Eltern/die Erziehungsberechtigten",
				"die Schulen",
				"Recht und Alltag", 12,
				"C",
				"98,2%",
				false
			)
		)
        list.add(
			Question(
				243,
				"Maik und Sybille wollen mit Freunden an ihrem deutschen Wohnort eine Demonstration auf der Straße abhalten. Was müssen sie vorher tun?",
				"Sie müssen nichts tun. Man darf in Deutschland jederzeit überall demonstrieren.",
				"Sie müssen die Demonstration anmelden.",
				"Sie können gar nichts tun, denn Demonstrationen sind in Deutschland grundsätzlich verboten.",
				"Maik und Sybille müssen einen neuen Verein gründen, weil nur Vereine demonstrieren dürfen.",
				"Recht und Alltag", 12,
				"B",
				"99,0%",
				false
			)
		)
        list.add(
			Question(
				244,
				"Welchen Schulabschluss braucht man normalerweise, um an einer Universität in Deutschland ein Studium zu beginnen?",
				"das Abitur",
				"ein Diplom",
				"die Prokura",
				"eine Gesellenprüfung",
				"Bildung", 18,
				"A",
				"97,6%",
				false
			)
		)
        list.add(
			Question(
				245,
				"Wer darf in Deutschland nicht als Paar zusammenleben?",
				"Hans (20 Jahre) und Marie (19 Jahre)",
				"Tom (20 Jahre) und Klaus (45 Jahre)",
				"Sofie (35 Jahre) und Lisa (40 Jahre)",
				"Anne (13 Jahre) und Tim (25 Jahre)",
				"Recht und Alltag", 12,
				"D",
				"98,3%",
				false
			)
		)
        list.add(
			Question(
				246,
				"Ab welchem Alter ist man in Deutschland volljährig?",
				"16",
				"18",
				"19",
				"21",
				"Recht und Alltag", 12,
				"B",
				"96,7%",
				false
			)
		)
        list.add(
			Question(
				247,
				"Eine Frau ist schwanger. Sie ist kurz vor und nach der Geburt ihres Kindes vom Gesetz besonders geschützt. Wie heißt dieser Schutz?",
				"Elternzeit",
				"Geburtsvorbereitung",
				"Mutterschutz",
				"Wochenbett",
				"Recht und Alltag", 12,
				"C",
				"98,6%",
				false
			)
		)
        list.add(
			Question(
				248,
				"Die Erziehung der Kinder ist in Deutschland vor allem Aufgabe …",
				"des Staates.",
				"der Eltern.",
				"der Großeltern.",
				"der Schulen.",
				"Pflichten", 9,
				"B",
				"96,1%",
				false
			)
		)
        list.add(
			Question(
				249,
				"Wer ist in Deutschland hauptsächlich verantwortlich für die Kindererziehung?",
				"der Staat",
				"die Eltern",
				"die Verwandten",
				"die Schulen",
				"Pflichten", 9,
				"B",
				"97,0%",
				false
			)
		)
        list.add(
			Question(
				250,
				"In Deutschland hat man die besten Chancen auf einen gut bezahlten Arbeitsplatz, wenn man …",
				"katholisch ist.",
				"gut ausgebildet ist.",
				"eine Frau ist.",
				"Mitglied einer Partei ist.",
				"Bildung", 18,
				"B",
				"96,4%",
				false
			)
		)
        list.add(
			Question(
				251,
				"Wenn man in Deutschland ein Kind schlägt, …",
				"geht das niemanden etwas an.",
				"geht das nur die Familie etwas an.",
				"kann man dafür nicht bestraft werden.",
				"kann man dafür bestraft werden.",
				"Recht und Alltag", 12,
				"D",
				"93,2%",
				false
			)
		)
        list.add(
			Question(
				252,
				"In Deutschland …",
				"darf man zur gleichen Zeit nur mit einem Partner / einer Partnerin verheiratet sein.",
				"kann man mehrere Ehepartner / Ehepartnerinnen gleichzeitig haben.",
				"darf man nicht wieder heiraten, wenn man einmal verheiratet war.",
				"darf eine Frau nicht wieder heiraten, wenn ihr Mann gestorben ist.",
				"Recht und Alltag", 12,
				"A",
				"92,0%",
				false
			)
		)
        list.add(
			Question(
				253,
				"Wo müssen Sie sich anmelden, wenn Sie in Deutschland umziehen?",
				"beim Einwohnermeldeamt",
				"beim Standesamt",
				"beim Ordnungsamt",
				"beim Gewerbeamt",
				"Kommune", 11,
				"A",
				"92,7%",
				false
			)
		)
        list.add(
			Question(
				254,
				"In Deutschland dürfen Ehepaare sich scheiden lassen. Meistens müssen sie dazu das \"Trennungsjahr\" einhalten. Was bedeutet das?",
				"Der Scheidungsprozess dauert ein Jahr.",
				"Mann und Frau sind ein Jahr verheiratet, dann ist die Scheidung möglich.",
				"Das Besuchsrecht für die Kinder gilt ein Jahr.",
				"Mann und Frau führen mindestens ein Jahr getrennt ihr eigenes Leben. Danach ist die Scheidung möglich.",
				"Recht und Alltag", 12,
				"D",
				"90,3%",
				false
			)
		)
        list.add(
			Question(
				255,
				"Bei Erziehungsproblemen können Eltern in Deutschland Hilfe erhalten vom …",
				"Ordnungsamt.",
				"Schulamt.",
				"Jugendamt.",
				"Gesundheitsamt.",
				"Kommune", 11,
				"C",
				"96,5%",
				false
			)
		)
        list.add(
			Question(
				256,
				"Ein Ehepaar möchte in Deutschland ein Restaurant eröffnen. Was braucht es dazu unbedingt?",
				"eine Erlaubnis der Polizei",
				"eine Genehmigung einer Partei",
				"eine Genehmigung des Einwohnermeldeamts",
				"eine Gaststättenerlaubnis von der zuständigen Behörde",
				"Kommune", 11,
				"D",
				"92,8%",
				false
			)
		)
        list.add(
			Question(
				257,
				"Eine erwachsene Frau möchte in Deutschland das Abitur nachholen. Das kann sie an …",
				"einer Hochschule.",
				"einem Abendgymnasium.",
				"einer Hauptschule.",
				"einer Privatuniversität.",
				"Bildung", 18,
				"B",
				"90,3%",
				false
			)
		)
        list.add(
			Question(
				258,
				"Was darf das Jugendamt in Deutschland?",
				"Es entscheidet, welche Schule das Kind besucht.",
				"Es kann ein Kind, das geschlagen wird oder hungern muss, aus der Familie nehmen.",
				"Es bezahlt das Kindergeld an die Eltern.",
				"Es kontrolliert, ob das Kind einen Kindergarten besucht.",
				"Recht und Alltag", 12,
				"B",
				"94,7%",
				false
			)
		)
        list.add(
			Question(
				259,
				"Das Berufsinformationszentrum BIZ bei der Bundesagentur für Arbeit in Deutschland hilft bei der …",
				"Rentenberechnung.",
				"Lehrstellensuche.",
				"Steuererklärung.",
				"Krankenversicherung.",
				"Kommune", 11,
				"B",
				"88,9%",
				false
			)
		)
        list.add(
			Question(
				260,
				"In Deutschland hat ein Kind in der Schule …",
				"Recht auf unbegrenzte Freizeit.",
				"Wahlfreiheit für alle Fächer.",
				"Anspruch auf Schulgeld.",
				"Anwesenheitspflicht.",
				"Pflichten", 9,
				"D",
				"85,5%",
				false
			)
		)
        list.add(
			Question(
				261,
				"Ein Mann möchte mit 30 Jahren in Deutschland sein Abitur nachholen. Wo kann er das tun? An …",
				"einer Hochschule",
				"einem Abendgymnasium",
				"einer Hauptschule",
				"einer Privatuniversität",
				"Bildung", 18,
				"B",
				"90,6%",
				false
			)
		)
        list.add(
			Question(
				262,
				"Was bedeutet in Deutschland der Grundsatz der Gleichbehandlung?",
				"Niemand darf z. B. wegen einer Behinderung benachteiligt werden.",
				"Man darf andere Personen benachteiligen, wenn ausreichende persönliche Gründe hierfür vorliegen.",
				"Niemand darf gegen Personen klagen, wenn sie benachteiligt wurden.",
				"Es ist für alle Gesetz, benachteiligten Gruppen jährlich Geld zu spenden.",
				"Grundrechte", 5,
				"A",
				"81,9%",
				false
			)
		)
        list.add(
			Question(
				263,
				"In Deutschland sind Jugendliche ab 14 Jahren strafmündig. Das bedeutet: Jugendliche, die 14 Jahre und älter sind und gegen Strafgesetze verstoßen, …",
				"werden bestraft.",
				"werden wie Erwachsene behandelt.",
				"teilen die Strafe mit ihren Eltern.",
				"werden nicht bestraft.",
				"Recht und Alltag", 12,
				"A",
				"84,8%",
				false
			)
		)
        list.add(
			Question(
				264,
				"Zu welchem Fest tragen Menschen in Deutschland bunte Kostüme und Masken?",
				"am Rosenmontag",
				"am Maifeiertag",
				"beim Oktoberfest",
				"an Pfingsten",
				"Interkulturelles", 20,
				"A",
				"87,8%",
				false
			)
		)
        list.add(
			Question(
				265,
				"Wohin muss man in Deutschland zuerst gehen, wenn man heiraten möchte?",
				"zum Einwohnermeldeamt",
				"zum Ordnungsamt",
				"zur Agentur für Arbeit",
				"zum Standesamt",
				"Kommune", 11,
				"D",
				"95,6%",
				false
			)
		)
        list.add(
			Question(
				266,
				"Wann beginnt die gesetzliche Nachtruhe in Deutschland?",
				"wenn die Sonne untergeht",
				"um 22 Uhr",
				"wenn die Nachbarn schlafen gehen",
				"um 0 Uhr, Mitternacht",
				"Recht und Alltag", 12,
				"B",
				"98,9%",
				false
			)
		)
        list.add(
			Question(
				267,
				"Eine junge Frau in Deutschland, 22 Jahre alt, lebt mit ihrem Freund zusammen. Die Eltern der Frau finden das nicht gut, weil ihnen der Freund nicht gefällt. Was können die Eltern tun?",
				"Sie müssen die Entscheidung der volljährigen Tochter respektieren.",
				"Sie haben das Recht, die Tochter in die elterliche Wohnung zurückzuholen.",
				"Sie können zur Polizei gehen und die Tochter anzeigen.",
				"Sie suchen einen anderen Mann für die Tochter.",
				"Recht und Alltag", 12,
				"A",
				"97,1%",
				false
			)
		)
        list.add(
			Question(
				268,
				"Eine junge Frau will den Führerschein machen. Sie hat Angst vor der Prüfung weil ihre Muttersprache nicht Deutsch ist. Was ist richtig?",
				"Sie muss mindestens zehn Jahre in Deutschland leben, bevor sie den Führerschein machen kann.",
				"Sie kann die Theorie-Prüfung vielleicht in ihrer Muttersprache machen. Es gibt mehr als zehn Sprachen zur Auswahl.",
				"Wenn sie kein Deutsch kann, darf sie keinen Führerschein haben.",
				"Sie muss den Führerschein in dem Land machen, in dem man ihre Sprache spricht.",
				"Recht und Alltag", 12,
				"B",
				"98,9%",
				false
			)
		)
        list.add(
			Question(
				269,
				"In Deutschland haben Kinder ab dem Alter von drei Jahren bis zur Ersteinschulung einen Anspruch auf …",
				"monatliches Taschengeld.",
				"einen Kindergartenplatz.",
				"einen Platz in einem Sportverein.",
				"einen Ferienpass.",
				"Bildung", 18,
				"B",
				"98,8%",
				false
			)
		)
        list.add(
			Question(
				270,
				"Die Volkshochschule in Deutschland ist eine Einrichtung …",
				"für den Religionsunterricht.",
				"nur für Jugendliche.",
				"zur Weiterbildung.",
				"nur für Rentner und Rentnerinnen.",
				"Bildung", 18,
				"C",
				"94,0%",
				false
			)
		)
        list.add(
			Question(
				271,
				"Was ist in Deutschland ein Brauch zu Weihnachten?",
				"bunte Eier verstecken",
				"einen Tannenbaum schmücken",
				"sich mit Masken und Kostümen verkleiden",
				"Kürbisse vor die Tür stellen",
				"Interkulturelles", 20,
				"B",
				"97,5%",
				false
			)
		)
        list.add(
			Question(
				272,
				"Welche Lebensform ist in Deutschland nicht erlaubt?",
				"Mann und Frau sind geschieden und leben mit neuen Partnern zusammen.",
				"Zwei Frauen leben zusammen.",
				"Ein allein erziehender Vater lebt mit seinen zwei Kindern zusammen.",
				"Ein Mann ist mit zwei Frauen zur selben Zeit verheiratet.",
				"Recht und Alltag", 12,
				"D",
				"96,7%",
				false
			)
		)
        list.add(
			Question(
				273,
				"Bei Erziehungsproblemen gehen Sie in Deutschland …",
				"zum Arzt / zur Ärztin.",
				"zum Gesundheitsamt.",
				"zum Einwohnermeldeamt.",
				"zum Jugendamt.",
				"Kommune", 11,
				"D",
				"95,5%",
				false
			)
		)
        list.add(
			Question(
				274,
				"Sie haben in Deutschland absichtlich einen Brief geöffnet, der an eine andere Person adressiert ist. Was haben Sie nicht beachtet?",
				"das Schweigerecht",
				"das Briefgeheimnis",
				"die Schweigepflicht",
				"die Meinungsfreiheit",
				"Grundrechte", 5,
				"B",
				"90,0%",
				false
			)
		)
        list.add(
			Question(
				275,
				"Was braucht man in Deutschland für eine Ehescheidung?",
				"die Einwilligung der Eltern",
				"ein Attest eines Arztes / einer Ärztin",
				"die Einwilligung der Kinder",
				"die Unterstützung eines Anwalts / einer Anwältin",
				"Recht und Alltag", 12,
				"D",
				"91,8%",
				false
			)
		)
        list.add(
			Question(
				276,
				"Was sollten Sie tun, wenn Sie von Ihrem Ansprechpartner / Ihrer Ansprechpartnerin in einer deutschen Behörde schlecht behandelt werden?",
				"Ich kann nichts tun.",
				"Ich muss mir diese Behandlung gefallen lassen.",
				"Ich drohe der Person.",
				"Ich kann mich beim Behördenleiter / bei der Behördenleiterin beschweren.",
				"Recht und Alltag", 12,
				"D",
				"94,9%",
				false
			)
		)
        list.add(
			Question(
				277,
				"Eine Frau, die ein zweijähriges Kind hat, bewirbt sich in Deutschland um eine Stelle. Was ist ein Beispiel für Diskriminierung? Sie bekommt die Stelle nur deshalb nicht, weil sie …",
				"kein Englisch spricht.",
				"zu hohe Gehaltsvorstellungen hat.",
				"keine Erfahrungen in diesem Beruf hat.",
				"Mutter ist.",
				"Grundrechte", 5,
				"D",
				"95,4%",
				false
			)
		)
        list.add(
			Question(
				278,
				"Ein Mann im Rollstuhl hat sich auf eine Stelle als Buchhalter beworben. Was ist ein Beispiel für Diskriminierung? Er bekommt die Stelle nur deshalb nicht, weil er …",
				"im Rollstuhl sitzt.",
				"keine Erfahrung hat.",
				"zu hohe Gehaltsvorstellungen hat.",
				"kein Englisch spricht.",
				"Grundrechte", 5,
				"A",
				"93,7%",
				false
			)
		)
        list.add(
			Question(
				279,
				"In den meisten Mietshäusern in Deutschland gibt es eine \"Hausordnung\". Was steht in einer solchen \"Hausordnung\"? Sie nennt …",
				"Regeln für die Benutzung öffentlicher Verkehrsmittel.",
				"alle Mieter und Mieterinnen im Haus.",
				"Regeln, an die sich alle Bewohner und Bewohnerinnen halten müssen.",
				"die Adresse des nächsten Ordnungsamtes.",
				"Recht und Alltag", 12,
				"C",
				"86,6%",
				false
			)
		)
        list.add(
			Question(
				280,
				"Wenn Sie sich in Deutschland gegen einen falschen Steuerbescheid wehren wollen, müssen Sie …",
				"nichts machen.",
				"den Bescheid wegwerfen.",
				"Einspruch einlegen.",
				"warten, bis ein anderer Bescheid kommt.",
				"Recht und Alltag", 12,
				"C",
				"93,0%",
				false
			)
		)
        list.add(
			Question(
				281,
				"Zwei Freunde wollen in ein öffentliches Schwimmbad in Deutschland. Beide haben eine dunkle Hautfarbe und werden deshalb nicht hineingelassen. Welches Recht wird in dieser Situation verletzt? Das Recht auf …",
				"Meinungsfreiheit",
				"Gleichbehandlung",
				"Versammlungsfreiheit",
				"Freizügigkeit",
				"Grundrechte", 5,
				"B",
				"90,6%",
				false
			)
		)
        list.add(
			Question(
				282,
				"Welches Ehrenamt müssen deutsche Staatsbürger / Staatsbürgerinnen übernehmen, wenn sie dazu aufgefordert werden?",
				"Vereinstrainer / Vereinstrainerin",
				"Bibliotheksaufsicht",
				"Wahlhelfer / Wahlhelferin",
				"Lehrer / Lehrerin",
				"Pflichten", 9,
				"C",
				"88,0%",
				false
			)
		)
        list.add(
			Question(
				283,
				"Was tun Sie, wenn Sie eine falsche Rechnung von einer deutschen Behörde bekommen?",
				"Ich lasse die Rechnung liegen.",
				"Ich lege Widerspruch bei der Behörde ein.",
				"Ich schicke die Rechnung an die Behörde zurück.",
				"Ich gehe mit der Rechnung zum Finanzamt.",
				"Recht und Alltag", 12,
				"B",
				"89,2%",
				false
			)
		)
        list.add(
			Question(
				284,
				"Was man für die Arbeit können muss, ändert sich in der Zukunft sehr schnell. Was kann man tun?",
				"Es ist egal, was man lernt.",
				"Kinder lernen in der Schule alles, was im Beruf wichtig ist. Nach der Schule muss man nicht weiter lernen.",
				"Erwachsene müssen auch nach der Ausbildung immer weiter lernen.",
				"Alle müssen früher aufhören zu arbeiten, weil sich alles ändert.",
				"Bildung", 18,
				"C",
				"98,8%",
				false
			)
		)
        list.add(
			Question(
				285,
				"Frau Frost arbeitet als fest angestellte Mitarbeiterin in einem Büro. Was muss sie nicht von ihrem Gehalt bezahlen?",
				"Umsatzsteuer",
				"Lohnsteuer",
				"Beiträge zur Arbeitslosenversicherung",
				"Beiträge zur Renten- und Krankenversicherung",
				"Sozialsystem", 4,
				"A",
				"75,2%",
				false
			)
		)
        list.add(
			Question(
				286,
				"Welche Organisation in einer Firma hilft den Arbeitnehmern und Arbeitnehmerinnen bei Problemen mit dem Arbeitgeber / der Arbeitgeberin?",
				"der Betriebsrat",
				"der Betriebsprüfer / die Betriebsprüferin",
				"die Betriebsgruppe",
				"das Betriebsmanagement",
				"Recht und Alltag", 12,
				"A",
				"88,1%",
				false
			)
		)
        list.add(
			Question(
				287,
				"Sie möchten bei einer Firma in Deutschland Ihr Arbeitsverhältnis beenden. Was müssen Sie beachten?",
				"die Gehaltszahlungen",
				"die Arbeitszeit",
				"die Kündigungsfrist",
				"die Versicherungspflicht",
				"Recht und Alltag", 12,
				"C",
				"94,8%",
				false
			)
		)
        list.add(
			Question(
				288,
				"Bei welchem Amt muss man in Deutschland in der Regel seinen Hund anmelden?",
				"beim Finanzamt",
				"beim Einwohnermeldeamt",
				"bei der Kommune (Stadt oder Gemeinde)",
				"beim Gesundheitsamt",
				"Kommune", 11,
				"C",
				"80,6%",
				false
			)
		)
        list.add(
			Question(
				289,
				"Ein Mann mit dunkler Hautfarbe bewirbt sich um eine Stelle als Kellner in einem Restaurant in Deutschland. Was ist ein Beispiel für Diskriminierung? Er bekommt die Stelle nur deshalb nicht, weil …",
				"seine Deutschkenntnisse zu gering sind.",
				"er zu hohe Gehaltsvorstellungen hat.",
				"er eine dunkle Haut hat.",
				"er keine Erfahrungen im Beruf hat.",
				"Grundrechte", 5,
				"C",
				"91,0%",
				false
			)
		)
        list.add(
			Question(
				290,
				"Sie haben in Deutschland einen Fernseher gekauft. Zu Hause packen Sie den Fernseher aus, doch er funktioniert nicht. Der Fernseher ist kaputt. Was können Sie machen?",
				"eine Anzeige schreiben",
				"den Fernseher reklamieren",
				"das Gerät ungefragt austauschen",
				"die Garantie verlängern",
				"Recht und Alltag", 12,
				"B",
				"87,3%",
				false
			)
		)
        list.add(
			Question(
				291,
				"Warum muss man in Deutschland bei der Steuererklärung aufschreiben, ob man zu einer Kirche gehört oder nicht? Weil …",
				"das für die Statistik in Deutschland wichtig ist.",
				"es eine Kirchensteuer gibt, die an die Einkommen- und Lohnsteuer geknüpft ist.",
				"man mehr Steuern zahlen muss, wenn man nicht zu einer Kirche gehört.",
				"die Kirche für die Steuererklärung verantwortlich ist.",
				"Recht und Alltag", 12,
				"B",
				"97,4%",
				false
			)
		)
        list.add(
			Question(
				292,
				"Die Menschen in Deutschland leben nach dem Grundsatz der religiösen Toleranz. Was bedeutet das?",
				"Es dürfen keine Moscheen gebaut werden.",
				"Alle Menschen glauben an Gott.",
				"Jeder kann glauben, was er möchte.",
				"Der Staat entscheidet, an welchen Gott die Menschen glauben.",
				"Religiöse Vielfalt", 17,
				"C",
				"97,9%",
				false
			)
		)
        list.add(
			Question(
				293,
				"Was ist in Deutschland ein Brauch an Ostern?",
				"Kürbisse vor die Tür stellen",
				"einen Tannenbaum schmücken",
				"Eier bemalen",
				"Raketen in die Luft schießen",
				"Interkulturelles", 20,
				"C",
				"95,5%",
				false
			)
		)
        list.add(
			Question(
				294,
				"Pfingsten ist ein …",
				"christlicher Feiertag.",
				"deutscher Gedenktag.",
				"internationaler Trauertag.",
				"bayerischer Brauch.",
				"Religiöse Vielfalt", 17,
				"A",
				"95,1%",
				false
			)
		)
        list.add(
			Question(
				295,
				"Welche Religion hat die europäische und deutsche Kultur geprägt?",
				"der Hinduismus",
				"das Christentum",
				"der Buddhismus",
				"der Islam",
				"Religiöse Vielfalt", 17,
				"B",
				"97,2%",
				false
			)
		)
        list.add(
			Question(
				296,
				"In Deutschland nennt man die letzten vier Wochen vor Weihnachten …",
				"den Buß- und Bettag.",
				"das Erntedankfest.",
				"die Adventszeit.",
				"Allerheiligen.",
				"Religiöse Vielfalt", 17,
				"C",
				"93,4%",
				false
			)
		)
        list.add(
			Question(
				297,
				"Aus welchem Land sind die meisten Migranten / Migrantinnen nach Deutschland gekommen?",
				"Italien",
				"Polen",
				"Marokko",
				"Türkei",
				"Migrationsgeschichte", 19,
				"D",
				"85,0%",
				false
			)
		)
        list.add(
			Question(
				298,
				"In der DDR lebten vor allem Migranten aus …",
				"Vietnam, Polen, Mosambik.",
				"Frankreich, Rumänien, Somalia.",
				"Chile, Ungarn, Simbabwe.",
				"Nordkorea, Mexiko, Ägypten.",
				"Migrationsgeschichte", 19,
				"A",
				"85,6%",
				false
			)
		)
        list.add(
			Question(
				299,
				"Ausländische Arbeitnehmer und Arbeitnehmerinnen, die in den 50er und 60er Jahren von der Bundesrepublik Deutschland angeworben wurden, nannte man …",
				"Schwarzarbeiter / Schwarzarbeiterinnen",
				"Gastarbeiter / Gastarbeiterinnen",
				"Zeitarbeiter / Zeitarbeiterinnen",
				"Schichtarbeiter / Schichtarbeiterinnen",
				"Migrationsgeschichte", 19,
				"B",
				"92,4%",
				false
			)
		)
        list.add(
			Question(
				300,
				"Aus welchem Land kamen die ersten Gastarbeiter / Gastarbeiterinnen nach Deutschland?",
				"Italien",
				"Spanien",
				"Portugal",
				"Türkei",
				"Migrationsgeschichte", 19,
				"A",
				"73,8%",
				false
			)
		)
        list.add(
			Question(
				301,
				"Welches Wappen gehört zum Bundesland Baden-Württemberg?",
				"1",
				"2",
				"3",
				"4",
				"Baden Württemberg", 0,
				"A",
				"94,0%",
				true
			)
		)
        list.add(
			Question(
				302,
				"Welches ist ein Landkreis in Baden-Württemberg?",
				"Demmin",
				"Neckar-Odenwald-Kreis",
				"Nordfriesland",
				"Altötting",
				"Baden Württemberg", 0,
				"B",
				"92,5%",
				false
			)
		)
        list.add(
			Question(
				303,
				"Für wie viele Jahre wird der Landtag in Baden-Württemberg gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Baden Württemberg", 0,
				"C",
				"66,1%",
				false
			)
		)
        list.add(
			Question(
				304,
				"Ab welchem Alter darf man in Baden-Württemberg bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Baden Württemberg", 0,
				"B",
				"90,2%",
				false
			)
		)
        list.add(
			Question(
				305,
				"Welche Farben hat die Landesflagge von Baden-Württemberg?",
				"blau-weiß-rot",
				"schwarz-gold",
				"weiß-blau",
				"grün-weiß-rot",
				"Baden Württemberg", 0,
				"B",
				"90,6%",
				false
			)
		)
        list.add(
			Question(
				306,
				"Wo können Sie sich in Baden-Württemberg über politische Themen informieren?",
				"beim Ordnungsamt der Gemeinde",
				"bei der Verbraucherzentrale",
				"bei der Landeszentrale für politische Bildung",
				"bei den Kirchen",
				"Baden Württemberg", 0,
				"C",
				"90,3%",
				false
			)
		)
        list.add(
			Question(
				307,
				"Die Landeshauptstadt von Baden-Württemberg heißt...",
				"Heidelberg.",
				"Stuttgart.",
				"Karlsruhe.",
				"Mannheim.",
				"Baden Württemberg", 0,
				"B",
				"96,2%",
				false
			)
		)
        list.add(
			Question(
				308,
				"Welches Bundesland ist Baden-Württemberg?",
				"1",
				"2",
				"3",
				"4",
				"Baden Württemberg", 0,
				"B",
				"90,9%",
				true
			)
		)
        list.add(
			Question(
				309,
				"Wie nennt man den Regierungschef / die Regierungschefin in Baden-Württemberg?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Baden Württemberg", 0,
				"D",
				"87,0%",
				false
			)
		)
        list.add(
			Question(
				310,
				"Welchen Minister / welche Ministerin hat Baden-Württemberg nicht?",
				"Finanzminister / Finanzministerin",
				"Justizminister / Justizministerin",
				"Innenminister / Innenministerin",
				"Außenminister / Außenministerin",
				"Baden Württemberg", 0,
				"D",
				"88,7%",
				false
			)
		)
        list.add(
			Question(
				311,
				"Welches Wappen gehört zum Freistaat Bayern?",
				"1",
				"2",
				"3",
				"4",
				"Bayern", 0,
				"B",
				"94,4%",
				true
			)
		)
        list.add(
			Question(
				312,
				"Welches ist ein Landkreis in Bayern?",
				"Prignitz",
				"Rhein-Sieg-Kreis",
				"Nordfriesland",
				"Altötting",
				"Bayern", 0,
				"D",
				"89,4%",
				false
			)
		)
        list.add(
			Question(
				313,
				"Für wie viele Jahre wird der Landtag in Bayern gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Bayern", 0,
				"C",
				"67,2%",
				false
			)
		)
        list.add(
			Question(
				314,
				"Ab welchem Alter darf man in Bayern bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Bayern", 0,
				"C",
				"94,1%",
				false
			)
		)
        list.add(
			Question(
				315,
				"Welche Farben hat die Landesflagge von Bayern?",
				"blau-weiß-rot",
				"weiß-blau",
				"grün-weiß-rot",
				"schwarz-gelb",
				"Bayern", 0,
				"B",
				"94,9%",
				false
			)
		)
        list.add(
			Question(
				316,
				"Wo können Sie sich in Bayern über politische Themen informieren?",
				"beim Ordnungsamt der Gemeinde",
				"bei der Landeszentrale für politische Bildung",
				"bei der Verbraucherzentrale",
				"bei den Kirchen",
				"Bayern", 0,
				"B",
				"90,5%",
				false
			)
		)
        list.add(
			Question(
				317,
				"Die Landeshauptstadt von Bayern heißt...",
				"Ingolstadt.",
				"Regensburg.",
				"Nürnberg.",
				"München.",
				"Bayern", 0,
				"D",
				"99,1%",
				false
			)
		)
        list.add(
			Question(
				318,
				"Welches Bundesland ist Bayern?",
				"1",
				"2",
				"3",
				"4",
				"Bayern", 0,
				"D",
				"96,9%",
				true
			)
		)
        list.add(
			Question(
				319,
				"Wie nennt man den Regierungschef / die Regierungschefin in Bayern?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Bayern", 0,
				"D",
				"87,9%",
				false
			)
		)
        list.add(
			Question(
				320,
				"Welchen Minister / welche Ministerin hat Bayern nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Bayern", 0,
				"B",
				"87,9%",
				false
			)
		)
        list.add(
			Question(
				321,
				"Welches Wappen gehört zum Bundesland Berlin?",
				"1",
				"2",
				"3",
				"4",
				"Berlin", 0,
				"D",
				"97,2%",
				true
			)
		)
        list.add(
			Question(
				322,
				"Welches ist ein Bezirk von Berlin?",
				"Altona",
				"Prignitz",
				"Pankow",
				"Demmin",
				"Berlin", 0,
				"C",
				"95,5%",
				false
			)
		)
        list.add(
			Question(
				323,
				"Für wie viele Jahre wird das Landesparlament in Berlin gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Berlin", 0,
				"C",
				"63,5%",
				false
			)
		)
        list.add(
			Question(
				324,
				"Ab welchem Alter darf man in Berlin bei Kommunalwahlen (Wahl der Bezirksverordnetenversammlung) wählen?",
				"14",
				"16",
				"18",
				"20",
				"Berlin", 0,
				"B",
				"64,8%",
				false
			)
		)
        list.add(
			Question(
				325,
				"Welche Farben hat die Landesflagge von Berlin?",
				"blau-weiß-rot",
				"weiß-rot",
				"grün-weiß-rot",
				"schwarz-gold",
				"Berlin", 0,
				"B",
				"83,3%",
				false
			)
		)
        list.add(
			Question(
				326,
				"Wo können Sie sich in Berlin über politische Themen informieren?",
				"beim Ordnungsamt der Gemeinde",
				"bei den Kirchen",
				"bei der Verbraucherzentrale",
				"bei der Landeszentrale für politische Bildung",
				"Berlin", 0,
				"D",
				"93,2%",
				false
			)
		)
        list.add(
			Question(
				327,
				"Welches Bundesland ist ein Stadtstaat?",
				"Berlin",
				"Saarland",
				"Brandenburg",
				"Hessen",
				"Berlin", 0,
				"A",
				"95,7%",
				false
			)
		)
        list.add(
			Question(
				328,
				"Welches Bundesland ist Berlin?",
				"1",
				"2",
				"3",
				"4",
				"Berlin", 0,
				"D",
				"95,6%",
				true
			)
		)
        list.add(
			Question(
				329,
				"Wie nennt man den Regierungschef / die Regierungschefin des Stadtstaates Berlin?",
				"Ministerpräsident / Ministerpräsidentin",
				"Oberbürgermeister / Oberbürgermeisterin",
				"Präsident / Präsidentin des Senats",
				"Regierender Bürgermeister / Regierende Bürgermeisterin",
				"Berlin", 0,
				"D",
				"72,9%",
				false
			)
		)
        list.add(
			Question(
				330,
				"Welchen Senator / welche Senatorin hat Berlin nicht?",
				"Finanzsenator / Finanzsenatorin",
				"Innensenator / Innensenatorin",
				"Senator / Senatorin für Außenbeziehungen",
				"Justizsenator / Justizsenatorin",
				"Berlin", 0,
				"C",
				"81,4%",
				false
			)
		)
        list.add(
			Question(
				331,
				"Welches Wappen gehört zum Bundesland Brandenburg?",
				"1",
				"2",
				"3",
				"4",
				"Brandenburg", 0,
				"A",
				"90,4%",
				true
			)
		)
        list.add(
			Question(
				332,
				"Welches ist ein Landkreis in Brandenburg?",
				"Prignitz",
				"Rhein-Sieg-Kreis",
				"Vogtlandkreis",
				"Amberg-Sulzbach",
				"Brandenburg", 0,
				"A",
				"86,2%",
				false
			)
		)
        list.add(
			Question(
				333,
				"Für wie viele Jahre wird der Landtag in Brandenburg gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Brandenburg", 0,
				"C",
				"63,0%",
				false
			)
		)
        list.add(
			Question(
				334,
				"Ab welchem Alter darf man in Brandenburg bei Kommunalwahlen wählen?",
				"14",
				"18",
				"16",
				"20",
				"Brandenburg", 0,
				"C",
				"86,5%",
				false
			)
		)
        list.add(
			Question(
				335,
				"Welche Farben hat die Landesflagge von Brandenburg?",
				"blau-weiß-rot",
				"rot-weiß",
				"grün-weiß-rot",
				"schwarz-gelb",
				"Brandenburg", 0,
				"B",
				"85,1%",
				false
			)
		)
        list.add(
			Question(
				336,
				"Wo können Sie sich in Brandenburg über politische Themen informieren?",
				"bei den Kirchen",
				"beim Ordnungsamt der Gemeinde",
				"bei der Landeszentrale für politische Bildung",
				"bei der Verbraucherzentrale",
				"Brandenburg", 0,
				"C",
				"91,4%",
				false
			)
		)
        list.add(
			Question(
				337,
				"Die Landeshauptstadt von Brandenburg heißt...",
				"Potsdam.",
				"Cottbus.",
				"Brandenburg.",
				"Frankfurt/Oder.",
				"Brandenburg", 0,
				"A",
				"89,6%",
				false
			)
		)
        list.add(
			Question(
				338,
				"Welches Bundesland ist Brandenburg?",
				"1",
				"2",
				"3",
				"4",
				"Brandenburg", 0,
				"D",
				"87,6%",
				true
			)
		)
        list.add(
			Question(
				339,
				"Wie nennt man den Regierungschef / die Regierungschefin in Brandenburg?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Brandenburg", 0,
				"D",
				"84,8%",
				false
			)
		)
        list.add(
			Question(
				340,
				"Welchen Minister / welche Ministerin hat Brandenburg nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Brandenburg", 0,
				"B",
				"88,1%",
				false
			)
		)
        list.add(
			Question(
				341,
				"Welches Wappen gehört zur Freien Hansestadt Bremen?",
				"1",
				"2",
				"3",
				"4",
				"Bremen", 0,
				"C",
				"94,0%",
				true
			)
		)
        list.add(
			Question(
				342,
				"Welches ist ein Stadtteil von Bremen?",
				"Altona",
				"Hemelingen",
				"Pankow",
				"Babelsberg",
				"Bremen", 0,
				"B",
				"92,8%",
				false
			)
		)
        list.add(
			Question(
				343,
				"Für wie viele Jahre wird das Landesparlament in Bremen gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Bremen", 0,
				"B",
				"87,5%",
				false
			)
		)
        list.add(
			Question(
				344,
				"Ab welchem Alter darf man in Bremen bei den Wahlen zur Bürgerschaft (Landtag) wählen?",
				"14",
				"16",
				"18",
				"20",
				"Bremen", 0,
				"B",
				"58,7%",
				false
			)
		)
        list.add(
			Question(
				345,
				"Welche Farben hat die Landesflagge von Bremen?",
				"blau-weiß-rot",
				"rot-weiß",
				"grün-weiß-rot",
				"schwarz-gold",
				"Bremen", 0,
				"B",
				"88,9%",
				false
			)
		)
        list.add(
			Question(
				346,
				"Wo können Sie sich in Bremen über politische Themen informieren?",
				"beim Ordnungsamt der Gemeinde",
				"bei der Landeszentrale für politische Bildung",
				"bei den Kirchen",
				"bei der Verbraucherzentrale",
				"Bremen", 0,
				"B",
				"93,2%",
				false
			)
		)
        list.add(
			Question(
				347,
				"Was ist ein deutscher Stadtstaat?",
				"Bremen",
				"München",
				"Frankfurt",
				"Erfurt",
				"Bremen", 0,
				"A",
				"93,1%",
				false
			)
		)
        list.add(
			Question(
				348,
				"Welches Bundesland ist Bremen?",
				"1",
				"2",
				"3",
				"4",
				"Bremen", 0,
				"A",
				"86,2%",
				true
			)
		)
        list.add(
			Question(
				349,
				"Wie nennt man den Regierungschef / die Regierungschefin des Stadtstaates Bremen?",
				"Ministerpräsident / Ministerpräsidentin",
				"Erster Bürgermeister / Erste Bürgermeisterin",
				"Präsident / Präsidentin des Senats",
				"Regierender Bürgermeister / Regierende Bürgermeisterin",
				"Bremen", 0,
				"C",
				"45,5%",
				false
			)
		)
        list.add(
			Question(
				350,
				"Welchen Senator / welche Senatorin hat Bremen nicht?",
				"Senator / Senatorin für Außenbeziehungen",
				"Finanzsenator / Finanzsenatorin",
				"Justizsenator / Justizsenatorin",
				"Innensenator / Innensenatorin",
				"Bremen", 0,
				"A",
				"85,4%",
				false
			)
		)
        list.add(
			Question(
				351,
				"Welches Wappen gehört zur Freien und Hansestadt Hamburg?",
				"1",
				"2",
				"3",
				"4",
				"Hamburg", 0,
				"B",
				"98,3%",
				true
			)
		)
        list.add(
			Question(
				352,
				"Welches ist ein Bezirk von Hamburg?",
				"Altona",
				"Hemelingen",
				"Pankow",
				"Demmin",
				"Hamburg", 0,
				"A",
				"98,4%",
				false
			)
		)
        list.add(
			Question(
				353,
				"Für wie viele Jahre wird das Landesparlament in Hamburg gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Hamburg", 0,
				"C",
				"89,2%",
				false
			)
		)
        list.add(
			Question(
				354,
				"Ab welchem Alter darf man in Hamburg bei Kommunalwahlen (Wahl der Bezirksversammlungen) wählen?",
				"14",
				"16",
				"18",
				"20",
				"Hamburg", 0,
				"B",
				"91,5%",
				false
			)
		)
        list.add(
			Question(
				355,
				"Welche Farben hat die Landesflagge von Hamburg?",
				"blau-weiß-rot",
				"weiß-rot",
				"grün-weiß-rot",
				"schwarz-gelb",
				"Hamburg", 0,
				"B",
				"93,2%",
				false
			)
		)
        list.add(
			Question(
				356,
				"Wo können Sie sich in Hamburg über politische Themen informieren?",
				"beim Ordnungsamt der Gemeinde",
				"bei der Verbraucherzentrale",
				"bei den Kirchen",
				"bei der Landeszentrale für politische Bildung",
				"Hamburg", 0,
				"D",
				"92,6%",
				false
			)
		)
        list.add(
			Question(
				357,
				"Welches Bundesland ist ein Stadtstaat?",
				"Hamburg",
				"Sachsen",
				"Bayern",
				"Thüringen",
				"Hamburg", 0,
				"A",
				"96,5%",
				false
			)
		)
        list.add(
			Question(
				358,
				"Welches Bundesland ist Hamburg?",
				"1",
				"2",
				"3",
				"4",
				"Hamburg", 0,
				"C",
				"91,0%",
				true
			)
		)
        list.add(
			Question(
				359,
				"Wie nennt man den Regierungschef / die Regierungschefin des Stadtstaates Hamburg?",
				"Ministerpräsident / Ministerpräsidentin",
				"Erster Bürgermeister / Erste Bürgermeisterin",
				"Regierender Senator / Regierende Senatorin",
				"Oberbürgermeister / Oberbürgermeisterin",
				"Hamburg", 0,
				"B",
				"80,1%",
				false
			)
		)
        list.add(
			Question(
				360,
				"Welchen Senator / welche Senatorin hat Hamburg nicht?",
				"Justizsenator / Justizsenatorin",
				"Senator / Senatorin für Außenbeziehungen",
				"Finanzsenator / Finanzsenatorin",
				"Innensenator / Innensenatorin",
				"Hamburg", 0,
				"B",
				"84,1%",
				false
			)
		)
        list.add(
			Question(
				361,
				"Welches Wappen gehört zum Bundesland Hessen?",
				"1",
				"2",
				"3",
				"4",
				"Hessen", 0,
				"A",
				"96,1%",
				true
			)
		)
        list.add(
			Question(
				362,
				"Welches ist ein Landkreis in Hessen?",
				"Ammerland",
				"Altötting",
				"Prignitz",
				"Main-Taunus-Kreis",
				"Hessen", 0,
				"D",
				"98,2%",
				false
			)
		)
        list.add(
			Question(
				363,
				"Für wie viele Jahre wird der Landtag in Hessen gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Hessen", 0,
				"C",
				"71,4%",
				false
			)
		)
        list.add(
			Question(
				364,
				"Ab welchem Alter darf man in Hessen bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Hessen", 0,
				"C",
				"95,2%",
				false
			)
		)
        list.add(
			Question(
				365,
				"Welche Farben hat die Landesflagge von Hessen?",
				"blau-weiß-rot",
				"rot-weiß",
				"schwarz-gold",
				"grün-weiß-rot",
				"Hessen", 0,
				"B",
				"82,7%",
				false
			)
		)
        list.add(
			Question(
				366,
				"Wo können Sie sich in Hessen über politische Themen informieren?",
				"bei der Landeszentrale für politische Bildung",
				"bei der Verbraucherzentrale",
				"beim Ordnungsamt der Gemeinde",
				"bei den Kirchen",
				"Hessen", 0,
				"A",
				"93,0%",
				false
			)
		)
        list.add(
			Question(
				367,
				"Die Landeshauptstadt von Hessen heißt...",
				"Kassel.",
				"Darmstadt.",
				"Frankfurt.",
				"Wiesbaden.",
				"Hessen", 0,
				"D",
				"96,9%",
				false
			)
		)
        list.add(
			Question(
				368,
				"Welches Bundesland ist Hessen?",
				"1",
				"2",
				"3",
				"4",
				"Hessen", 0,
				"C",
				"94,1%",
				true
			)
		)
        list.add(
			Question(
				369,
				"Wie nennt man den Regierungschef / die Regierungschefin in Hessen?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Hessen", 0,
				"D",
				"87,7%",
				false
			)
		)
        list.add(
			Question(
				370,
				"Welchen Minister / welche Ministerin hat Hessen nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Hessen", 0,
				"B",
				"89,7%",
				false
			)
		)
        list.add(
			Question(
				371,
				"Welches Wappen gehört zum Bundesland Mecklenburg-Vorpommern?",
				"1",
				"2",
				"3",
				"4",
				"Mecklenburg Vorpommern", 0,
				"C",
				"91,1%",
				true
			)
		)
        list.add(
			Question(
				372,
				"Welches ist ein Landkreis in Mecklenburg-Vorpommern?",
				"Prignitz",
				"Demmin",
				"Vogtlandkreis",
				"Rhein-Sieg-Kreis",
				"Mecklenburg Vorpommern", 0,
				"B",
				"88,5%",
				false
			)
		)
        list.add(
			Question(
				373,
				"Für wie viele Jahre wird der Landtag in Mecklenburg-Vorpommern gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Mecklenburg Vorpommern", 0,
				"C",
				"70,1%",
				false
			)
		)
        list.add(
			Question(
				374,
				"Ab welchem Alter darf man in Mecklenburg-Vorpommern bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Mecklenburg Vorpommern", 0,
				"B",
				"74,9%",
				false
			)
		)
        list.add(
			Question(
				375,
				"Welche Farben hat die Landesflagge von Mecklenburg-Vorpommern?",
				"schwarz-rot-gold",
				"blau-weiß-gelb-rot",
				"grün-weiß-rot",
				"schwarz-gelb",
				"Mecklenburg Vorpommern", 0,
				"B",
				"85,2%",
				false
			)
		)
        list.add(
			Question(
				376,
				"Wo können Sie sich in Mecklenburg-Vorpommern über politische Themen informieren?",
				"bei der Landeszentrale für politische Bildung",
				"bei den Kirchen",
				"beim Ordnungsamt der Gemeinde",
				"bei der Verbraucherzentrale",
				"Mecklenburg Vorpommern", 0,
				"A",
				"93,2%",
				false
			)
		)
        list.add(
			Question(
				377,
				"Die Landeshauptstadt von Mecklenburg-Vorpommern heißt...",
				"Greifswald.",
				"Schwerin.",
				"Rostock.",
				"Wismar.",
				"Mecklenburg Vorpommern", 0,
				"B",
				"93,8%",
				false
			)
		)
        list.add(
			Question(
				378,
				"Welches Bundesland ist Mecklenburg-Vorpommern?",
				"1",
				"2",
				"3",
				"4",
				"Mecklenburg Vorpommern", 0,
				"C",
				"91,6%",
				true
			)
		)
        list.add(
			Question(
				379,
				"Wie nennt man den Regierungschef / die Regierungschefin in Mecklenburg-Vorpommern?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Mecklenburg Vorpommern", 0,
				"D",
				"88,0%",
				false
			)
		)
        list.add(
			Question(
				380,
				"Welchen Minister / welche Ministerin hat Mecklenburg-Vorpommern nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Mecklenburg Vorpommern", 0,
				"B",
				"89,8%",
				false
			)
		)
        list.add(
			Question(
				381,
				"Welches Wappen gehört zum Bundesland Niedersachsen?",
				"1",
				"2",
				"3",
				"4",
				"Niedersachsen", 0,
				"C",
				"97,0%",
				true
			)
		)
        list.add(
			Question(
				382,
				"Welches ist ein Landkreis in Niedersachsen?",
				"Ammerland",
				"Rhein-Sieg-Kreis",
				"Nordfriesland",
				"Vogtlandkreis",
				"Niedersachsen", 0,
				"A",
				"82,3%",
				false
			)
		)
        list.add(
			Question(
				383,
				"Für wie viele Jahre wird der Landtag in Niedersachsen gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Niedersachsen", 0,
				"C",
				"68,5%",
				false
			)
		)
        list.add(
			Question(
				384,
				"Ab welchem Alter darf man in Niedersachsen bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Niedersachsen", 0,
				"B",
				"78,3%",
				false
			)
		)
        list.add(
			Question(
				385,
				"Welche Farben hat die Landesflagge von Niedersachsen?",
				"rot-weiß",
				"schwarz-rot-gold",
				"schwarz-gelb",
				"blau-weiß-rot",
				"Niedersachsen", 0,
				"B",
				"76,3%",
				false
			)
		)
        list.add(
			Question(
				386,
				"Wo können Sie sich in Niedersachsen über politische Themen informieren?",
				"beim Koordinator für politische Bildung im Kultusministerium",
				"beim Ordnungsamt der Gemeinde",
				"bei der Verbraucherzentrale",
				"bei den Kirchen",
				"Niedersachsen", 0,
				"A",
				"87,9%",
				false
			)
		)
        list.add(
			Question(
				387,
				"Die Landeshauptstadt von Niedersachsen heißt …",
				"Hannover.",
				"Braunschweig.",
				"Wolfsburg.",
				"Osnabrück.",
				"Niedersachsen", 0,
				"A",
				"98,6%",
				false
			)
		)
        list.add(
			Question(
				388,
				"Welches Bundesland ist Niedersachsen?",
				"1",
				"2",
				"3",
				"4",
				"Niedersachsen", 0,
				"A",
				"92,8%",
				true
			)
		)
        list.add(
			Question(
				389,
				"Wie nennt man den Regierungschef / die Regierungschefin in Niedersachsen?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Niedersachsen", 0,
				"D",
				"86,5%",
				false
			)
		)
        list.add(
			Question(
				390,
				"Welchen Minister / welche Ministerin hat Niedersachsen nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Niedersachsen", 0,
				"B",
				"88,5%",
				false
			)
		)
        list.add(
			Question(
				391,
				"Welches Wappen gehört zum Bundesland Nordrhein-Westfalen?",
				"1",
				"2",
				"3",
				"4",
				"Nordrhein Westfalen", 0,
				"B",
				"97,9%",
				true
			)
		)
        list.add(
			Question(
				392,
				"Welches ist ein Landkreis in Nordrhein-Westfalen?",
				"Ammerland",
				"Rhein-Sieg-Kreis",
				"Nordfriesland",
				"Vogtlandkreis",
				"Nordrhein Westfalen", 0,
				"B",
				"93,3%",
				false
			)
		)
        list.add(
			Question(
				393,
				"Für wie viele Jahre wird der Landtag in Nordrhein-Westfalen gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Nordrhein Westfalen", 0,
				"C",
				"68,7%",
				false
			)
		)
        list.add(
			Question(
				394,
				"Ab welchem Alter darf man in Nordrhein-Westfalen bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Nordrhein Westfalen", 0,
				"B",
				"77,4%",
				false
			)
		)
        list.add(
			Question(
				395,
				"Welche Farben hat die Landesflagge von Nordrhein-Westfalen?",
				"rot-weiß",
				"grün-weiß-rot",
				"schwarz-gold",
				"blau-weiß-rot",
				"Nordrhein Westfalen", 0,
				"B",
				"92,4%",
				false
			)
		)
        list.add(
			Question(
				396,
				"Wo können Sie sich in Nordrhein-Westfalen über politische Themen informieren?",
				"bei den Kirchen",
				"beim Ordnungsamt der Gemeinde",
				"bei der Verbraucherzentrale",
				"bei der Landeszentrale für politische Bildung",
				"Nordrhein Westfalen", 0,
				"D",
				"92,7%",
				false
			)
		)
        list.add(
			Question(
				397,
				"Die Landeshauptstadt von Nordrhein-Westfalen heißt …",
				"Köln.",
				"Bonn.",
				"Düsseldorf.",
				"Dortmund.",
				"Nordrhein Westfalen", 0,
				"C",
				"95,2%",
				false
			)
		)
        list.add(
			Question(
				398,
				"Welches Bundesland ist Nordrhein-Westfalen?",
				"1",
				"2",
				"3",
				"4",
				"Nordrhein Westfalen", 0,
				"C",
				"92,5%",
				true
			)
		)
        list.add(
			Question(
				399,
				"Wie nennt man den Regierungschef / die Regierungschefin in Nordrhein-Westfalen?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Nordrhein Westfalen", 0,
				"D",
				"85,9%",
				false
			)
		)
        list.add(
			Question(
				400,
				"Welchen Minister / welche Ministerin hat Nordrhein-Westfalen nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Nordrhein Westfalen", 0,
				"B",
				"87,5%",
				false
			)
		)
        list.add(
			Question(
				401,
				"Welches Wappen gehört zum Bundesland Rheinland-Pfalz?",
				"1",
				"2",
				"3",
				"4",
				"Rheinland Pfalz", 0,
				"A",
				"97,2%",
				true
			)
		)
        list.add(
			Question(
				402,
				"Welches ist ein Landkreis in Rheinland-Pfalz?",
				"Westerwaldkreis",
				"Altötting",
				"Emsland",
				"Prignitz",
				"Rheinland Pfalz", 0,
				"A",
				"92,7%",
				false
			)
		)
        list.add(
			Question(
				403,
				"Für wie viele Jahre wird der Landtag in Rheinland-Pfalz gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Rheinland Pfalz", 0,
				"C",
				"68,4%",
				false
			)
		)
        list.add(
			Question(
				404,
				"Ab welchem Alter darf man in Rheinland-Pfalz bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Rheinland Pfalz", 0,
				"C",
				"94,4%",
				false
			)
		)
        list.add(
			Question(
				405,
				"Welche Farben hat die Landesflagge von Rheinland-Pfalz?",
				"weiß-rot",
				"schwarz-rot-gold",
				"schwarz-gelb",
				"grün-weiß-rot",
				"Rheinland Pfalz", 0,
				"B",
				"88,1%",
				false
			)
		)
        list.add(
			Question(
				406,
				"Wo können Sie sich in Rheinland-Pfalz über politische Themen informieren?",
				"bei den Kirchen",
				"bei der Verbraucherzentrale",
				"beim Ordnungsamt der Gemeinde",
				"bei der Landeszentrale für politische Bildung",
				"Rheinland Pfalz", 0,
				"D",
				"92,2%",
				false
			)
		)
        list.add(
			Question(
				407,
				"Die Landeshauptstadt von Rheinland-Pfalz heißt …",
				"Mainz.",
				"Kaiserslautern.",
				"Ludwigshafen.",
				"Koblenz.",
				"Rheinland Pfalz", 0,
				"A",
				"97,4%",
				false
			)
		)
        list.add(
			Question(
				408,
				"Welches Bundesland ist Rheinland-Pfalz?",
				"1",
				"2",
				"3",
				"4",
				"Rheinland Pfalz", 0,
				"A",
				"89,6%",
				true
			)
		)
        list.add(
			Question(
				409,
				"Wie nennt man den Regierungschef / die Regierungschefin in Rheinland-Pfalz?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Rheinland Pfalz", 0,
				"D",
				"85,8%",
				false
			)
		)
        list.add(
			Question(
				410,
				"Welchen Minister / welche Ministerin hat Rheinland-Pfalz nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Rheinland Pfalz", 0,
				"B",
				"88,3%",
				false
			)
		)
        list.add(
			Question(
				411,
				"Welches Wappen gehört zum Bundesland Saarland?",
				"1",
				"2",
				"3",
				"4",
				"Saarland", 0,
				"D",
				"93,8%",
				true
			)
		)
        list.add(
			Question(
				412,
				"Welches ist ein Landkreis im Saarland?",
				"Demmin",
				"Altötting",
				"Neunkirchen",
				"Rhein-Sieg-Kreis",
				"Saarland", 0,
				"C",
				"95,9%",
				false
			)
		)
        list.add(
			Question(
				413,
				"Für wie viele Jahre wird der Landtag des Saarlandes gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Saarland", 0,
				"C",
				"70,3%",
				false
			)
		)
        list.add(
			Question(
				414,
				"Ab welchem Alter darf man im Saarland bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Saarland", 0,
				"C",
				"95,7%",
				false
			)
		)
        list.add(
			Question(
				415,
				"Welche Farben hat die Landesflagge des Saarlandes?",
				"weiß-blau",
				"schwarz-rot-gold",
				"schwarz-gelb",
				"grün-weiß-rot",
				"Saarland", 0,
				"B",
				"85,3%",
				false
			)
		)
        list.add(
			Question(
				416,
				"Wo können Sie sich im Saarland über politische Themen informieren?",
				"bei den Kirchen",
				"bei der Landeszentrale für politische Bildung",
				"bei der Verbraucherzentrale",
				"beim Ordnungsamt der Gemeinde",
				"Saarland", 0,
				"B",
				"94,8%",
				false
			)
		)
        list.add(
			Question(
				417,
				"Die Landeshauptstadt des Saarlandes heißt …",
				"Neunkirchen.",
				"Homburg.",
				"Saarbrücken.",
				"Völklingen.",
				"Saarland", 0,
				"C",
				"97,8%",
				false
			)
		)
        list.add(
			Question(
				418,
				"Welches Bundesland ist das Saarland?",
				"1",
				"2",
				"3",
				"4",
				"Saarland", 0,
				"B",
				"96,7%",
				true
			)
		)
        list.add(
			Question(
				419,
				"Wie nennt man den Regierungschef / die Regierungschefin des Saarlandes?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Saarland", 0,
				"D",
				"88,2%",
				false
			)
		)
        list.add(
			Question(
				420,
				"Welchen Minister / welche Ministerin hat das Saarland nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Saarland", 0,
				"B",
				"90,1%",
				false
			)
		)
        list.add(
			Question(
				421,
				"Welches Wappen gehört zum Freistaat Sachsen?",
				"1",
				"2",
				"3",
				"4",
				"Sachsen", 0,
				"D",
				"97,5%",
				true
			)
		)
        list.add(
			Question(
				422,
				"Welches ist ein Landkreis in Sachsen?",
				"Vogtlandkreis",
				"Altötting",
				"Uckermark",
				"Nordfriesland",
				"Sachsen", 0,
				"A",
				"91,8%",
				false
			)
		)
        list.add(
			Question(
				423,
				"Für wie viele Jahre wird der Landtag in Sachsen gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Sachsen", 0,
				"C",
				"66,9%",
				false
			)
		)
        list.add(
			Question(
				424,
				"Ab welchem Alter darf man in Sachsen bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Sachsen", 0,
				"C",
				"94,5%",
				false
			)
		)
        list.add(
			Question(
				425,
				"Welche Farben hat die Landesflagge von Sachsen?",
				"blau-weiß-rot",
				"weiß-grün",
				"grün-weiß-rot",
				"schwarz-gelb",
				"Sachsen", 0,
				"B",
				"82,3%",
				false
			)
		)
        list.add(
			Question(
				426,
				"Wo können Sie sich in Sachsen über politische Themen informieren?",
				"bei der Landeszentrale für politische Bildung",
				"beim Ordnungsamt der Gemeinde",
				"bei den Kirchen",
				"bei der Verbraucherzentrale",
				"Sachsen", 0,
				"A",
				"93,3%",
				false
			)
		)
        list.add(
			Question(
				427,
				"Die Landeshauptstadt von Sachsen heißt …",
				"Leipzig.",
				"Dresden.",
				"Chemnitz.",
				"Zwickau.",
				"Sachsen", 0,
				"B",
				"96,7%",
				false
			)
		)
        list.add(
			Question(
				428,
				"Welches Bundesland ist Sachsen?",
				"1",
				"2",
				"3",
				"4",
				"Sachsen", 0,
				"D",
				"93,9%",
				true
			)
		)
        list.add(
			Question(
				429,
				"Wie nennt man den Regierungschef / die Regierungschefin in Sachsen?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Sachsen", 0,
				"D",
				"85,8%",
				false
			)
		)
        list.add(
			Question(
				430,
				"Welchen Minister / welche Ministerin hat Sachsen nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Sachsen", 0,
				"B",
				"89,7%",
				false
			)
		)
        list.add(
			Question(
				431,
				"Welches Wappen gehört zum Bundesland Sachsen-Anhalt?",
				"1",
				"2",
				"3",
				"4",
				"Sachsen Anhalt", 0,
				"D",
				"94,5%",
				true
			)
		)
        list.add(
			Question(
				432,
				"Welches ist ein Landkreis in Sachsen-Anhalt?",
				"Ammerland",
				"Altötting",
				"Uckermark",
				"Börde",
				"Sachsen Anhalt", 0,
				"D",
				"90,3%",
				false
			)
		)
        list.add(
			Question(
				433,
				"Für wie viele Jahre wird der Landtag in Sachsen-Anhalt gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Sachsen Anhalt", 0,
				"C",
				"69,6%",
				false
			)
		)
        list.add(
			Question(
				434,
				"Ab welchem Alter darf man in Sachsen-Anhalt bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Sachsen Anhalt", 0,
				"B",
				"77,1%",
				false
			)
		)
        list.add(
			Question(
				435,
				"Welche Farben hat die Landesflagge von Sachsen-Anhalt?",
				"blau-weiß-rot",
				"gelb-schwarz",
				"grün-weiß-rot",
				"weiß-rot",
				"Sachsen Anhalt", 0,
				"B",
				"86,5%",
				false
			)
		)
        list.add(
			Question(
				436,
				"Wo können Sie sich in Sachsen-Anhalt über politische Themen informieren?",
				"bei den Kirchen",
				"bei der Landeszentrale für politische Bildung",
				"beim Ordnungsamt der Gemeinde",
				"bei der Verbraucherzentrale",
				"Sachsen Anhalt", 0,
				"B",
				"94,4%",
				false
			)
		)
        list.add(
			Question(
				437,
				"Die Landeshauptstadt von Sachsen-Anhalt heißt …",
				"Halle.",
				"Dessau.",
				"Magdeburg.",
				"Wittenberg.",
				"Sachsen Anhalt", 0,
				"C",
				"97,9%",
				false
			)
		)
        list.add(
			Question(
				438,
				"Welches Bundesland ist Sachsen-Anhalt?",
				"1",
				"2",
				"3",
				"4",
				"Sachsen Anhalt", 0,
				"C",
				"92,5%",
				true
			)
		)
        list.add(
			Question(
				439,
				"Wie nennt man den Regierungschef / die Regierungschefin in Sachsen-Anhalt?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Sachsen Anhalt", 0,
				"D",
				"85,7%",
				false
			)
		)
        list.add(
			Question(
				440,
				"Welchen Minister / welche Ministerin hat Sachsen-Anhalt nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Sachsen Anhalt", 0,
				"B",
				"88,9%",
				false
			)
		)
        list.add(
			Question(
				441,
				"Welches Wappen gehört zum Bundesland Schleswig-Holstein?",
				"1",
				"2",
				"3",
				"4",
				"Schleswig Holstein", 0,
				"C",
				"93,8%",
				true
			)
		)
        list.add(
			Question(
				442,
				"Welches ist ein Landkreis in Schleswig-Holstein?",
				"Ammerland",
				"Demmin",
				"Nordfriesland",
				"Rhein-Sieg-Kreis",
				"Schleswig Holstein", 0,
				"C",
				"92,7%",
				false
			)
		)
        list.add(
			Question(
				443,
				"Für wie viele Jahre wird der Landtag in Schleswig-Holstein gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Schleswig Holstein", 0,
				"C",
				"69,5%",
				false
			)
		)
        list.add(
			Question(
				444,
				"Ab welchem Alter darf man in Schleswig-Holstein bei Kommunalwahlen wählen?",
				"14",
				"16",
				"18",
				"20",
				"Schleswig Holstein", 0,
				"B",
				"79,5%",
				false
			)
		)
        list.add(
			Question(
				445,
				"Welche Farben hat die Landesflagge von Schleswig-Holstein?",
				"weiß-blau",
				"blau-weiß-rot",
				"weiß-rot",
				"grün-weiß-rot",
				"Schleswig Holstein", 0,
				"B",
				"93,0%",
				false
			)
		)
        list.add(
			Question(
				446,
				"Wo können Sie sich in Schleswig-Holstein über politische Themen informieren?",
				"bei der Verbraucherzentrale",
				"beim Ordnungsamt der Gemeinde",
				"bei der Landeszentrale für politische Bildung",
				"bei den Kirchen",
				"Schleswig Holstein", 0,
				"C",
				"92,0%",
				false
			)
		)
        list.add(
			Question(
				447,
				"Die Landeshauptstadt von Schleswig-Holstein heißt …",
				"Husum.",
				"Flensburg.",
				"Lübeck.",
				"Kiel.",
				"Schleswig Holstein", 0,
				"D",
				"97,4%",
				false
			)
		)
        list.add(
			Question(
				448,
				"Welches Bundesland ist Schleswig-Holstein?",
				"1",
				"2",
				"3",
				"4",
				"Schleswig Holstein", 0,
				"A",
				"94,6%",
				true
			)
		)
        list.add(
			Question(
				449,
				"Wie nennt man den Regierungschef / die Regierungschefin in Schleswig-Holstein?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Schleswig Holstein", 0,
				"D",
				"86,9%",
				false
			)
		)
        list.add(
			Question(
				450,
				"Welchen Minister / welche Ministerin hat Schleswig-Holstein nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Schleswig Holstein", 0,
				"B",
				"88,5%",
				false
			)
		)
        list.add(
			Question(
				451,
				"Welches Wappen gehört zum Freistaat Thüringen?",
				"1",
				"2",
				"3",
				"4",
				"Thüringen", 0,
				"D",
				"92,9%",
				true
			)
		)
        list.add(
			Question(
				452,
				"Welches ist ein Landkreis in Thüringen?",
				"Ammerland",
				"Altötting",
				"Nordfriesland",
				"Wartburgkreis",
				"Thüringen", 0,
				"D",
				"89,6%",
				false
			)
		)
        list.add(
			Question(
				453,
				"Für wie viele Jahre wird der Landtag in Thüringen gewählt?",
				"3",
				"4",
				"5",
				"6",
				"Thüringen", 0,
				"C",
				"67,1%",
				false
			)
		)
        list.add(
			Question(
				454,
				"Ab welchem Alter darf man in Thüringen bei Kommunalwahlen wählen?",
				"14",
				"18",
				"16",
				"20",
				"Thüringen", 0,
				"C",
				"92,0%",
				false
			)
		)
        list.add(
			Question(
				455,
				"Welche Farben hat die Landesflagge von Thüringen?",
				"blau-weiß-rot",
				"weiß-rot",
				"grün-weiß-rot",
				"schwarz-gold",
				"Thüringen", 0,
				"B",
				"70,5%",
				false
			)
		)
        list.add(
			Question(
				456,
				"Wo können Sie sich in Thüringen über politische Themen informieren?",
				"bei den Kirchen",
				"bei der Verbraucherzentrale",
				"bei der Landeszentrale für politische Bildung",
				"beim Ordnungsamt der Gemeinde",
				"Thüringen", 0,
				"C",
				"94,0%",
				false
			)
		)
        list.add(
			Question(
				457,
				"Die Landeshauptstadt von Thüringen heißt …",
				"Eisenach.",
				"Erfurt.",
				"Gera.",
				"Jena.",
				"Thüringen", 0,
				"B",
				"97,0%",
				false
			)
		)
        list.add(
			Question(
				458,
				"Welches Bundesland ist Thüringen?",
				"1",
				"2",
				"3",
				"4",
				"Thüringen", 0,
				"B",
				"87,8%",
				true
			)
		)
        list.add(
			Question(
				459,
				"Wie nennt man den Regierungschef / die Regierungschefin in Thüringen?",
				"Erster Minister / Erste Ministerin",
				"Premierminister / Premierministerin",
				"Bürgermeister / Bürgermeisterin",
				"Ministerpräsident / Ministerpräsidentin",
				"Thüringen", 0,
				"D",
				"87,8%",
				false
			)
		)
        list.add(
			Question(
				460,
				"Welchen Minister / welche Ministerin hat Thüringen nicht?",
				"Justizminister / Justizministerin",
				"Außenminister / Außenministerin",
				"Finanzminister / Finanzministerin",
				"Innenminister / Innenministerin",
				"Thüringen", 0,
				"B",
				"87,4%",
				false
			)
		)

        return list
    }
}