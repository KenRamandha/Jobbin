package com.example.jobbin.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//data class ModelJobs(
//    var imageJobs : Int,
//    var judulJobs : String,
//    var keteranganJobs : String,
//    var jamJobs : String,
//    var alamatJobs : String,
//    var waktuJobs : String
//)
@Parcelize
data class ModelJobs(
    var imageJobs : Int = 0,
    var judulJobs : String? = null,
    var keteranganJobs : String? = null,
    var jamJobs : String? = null,
    var alamatJobs : String? = null,
    var waktuJobs : String? = null
) : Parcelable
