package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.word

import com.google.gson.annotations.SerializedName

data class MeaningDto(
    @SerializedName("anlam")
    val meaning: String,
    @SerializedName("anlam_id")
    val meaningId: String,
    @SerializedName("anlam_sira")
    val meaningOrder: String,
    @SerializedName("fiil")
    val verb: String,
    @SerializedName("gos")
    val gos: String,
    @SerializedName("madde_id")
    val id: String,
    @SerializedName("ozelliklerListe")
    val features: List<FeatureDto>,
    @SerializedName("tipkes")
    val tipkes: String
)