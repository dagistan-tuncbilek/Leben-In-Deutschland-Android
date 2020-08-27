package com.dt.lebenindeutschland.utility

data class ThemaData(
    var themaName: String,
    var max: Int,
    var progress: Int
)

fun getThemesData(): ArrayList<ThemaData> {

    return arrayListOf(
        ThemaData("Bundesland/Staat", 10, 0),
        ThemaData("Verfassungsorgane", 31, 0),
        ThemaData("Verfassungsprinzipien", 22, 0),
        ThemaData("Föderalismus", 8, 0),
        ThemaData("Sozialsystem", 8, 0),
        ThemaData("Grundrechte", 22, 0),
        ThemaData("Wahlen und Beteiligung", 30, 0),
        ThemaData("Parteien", 7, 0),
        ThemaData("Aufgaben des Staates", 4, 0),
        ThemaData("Pflichten", 8, 0),
        ThemaData("Staatssymbole", 6, 0),
        ThemaData("Kommune", 10, 0),
        ThemaData("Recht und Alltag", 36, 0),
        ThemaData("Der Nationalsozialismus und seine Folgen", 20, 0),
        ThemaData("Wichtige Stationen nach 1945", 33, 0),
        ThemaData("Wiedervereinigung", 15, 0),
        ThemaData("Deutschland in Europa", 21, 0),
        ThemaData("Religiöse Vielfalt", 5, 0),
        ThemaData("Bildung", 7, 0),
        ThemaData("Migrationsgeschichte", 4, 0),
        ThemaData("Interkulturelles Zusammenleben", 3, 0)
    )
}


