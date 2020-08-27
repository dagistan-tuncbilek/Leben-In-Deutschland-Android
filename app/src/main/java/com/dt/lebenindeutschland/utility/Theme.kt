package com.dt.lebenindeutschland.utility

var selectedThema: Thema = Thema.BUNDESLANDER

enum class Thema {

    BUNDESLANDER {
        override fun getNextTheme(): Thema {
            return VERFASSUNGSORGANE
        }
        override fun getLastTheme(): Thema {
            return INTERKULTURELLES
        }
        override fun getThemeName(): String {
            return "Bundesland/Staat"
        }

        override fun getThemeID(): Int {
            return 0
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(-1)
        }
    },
    VERFASSUNGSORGANE {
        override fun getNextTheme(): Thema {
            return VERFASSUNGSPRINZIPIEN
        }
        override fun getLastTheme(): Thema {
            return BUNDESLANDER
        }

        override fun getThemeName(): String {
            return "Verfassungsorgane"
        }

        override fun getThemeID(): Int {
            return 1
        }

        override fun getThemeQuestionIdList(): IntArray {
            return  intArrayOf(13, 20, 28, 31, 42, 43, 44, 48, 55, 57, 58, 65, 70, 71, 72, 74, 75, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 98, 129)
        }
    },
    VERFASSUNGSPRINZIPIEN {
        override fun getNextTheme(): Thema {
            return SOZIALSYSTEM
        }
        override fun getLastTheme(): Thema {
            return VERFASSUNGSPRINZIPIEN
        }
        override fun getThemeName(): String {
            return "Verfassungsprinzipien"
        }

        override fun getThemeID(): Int {
            return 2
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(3, 6, 11, 22, 26, 27, 30, 32, 34, 41, 51, 52, 53, 54, 60, 61, 63, 143, 144, 145, 147, 148)
        }
    },
    FEDERALISMUS {
        override fun getNextTheme(): Thema {
            return SOZIALSYSTEM
        }
        override fun getLastTheme(): Thema {
            return VERFASSUNGSPRINZIPIEN
        }
        override fun getThemeName(): String {
            return "Föderalismus"
        }

        override fun getThemeID(): Int {
            return 3
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(24, 25, 37, 38, 39, 49, 64, 67)
        }
    },
    SOZIALSYSTEM {
        override fun getNextTheme(): Thema {
            return GRUNDRECHTE
        }
        override fun getLastTheme(): Thema {
            return FEDERALISMUS
        }
        override fun getThemeName(): String {
            return "Sozialsystem"
        }

        override fun getThemeID(): Int {
            return 4
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(23, 35, 36, 45, 97, 99, 100, 285)
        }
    },
    GRUNDRECHTE {
        override fun getNextTheme(): Thema {
            return WAHLEN
        }
        override fun getLastTheme(): Thema {
            return SOZIALSYSTEM
        }
        override fun getThemeName(): String {
            return "Grundrechte"
        }

        override fun getThemeID(): Int {
            return 5
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(1, 2, 4, 7, 8, 9, 10, 12, 14, 15, 16, 17, 18, 19, 101, 135, 262, 274, 277, 278, 281, 289)
        }
    },
    WAHLEN {
        override fun getNextTheme(): Thema {
            return PARTEIEN
        }

        override fun getLastTheme(): Thema {
            return GRUNDRECHTE
        }

        override fun getThemeName(): String {
            return "Wahlen und Beteiligung"
        }

        override fun getThemeID(): Int {
            return 6
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(5, 62, 93, 94, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 130, 132, 133, 134)
        }

    },
    PARTEIEN {
        override fun getNextTheme(): Thema {
            return AUFGABEN
        }
        override fun getLastTheme(): Thema {
            return WAHLEN
        }
        override fun getThemeName(): String {
            return "Parteien"
        }

        override fun getThemeID(): Int {
            return 7
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(59, 73, 76, 78, 79, 92, 103)
        }
    },
    AUFGABEN {
        override fun getNextTheme(): Thema {
            return PFLICHTEN
        }
        override fun getLastTheme(): Thema {
            return PARTEIEN
        }
        override fun getThemeName(): String {
            return "Aufgaben Des Staates"
        }

        override fun getThemeID(): Int {
            return 8
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(46, 47, 68, 77)
        }
    },
    PFLICHTEN {
        override fun getNextTheme(): Thema {
            return STAATSSYMBOLE
        }
        override fun getLastTheme(): Thema {
            return AUFGABEN
        }
        override fun getThemeName(): String {
            return "Pflichten"
        }

        override fun getThemeID(): Int {
            return 9
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(95, 96, 105, 106, 248, 249, 260, 282)
        }
    },
    STAATSSYMBOLE {
        override fun getNextTheme(): Thema {
            return KOMMUNE
        }
        override fun getLastTheme(): Thema {
            return PFLICHTEN
        }
        override fun getThemeName(): String {
            return "Staatssymbole"
        }

        override fun getThemeID(): Int {
            return 10
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(21, 29, 40, 66, 214, 216)
        }
    },
    KOMMUNE {
        override fun getNextTheme(): Thema {
            return RECHTUNDALLTAG
        }
        override fun getLastTheme(): Thema {
            return STAATSSYMBOLE
        }
        override fun getThemeName(): String {
            return "Kommune"
        }

        override fun getThemeID(): Int {
            return 11
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(56, 69, 131, 253, 255, 256, 259, 265, 273, 288)
        }
    },
    RECHTUNDALLTAG {
        override fun getNextTheme(): Thema {
            return NATIONALSOZIALISMUS
        }
        override fun getLastTheme(): Thema {
            return KOMMUNE
        }
        override fun getThemeName(): String {
            return "Recht Und Alltag"
        }

        override fun getThemeID(): Int {
            return 12
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(102, 104, 136, 137, 138, 139, 140, 141, 142, 146, 149, 150, 241, 242, 243, 245, 246, 247, 251, 252, 254, 258, 263, 266, 267, 268, 272, 275, 276, 279, 280, 283, 286, 287, 290, 291)
        }
    },
    NATIONALSOZIALISMUS {
        override fun getNextTheme(): Thema {
            return NACH1945
        }
        override fun getLastTheme(): Thema {
            return RECHTUNDALLTAG
        }
        override fun getThemeName(): String {
            return "Nationalsozialismus"
        }

        override fun getThemeID(): Int {
            return 13
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 170, 175, 176, 177, 179, 184, 220)
        }
    },
    NACH1945 {
        override fun getNextTheme(): Thema {
            return WIEDERVEREINIGUNG
        }
        override fun getLastTheme(): Thema {
            return NATIONALSOZIALISMUS
        }
        override fun getThemeName(): String {
            return "Nach 1945"
        }

        override fun getThemeID(): Int {
            return 14
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(50, 151, 165, 166, 167, 168, 169, 171, 172, 174, 178, 180, 181, 182, 183, 185, 186, 187, 188, 189, 190, 193, 199, 202, 203, 207, 208, 209, 210, 211, 212, 215, 217)
        }
    },
    WIEDERVEREINIGUNG {
        override fun getNextTheme(): Thema {
            return DEUTSCHLANDINEUROPA
        }
        override fun getLastTheme(): Thema {
            return NACH1945
        }
        override fun getThemeName(): String {
            return "Wiedervereinigung"
        }

        override fun getThemeID(): Int {
            return 15
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(191, 192, 194, 195, 196, 197, 198, 200, 201, 204, 205, 206, 218, 219, 228)
        }
    },
    DEUTSCHLANDINEUROPA {
        override fun getNextTheme(): Thema {
            return RELIGIOSE
        }
        override fun getLastTheme(): Thema {
            return WIEDERVEREINIGUNG
        }
        override fun getThemeName(): String {
            return "Deutschland In Europa"
        }

        override fun getThemeID(): Int {
            return 16
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(173, 213, 221, 222, 223, 224, 225, 226, 227, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240)
        }
    },
    RELIGIOSE {
        override fun getNextTheme(): Thema {
            return BILDUNG
        }
        override fun getLastTheme(): Thema {
            return DEUTSCHLANDINEUROPA
        }
        override fun getThemeName(): String {
            return "Religiöse Vielfalt"
        }

        override fun getThemeID(): Int {
            return 17
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(33, 292, 294, 295, 296)
        }
    },
    BILDUNG {
        override fun getNextTheme(): Thema {
            return MIGRATIONSGESCHICHTE
        }
        override fun getLastTheme(): Thema {
            return RELIGIOSE
        }
        override fun getThemeName(): String {
            return "Bildung"
        }

        override fun getThemeID(): Int {
            return 18
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(244, 250, 257, 261, 269, 270, 284)
        }
    },
    MIGRATIONSGESCHICHTE {
        override fun getNextTheme(): Thema {
            return INTERKULTURELLES
        }
        override fun getLastTheme(): Thema {
            return BILDUNG
        }
        override fun getThemeName(): String {
            return "Migrationsgeschichte"
        }

        override fun getThemeID(): Int {
            return 19
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(297, 298, 299, 300)
        }
    },
    INTERKULTURELLES {
        override fun getNextTheme(): Thema {
            return BUNDESLANDER
        }
        override fun getLastTheme(): Thema {
            return MIGRATIONSGESCHICHTE
        }
        override fun getThemeName(): String {
            return "Interkulturelles"
        }

        override fun getThemeID(): Int {
            return 20
        }

        override fun getThemeQuestionIdList(): IntArray {
            return intArrayOf(264, 271, 293)
        }
    };

    abstract fun getNextTheme(): Thema

    abstract fun getLastTheme(): Thema

    abstract fun getThemeName(): String

    abstract fun getThemeID(): Int

    abstract fun getThemeQuestionIdList(): IntArray
}