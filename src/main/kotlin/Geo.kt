data class Geo(
    val type: String,
    val coordinates: String,
    val place: Place,
)

data class Place(
    val id: Int,
    val title: String,
    val latitude: Int,
    val longitude: Int,
    val created: Int,
    val icon: String,
    val country: String,
    val city: String,
    val type: Int? = null,
    val groupId: Int? = null,
    val groupPhoto: String? = null,
    val checkins: Int? = null,
    val updated: Int? = null,
    val address: Int? = null,
)