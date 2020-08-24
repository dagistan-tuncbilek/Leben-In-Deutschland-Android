package com.dt.lebenindeutschland.utility

enum class Language {

    NOT_SELECTED {
        override fun getLanguage(): String = "NOT_SELECTED"
    },
    GERMAN {
        override fun getLanguage(): String = "de"
    },
    ENGLISH {
        override fun getLanguage(): String = "en"
    },
    RUSSIAN {
        override fun getLanguage(): String =  "ru"
    },
    TURKISH {
        override fun getLanguage(): String =  "tr"
    },
    ARABIC {
        override fun getLanguage(): String = "ar"

    },
    POLISH {
        override fun getLanguage(): String = "pl"

    };
    abstract fun getLanguage(): String
}