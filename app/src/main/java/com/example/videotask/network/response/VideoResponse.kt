package com.example.videotask.network.response

import com.google.gson.annotations.SerializedName

/**
 * @author shital awathe
 * Video response data model
 */
data class VideoResponse(
    @SerializedName("success")
    var success: Boolean?= false,

    @SerializedName("message")
    var message: String?= null,

    @SerializedName("data")
    var data: Data?= null
)

data class Data(
    @SerializedName("data")
    var data: ArrayList<DataItem>?= null
)

data class DataItem(
    @SerializedName("_id")
    var _id: String?= null,

    @SerializedName("media_base_url")
    var media_base_url: String?= null,

    @SerializedName("recording_details")
    var recording_details: RecordingDetails?= null
)

data class RecordingDetails(
    @SerializedName("duration")
    var duration: Double?= null,

    @SerializedName("cover_img_url")
    var cover_img_url: String?= null,

    @SerializedName("type")
    var type: String?= null,

    @SerializedName("description")
    var description: String?= null,

    @SerializedName("recording_url")
    var recording_url: String?= null,

    @SerializedName("status")
    var status: Int?= null,

    @SerializedName("recording_id")
    var recording_id: Int?= null,

    @SerializedName("streaming_hls")
    var streaming_hls: String?= null
)