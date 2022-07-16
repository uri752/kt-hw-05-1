package ru.netology

fun main() {
    var post1 =  Post(
        id = 0,
        ownerId = 1,
        text = "Новая нетология 1",
        date = 1590075360,
        likes = Likes(count = 22)
    )

    var post2 =  Post(
        id = 0,
        ownerId = 1,
        text = "Новая нетология 2",
        date = 1590075360,
        likes = Likes(count = 22)
    )

    val service = WallService
    println(post1)

    // функция добавления поста
    val added1 = service.add(post1)
    val added2 = service.add(post2)

    println(added1)
    println(added2)

    // функция обновления поста
    var post3 =  Post(
        id = 2,
        ownerId = 1,
        text = "Новая нетология 3",
        date = 1590075360,
        likes = Likes(count = 22)
    )

    val res = service.update(post3)
    println("Пост обновлен: $res")
    println(added2)
}
