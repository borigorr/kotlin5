data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val canPin: Boolean,
    val isFavorite: Boolean,
    val text: String,
    val replyPostId: Int,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val comments: Comments,
    ) {
}
