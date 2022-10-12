package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.word

import com.google.gson.annotations.SerializedName

data class FeatureDto(
    @SerializedName("ekno")
    val suffixNo: String,
    @SerializedName("kisa_adi")
    val shortName: String,
    @SerializedName("ozellik_id")
    val featureId: String,
    @SerializedName("tam_adi")
    val fullName: String,
    @SerializedName("tur")
    val kind: String
)