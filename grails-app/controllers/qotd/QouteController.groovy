package qotd

class QouteController {

    def index() {
        redirect(action: random)
    }

    def random = {
        def staticQoute = new Qoute(author: "Anonymous", content: "Real Programmers don't eat much quiche")
        [quote: staticQoute]
    }
}
