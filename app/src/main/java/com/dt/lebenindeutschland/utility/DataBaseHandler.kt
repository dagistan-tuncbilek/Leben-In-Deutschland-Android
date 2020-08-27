package com.dt.lebenindeutschland.utility

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ContentValues
import android.content.Context
import android.content.res.Configuration
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.dt.lebenindeutschland.selectedState
import java.util.*
import kotlin.collections.ArrayList

var userLanguage = Language.NOT_SELECTED
const val DATABASE_NAME = "LID_DB"

// TABLE_UTILITY, first id value shows the selected state enum with ordinals, second id value shows the language with ordinals.
const val TABLE_UTILITY = "UTILITY"
const val COL_VALUE = "VALUE"
const val COL_ID_UTIL = "ID"
const val STATE_ID = 1
const val LANGUAGE_ID = 2

const val TABLE_QUESTION_DATA = "LID_TABLE"
const val COL_ID = "ID"
const val COL_QUESTION = "QUESTION"
const val COL_ANSWER_A = "ANSWER_A"
const val COL_ANSWER_B = "ANSWER_B"
const val COL_ANSWER_C = "ANSWER_C"
const val COL_ANSWER_D = "ANSWER_D"
const val COL_THEME = "THEME"
const val COL_THEME_ID = "THEME_ID"
const val COL_TRUE_ANSWER = "TRUE_ANSWER"
const val COL_SUCCESS = "SUCCESS"
const val COL_HAS_PHOTO = "HASPHOTO"
const val COL_IS_LEARNED = "ISLEARNED"
val SELECT_ALL = arrayOf(COL_ID, COL_QUESTION,COL_ANSWER_A, COL_ANSWER_B, COL_ANSWER_C, COL_ANSWER_D,
    COL_THEME, COL_THEME_ID, COL_TRUE_ANSWER, COL_SUCCESS, COL_HAS_PHOTO, COL_IS_LEARNED, COL_IS_LEARNED)

class DataBaseHandler(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {

        val createLandTable = "CREATE TABLE $TABLE_UTILITY ($COL_ID_UTIL INTEGER, $COL_VALUE INTEGER)"
        val createQuestionTable = "CREATE TABLE $TABLE_QUESTION_DATA (${COL_ID} INTEGER PRIMARY KEY, $COL_QUESTION TEXT," +
                "$COL_ANSWER_A TEXT, $COL_ANSWER_B TEXT, $COL_ANSWER_C TEXT, $COL_ANSWER_D TEXT, " +
                "$COL_THEME TEXT, $COL_THEME_ID INTEGER, $COL_TRUE_ANSWER TEXT, $COL_SUCCESS TEXT, " +
                "$COL_HAS_PHOTO NUMERIC, $COL_IS_LEARNED NUMERIC)"

        db?.execSQL(createLandTable)
        db?.execSQL(createQuestionTable)

        val rawData: ArrayList<Question> = RawData().createData()
        for (q in rawData){
            val contentValues = ContentValues()
            contentValues.put(COL_ID, q.id)
            contentValues.put(COL_QUESTION, q.question)
            contentValues.put(COL_ANSWER_A, q.answerA)
            contentValues.put(COL_ANSWER_B, q.answerB)
            contentValues.put(COL_ANSWER_C, q.answerC)
            contentValues.put(COL_ANSWER_D, q.answerD)
            contentValues.put(COL_THEME, q.thema)
            contentValues.put(COL_THEME_ID, q.themeId)
            contentValues.put(COL_TRUE_ANSWER, q.trueAnswer)
            contentValues.put(COL_SUCCESS, q.success)
            contentValues.put(COL_HAS_PHOTO, q.hasPhoto)
            contentValues.put(COL_IS_LEARNED, q.isLearned)
            db?.insert(TABLE_QUESTION_DATA, null, contentValues)
        }

        val contentState = ContentValues()
        contentState.put(COL_ID_UTIL, STATE_ID)
        contentState.put(COL_VALUE, State.NOT_SELECTED.ordinal)
        val contentLanguage = ContentValues()
        contentLanguage.put(COL_ID_UTIL, LANGUAGE_ID)
        contentLanguage.put(COL_VALUE, Language.NOT_SELECTED.ordinal)
        db?.insert(TABLE_UTILITY, null, contentState)
        db?.insert(TABLE_UTILITY, null, contentLanguage)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    @SuppressLint("Recycle")
    fun setUserSettingsFromDatabase (context: Context){
        val db = this.readableDatabase
        val columns = arrayOf(COL_ID_UTIL, COL_VALUE)
        val cursor: Cursor = db.query(TABLE_UTILITY, columns, null, null, null, null, null)
        var language:Language = Language.NOT_SELECTED
        while (cursor.moveToNext()) {
            val id = cursor.getInt(cursor.getColumnIndex(COL_ID_UTIL))
            val ordinal = cursor.getInt(cursor.getColumnIndex(COL_VALUE))
            if (id == 1) selectedState = State.values()[ordinal]
            if (id == 2) language = Language.values()[ordinal]
        }
        db.close()
        userLanguage = language
    }

    fun updateUtilityData(id: Int, ordinal: Int){
        val db = writableDatabase
        val cv = ContentValues()
        cv.put(COL_ID_UTIL, id)
        cv.put(COL_VALUE, ordinal)
        db.update(TABLE_UTILITY, cv, "$COL_ID_UTIL=$id", null)
        db.close()
    }

    @SuppressLint("Recycle")
    @Synchronized fun readTestResults(): ArrayList<UserTestResult> {
        val results: ArrayList<UserTestResult> = arrayListOf()
        val db = this.readableDatabase
        val columns = arrayOf(COL_ID, COL_THEME_ID, COL_IS_LEARNED)
        val cursor: Cursor = db.query(TABLE_QUESTION_DATA, columns, null, null, null, null, null)
        while (cursor.moveToNext()) {
            val id = cursor.getInt(cursor.getColumnIndex(COL_ID))
            val themaid = cursor.getInt(cursor.getColumnIndex(COL_THEME_ID))
            val isLearned: Boolean = cursor.getInt(cursor.getColumnIndex(COL_IS_LEARNED)) > 0
            results.add(UserTestResult(id, themaid, isLearned))
        }
        db.close()
        return results
    }

//    USE THIS FUNCTION IF NECESSARY - DONT DELETE
//    @SuppressLint("Recycle")
//    @Synchronized fun readAllData(): ArrayList<Question> {
//        val results: ArrayList<Question> = arrayListOf()
//        val db = this.readableDatabase
//        val cursor: Cursor = db.query(TABLE_QUESTION_DATA, SELECT_ALL, null, null, null, null, null)
//        while (cursor.moveToNext()) {
//            results.add(
//                Question(
//                id = cursor.getInt(cursor.getColumnIndex(COL_ID)),
//                question = cursor.getString(cursor.getColumnIndex(COL_QUESTION)),
//                answerA = cursor.getString(cursor.getColumnIndex(COL_ANSWER_A)),
//                answerB = cursor.getString(cursor.getColumnIndex(COL_ANSWER_B)),
//                answerC = cursor.getString(cursor.getColumnIndex(COL_ANSWER_C)),
//                answerD = cursor.getString(cursor.getColumnIndex(COL_ANSWER_D)),
//                thema = cursor.getString(cursor.getColumnIndex(COL_THEMA)),
//                themaId = cursor.getInt(cursor.getColumnIndex(COL_THEMA_ID)),
//                trueAnswer = cursor.getString(cursor.getColumnIndex(COL_TRUE_ANSWER)),
//                success = cursor.getString(cursor.getColumnIndex(COL_SUCCESS)),
//                hasPhoto = cursor.getInt(cursor.getColumnIndex(COL_HASPHOTO))>0,
//                isLearned = cursor.getInt(cursor.getColumnIndex(COL_ISLEARNED)) > 0)
//            )
//        }
//    db.close()
//        return results
//    }

    @SuppressLint("Recycle")
    @Synchronized fun readSelectedData(array: IntArray): ArrayList<Question> {
        val results: ArrayList<Question> = arrayListOf()
        val db = this.readableDatabase
        val sbWhere: StringBuilder = StringBuilder()
        for (i in array){
            if(i == array.last()) sbWhere.append("$COL_ID=${i}") else sbWhere.append("$COL_ID=${i} OR ")
        }
        val cursor: Cursor = db.query(TABLE_QUESTION_DATA, SELECT_ALL, sbWhere.toString(), null, null, null, null)
        while (cursor.moveToNext()) {
            results.add(
                Question(
                id = cursor.getInt(cursor.getColumnIndex(COL_ID)),
                question = cursor.getString(cursor.getColumnIndex(COL_QUESTION)),
                answerA = cursor.getString(cursor.getColumnIndex(COL_ANSWER_A)),
                answerB = cursor.getString(cursor.getColumnIndex(COL_ANSWER_B)),
                answerC = cursor.getString(cursor.getColumnIndex(COL_ANSWER_C)),
                answerD = cursor.getString(cursor.getColumnIndex(COL_ANSWER_D)),
                thema = cursor.getString(cursor.getColumnIndex(COL_THEME)),
                themeId = cursor.getInt(cursor.getColumnIndex(COL_THEME_ID)),
                trueAnswer = cursor.getString(cursor.getColumnIndex(COL_TRUE_ANSWER)),
                success = cursor.getString(cursor.getColumnIndex(COL_SUCCESS)),
                hasPhoto = cursor.getInt(cursor.getColumnIndex(COL_HAS_PHOTO))>0,
                isLearned = cursor.getInt(cursor.getColumnIndex(COL_IS_LEARNED)) > 0)
            )
        }
        db.close()
        return results
    }

    @SuppressLint("Recycle")
    @Synchronized fun readDataWithThemaId(themaId: Int): ArrayList<Question> {
        val results: ArrayList<Question> = arrayListOf()
        val db = this.readableDatabase
        val where = "$COL_THEME_ID=$themaId"
        val cursor: Cursor = db.query(TABLE_QUESTION_DATA, SELECT_ALL, where, null, null, null, null)
        while (cursor.moveToNext()) {
            results.add(
                Question(
                    id = cursor.getInt(cursor.getColumnIndex(COL_ID)),
                    question = cursor.getString(cursor.getColumnIndex(COL_QUESTION)),
                    answerA = cursor.getString(cursor.getColumnIndex(COL_ANSWER_A)),
                    answerB = cursor.getString(cursor.getColumnIndex(COL_ANSWER_B)),
                    answerC = cursor.getString(cursor.getColumnIndex(COL_ANSWER_C)),
                    answerD = cursor.getString(cursor.getColumnIndex(COL_ANSWER_D)),
                    thema = cursor.getString(cursor.getColumnIndex(COL_THEME)),
                    themeId = cursor.getInt(cursor.getColumnIndex(COL_THEME_ID)),
                    trueAnswer = cursor.getString(cursor.getColumnIndex(COL_TRUE_ANSWER)),
                    success = cursor.getString(cursor.getColumnIndex(COL_SUCCESS)),
                    hasPhoto = cursor.getInt(cursor.getColumnIndex(COL_HAS_PHOTO))>0,
                    isLearned = cursor.getInt(cursor.getColumnIndex(COL_IS_LEARNED)) > 0)
            )
        }
        db.close()
        return results
    }

    @Synchronized fun updateData(id: Int, islearned: Boolean) {
        val db = writableDatabase
        val cv = ContentValues()
        cv.put(COL_ID, id)
        cv.put(COL_IS_LEARNED, islearned)
        db.update(TABLE_QUESTION_DATA, cv, "$COL_ID=$id", null)
        db.close()
    }

}

