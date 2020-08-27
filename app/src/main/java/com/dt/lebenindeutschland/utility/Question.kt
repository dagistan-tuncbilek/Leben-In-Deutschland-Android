package com.dt.lebenindeutschland.utility

data class Question(
	val id: Int,
	val question: String,
	val answerA: String,
	val answerB: String,
	val answerC: String,
	val answerD: String,
	val thema: String,
	val themeId: Int,
	val trueAnswer: String,
	val success: String,
	val hasPhoto: Boolean,
	var isLearned: Boolean = false,
	var userAnswer: String? = null
)