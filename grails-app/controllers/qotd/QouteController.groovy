package qotd

class QouteController {

    def index() {
        redirect(action: random)
    }

    def random = {
        def allQuotes = Qoute.list()
        def randomQuote
        if (allQuotes.size() > 0) {
            def index = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[index]
        } else {
            randomQuote = new Qoute(author: "Anonymous", content: "Real Programmers don't eat much quiche")
        }
        [quote: randomQuote]
    }
}
