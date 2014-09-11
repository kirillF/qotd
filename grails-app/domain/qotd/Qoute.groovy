package qotd

class Qoute {

    String content
    String author
    Date create = new Date()

    static constraints = {
        author(blank: false)
        content(maxSize: 1000, blank: false)

    }
}
