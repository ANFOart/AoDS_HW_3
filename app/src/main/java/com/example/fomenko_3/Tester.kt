package com.example.fomenko_3


fun main() {
    val studentGrades = StudentGrades(
        mutableListOf(
            89, 91, 90,
            67, 56, 60, 78, 97, 83
        )
    )
    println(studentGrades.getMaxGrade())
    println(studentGrades.getMinGrade())
    println(studentGrades.getAverage())
    println(studentGrades.getLessThanAverage())
    println(studentGrades.getGreaterThanAverage())
    println(studentGrades.getExcellentAmount())
    println(studentGrades.getGoodAmount())
    println(studentGrades.getSatisfactorilyAmount())
    println(studentGrades.getGradesInString())
    println(studentGrades.getGrades())
}