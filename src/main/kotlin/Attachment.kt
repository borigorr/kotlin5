sealed class Attachment(val type: String)

data class Photo(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)

data class Graffiti(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)

data class WikiPage(val id: Int, val groupId: Int, val title: String)

data class ApplicationContent(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Boolean,
)

data class PhotoAttachment(val photo: Photo): Attachment("Photo")

data class GraffitiAttachment(val graffiti: Graffiti): Attachment("Graffiti")

data class WikiPageAttachment(val wikiPage: WikiPage): Attachment("WikiPage")

data class ApplicationContentAttachment(val applicationContent: ApplicationContent): Attachment("ApplicationContent")

data class AudioAttachment(val audio: Audio): Attachment("Audio")