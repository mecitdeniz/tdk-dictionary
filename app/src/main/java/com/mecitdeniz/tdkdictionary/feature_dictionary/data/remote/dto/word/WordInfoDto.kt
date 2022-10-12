package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.word

import com.google.gson.annotations.SerializedName

data class WordInfoDto(
    val anlam_gor: String,

    @SerializedName("anlam_say")
    val meaningCount: String,

    @SerializedName("anlamlarListe")
    val meanings: List<MeaningDto>,

    @SerializedName("birlesikler")
    val combined: Any,

    @SerializedName("cesit")
    val kind: String,

    @SerializedName("cesit_say")
    val kindCount: String,

    @SerializedName("cogul_mu")
    val isPlural: String,
    val font: Any,
    val gosterim_tarihi: Any,
    val kac: String,

    @SerializedName("kelime_no")
    val wordNo: String,
    val lisan: String,
    val lisan_kodu: String,

    @SerializedName("madde")
    val word: String,
    @SerializedName("madde_duz")
    val wordPlain: String,
    @SerializedName("madde_id")
    val wordId: String,
    @SerializedName("on_taki")
    val prefix: Any,
    @SerializedName("ozel_mi")
    val isSpecial: String,
    @SerializedName("taki")
    val suffix: Any,
    @SerializedName("telaffuz")
    val pronunciation: Any
)