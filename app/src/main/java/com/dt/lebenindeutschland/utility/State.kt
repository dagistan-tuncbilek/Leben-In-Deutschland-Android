package com.dt.lebenindeutschland.utility

enum class State {
    BADEN_WURTTEMBERG {
        override fun getStateName(): String {
            return "Baden Württemberg"
        }
    },
    BAYERN {
        override fun getStateName(): String {
            return "Bayern"
        }
    },
    BERLIN {
        override fun getStateName(): String {
            return "Berlin"
        }
    },
    BRANDENBURG {
        override fun getStateName(): String {
            return "Brandenburg"
        }
    },
    BREMEN {
        override fun getStateName(): String {
            return "Bremen"
        }
    },
    HAMBURG {
        override fun getStateName(): String {
            return "Hamburg"
        }
    },
    HESSEN {
        override fun getStateName(): String {
            return "Hessen"
        }
    },
    MECKLENBURG_VORPOMMERN {
        override fun getStateName(): String {
            return "Mecklenburg Vorpommern"
        }
    },
    NIEDERSACHSEN {
        override fun getStateName(): String {
            return "Niedersachsen"
        }
    },
    NORDRHEIN_WESTFALEN {
        override fun getStateName(): String {
            return "Nordrhein Westfalen"
        }
    },
    RHEINLAND_PFALZ {
        override fun getStateName(): String {
            return "Rheinland Pfalz"
        }
    },
    SAARLAND {
        override fun getStateName(): String {
            return "Saarland"
        }
    },
    SACHSEN {
        override fun getStateName(): String {
            return "Sachsen"
        }
    },
    SACHSEN_ANHALT {
        override fun getStateName(): String {
            return "Sachsen Anhalt"
        }
    },
    SCHLESWIG_HOLSTEIN {
        override fun getStateName(): String {
            return "Schleswig-Holstein"
        }
    },
    THURINGEN {
        override fun getStateName(): String {
            return "Thüringen"
        }
    },
    NOT_SELECTED {
        override fun getStateName(): String {
            return "NOT SELECTED"
        }
    };
    abstract fun getStateName(): String
}