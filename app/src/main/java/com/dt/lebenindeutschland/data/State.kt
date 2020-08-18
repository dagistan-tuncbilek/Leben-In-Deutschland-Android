package com.dt.lebenindeutschland.data

enum class State {
    BADEN_WURTTEMBERG {

        override fun getStateName(): String {
            return "Baden Württemberg"
        }


        override fun getQuestionNumber(): Int{
            return 300
        }
    },
    BAYERN {
        
        override fun getStateName(): String {
            return "Bayern"
        }

        
        override fun getQuestionNumber(): Int{
            return 310
        }
    },
    BERLIN {
        
        override fun getStateName(): String {
            return "Berlin"
        }

        
        override fun getQuestionNumber(): Int{
            return 320
        }
    },
    BRANDENBURG {
        
        override fun getStateName(): String {
            return "Brandenburg"
        }

        
        override fun getQuestionNumber(): Int{
            return 330
        }
    },
    BREMEN {
        
        override fun getStateName(): String {
            return "Bremen"
        }

        
        override fun getQuestionNumber(): Int{
            return 340
        }
    },
    HAMBURG {
        
        override fun getStateName(): String {
            return "Hamburg"
        }

        
        override fun getQuestionNumber(): Int{
            return 350
        }
    },
    HESSEN {
        
        override fun getStateName(): String {
            return "Hessen"
        }

        
        override fun getQuestionNumber(): Int{
            return 360
        }
    },
    MECKLENBURG_VORPOMMERN {
        
        override fun getStateName(): String {
            return "Mecklenburg Vorpommern"
        }

        
        override fun getQuestionNumber(): Int{
            return 370
        }
    },
    NIEDERSACHSEN {
        
        override fun getStateName(): String {
            return "Niedersachsen"
        }

        
        override fun getQuestionNumber(): Int{
            return 380
        }
    },
    NORDRHEIN_WESTFALEN {
        
        override fun getStateName(): String {
            return "Nordrhein Westfalen"
        }

        
        override fun getQuestionNumber(): Int{
            return 390
        }
    },
    RHEINLAND_PFALZ {
        
        override fun getStateName(): String {
            return "Rheinland Pfalz"
        }

        
        override fun getQuestionNumber(): Int{
            return 400
        }
    },
    SAARLAND {
        
        override fun getStateName(): String {
            return "Saarland"
        }

        
        override fun getQuestionNumber(): Int{
            return 410
        }
    },
    SACHSEN {
        
        override fun getStateName(): String {
            return "Sachsen"
        }

        
        override fun getQuestionNumber(): Int{
            return 420
        }
    },
    SACHSEN_ANHALT {
        
        override fun getStateName(): String {
            return "Sachsen_Anhalt"
        }

        
        override fun getQuestionNumber(): Int{
            return 430
        }
    },
    SCHLESWIG_HOLSTEIN {
        
        override fun getStateName(): String {
            return "Schleswig Holstein"
        }

        
        override fun getQuestionNumber(): Int{
            return 440
        }
    },
    THURINGEN {
        
        override fun getStateName(): String {
            return "Thuringen"
        }

        
        override fun getQuestionNumber(): Int{
            return 450
        }
    },
    NOT_SELECTED {

        override fun getStateName(): String {
            return "NOT SELECTED"
        }

        
        override fun getQuestionNumber(): Int{
            return -1
        }
    };

    abstract fun getStateName(): String
    abstract fun getQuestionNumber(): Int
}