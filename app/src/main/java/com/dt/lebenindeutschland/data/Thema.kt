package com.dt.lebenindeutschland.data

var selectedThema: Thema = Thema.BUNDESLANDER

enum class Thema {

    BUNDESLANDER {
        override fun getNextThema(): Thema {
            return VERFASSUNGSORGANE
        }
        override fun getLastThema(): Thema {
            return INTERKULTURELLES
        }
        override fun getThemaName(): String {
            return "Bundesländer"
        }
    },
    VERFASSUNGSORGANE {
        override fun getNextThema(): Thema {
            return VERFASSUNGSPRINZIPIEN
        }
        override fun getLastThema(): Thema {
            return BUNDESLANDER
        }

        override fun getThemaName(): String {
            return "Verfassungsorgane"
        }
    },
    VERFASSUNGSPRINZIPIEN {
        override fun getNextThema(): Thema {
            return SOZIALSYSTEM
        }
        override fun getLastThema(): Thema {
            return VERFASSUNGSPRINZIPIEN
        }
        override fun getThemaName(): String {
            return "Verfassungsprinzipien"
        }
    },
    FEDERALISMUS {
        override fun getNextThema(): Thema {
            return SOZIALSYSTEM
        }
        override fun getLastThema(): Thema {
            return VERFASSUNGSPRINZIPIEN
        }
        override fun getThemaName(): String {
            return "Föderalismus"
        }
    },
    SOZIALSYSTEM {
        override fun getNextThema(): Thema {
            return GRUNDRECHTE
        }
        override fun getLastThema(): Thema {
            return FEDERALISMUS
        }
        override fun getThemaName(): String {
            return "Sozialsystem"
        }
    },
    GRUNDRECHTE {
        override fun getNextThema(): Thema {
            return WAHLEN
        }
        override fun getLastThema(): Thema {
            return SOZIALSYSTEM
        }
        override fun getThemaName(): String {
            return "Grundrechte"
        }
    },
    WAHLEN {
        override fun getNextThema(): Thema {
            return PARTEIEN
        }

        override fun getLastThema(): Thema {
            return GRUNDRECHTE
        }

        override fun getThemaName(): String {
            return "Wahlen und Beteiligung"
        }

    },
    PARTEIEN {
        override fun getNextThema(): Thema {
            return AUFGABEN
        }
        override fun getLastThema(): Thema {
            return WAHLEN
        }
        override fun getThemaName(): String {
            return "Parteien"
        }
    },
    AUFGABEN {
        override fun getNextThema(): Thema {
            return PFLICHTEN
        }
        override fun getLastThema(): Thema {
            return PARTEIEN
        }
        override fun getThemaName(): String {
            return "Aufgaben Des Staates"
        }
    },
    PFLICHTEN {
        override fun getNextThema(): Thema {
            return STAATSSYMBOLE
        }
        override fun getLastThema(): Thema {
            return AUFGABEN
        }
        override fun getThemaName(): String {
            return "Pflichten"
        }
    },
    STAATSSYMBOLE {
        override fun getNextThema(): Thema {
            return KOMMUNE
        }
        override fun getLastThema(): Thema {
            return PFLICHTEN
        }
        override fun getThemaName(): String {
            return "Staatssymbole"
        }
    },
    KOMMUNE {
        override fun getNextThema(): Thema {
            return RECHTUNDALLTAG
        }
        override fun getLastThema(): Thema {
            return STAATSSYMBOLE
        }
        override fun getThemaName(): String {
            return "Kommune"
        }
    },
    RECHTUNDALLTAG {
        override fun getNextThema(): Thema {
            return NATIONALSOZIALISMUS
        }
        override fun getLastThema(): Thema {
            return KOMMUNE
        }
        override fun getThemaName(): String {
            return "Recht Und Alltag"
        }
    },
    NATIONALSOZIALISMUS {
        override fun getNextThema(): Thema {
            return NACH1945
        }
        override fun getLastThema(): Thema {
            return RECHTUNDALLTAG
        }
        override fun getThemaName(): String {
            return "Nationalsozialismus"
        }
    },
    NACH1945 {
        override fun getNextThema(): Thema {
            return WIEDERVEREINIGUNG
        }
        override fun getLastThema(): Thema {
            return NATIONALSOZIALISMUS
        }
        override fun getThemaName(): String {
            return "Nach 1945"
        }
    },
    WIEDERVEREINIGUNG {
        override fun getNextThema(): Thema {
            return DEUTSCHLANDINEUROPA
        }
        override fun getLastThema(): Thema {
            return NACH1945
        }
        override fun getThemaName(): String {
            return "Wiedervereinigung"
        }
    },
    DEUTSCHLANDINEUROPA {
        override fun getNextThema(): Thema {
            return RELIGIOSE
        }
        override fun getLastThema(): Thema {
            return WIEDERVEREINIGUNG
        }
        override fun getThemaName(): String {
            return "Deutschland In Europa"
        }
    },
    RELIGIOSE {
        override fun getNextThema(): Thema {
            return BILDUNG
        }
        override fun getLastThema(): Thema {
            return DEUTSCHLANDINEUROPA
        }
        override fun getThemaName(): String {
            return "Religiöse Vielfalt"
        }
    },
    BILDUNG {
        override fun getNextThema(): Thema {
            return MIGRATIONSGESCHICHTE
        }
        override fun getLastThema(): Thema {
            return RELIGIOSE
        }
        override fun getThemaName(): String {
            return "Bildung"
        }
    },
    MIGRATIONSGESCHICHTE {
        override fun getNextThema(): Thema {
            return INTERKULTURELLES
        }
        override fun getLastThema(): Thema {
            return BILDUNG
        }
        override fun getThemaName(): String {
            return "Migrationsgeschichte"
        }
    },
    INTERKULTURELLES {
        override fun getNextThema(): Thema {
            return BUNDESLANDER
        }
        override fun getLastThema(): Thema {
            return MIGRATIONSGESCHICHTE
        }
        override fun getThemaName(): String {
            return "Interkulturelles"
        }
    };

    abstract fun getNextThema(): Thema

    abstract fun getLastThema(): Thema

    abstract fun getThemaName(): String
}