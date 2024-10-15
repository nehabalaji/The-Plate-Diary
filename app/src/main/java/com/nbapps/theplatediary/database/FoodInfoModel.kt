package com.nbapps.theplatediary.database

data class FoodInfoModel(
    val foodName: String,
    val measurementUnit: String,
    val quantity: String,
    val calories: Int,
    val totalFat: Float?,
    val saturatedFat: Float?,
    val transFat: Float?,
    val polyUnsaturatedFat: Float?,
    val monoUnsaturatedFat: Float?,
    val cholesterol: Float?,
    val sodium: Float?,
    val totalCarbohydrate: Float?,
    val dietaryFiber: Float?,
    val sugars: Float?,
    val protein: Float?
)
