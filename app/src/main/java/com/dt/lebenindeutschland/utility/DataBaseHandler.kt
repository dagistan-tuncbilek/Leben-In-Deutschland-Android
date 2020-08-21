package com.dt.lebenindeutschland.utility

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.dt.lebenindeutschland.selectedState


const val DATABASE_NAME = "LID_DB"
const val TABLE_SELECTEDLAND = "SELECTEDLAND"
const val COL_SELECTEDLAND = "LAND"
const val COL_ID_SELECTEDLAND = "ID"

const val TABLE_QUESTION_DATA = "LID_TABLE"
const val COL_ID = "ID"
const val COL_QUESTION = "QUESTION"
const val COL_ANSWER_A = "ANSWER_A"
const val COL_ANSWER_B = "ANSWER_B"
const val COL_ANSWER_C = "ANSWER_C"
const val COL_ANSWER_D = "ANSWER_D"
const val COL_THEMA = "THEMA"
const val COL_THEMA_ID = "THEMA_ID"
const val COL_TRUE_ANSWER = "TRUE_ANSWER"
const val COL_SUCCESS = "SUCCESS"
const val COL_HASPHOTO = "HASPHOTO"
const val COL_ISLEARNED = "ISLEARNED"
val SELECT_ALL = arrayOf(COL_ID, COL_QUESTION,COL_ANSWER_A, COL_ANSWER_B, COL_ANSWER_C, COL_ANSWER_D,
    COL_THEMA, COL_THEMA_ID, COL_TRUE_ANSWER, COL_SUCCESS, COL_HASPHOTO, COL_ISLEARNED, COL_ISLEARNED)

class DataBaseHandler(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {

        val createLandTable = "CREATE TABLE $TABLE_SELECTEDLAND ($COL_ID_SELECTEDLAND INTEGER, $COL_SELECTEDLAND INTEGER)"
        val createQuestionTable = "CREATE TABLE $TABLE_QUESTION_DATA (${COL_ID} INTEGER PRIMARY KEY, $COL_QUESTION TEXT," +
                "$COL_ANSWER_A TEXT, $COL_ANSWER_B TEXT, $COL_ANSWER_C TEXT, $COL_ANSWER_D TEXT, " +
                "$COL_THEMA TEXT, $COL_THEMA_ID INTEGER, $COL_TRUE_ANSWER TEXT, $COL_SUCCESS TEXT, " +
                "$COL_HASPHOTO NUMERIC, $COL_ISLEARNED NUMERIC)"

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
            contentValues.put(COL_THEMA, q.thema)
            contentValues.put(COL_THEMA_ID, q.themaId)
            contentValues.put(COL_TRUE_ANSWER, q.trueAnswer)
            contentValues.put(COL_SUCCESS, q.success)
            contentValues.put(COL_HASPHOTO, q.hasPhoto)
            contentValues.put(COL_ISLEARNED, q.isLearned)
            db?.insert(TABLE_QUESTION_DATA, null, contentValues)
            Log.d(TAG, "${q.id}. data inserted")
        }

        val contentValue = ContentValues()
        contentValue.put(COL_ID_SELECTEDLAND, 1)
        contentValue.put(COL_SELECTEDLAND, State.NOT_SELECTED.ordinal)
        db?.insert(TABLE_SELECTEDLAND, null, contentValue)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    @SuppressLint("Recycle")
    fun setUserStateFromDatabase () {
        val db = this.readableDatabase
        val columns = arrayOf(COL_ID_SELECTEDLAND, COL_SELECTEDLAND)
        val cursor: Cursor = db.query(TABLE_SELECTEDLAND, columns, null, null, null, null, null)
        while (cursor.moveToNext()) {
            cursor.getInt(cursor.getColumnIndex(COL_ID_SELECTEDLAND))
            val ordinal = cursor.getInt(cursor.getColumnIndex(COL_SELECTEDLAND))
            selectedState = State.values()[ordinal]
        }
    }

    fun updateStateData(state : State){
        val db = writableDatabase
        val cv = ContentValues()
        cv.put(COL_ID_SELECTEDLAND, 1)
        cv.put(COL_SELECTEDLAND, state.ordinal)
        db.update(TABLE_SELECTEDLAND, cv, "$COL_ID_SELECTEDLAND=1", null)
        Log.d(TAG, "Selected land updated -> ${selectedState.getStateName()}")
        db.close()
    }

    @SuppressLint("Recycle")
    @Synchronized fun readTestResults(): ArrayList<UserTestResult> {
        val results: ArrayList<UserTestResult> = arrayListOf()
        val db = this.readableDatabase
        val columns = arrayOf(COL_ID, COL_THEMA_ID, COL_ISLEARNED)
        val cursor: Cursor = db.query(TABLE_QUESTION_DATA, columns, null, null, null, null, null)
        while (cursor.moveToNext()) {
            val id = cursor.getInt(cursor.getColumnIndex(COL_ID))
            val themaid = cursor.getInt(cursor.getColumnIndex(COL_THEMA_ID))
            val isLearned: Boolean = cursor.getInt(cursor.getColumnIndex(COL_ISLEARNED)) > 0
            results.add(UserTestResult(id, themaid, isLearned))
        }
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
                thema = cursor.getString(cursor.getColumnIndex(COL_THEMA)),
                themaId = cursor.getInt(cursor.getColumnIndex(COL_THEMA_ID)),
                trueAnswer = cursor.getString(cursor.getColumnIndex(COL_TRUE_ANSWER)),
                success = cursor.getString(cursor.getColumnIndex(COL_SUCCESS)),
                hasPhoto = cursor.getInt(cursor.getColumnIndex(COL_HASPHOTO))>0,
                isLearned = cursor.getInt(cursor.getColumnIndex(COL_ISLEARNED)) > 0)
            )
        }
        return results
    }

    @SuppressLint("Recycle")
    @Synchronized fun readDataWithThemaId(themaId: Int): ArrayList<Question> {
        val results: ArrayList<Question> = arrayListOf()
        val db = this.readableDatabase
        val where = "$COL_THEMA_ID=$themaId"
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
                    thema = cursor.getString(cursor.getColumnIndex(COL_THEMA)),
                    themaId = cursor.getInt(cursor.getColumnIndex(COL_THEMA_ID)),
                    trueAnswer = cursor.getString(cursor.getColumnIndex(COL_TRUE_ANSWER)),
                    success = cursor.getString(cursor.getColumnIndex(COL_SUCCESS)),
                    hasPhoto = cursor.getInt(cursor.getColumnIndex(COL_HASPHOTO))>0,
                    isLearned = cursor.getInt(cursor.getColumnIndex(COL_ISLEARNED)) > 0)
            )
        }
        return results
    }

    @Synchronized fun updateData(id: Int, islearned: Boolean) {
        val db = writableDatabase
        val cv = ContentValues()
        cv.put(COL_ID, id)
        cv.put(COL_ISLEARNED, islearned)
        db.update(TABLE_QUESTION_DATA, cv, "$COL_ID=$id", null)
        Log.d(TAG, "Question $id is updated as $islearned")
        db.close()
    }

    companion object {
        private const val TAG = "DataBaseHandler"
    }

}

