data class Comment(
    val id: Int,
    val date: Int,
    val text: String,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Array<Attachment>,
    val parentsStack: Array<Int>,
    val thread: Array<Thread>,
)

data class Thread(
    val count: Int,
    val items: Array<Comment>,
    val canPost: Boolean,
    val showReplyButton: Boolean,
    val groupsCanPost: Boolean,

)