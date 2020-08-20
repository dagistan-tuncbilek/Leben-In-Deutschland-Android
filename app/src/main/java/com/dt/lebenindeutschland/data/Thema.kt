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

        override fun getThemaID(): Int {
            return 0
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(-1)
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

        override fun getThemaID(): Int {
            return 1
        }

        override fun getThemaQuestionIdList(): IntArray {
            return  intArrayOf(13, 20, 28, 31, 42, 43, 44, 48, 55, 57, 58, 65, 70, 71, 72, 74, 75, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 98, 129)
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

        override fun getThemaID(): Int {
            return 2
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(3, 6, 11, 22, 26, 27, 30, 32, 34, 41, 51, 52, 53, 54, 60, 61, 63, 143, 144, 145, 147, 148)
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

        override fun getThemaID(): Int {
            return 3
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(24, 25, 37, 38, 39, 49, 64, 67)
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

        override fun getThemaID(): Int {
            return 4
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(23, 35, 36, 45, 97, 99, 100, 285)
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

        override fun getThemaID(): Int {
            return 5
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(1, 2, 4, 7, 8, 9, 10, 12, 14, 15, 16, 17, 18, 19, 101, 135, 262, 274, 277, 278, 281, 289)
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

        override fun getThemaID(): Int {
            return 6
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(5, 62, 93, 94, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 130, 132, 133, 134)
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

        override fun getThemaID(): Int {
            return 7
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(59, 73, 76, 78, 79, 92, 103)
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

        override fun getThemaID(): Int {
            return 8
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(46, 47, 68, 77)
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

        override fun getThemaID(): Int {
            return 9
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(95, 96, 105, 106, 248, 249, 260, 282)
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

        override fun getThemaID(): Int {
            return 10
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(21, 29, 40, 66, 214, 216)
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

        override fun getThemaID(): Int {
            return 11
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(56, 69, 131, 253, 255, 256, 259, 265, 273, 288)
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

        override fun getThemaID(): Int {
            return 12
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(102, 104, 136, 137, 138, 139, 140, 141, 142, 146, 149, 150, 241, 242, 243, 245, 246, 247, 251, 252, 254, 258, 263, 266, 267, 268, 272, 275, 276, 279, 280, 283, 286, 287, 290, 291)
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

        override fun getThemaID(): Int {
            return 13
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 170, 175, 176, 177, 179, 184, 220)
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

        override fun getThemaID(): Int {
            return 14
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(50, 151, 165, 166, 167, 168, 169, 171, 172, 174, 178, 180, 181, 182, 183, 185, 186, 187, 188, 189, 190, 193, 199, 202, 203, 207, 208, 209, 210, 211, 212, 215, 217)
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

        override fun getThemaID(): Int {
            return 15
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(191, 192, 194, 195, 196, 197, 198, 200, 201, 204, 205, 206, 218, 219, 228)
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

        override fun getThemaID(): Int {
            return 16
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(173, 213, 221, 222, 223, 224, 225, 226, 227, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240)
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

        override fun getThemaID(): Int {
            return 17
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(33, 292, 294, 295, 296)
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

        override fun getThemaID(): Int {
            return 18
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(244, 250, 257, 261, 269, 270, 284)
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

        override fun getThemaID(): Int {
            return 19
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(297, 298, 299, 300)
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

        override fun getThemaID(): Int {
            return 20
        }

        override fun getThemaQuestionIdList(): IntArray {
            return intArrayOf(264, 271, 293)
        }
    };

    abstract fun getNextThema(): Thema

    abstract fun getLastThema(): Thema

    abstract fun getThemaName(): String

    abstract fun getThemaID(): Int

    abstract fun getThemaQuestionIdList(): IntArray
}