object WallService {

    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val addPost = post.copy(id = posts.size + 1)
        posts += addPost
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