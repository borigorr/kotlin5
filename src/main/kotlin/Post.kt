data class Post(
    val id: Int?,
    val ownerId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String?,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments?,
    val likes: Likes,
    val reposts: Reposts,
    val postType: String,
    val postSource: PostSource,
    val attachments: Array<Attachment>?,
    val geo: Geo,
    val signerId: Int,
    val copyHistory: Array<Post>?,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val fromId: Int,
    val isPinned: Boolean,
    val isFavorite: Boolean,
)
