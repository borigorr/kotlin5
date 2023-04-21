object WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun createComment(postId: Int, comment: Comment): Comment {
        for ((index, value) in posts.withIndex()) {
            if (value.id == postId) {
                comments += comment
                return comment
            }
        }
        throw PostNotFoundException("Post $postId not found")
    }

    fun add(post: Post): Post {
        val addPost = post.copy(id = posts.size + 1)
        posts += addPost.copy()
        return addPost
    }

    fun update(post: Post): Boolean {
        for ((index, value) in posts.withIndex()) {
            if (value.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
    }
}